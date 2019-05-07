package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

public class WX_grade extends WX_report{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void search_person_form_WXgrade(String name,String cid,String card,String phone) throws Exception{
		click("WXgrade");
		write("person_name",name);
		write("cid",cid);
		write("card",card);
		write("phone",phone);
		if(!check("uploadinfo")){
			upload("upload",filepath+cid+".png");
		}
		click("search");
	}
	
	public void check_grade_test() throws Exception{
		enterprise_landing();
		search_person_form_WXgrade(case19[0],case19[1],case19[2],case19[3]);
		click("ok");
		switchto();
		check_source(case19[4]);
		close_web();
	}
	
	public void check_riskinfo_test() throws Exception{
		enterprise_landing();
		search_person_form_WXgrade(case20[0],case20[1],case20[2],case20[3]);
		click("ok");
		switchto();
		check_source(case20[4]); 
		close_web();
	}
	
	public void addto_control_test() throws Exception{
		enterprise_landing();
		search_person_form_WXgrade(case21[0],case21[1],case21[2],case21[3]);
		click("ok");
		switchto();
		click("add2contr");
		switchto();
		click("add2contr");
		click("ok");
		click("ok2");   
		if(check("contr_object")){
			logger.info("从万象评分进行加入监控，执行成功");
		}else{
  			logger.error("从万象评分进行加入监控，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void search_person_form_present(String name,String cid,String card,String phone) throws Exception{ 
		write("person_name",name);
		write("cid",cid);
		write("card",card);
		write("phone",phone);
		if(check("uploadinfo1")){
			upload("upload",filepath+cid+".png");
		}
		click("search2");
	}
	
	//火狐浏览器低版本不能实现此功能
	public void recheck_grade_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_person_form_WXgrade(case22[0], case22[1], case22[2], case22[3]);
		click("ok");
		switchto();
		search_person_form_present(case22[4], case22[5], case22[6], case22[7]);
		click("ok");
		switchto();
		check_source(case22[8]);
		money2 = get_my_money();
		sum(money1-money2,2*gradecost);
		close_web();
	}
	
	public void check_grade_from_history_test() throws Exception{
		enterprise_landing();
		click("WXgrade");
		click("tongwenzhou1");
		switchto();
		check("add2contr");
		close_web();
	}
	
}
