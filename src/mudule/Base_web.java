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
			logger.info("提示：上传的文件名必须和身份证号一致，");
		}else{
			logger.error("未提示：上传的文件名必须和身份证号一致，执行失败");
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
			logger.info("不需要再上传此人的授权文件，执行成功");
		}else{
			logger.error("还需要再上传此人的授权文件，执行失败");
		    throw new Exception();
		}
		close_web();
	}
	
	
	
	
	
	
	
	
	
	
	//case000配置参数相关函数
	public void enterprise_landing_simulate(String account,String password) throws Exception{	
		open_web("http://192.168.100.34:7080/cms/login");
		max_size();
		if(check("setting_login")){
			write("setting_name_input",account);
			write("setting_password_input",password);
			click("setting_login");
		}else{
			logger.error("没有进入登陆界面");
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
    	reportcost = recost("188");                        //计费码188
    	persbussreport = recost("821");                    //计费码821
    	persbussreport1 = recost("203");                   //计费码203
    	persWXreport = recost("186");                      //计费码186
    	gradecost = recost("1");                           //计费码1
    	fourdimcost = recost("108");                       //计费码108
    	twodimcost_nameid = recost("142");                 //计费码142
    	twodimcost_namecard = recost("140");               //计费码140
    	twodimcost_cardpho = recost("141");                //计费码141
    	threedimcost = recost("75");                       //计费码75
    	ICcompanycost = recost("202");                     //计费码202
    	ICpersoncost = recost("203");                      //计费码203
    	judcost = recost("196");                           //计费码196
    	tradcost = recost("28");                           //计费码28   
    	PQCcost = recost("15");                            //计费码15
    	URTcost = recost("30");                            //计费码30
    	fixlinecost = recost("69");                        //计费码69
    	blacklistcost = recost("129");                     //计费码129
    	UPBcost = recost("214");                           //计费码214
    	UPBcheckcost = recost("105");                      //计费码105
    	ATScheckcost = recost("50");                       //计费码50
    	ATScost = recost("213");                           //计费码213
    	PFTcheckcost = recost("75");                       //计费码75
    	PFTcost1 = recost("241");                          //计费码241
    	PFTcost2 = recost("242");                          //计费码242
    	PFTcost3 = recost("243");                          //计费码243
    	PFTcost4 = recost("244");                          //计费码244
    	frametodefault();
    	close_web();
    }
    
}
