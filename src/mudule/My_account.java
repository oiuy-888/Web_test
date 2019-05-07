package mudule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class My_account extends WX_union{
	
	Logger logger = LogManager.getLogger(this.getClass());
    
	//本帐户当地信息
	public String[][] acc = {{case95[2],case95[3],case95[4],case95[5],case95[6],case95[7],case95[8]},
			                 {case95[9],case95[10],case95[11],case95[12],case95[13],case95[14],case95[15]}};
	
	public void check_account_test() throws Exception{
		enterprise_landing(case95[0],case95[1]);
		click("My_account");
		click("account_control");
		for(int i=0;i<acc.length;i++){
			for(int j=0;j<7;j++){          
				check_source(acc[i][j]);
			}
		}
		logger.info("该机构下所有账户信息显示完整，执行成功");
		close_web();
	}
	
	public boolean belong(double para,double min,double max){
		if((para>=min)&&(para<=max)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean belong(int para,int min,int max){
		if((para>=min)&&(para<=max)){
			return true;
		}else{
			return false;
		}
	}
	
	public void check_account_test1() throws Exception{
		double money,expeng;
		int times;
		enterprise_landing();
		click("My_account");
		click("conmuse_result");
		money = Double.parseDouble(read("my_money"));
		boolean a = belong(money,Double.parseDouble(case96[0]),Double.parseDouble(case96[1]));           //本账户当前余额
		expeng = Double.parseDouble(read("account_expend"));
		boolean b = belong(expeng,Double.parseDouble(case96[2]),Double.parseDouble(case96[3]));          //本账户当前消费金额
		times = Integer.parseInt(read("account_search_times"));
		boolean c = belong(times,Integer.parseInt(case96[0]),Integer.parseInt(case96[4]));             //预设的最大查询次数
		if(a&&b&&c){
			logger.info("标题处显示账户余额，消费金额，查询次数，执行成功");
		}else{
			logger.error("标题处未显示账户余额，消费金额，查询次数，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_account_cost_by_data(String exist,String para) throws Exception{
		click(exist);
		if(check(para)){
		}else{
			logger.error("下方未显示本周消费统计，本月消费统计，近六个月消费统计，执行失败");
			throw new Exception();
		}
	}
	
	public void check_account_test2() throws Exception{
		enterprise_landing();
		click("My_account");
		click("conmuse_result");
		check_account_cost_by_data("account_week","account_week_cost");
		check_account_cost_by_data("account_month","account_month_cost");
		check_account_cost_by_data("account_year","account_year_cost");
		close_web();
	}
	
}
