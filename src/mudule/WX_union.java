package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Interner;

public class WX_union extends WX_smart{
	
	Logger logger = LogManager.getLogger(this.getClass());

	public void union_input(String name,String cid) throws Exception{
		write("union_name_input",name);
		write("union_sid_input",cid);
		click("union_excl_point");
		if(!check("uploadinfo")){                      
			upload("union_upload",filepath+cid+".png");
		}
		click("union_search");
		wait(1);
	}
	
	public int get_union_money() throws Exception{
		String para = read("union_money");
		return Integer.parseInt(para);
	}
	
	public void check_union_test() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case87[0],case87[1]);
		if(check("union_wrong_result")){
			logger.info("有弹出身份证号有误的提示，执行成功");
		}else{
			logger.error("没有弹出身份证号有误的提示，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test1() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case88[0],case88[1]);
		click("ok");
		switchto();
		if(check("union_result")){
			logger.info("可查询到信贷信息，执行成功");
		}else{
			logger.error("不可查询到信贷信息，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test2() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case89[0],case89[1]);
		click("ok");
		switchto();
		if(check("union_result")){
			logger.info("可查询到信贷信息，执行成功");
		}else{
			logger.error("不可查询到信贷信息，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test3() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case90[0],case90[1]);
		click("ok");
		switchto();
		if(check("union_result")){
			logger.info("可查询到信贷信息，执行成功");
		}else{
			logger.error("不可查询到信贷信息，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_type(int para) throws Exception{
		click("ok");
		switchto();
		boolean a = read("union_report_1").contains("0条记录");
		boolean b = read("union_report_2").contains("0条记录");
		boolean c = read("union_report_3").contains("0条记录");
		if(para == 1){
			if((!a)&&b&&c){
				logger.info("生成报告只包含网贷负面信息，信息正确");
			}else{
				logger.error("生成报告并非只包含网贷负面信息，信息有误");
				throw new Exception();
			}
		}else if(para == 2){
			if((!a)&&(!b)&&c){
				logger.info("生成报告包含网贷负面信息和执行记录，信息正确");
			}else{
				logger.error("生成报告并非只包含网贷负面信息和执行记录，信息有误");
				throw new Exception();
			}
		}else if(para == 3){
			if((!a)&&(!b)&&(!c)){
				logger.info("生成报告包含网贷负面信息和执行记录和失信老赖，信息正确");
			}else{
				logger.error("生成报告并非全包含，信息有误");
				throw new Exception();
			}
		}
		switchto();
	}
	
	public void check_union_test4() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		union_input(case91[0],case91[1]);
		check_type(1);
		money2 = get_union_money();
		if(money1-money2==netloan){
			logger.info("万象币扣除等于unioncost，执行成功");
		}else{
			logger.error("万象币扣除等于unioncost，执行成功");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test5() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		union_input(case92[0],case92[1]);
		check_type(2);
		money2 = get_union_money();
		if(money1-money2==netloan+risksxbzx){
			logger.info("万象币扣除等于netloan+risksxbzx，执行成功");
		}else{
			logger.error("万象币扣除等于netloan+risksxbzx，执行成功");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test6() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		union_input(case93[0],case93[1]);
		check_type(3);
		money2 = get_union_money();
		if(money1-money2==netloan+risksxbzx+risksxll){
			logger.info("万象币扣除等于netloan+risksxbzx+risksxll，执行成功");
		}else{
			logger.error("万象币扣除等于netloan+risksxbzx+risksxll，执行成功");
			throw new Exception();
		}
		close_web();
	}
	
	public void batch_upload(String para) throws Exception{
		click("batch_upload_data");
		upload("batch_upload",filepath+para+".xls");
		click("batch_upload_button");
		click("close_batch");
	}
	
	public void batch_upload_union_test() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		batch_upload(case94[0]);
		refresh();
		money2 = get_union_money();
		if(money2-money1==bacth_upload_money){
			logger.info("批量上传获得万象币等于bacth_upload_money，执行成功");
		}else{
			logger.error("批量上传获得万象币不等于bacth_upload_money，执行成功");
			throw new Exception();
		}
		close_web();
	}
	
}
