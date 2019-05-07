package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

public class Base_web extends My_account{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void search_person_form_WXgrade_diff(String name,String cid,String card,String phone,String cid1) throws Exception{
		click("WXgrade");
		write("person_name",name);
		write("cid",cid);
		upload("upload",filepath+cid1+".png");
		write("card",card);
		write("phone",phone);
		click("search");
	}
	
	public void re_upload(String cid,String para) throws Exception{
		upload("upload",filepath+cid+".png");
		click("search");
		wait(1);
		click("ok");
		switchto();
		check_source(para);
	}
	
	public void check_key_file_test() throws Exception{
		enterprise_landing();
		search_person_form_WXgrade_diff(case98[0],case98[1],case98[2],case98[3],case98[4]);
		if(check("cidandfile_warn")){
			logger.info("��ʾ���ϴ����ļ�����������֤��һ�£�");
		}else{
			logger.error("δ��ʾ���ϴ����ļ�����������֤��һ�£�ִ��ʧ��");
			throw new Exception();
		}
		re_upload(case98[1],case98[5]);
		close_web();
	}
	
	public void check_key_file_test1() throws Exception{
		enterprise_landing();
		search_person_form_WXgrade(case99[0],case99[1],case99[2],case99[3]);
		click("ok");
		click("WXreport");
		click("check_person");
		write("person_name",case99[0]);
		write("cid",case99[1]);
		write("card",case99[2]);
		if(check("uploadinfo")){
			logger.info("����Ҫ���ϴ����˵���Ȩ�ļ���ִ�гɹ�");
		}else{
			logger.error("����Ҫ���ϴ����˵���Ȩ�ļ���ִ��ʧ��");
		    throw new Exception();
		}
		close_web();
	}
	
	
	
	
	
	
	
	
	
	
	//case000���ò�����غ���
	public void enterprise_landing_simulate(String account,String password) throws Exception{	
		open_web("http://192.168.100.34:7080/cms/login");
		max_size();
		if(check("setting_login")){
			write("setting_name_input",account);
			write("setting_password_input",password);
			click("setting_login");
		}else{
			logger.error("û�н����½����");
            throw new Exception();
		}
	}
	
	public void fixed_menu() throws Exception{
		frameto("leftFrame");
		click("manage_charing");
		click("tariff");
		frametodefault();
	}
	
	public double recost(String para) throws Exception{
		double cost = Double.parseDouble(read("charging_"+para));
		return cost; 
	}
	
    public void setting_charge() throws Exception {
    	enterprise_landing_simulate("admin","123");
    	fixed_menu();
    	frameto("rightFrame");
    	reportcost = recost("188");                        //�Ʒ���188
    	persbussreport = recost("821");                    //�Ʒ���821
    	persbussreport1 = recost("203");                   //�Ʒ���203
    	persWXreport = recost("186");                      //�Ʒ���186
    	gradecost = recost("1");                           //�Ʒ���1
    	fourdimcost = recost("108");                       //�Ʒ���108
    	twodimcost_nameid = recost("142");                 //�Ʒ���142
    	twodimcost_namecard = recost("140");               //�Ʒ���140
    	twodimcost_cardpho = recost("141");                //�Ʒ���141
    	threedimcost = recost("75");                       //�Ʒ���75
    	ICcompanycost = recost("202");                     //�Ʒ���202
    	ICpersoncost = recost("203");                      //�Ʒ���203
    	judcost = recost("196");                           //�Ʒ���196
    	tradcost = recost("28");                           //�Ʒ���28   
    	PQCcost = recost("15");                            //�Ʒ���15
    	URTcost = recost("30");                            //�Ʒ���30
    	fixlinecost = recost("69");                        //�Ʒ���69
    	blacklistcost = recost("129");                     //�Ʒ���129
    	UPBcost = recost("214");                           //�Ʒ���214
    	UPBcheckcost = recost("105");                      //�Ʒ���105
    	ATScheckcost = recost("50");                       //�Ʒ���50
    	ATScost = recost("213");                           //�Ʒ���213
    	PFTcheckcost = recost("75");                       //�Ʒ���75
    	PFTcost1 = recost("241");                          //�Ʒ���241
    	PFTcost2 = recost("242");                          //�Ʒ���242
    	PFTcost3 = recost("243");                          //�Ʒ���243
    	PFTcost4 = recost("244");                          //�Ʒ���244
    	frametodefault();
    	close_web();
    }
    
}
