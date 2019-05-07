package mudule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WX_cloud extends WX_observe{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void no_input_4dim_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		click("4check");
		if((check("req_name"))&&(check("req_id"))&&(check("req_card"))&&(check("req_phone"))){
			logger.info("��ά���鴦û���������ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά���鴦û���������ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void add_4dim(String name,String cid,String card,String phone) throws Exception{
		write("4name",name);
		write("4id",cid);
		write("4card",card);
		write("4phone",phone);
		click("4check");
		click("ok");
	}
	
	public void err_input_4dim_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_4dim(case29[0],case29[1],case29[2],case29[3]);    
		if(check("4errinfo")){
			logger.info("��ά���鴦����������ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά���鴦����������ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void right_input_4dim_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_4dim(case30[0],case30[1],case30[2],case30[3]);
		if(check("4sucinfo")){
			logger.info("��ά���鴦������ȷ���ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά���鴦������ȷ���ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_4dim_coat_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		click("WXcloud");
		add_4dim(case31[0],case31[1],case31[2],case31[3]);
		if(check("4sucinfo")||check("4errinfo")){
			money2 = get_my_money();
			sum(money1-money2,fourdimcost);
		}else{
			logger.error("���������ݣ�ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void add_2dim_name_id(String name,String cid) throws Exception{
		click("2dim_choose");
		click("name_id");
		write("2name",name);
		write("2id",cid);
		click("2check");
		click("ok");
	}
	
	public void add_2dim_name_card(String name,String card) throws Exception{
		click("2dim_choose");
		click("name_card");
		write("2name",name);
		write("2card",card);
		click("2check");
		click("ok");
	}
	
	public void add_2dim_card_phone(String card,String phone) throws Exception{
		click("2dim_choose");
		click("card_phone");
		write("2card",card);
		write("2phone",phone);
		click("2check");
		click("ok");
	}
	
	public void err_input_2dim_name_id_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_name_id(case32[0],case32[1]);
		if(check("4errinfo")){
			logger.info("��ά��֤����������ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤����������ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void right_input_2dim_name_id_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_name_id(case33[0],case33[1]);
		if(check("4sucinfo")){
			logger.info("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void input_norecord_2dim_name_id_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_name_id(case34[0],case34[1]);
		if(check("4norecordinfo")){
			logger.info("��ά��֤��������޼�¼���ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤��������޼�¼���ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_2dim_name_id_coat_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		click("WXcloud");
		add_2dim_name_id(case35[0],case35[1]);
		if(check("4sucinfo")||check("4errinfo")){
			money2 = get_my_money();
			sum(money1-money2,twodimcost_nameid);
		}else{
			logger.error("���������ݣ�ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void err_input_2dim_name_card_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_name_card(case36[0],case36[1]);
		if(check("4errinfo")){
			logger.info("��ά��֤����������ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤����������ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void right_input_2dim_name_card_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_name_card(case37[0],case37[1]);
		if(check("4sucinfo")){
			logger.info("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_2dim_name_card_coat_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		click("WXcloud");
		add_2dim_name_card(case38[0],case38[1]);
		if(check("4sucinfo")||check("4errinfo")){
			money2 = get_my_money();
			sum(money1-money2,twodimcost_namecard);
		}else{
			logger.error("���������ݣ�ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void err_input_2dim_card_phone_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_card_phone(case39[0],case39[1]);
		if(check("4errinfo")){
			logger.info("��ά��֤����������ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤����������ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void right_input_2dim_card_phone_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_2dim_card_phone(case40[0],case40[1]);
		if(check("4sucinfo")){
			logger.info("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_2dim_card_phone_coat_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		click("WXcloud");
		add_2dim_card_phone(case41[0],case41[1]);
		if(check("4sucinfo")||check("4errinfo")){
			money2 = get_my_money();
			sum(money1-money2,twodimcost_cardpho);
		}else{
			logger.error("���������ݣ�ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void add_3dim(String name,String cid,String phone) throws Exception{
		write("3name",name);
		write("3id",cid);
		write("3phone",phone);
		click("3check");
		click("ok");
	}
	
	public void err_input_3dim_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_3dim(case42[0],case42[1],case42[2]);
		if(check("3errinfo")){
			logger.info("��ά��֤����������ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤����������ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void right_input_3dim_test() throws Exception{
		enterprise_landing();
		click("WXcloud");
		add_3dim(case43[0],case43[1],case43[2]);
		if(check("4sucinfo")){
			logger.info("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ�гɹ�");
		}else{
			logger.error("��ά��֤������ȷ���ݣ���ʾ��Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_3dim_coat_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		click("WXcloud");
		add_3dim(case44[0],case44[1],case44[2]);
		if(check("4sucinfo")||check("4errinfo")){
			money2 = get_my_money();
			sum(money1-money2,threedimcost);
		}else{
			logger.error("���������ݣ�ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
}
