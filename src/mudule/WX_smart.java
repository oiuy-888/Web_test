package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

public class WX_smart extends WX_cloud{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public void switch_to_smart_object(String para) throws Exception{
		click("WXsmart");
		click(para);
	}
	
	public void IC_company_input(String name) throws Exception{
		click("IC_check_company");
		write("IC_company_input",name);
		click("IC_company_search");
	}
	
    public void IC_person_input(String name,String id) throws Exception{
		click("IC_check_person");
		write("IC_personname_input", name);
		write("IC_personid_input", id);
		click("IC_person_search");
	}
	
	public void check_ICinfo_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_company_input(case45[0]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,ICcompanycost);
		close_web();
	}
	
	public void check_ICinfo_by_code_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_company_input(case46[0]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,ICcompanycost);
		close_web();
	}
	
	public void check_ICinfo_pic_report_test() throws Exception{
		enterprise_landing();
		switch_to_smart_object("ICinfo");
		IC_company_input(case47[0]);
	    click("ok");
		switchto();
		click("more");
		switchto();
		if(check("hierarchy")){
			logger.info("在报告中点击查看更多，跳转到关联图谱页面，执行成功");
		}else{
			logger.error("在报告中点击查看更多，未跳转到关联图谱页面，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_ICinfo_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_company_input(case48[0]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,ICcompanycost);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}

	public void check_ICinfo_person_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_person_input(case49[0],case49[1]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,ICpersoncost);
		close_web();
	}
	
	public void check_ICinfo_person_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_person_input(case50[0],case50[1]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,ICpersoncost);
		close_web();
	}
	
	public void check_ICinfo_person_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_person_input(case51[0],case51[1]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,ICpersoncost);
		close_web();
	}
	
	public void check_more_default_test() throws Exception{
		enterprise_landing();
		switch_to_smart_object("ICinfo");
		click("more1");
		switchto();
		if(read("IC_default").trim().equals(case52[0])){
			logger.info("历史记录页面，默认在万象智慧--工商信息处，执行成功");
		}else{
			logger.error("历史记录页面，默认不在万象智慧--工商信息处，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_ICinfo_person_test4() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ICinfo");
		IC_person_input(case53[0],case53[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,ICpersoncost);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void jud_company_input(String name) throws Exception{
		click("jud_check_company");
		write("jud_company_input",name);
		click("jud_company_search");
	}
	
    public void jud_person_input(String name,String id) throws Exception{
		click("jud_check_person");
		write("jud_personname_input", name);
		write("jud_personcid_input", id);
		click("jud_person_search");
	}
	
	public void check_judinfo_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_company_input(case54[0]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_judinfo_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_company_input(case55[0]);
		money2 = skip_cost_remind_ok_switch("jud_details");
		sum(money1-money2,judcost);
		close_web();
	}
	
	public void check_judinfo_person_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_person_input(case56[0],case56[1]);
		money2 = skip_cost_remind_ok_switch("jud_details");
		sum(money1-money2,judcost);
		close_web();
	}
	
	public void check_judinfo_person_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_person_input(case57[0],case57[1]);
		money2 = skip_cost_remind_ok_switch("jud_details");
		sum(money1-money2,judcost);
		close_web();
	}
	
	public void check_judinfo_person_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_person_input(case58[0],case58[1]);
		money2 = skip_cost_remind_ok_switch("jud_details");
		sum(money1-money2,judcost);
		close_web();
	}
	
	public void check_judinfo_person_test3() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_person_input(case59[0],case59[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_judinfo_person_test4() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("judinfo");
		jud_person_input(case60[0],case60[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void trad_input(String name,String cid) throws Exception{
		write("trad_name_input",name);
		write("trad_cid_input",cid);
		click("trad_search");
	}
	
	public void check_tradinfo_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("tradinfo");
		trad_input(case61[0],case61[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_tradinfo_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("tradinfo");
		trad_input(case62[0],case62[1]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,tradcost);
		close_web();
	}
	
	public void check_tradinfo_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("tradinfo");
		trad_input(case63[0],case63[1]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,tradcost);
		close_web();
	}
	
	public void PQC_input(String name,String cid) throws Exception{
		write("PQC_name_input",name);
		write("PQC_cid_input",cid);
		click("PQC_excl_point");     //相当于刷新界面
		if(check("uploadinfo1")){
			upload("upload",filepath+cid+".png");
		}
		click("PQC_search");
	}
	
	public void check_PQCinfo_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PQCinfo");
		PQC_input(case64[0],case64[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_PQCinfo_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PQCinfo");
		PQC_input(case65[0],case65[1]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,PQCcost);
		close_web();
	}
	
	public void check_PQCinfo_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PQCinfo");
		PQC_input(case66[0],case66[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void UTR_input(String name,String cid,String card,String phone) throws Exception{
		write("UTR_name_input",name);
		write("UTR_cid_input",cid);
		write("UTR_card_input",card);
		write("UTR_phone_input",phone);
		if(check("uploadinfo1")){
			upload("UTR_upload",filepath+cid+".png");
		}
		click("UTR_search");
	}
	
	public void check_UTRinfo_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UTRinfo");
		UTR_input(case67[0],case67[1],case67[2],case67[3]);
		money2 = skip_cost_remind_ok_switch("report_host");
		sum(money1-money2,URTcost);
		close_web();
	}
	
	public void check_UTRinfo_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UTRinfo");
		UTR_input(case68[0],case68[1],case68[2],case68[3]);
		money2 = skip_cost_remind_ok_switch("report_host");
		sum(money1-money2,URTcost);
		close_web();
	}
	
	public void check_UTRinfo_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UTRinfo");
		UTR_input(case69[0],case69[1],case69[2],case69[3]);
		money2 = skip_cost_remind_ok_switch("report_host");
		sum(money1-money2,URTcost);
		close_web();
	}
	
	public void check_UTRinfo_test3() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UTRinfo");
		UTR_input(case70[0],case70[1],case70[2],case70[3]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void fixline_input(String phone,String name,String address) throws Exception{
		write("fixline_phone_input",phone);
		write("fixline_name_input",name);
		write("fixline_address_input",address);
		click("fixline_search");
	}
	
	public void check_fixlineinfo_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("fixlineinfo");
		fixline_input(case71[0],case71[1],case71[2]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,fixlinecost);
		close_web();
	}
	
	public void check_fixlineinfo_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("fixlineinfo");
		fixline_input(case72[0],case72[1],case72[2]);
		click("ok");
		if(check("fixline_right_result")){
			money2 = get_my_money();
			sum(money1-money2,fixlinecost);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_fixlineinfo_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("fixlineinfo");
		fixline_input(case73[0],case73[1],case73[2]);
		click("ok");
		if(check("fixline_wrong_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void blacklist_input(String name,String cid) throws Exception{
		write("blacklist_name_input",name);
		write("blacklist_cid_input",cid);
		click("blacklist_search");
	}
	
	public void check_blacklist_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("blacklistinfo");
		blacklist_input(case74[0],case74[1]);
		money2 = skip_cost_remind_ok_switch("blacklist_result");
		sum(money1-money2,blacklistcost);
		close_web();
	}
	
	public void check_blacklist_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("blacklistinfo");
		blacklist_input(case75[0],case75[1]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,zero);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void UPB_input(String name,String cid,String card,String begin,String end) throws Exception{
		write("UPB_name_input",name);
		write("UPB_cid_input",cid);
		write("UPB_card_input",card);
		write("UPB_begin_input",begin);
		write("UPB_end_input",end);
		if(!check("uploadinfo")){
			upload("UPB_upload",filepath+cid+".png");
		}
		click("UPB_search");
	}
	
	public void check_UPB_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UPBinfo");
		UPB_input(case76[0],case76[1],case76[2],case76[3],case76[4]);
		click("ok");
		if(check("UPB_wrong_result")){
			money2 = get_my_money();
			sum(money1-money2,UPBcheckcost);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_UPB_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UPBinfo");
		UPB_input(case77[0],case77[1],case77[2],case77[3],case77[4]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,(UPBcheckcost+UPBcost));
		close_web();
	}
	
	public void check_UPB_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("UPBinfo");
		UPB_input(case78[0],case78[1],case78[2],case78[3],case78[4]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,UPBcheckcost);
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void ATS_input(String name,String cid,String sch) throws Exception{
		write("ATS_name_input",name);
		write("ATS_cid_input",cid);
		write("ATS_schedule_input",sch);
		if(check("uploadinfo1")){
			upload("ATS_upload",filepath+cid+".png");
		}
		click("ATS_search");
	}
	
	public void check_ATS_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ATSinfo");
		ATS_input(case79[0],case79[1],case79[2]);
		money2 = skip_cost_remind_ok_switch("ATS_wrong_result");
		sum(money1-money2,(ATScheckcost));
		close_web();
	}
	
	public void check_ATS_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ATSinfo");
		ATS_input(case80[0],case80[1],case80[2]);
		click("ok");
		if(check("no_result")){
			money2 = get_my_money();
			sum(money1-money2,(ATScheckcost+ATScost));
		}else{
			logger.error("没有查询到结果返回异常，执行失败");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_ATS_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("ATSinfo");
		ATS_input(case81[0],case81[1],case81[2]);
		money2 = skip_cost_remind_ok_switch("report_time");
		sum(money1-money2,(ATScheckcost+ATScost));
		close_web();
	}
	
	public void PFT_input(String name,String cid,String phone,int select) throws Exception{
		write("PFT_name_input",name);
		write("PFT_cid_input",cid);
		write("PFT_phone_input",phone);
		click("PFT_select_input");
		if(select == 1){
			click("PFT_sele_one");
		}else if(select == 2){
			click("PFT_sele_one");
			click("PFT_sele_two");
		}else if(select == 3){
			click("PFT_sele_one");
			click("PFT_sele_two");
			click("PFT_sele_three");
		}else if(select == 4){
			click("PFT_sele_one");
			click("PFT_sele_two");
			click("PFT_sele_three");
			click("PFT_sele_four");
		}
		click("PFT_sele_ok");
		if(check("uploadinfo1")){
			upload("PFT_upload",filepath+cid+".png");
		}
		click("PFT_search");
	}
	//金融交易画像查询
	public void check_PFT_test() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PFTinfo");
		PFT_input(case82[0],case82[1],case82[2],1);
		money2 = skip_cost_remind_ok_switch("PFT_wrong_result");
		sum(money1-money2,PFTcheckcost);
		close_web();
	}
	//现改为手机运营商信息查询
	public void check_PFT_test1() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PFTinfo");
		PFT_input(case83[0],case83[1],case83[2],1);
		money2 = skip_cost_remind_ok_switch("PFT_result");
		sum(money1-money2,(PFTcheckcost+PFTcost1));
		close_web();
	}
	
	//现改为手机号码归属地信息查询
	public void check_PFT_test2() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PFTinfo");
		PFT_input(case84[0],case84[1],case84[2],2);
		money2 = skip_cost_remind_ok_switch("PFT_result");
		sum(money1-money2,(PFTcheckcost+PFTcost1+PFTcost2));
		close_web();
	}
	
	public void check_PFT_test3() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PFTinfo");
		PFT_input(case85[0],case85[1],case85[2],3);
		money2 = skip_cost_remind_ok_switch("PFT_result");
		sum(money1-money2,(PFTcheckcost+PFTcost1+PFTcost2+PFTcost3));
		close_web();
	}
	
	public void check_PFT_test4() throws Exception{
		double money1,money2;
		enterprise_landing();
		money1 = get_my_money();
		switch_to_smart_object("PFTinfo");
		PFT_input(case86[0],case86[1],case86[2],4);
		money2 = skip_cost_remind_ok_switch("PFT_result");
		sum(money1-money2,(PFTcheckcost+PFTcost1+PFTcost2+PFTcost3+PFTcost4));
		close_web();
	}
	
}
