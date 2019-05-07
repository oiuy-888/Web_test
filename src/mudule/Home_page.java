package mudule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;

public class Home_page extends Actuate{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void click_sign_in_test() throws Exception {	
		open_web();
		max_size();
		click("enroll");
		if(check("agency_information")){
			logger.info("click sign in successed!");
		}else{
			logger.error("click sign in failed!");
            throw new Exception();
		}
		close_web();
	}
	
	public void search_company_form(String place, String company) throws Exception{
		click(place);
		write("orgname",company);
		click("search");
		wait(1);
	}
	
	public void search_company_form(String place, String para, String company) throws Exception{
		click(place);
		click(para);
		write("orgname",company);
		click("search");
		wait(1);
	}
	
	public void enter_company_page_test() throws Exception {
		enterprise_landing();
		search_company_form("Home",case2[0]);
		if(check("reg_num")){
			check_update();
		}else{
			logger.error("demand failed!");
            throw new Exception();
		}
		close_web();
	}
	
	public void enter_company_page_test2() throws Exception {
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("Home",case4[0]);
		if(check("reg_num")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("Enter company_page failed!");
            throw new Exception();
		}
		close_web();
	}
	
	public void check_update() throws Exception {
		click("update");
		wait(40);                 //爬虫固定等待
		String readtime = read("data");
		Calendar now = Calendar.getInstance();
		String time = now.get(Calendar.YEAR) +"-"+ (now.get(Calendar.MONTH)+1) +"-"+ now.get(Calendar.DATE);
		if(readtime.contains(time)){
			logger.info("check_update successed!");
		}else{
			logger.error("check update failed!");
			throw new Exception();
		}
	}
	
	public void check_report_test() throws Exception { 
		double money1,money2,sum;
		enterprise_landing();
		money1 = get_my_money();
        search_company_form("WXreport","check_company",case3[0]);          //此处写入栏与search按钮属同HOME页相同
        click("ok");
        if(check("reg_num")){
        	money2 = get_my_money();
        	sum(money1-money2,reportcost);
        }else{
        	logger.error("check report failed!");
			throw new Exception();
        }
		close_web();
	}
	
	public void personal_user_test() throws Exception{
		enterprise_landing("lishuai1","lishuai001");
		personal_user_step("WXreport");
		personal_user_step("WXgrade");
		personal_user_step("WXobserve");
		personal_user_step("WXcloud");
		personal_user_step("WXsmart");
		personal_user_step("WXunion");
		close_web();
	}
	
	public void personal_user_step(String para) throws Exception{
		click(para);
		wait(1);
		if(check("agency_information")){
			back();
			logger.info("Personal user should not get"+para);
		}else{
			logger.error("Personal user intercept failed!");
			throw new Exception();
		}
	}
	
	public void enterprise_user_test() throws Exception {
		enterprise_landing();
		enterprise_user_step("WXreport","info1");
		enterprise_user_step("WXgrade","info2");
		enterprise_user_step("WXobserve","info3");
		enterprise_user_step("WXcloud","info4");
		enterprise_user_step("WXsmart","info5");
		enterprise_user_step("WXunion","info6");
		close_web();
	}
	
	public void enterprise_user_step(String para,String tag) throws Exception{
		click(para);
		wait(1);
		if(check(tag)){
			back();
			logger.info("Personal user should not get"+para);
		}else{
			logger.error("Personal user intercept failed!");
			throw new Exception();
		}
	}
}
