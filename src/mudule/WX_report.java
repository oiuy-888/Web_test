package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

public class WX_report extends Home_page{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void cancel_report_test() throws Exception {
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case7[0]);
		money2 = skip_cost_remind_cancel();
		sum(money1-money2,zero);
		close_web();
	}
	
	public void check_report_with_code_test() throws Exception {
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case9[0]); 
		click("ok");
		if(check("reg_num")){
			money2 = get_my_money();
			sum(money1-money2,reportcost);
		}else{
			logger.error("check report with code failed!");
			throw new Exception();
		}
		close_web();
	}
	
	public void cancel_report_with_code_test() throws Exception {
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case8[0]);
		click("cancel");
		money2 = get_my_money();
		sum(money1-money2,zero);
		close_web();
	}
	
	public void check_report_with_0org0acc_within7d_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case10[0]);
		if(check("cost_remind0")){
			logger.error("�п۷����ѣ���ѯ����ʧ��");
			throw new Exception();
		}else{
			money2 = get_my_money();
			sum(money1-money2,zero);
		}
		close_web();
	}
	
	public void check_report_with_0org1acc_within7d_test() throws Exception{
		double money1,money2;
		enterprise_landing(case11[0],case11[1]);
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case11[2]); 
		if(check("cost_remind0")){
			click("ok");
			money2 = get_my_money();
			sum(money1-money2,reportcost);
		}else{
			logger.error("û�п۷����ѣ�ͬ������ͬ�˻����Ѳ�ѯʧ��");
			throw new Exception();
		}
		close_web();
	}

	public void check_report_from_data_source_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case12[0]);
		click("update");
		if(check("cost_remind1")){
			click("ok");
			wait(60);    //����̶��ȴ�
			money2 = get_my_money();
			sum(money1-money2,reportcost);
		}else{
			logger.error("��ѯ����Դδ��ʾ�۷ѣ���ѯʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public double skip_cost_remind_ok(String para) throws Exception{
		double money;
		if(check("cost_remind")){
			click("ok");
			if(check(para)){
				money = get_my_money();
			}else{
				logger.error("���Ԫ�أ� "+para+" ������");
				throw new Exception();
			}
		}else{
			logger.error("δ�����շ���ʾ��ִ��ʧ��");
			throw new Exception();
		}
		return money;
	}
	/****��ҳ���л����ж�****/
	public double skip_cost_remind_ok_switch(String para) throws Exception{
		double money;
		if(check("cost_remind")){
			wait(2);  //�ϴ��ļ���������ʱ��ʧ��
			click("ok");
			wait(2);  //�ֶ���ʱ�ȴ��´��ڴ򿪣������ж�û���´���
			switchto();
			if(check(para)){
				switchto();
				money = get_my_money();
			}else{
				logger.error("���Ԫ�أ� "+para+" ������");
				throw new Exception();
			}
		}else{
			logger.error("δ�����շ���ʾ��ִ��ʧ��");
			throw new Exception();
		}
		return money;
	}
	
	public double skip_cost_remind_cancel() throws Exception{
		double money;
		if(check("cost_remind")){
			click("cancel");
			money = get_my_money();
		}else{
			logger.error("δ�����շ���ʾ��ִ��ʧ��");
			throw new Exception();
		}
		return money;
	}
	
	public void check_shareholders_info_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport",case13[0]);
		click("maosai");
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,persbussreport1);
		close_web();
	}
	
	public void check_legals_company_info_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_company_form("WXreport","check_company",case14[0]);
		click("legal_person");
		click("beijingda");
		money2 = skip_cost_remind_ok_switch("reg_num");
		sum(money1-money2,reportcost);
		close_web();
	}
	
	public void search_person_form_WXreport(String name,String cid,String card,String phone) throws Exception{
		click("WXreport");
		click("check_person");
		write("person_name",name);
		write("cid",cid);
		write("card",card);
		write("phone",phone);
		if(!check("uploadinfo")){
			upload("upload",filepath+cid+".png");
		}
		click("search1");
	}
	
	public void check_0grade_personal_report_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_person_form_WXreport(case15[0],case15[1],case15[2],case15[3]);
		money2 = skip_cost_remind_ok_switch("noenough_info");
		sum(money1-money2,persWXreport);
		close_web();
	}
	
	public void check_1grade_personal_report_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_person_form_WXreport(case16[0],case16[1],case16[2],case16[3]);
		money2 = skip_cost_remind_ok_switch("addtotail");
		sum(money1-money2,persWXreport);
		close_web();
	}
	
	public void check_personal_report_from_history_test() throws Exception{
		enterprise_landing();
		click("WXreport");
		click("check_person");
		click("tongwenzhou");
		switchto();
		if(check("addtotail")){
			logger.info("����ʷ��¼�в鿴���˱��棬ִ�гɹ�");
		}else{
			logger.error("����ʷ��¼�в鿴���˱��棬ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void search_person_batch_form_WXreport(String excel,String zip) throws Exception{
		click("WXreport");
		click("check_person");
		click("search_batch");
		if(check("excel_batch")){
			upload("excel_batch",filepath+excel+".xls");
			wait(1);
			upload("zip_batch",filepath+zip+".zip");
		}else{
			logger.error("δ�������ϴ�����");
			throw new Exception();
		}
		click("upload_batch");
		wait(1);
		click("search_batch1");
	}
	
	public void wait_batch() throws Exception{
		if(check("wait_batch")){
			wait(130);     //�ֶ��ȴ������ϴ����
			if(check("search_longtime")){
				click("ok1");
				logger.info("��ѯ��������100%ʱ��û�в�ѯ��ϣ����ȷ����ת");
			}else{
				logger.error("��ѯ��������100%ʱ��û�в�ѯ��ϣ�δ������رմ�����ʾ");
				throw new Exception();
			}
			logger.info("�����ϴ���ִ�гɹ�");
		}else{
			logger.error("�����ϴ���ִ��ʧ��");
			throw new Exception();
		}
	}
	
	public void check_personal_report_batch_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		search_person_batch_form_WXreport(case18[0],case18[1]);
		wait_batch();
		money2 = get_my_money();
		sum(money1-money2,5*persWXreport);
		close_web();
	}
	
}
