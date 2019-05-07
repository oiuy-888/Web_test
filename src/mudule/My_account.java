package mudule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class My_account extends WX_union{
	
	Logger logger = LogManager.getLogger(this.getClass());
    
	//���ʻ�������Ϣ
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
		logger.info("�û����������˻���Ϣ��ʾ������ִ�гɹ�");
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
		boolean a = belong(money,Double.parseDouble(case96[0]),Double.parseDouble(case96[1]));           //���˻���ǰ���
		expeng = Double.parseDouble(read("account_expend"));
		boolean b = belong(expeng,Double.parseDouble(case96[2]),Double.parseDouble(case96[3]));          //���˻���ǰ���ѽ��
		times = Integer.parseInt(read("account_search_times"));
		boolean c = belong(times,Integer.parseInt(case96[0]),Integer.parseInt(case96[4]));             //Ԥ�������ѯ����
		if(a&&b&&c){
			logger.info("���⴦��ʾ�˻������ѽ���ѯ������ִ�гɹ�");
		}else{
			logger.error("���⴦δ��ʾ�˻������ѽ���ѯ������ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_account_cost_by_data(String exist,String para) throws Exception{
		click(exist);
		if(check(para)){
		}else{
			logger.error("�·�δ��ʾ��������ͳ�ƣ���������ͳ�ƣ�������������ͳ�ƣ�ִ��ʧ��");
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
