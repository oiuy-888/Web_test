package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

public class WX_observe extends WX_grade{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void switch_to_company() throws Exception{
		if(check("choose_obs")){
			click("obs_company1");
		}
		if(check("example")){
			logger.info("当前已经在企业监控界面");
		}else{
			click("obs_company");
			if(check("obs_batch")){
				logger.info("切换到企业监控界面，执行成功");
			}else{
				logger.error("切换到企业监控界面，执行失败");
				throw new Exception();
			}
		}
	}
	
	public void switch_to_person() throws Exception{
		if(check("choose_obs")){
			click("obs_person1");
		}
        if(check("example")){
			click("obs_person");
			if(check("obs_enturst")&&(!check("example"))){
				logger.info("切换到个人监控界面，执行成功");
			}else{
				logger.error("切换到个人监控界面，执行失败");
				throw new Exception();
			}
		}else{
			logger.info("当前已经在个人监控界面");
		}
	}
	
	public void add_obs_company(String company) throws Exception{
		click("obs_enturst");
		write("obs_companyname",company);
		click("start_obs");
		click("ok");
		click("ok3");
	}
	
	public void add_obs_company_batch(String file) throws Exception{
		click("obs_batch");
		upload("obs_upload",filepath + file + ".xls");
		click("start_obs_batch");
		click("ok");
		wait(20);    //手动等待上传完成
	}
	
	public void observe_company_test() throws Exception{
		enterprise_landing();
		click("WXobserve");
		switch_to_company();
		add_obs_company(case24[0]);
		if(check("penging")&&check("--")){
			logger.info("新添加的企业监控状态-待处理、到期时间--，执行成功");
		}else{
			logger.error("新添加的企业监控状态-待处理、到期时间--，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_company_default_info() throws Exception{
		click("check");
		switchto();
		String s = read("ICinfo");
		if(check("one_year")&&(s.equals("工商信息"))){              //工商信息通过绝对路径获得
			logger.info("批量监控默认监控工商信息，期限为一年，验证成功");
		}else{
			logger.error("批量监控默认监控工商信息，期限为一年，验证失败");
			throw new Exception();
		}
	}
	
	public void observe_company_batch_test() throws Exception{
		enterprise_landing();
		click("WXobserve");
		switch_to_company();
		add_obs_company_batch(case25[0]);
		check_company_default_info();
		close_web();
	}
	
	public void add_obs_person(String name,String cid,String phone) throws Exception{
		write("person_name",name);
		write("cid",cid);
		write("mobilephone",phone);
		if(check("uploadinfo")){}
		else{
			upload("upload",filepath+cid+".png");
		}
		click("start_obs");
		click("ok");
		wait(2);
		click("ok2");
	}
	
	public void check_person_default_info() throws Exception{
		click("check");
		switchto();
		String s = read("ICinfo1").trim();
		String s1 = read("half_year").trim();
		String s2 = read("ICinfo2").trim();
		String s3 = read("ICinfo3").trim();
		boolean a = s2.contains("黑名单");           //如果直接列入if判断条件中，会返回false
		boolean b = s3.contains("负面");            //如果直接列入if判断条件中，会返回false
		if((s1.equals("半年"))&&(s.equals("司法信息"))&&a&&b){ 
			logger.info("个人空监默认项，验证成功");
		}else{
			logger.error("个人空监默认项，验证失败");
			throw new Exception();
		}
	}
	
	public void observe_person_test() throws Exception{
		enterprise_landing();
		click("WXobserve");
		switch_to_person();
		click("obs_enturst");
		add_obs_person(case26[0],case26[1],case26[2]);
		check_person_default_info();
		close_web();
	}

	public void switch_obs_test() throws Exception{
		enterprise_landing();
		click("WXobserve");
		switch_to_company();
		switch_to_person();
		switch_to_company();
		close_web();
	}
}
