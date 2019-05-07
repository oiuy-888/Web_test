package config;

public class Home_cfg extends Set_cfg{

	public Home_cfg(){
		super();
	}
	
	@Override
    public void set_default() {
		this.name = "Config";
		add("login",new button("//*[text()='��¼']",method_sel.xpath,"��ʼҳ���¼��ת"));
		add("user_login",new button("//*[text()='�û���']",method_sel.xpath,"��֤�Ƿ���ת���û�����¼����"));
		add("test_account",new button("account",method_sel.id,"�˻�"));
		add("test_password",new button("pwd_input_ip",method_sel.id,"����"));
		add("enter",new button("button_id",method_sel.id,"��¼"));
		add("out",new button("�˳�",method_sel.xpaths,"�˳�"));
		add("ls",new button("//*[text()='lishuai']",method_sel.xpath,"�˻�����"));
		add("Home",new button("//*[text()='��ҳ']",method_sel.xpath,"��ҳ"));
		add("WXreport",new button("//*[text()='���󱨸�']",method_sel.xpath,"���󱨸�"));
		add("WXgrade",new button("//*[text()='��������']",method_sel.xpath,"��������"));
		add("WXobserve",new button("//*[text()='���󶯲�']",method_sel.xpath,"���󶯲�"));
		add("WXcloud",new button("//*[text()='�����ƶ�']",method_sel.xpath,"�����ƶ�"));
		add("WXsmart",new button("//*[text()='�����ǻ�']",method_sel.xpath,"�����ǻ�"));
		add("WXunion",new button("//*[text()='��������']",method_sel.xpath,"��������"));
		add("My_account",new button("//span[contains(text(),'�ҵ��˻�')]",method_sel.xpath,"��ѯ��Ŷ���˻�"));
		
		
		//HOME
		add("agency_information",new button("����ע����Ϣ",method_sel.xpaths,"ע�������Ϣ������֤�Ƿ�������"));
		add("company_web",new button("//*[text()='��˾��ַ']",method_sel.xpath,"��˾��ַ���ڼ����Ƿ�������"));
		add("enroll",new button("ע��",method_sel.parlintext,"��ҳ��ע��"));	
		add("orgname",new button("orgName",method_sel.id,"�г����������޹�˾"));	
		add("search",new button("//*[text()='��ѯ']",method_sel.xpath,"��ѯ"));
		add("reg_num",new button("ע���",method_sel.xpaths,"ע���"));
		add("80.00",new button("80.00 ��Ԫ",method_sel.xpaths,"80.00��ע���ʱ�"));
		add("3.00",new button("3.00 ��Ԫ������ң�",method_sel.xpaths,"3.00��ע���ʱ�"));
		add("update",new button("//*[text()='��������']",method_sel.xpath,"��������"));
		add("data",new button("base_info_updata",method_sel.clsname,"����������"));
		add("company_report",new button("//*[text()='�鿴��ҵ���ñ���']",method_sel.xpath,"�鿴��ҵ���ñ���"));
		add("conmuse_result",new button("ͳ��",method_sel.parlintext,"����ͳ����"));
		add("my_money",new button("consume_count_cor",method_sel.clsname,"�ҵ����"));
		add("ok",new button("ȷ��",method_sel.xpaths,"��ʾ���е�ȷ��"));
		add("cancel",new button("ȡ��",method_sel.xpaths,"��ʾ���е�ȡ��"));
		add("info1",new button("�������ݣ�",method_sel.xpaths,"���󱨸�ҳ�İ���������ʾ"));
		add("info2",new button("���ô����ݽ�ģ�������Ը���������ص�������ԡ����ü�¼����Լ��������Ϊ���ʺ��罻Ӱ�����ά�Ƚ����ۺ�������",method_sel.xpaths,"��������ҳ�İ�����ʾ����"));
		add("info3",new button("ѡ������ҵ���߼�ظ���",method_sel.xpaths,"���󶯲�ҳ�İ���������ʾ"));
		add("info4",new button("��ά��֤",method_sel.xpaths,"�����ƶ�ҳ�İ���������ʾ"));
		add("info5",new button("���ճ���ͳ�Ʊ���",method_sel.xpaths,"�����ǻ�ҳ�İ���������ʾ"));
		add("info6",new button("�����",method_sel.xpaths,"��������ҳ�İ���������ʾ"));
		
		
		//REPORT
		add("cost_remind",  new button("ȷ��",method_sel.xpaths,"ͨ�ý���Ŀ۷������е�ȷ��"));
		add("cost_remind0",  new button("html/body/div[3]/div[6]/div[2]",method_sel.xpath,"ͨ�ý���Ŀ۷������е���Ϣ"));
		add("cost_remind1",  new button("html/body/div[2]/div[6]/div[2]",method_sel.xpath,"ͨ�ý���Ŀ۷������е���Ϣ"));
		add("maosai",  new button("html/body/div[2]/div[8]/div/div[3]/div/div[3]/ul/li/div[2]/p/a/strong",method_sel.xpath,"��ҵ�����еĶ��³���ѡ"));
		add("personal_business_info_report",  new button("������Ϣ���棨���ˣ�",method_sel.xpaths,"������Ϣ���棨���ˣ�����"));
		add("company_state",  new button("��Ӫ����ҵ��",method_sel.xpaths,"ë�����˱����е���ҵ״̬"));
		add("report_time",  new button("����ʱ�䣺",method_sel.xpaths,"���³���ѡ���˹�����Ϣ����ı���ʱ��"));
		add("report_host",  new button("�������壺",method_sel.xpaths,"��������"));
		add("legal_person",  new button("html/body/div[2]/div[8]/div/div[2]/ul/li[4]/strong",method_sel.xpath,"��ҵ�����еķ���������"));
		add("beijingda",  new button("html/body/div[2]/div[8]/div/div[3]/div[4]/div/ul/li/h2/a/strong",method_sel.xpath,"��ҵ�����еķ�����������ת����ҵ"));
		add("check_person",  new button("�����",method_sel.xpaths,"���󱨸��в����"));
		add("check_company",  new button("����ҵ",method_sel.xpaths,"���󱨸��в���ҵ"));
		add("person_name",  new button("name",method_sel.id,"���󱨸��в������д������"));
		add("cid",  new button("cid",method_sel.id,"���󱨸��в������д�����֤��"));
		add("card",  new button("card",method_sel.id,"���󱨸��в������д�����п���"));
		add("phone",  new button("phone",method_sel.id,"���󱨸��в������д���ֻ���"));
		add("uploadinfo",  new button("������Ȩ�ļ����ϴ�",method_sel.xpaths,"�ϴ�������Ȩ�ļ�״̬��ʾ-���ϴ�"));
		add("uploadinfo1",  new button("��Ȩ�ļ������ڣ�",method_sel.xpaths,"�ϴ�������Ȩ�ļ�״̬��ʾ-δ�ϴ���δʹ�ã�"));
		add("upload",  new button("localUrl",method_sel.id,"�ϴ�������Ȩ�ļ�"));
		add("search_batch",  new button("������ѯ",method_sel.xpaths,"���󱨸���˲�ѯ�����������ѯ"));
		add("search_batch1",  new button("batchQueryPerReport",method_sel.id,"���󱨸���˲�ѯ�����ϴ��ļ����������ѯ"));
		add("search1",  new button("queryPerReportBtn",method_sel.id,"���󱨸���˲�ѯ����Ĳ�ѯ"));
		add("addtotail",  new button("������",method_sel.xpaths,"������"));
		add("noenough_info",  new button("��Ϣ����,��������",method_sel.xpaths,"��Ϣ����,��������"));
		add("tongwenzhou",  new button("html/body/div[3]/div[9]/div[2]/ul/li/a",method_sel.xpath,"�鱨��-�����-��ʷ��¼��һ��"));
		add("excel_batch",  new button("localUrlXsl",method_sel.id,"+ �ϴ�Excel�ļ�"));
		add("zip_batch",  new button("localUrlZip",method_sel.id,"+ �ϴ���Ȩ�ļ�ѹ����"));
		add("upload_batch",  new button("batchQueryPerReport",method_sel.id,"�����ϴ�"));
		add("wait_batch",  new button("���ڲ�ѯ�У��������ȴ�...",method_sel.xpaths,"���ڲ�ѯ�У��������ȴ�..."));
		add("search_longtime",  new button("��",method_sel.parlintext,"��ѯʱ�������ʾ"));
		add("ok1",  new button("��",method_sel.parlintext,"��ѯʱ�������ʾ����ȷ��"));
		
		
		//GRADE
		add("add2contr",  new button("�����",method_sel.parlintext,"������"));
		add("contr_object",  new button("���Ŀ��",method_sel.xpaths,"���Ŀ��"));
		add("search2",  new button("queryScoreBtn",method_sel.id,"�������ֽ���Ĳ�ѯ"));
		add("ok2",  new button("html/body/div[8]/div/div/input",method_sel.xpath,"�����ص�ȷ��"));
		add("tongwenzhou1",  new button("html/body/div/div[8]/div[2]/ul/li/a",method_sel.xpath,"����������ʷ��¼��һ��"));
		
		
		//OBSERVE
		add("obs_company",  new button("��ҵ���",method_sel.xpaths,"��ҵ���"));
		add("obs_person",  new button("���˼��",method_sel.xpaths,"���˼��"));
		add("obs_company1",  new button("img_entrty",method_sel.id,"��ҵ���ͼ"));
		add("obs_person1",  new button("img_person",method_sel.id,"���˼��ͼ"));
		add("ok3",  new button("html/body/div/div[5]/div/div/input",method_sel.xpath,"�����ص�ȷ��"));
		add("penging",  new button("������",method_sel.xpaths,"��ҵ���״̬�Ĵ�����"));
		add("--",  new button("--",method_sel.xpaths,"��ҵ��صĵ�������ʾ"));
		add("example",  new button("����",method_sel.xpaths,"����"));
		add("obs_batch",  new button("������Ӽ��",method_sel.xpaths,"��ҵ��ؽ����������Ӽ��"));
		add("obs_upload",  new button("localUrl",method_sel.id,"������Ӽ�أ����ϴ�Excel�ļ�"));
		add("obs_enturst",  new button("ί�м��",method_sel.xpaths,"ί�м��"));
		add("obs_companyname",  new button("orgname",method_sel.id,"���빫˾��������"));
		add("start_obs",  new button("������",method_sel.xpaths,"��ҵ������"));
		add("start_obs_batch",  new button("������Ӽ��",method_sel.xpaths,"������Ӽ�أ���ʼ�������"));
		add("choose_obs",  new button("ѡ������ҵ���߼�ظ���",method_sel.xpaths,"ѡ������ҵ���߼�ظ���"));
		add("half_year",  new button("html/body/div/div/table/tbody/tr[6]/td[4]",method_sel.xpath,"���˼������Ĭ��Ϊ����"));
		add("one_year",  new button("һ��",method_sel.xpaths,"��ҵ�������Ĭ��Ϊһ��"));
		add("ICinfo1",  new button("html/body/div/div[2]/table/tbody/tr[3]/td[2]",method_sel.xpath,"������͵ľ���·��"));
		add("ICinfo2",  new button("html/body/div/div[2]/table/tbody/tr[4]/td[2]",method_sel.xpath,"������͵ľ���·��"));
		add("ICinfo3",  new button("html/body/div/div[2]/table/tbody/tr[5]/td[2]",method_sel.xpath,"������͵ľ���·��"));
		add("check",  new button("�鿴",method_sel.xpaths,"���뵽�鿴�������"));
		add("mobilephone",  new button("mobilePhone",method_sel.id,"���˼�������ֻ�����"));
		
		
		//CLOUD
		add("4check",  new button("html/body/div/div[7]/div/div/div/form/div/div/div/a",method_sel.xpath,"��ά��֤�ľ���·��"));
		add("2check",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div[2]/div/a",method_sel.xpath,"��ά��֤�ľ���·��"));
		add("3check",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/div/a",method_sel.xpath,"��ά��֤�ľ���·��"));
		add("req_name",  new button("name-error",method_sel.id,"��������"));
		add("req_id",  new button("identity_id-error",method_sel.id,"���֤����"));
		add("req_card",  new button("card-error",method_sel.id,"���п��ű���"));
		add("req_phone",  new button("phone-error",method_sel.id,"�ֻ��ű���"));
		add("4name",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li/input",method_sel.xpath,"��ά��֤����"));
		add("4id",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li[2]/input",method_sel.xpath,"��ά��֤���֤��"));
		add("4card",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li[3]/input",method_sel.xpath,"��ά��֤���п���"));
		add("4phone",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li[4]/input",method_sel.xpath,"��ά��֤�ֻ���"));
		add("3name",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/ul/li/input",method_sel.xpath,"��ά��֤����"));
		add("3id",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/ul/li[2]/input",method_sel.xpath,"��ά��֤���֤��"));
		add("3phone",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/ul/li[3]/input",method_sel.xpath,"��ά��֤�ֻ���"));
		add("2name",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li/input",method_sel.xpath,"��ά��֤����"));
		add("2id",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li[2]/input",method_sel.xpath,"��ά��֤���֤��"));
		add("2card",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li[3]/input",method_sel.xpath,"��ά��֤���п���"));
		add("2phone",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li[4]/input",method_sel.xpath,"��ά��֤�ֻ���"));
		add("4errinfo",  new button("��֤ʧ��",method_sel.xpaths,"��֤ʧ����ʾ"));
		add("4sucinfo",  new button("ƥ��ɹ�",method_sel.xpaths,"��֤�ɹ���ʾ"));
		add("4norecordinfo",  new button("�����޼�¼",method_sel.xpaths,"�����޼�¼��ʾ"));
		add("name_id",  new button("���������֤��",method_sel.xpaths,"���������֤��"));
		add("name_card",  new button("���������п���",method_sel.xpaths,"���������п���"));
		add("card_phone",  new button("���п��ţ��ֻ���",method_sel.xpaths,"���п��ţ��ֻ���"));
		add("2dim_choose",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div",method_sel.xpath,"��ά��֤����ѡ��"));
		add("3errinfo",  new button("�ֻ���һ�£�֤���ź�������һ��",method_sel.xpaths,"��ά��֤ʧ����ʾ���ֻ��Ŵ��ڣ�"));
		add("3errinfo1",  new button("���벻����",method_sel.xpaths,"��ά��֤ʧ����ʾ���ֻ��Ų����ڣ�"));
		
		
		//SMART
		add("ICinfo",  new button("������Ϣ",method_sel.xpaths,"�����ǻ۹�����Ϣ"));
		add("judinfo",  new button("˾����Ϣ",method_sel.xpaths,"�����ǻ�˾����Ϣ"));
		add("tradinfo",  new button("�̻����׷���",method_sel.xpaths,"�����ǻ��̻����׷���"));
		add("PQCinfo",  new button("ְҵ�ʸ�֤��",method_sel.xpaths,"�����ǻ�ְҵ�ʸ�֤��"));
		add("UTRinfo",  new button("�������ױ���",method_sel.xpaths,"�����ǻ��������ױ���"));
		add("fixlineinfo",  new button("����̻��˲�",method_sel.xpaths,"�����ǻ�����̻��˲�"));
		add("blacklistinfo",  new button("����������",method_sel.xpaths,"�����ǻ�����������"));
		add("UPBinfo",  new button("�����˵��˲�",method_sel.xpaths,"�����ǻ������˵��˲�"));
		add("ATSinfo",  new button("���ճ���ͳ�Ʊ���",method_sel.xpaths,"�����ǻۺ��ճ���ͳ�Ʊ���"));
		add("PFTinfo",  new button("���ڽ��׻���",method_sel.xpaths,"�����ǻ۽��ڽ��׻���"));
		add("eduinfo",  new button("ѧ����Ϣ",method_sel.xpaths,"�����ǻ�ѧ����Ϣ"));
		add("operatorinfo",  new button("�ֻ���Ӫ����Ϣ",method_sel.xpaths,"�����ǻ��ֻ���Ӫ����Ϣ"));
		add("locationinfo",  new button("�ֻ������������Ϣ",method_sel.xpaths,"�����ǻ��ֻ������������Ϣ"));
		add("IC_company_input",  new button("orgname_ic",method_sel.id,"������Ϣ-����ҵ�����"));
		add("IC_personname_input",  new button("person_name_ic",method_sel.id,"������Ϣ-��������������"));
		add("IC_personid_input",  new button("person_orgname_ic",method_sel.id,"������Ϣ-�����֤���������"));
		add("konglingqiang",  new button("����ǿ",method_sel.xpaths,"��ҵ��ѯ�������"));
		add("lihongjie",  new button("����",method_sel.xpaths,"��ҵ��ѯ�������"));
		add("hierarchy",  new button("�㼶ͼ",method_sel.xpaths,"����ͼ���еĲ㼶ͼ��֤��"));
		add("more",  new button("html/body/div/div[3]/div/div/a",method_sel.xpath,"�����еĲ鿴����"));
		add("no_result",  new button("û�в�ѯ�����",method_sel.xpaths,"û�в�ѯ�����"));
		add("IC_check_company",  new button("html/body/div/div[7]/div/div[3]/ul/li",method_sel.xpath,"�����ǻ��й�����Ϣ����ҵ"));
		add("IC_check_person",  new button("html/body/div/div[7]/div/div[3]/ul/li[2]",method_sel.xpath,"�����ǻ��й�����Ϣ�����"));
		add("IC_person_result",  new button("����������ʳƷ���޹�˾",method_sel.xpaths,"�������˱�����֤��"));
		add("IC_person_result1",  new button("��������(����)�ɷ����޹�˾",method_sel.xpaths,"�ų�У���˱�����֤��"));
		add("IC_person_result2",  new button("���������������������޹�˾",method_sel.xpaths,"��˧���˱�����֤��"));
		add("IC_person_search",  new button("html/body/div/div[7]/div/div[3]/div/form[2]/div/div/div[2]/a",method_sel.xpath,"�����ǻ۹�����Ϣ������еĲ�ѯ"));
		add("IC_company_search",  new button("��ѯ",method_sel.xpaths,"�����ǻ۹�����Ϣ����ҵ�еĲ�ѯ"));
		add("more1",  new button("����",method_sel.parlintext,"�����ǻ۹�����Ϣҳ��ĸ���"));
		add("IC_default",  new button("html/body/div/div[7]/div[2]/div[5]/div/div/table/tbody/tr/td[2]/p/a",method_sel.xpath,"�����ʷĬ���������ǻ�-������Ϣ��"));
		add("jud_check_company",  new button("html/body/div/div[7]/div/div[4]/ul/li",method_sel.xpath,"�����ǻ���˾����Ϣ����ҵ"));
		add("jud_check_person",  new button("html/body/div/div[7]/div/div[4]/ul/li[2]",method_sel.xpath,"�����ǻ���˾����Ϣ�����"));
		add("jud_company_input",  new button("orgname_elisor",method_sel.id,"˾����Ϣ-����ҵ�����"));
		add("jud_personname_input",  new button("name_elisor",method_sel.id,"˾����Ϣ-��������������"));
		add("jud_personcid_input",  new button("cid_elisor",method_sel.id,"˾����Ϣ-�����֤���������"));
		add("jud_person_search",  new button("html/body/div/div[7]/div/div[4]/div/div[2]/form/div/div[2]/a",method_sel.xpath,"�����ǻ�˾����Ϣ������еĲ�ѯ"));
		add("jud_company_search",  new button("html/body/div/div[7]/div/div[4]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ�˾����Ϣ����ҵ�еĲ�ѯ"));
		add("jud_details",  new button("˾������",method_sel.xpaths,"�����ǻ�˾����Ϣ�������"));
		add("trad_name_input",  new button("mname",method_sel.id,"�����ǻ��̻����׷�����������"));
		add("trad_cid_input",  new button("midpid",method_sel.id,"�����ǻ��̻����׷����̻��������"));
		add("trad_search",  new button("html/body/div/div[7]/div/div[5]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ��̻����׷����еĲ�ѯ"));
		add("trad_result",  new button("100%",method_sel.xpaths,"111�̻����ױ�����֤��"));
		add("trad_result1",  new button("64%",method_sel.xpaths,"105220880430027�̻����ױ�����֤��"));
		add("PQC_name_input",  new button("name_cert",method_sel.id,"�����ǻ�ְҵ�ʸ�֤����������"));
		add("PQC_cid_input",  new button("cid_cert",method_sel.id,"�����ǻ�ְҵ�ʸ�֤�����֤������"));
		add("PQC_search",  new button("html/body/div/div[7]/div/div[6]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ�ְҵ�ʸ�֤���еĲ�ѯ"));
		add("PQC_result",  new button("������ְҵ���ܼ�������",method_sel.xpaths,"������ְҵ�ʸ�֤����֤��"));
		add("PQC_excl_point",  new button("html/body/div/div[7]/div/div[6]/div/div/form/div[3]/i",method_sel.xpath,"�ϴ���Ȩ�ļ�ǰˢ�µ�̾�ű�ʶ"));
		add("UTR_name_input",  new button("name_transaction",method_sel.id,"�����ǻ��������ױ�����������"));
		add("UTR_cid_input",  new button("cid_transaction",method_sel.id,"�����ǻ��������ױ������֤������"));
		add("UTR_card_input",  new button("card_transaction",method_sel.id,"�����ǻ��������ױ������п�������"));
		add("UTR_phone_input",  new button("mobile_transaction",method_sel.id,"�����ǻ��������ױ����ֻ�������"));
		add("UTR_search",  new button("html/body/div/div[7]/div/div[7]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ��������ױ���Ĳ�ѯ"));
		add("UTR_result",  new button("������",method_sel.xpaths,"���о��������ױ�����֤��"));
		add("UTR_result1",  new button("VISA����VIS��������ʶ��",method_sel.xpaths,"�κ��������ױ�����֤��"));
		add("UTR_result2",  new button("62������׼��",method_sel.xpaths,"������������ױ�����֤��"));
		add("UTR_upload",  new button("html/body/div/div[7]/div/div[7]/div/div/form/div[3]/input",method_sel.xpath,"�������ױ��������ϴ���Ȩ�ļ�"));
		add("fixline_phone_input",  new button("fixedPhone",method_sel.id,"�����ǻ�����̻��˲��������"));
		add("fixline_name_input",  new button("cname",method_sel.id,"�����ǻ�����̻��˲���������"));
		add("fixline_address_input",  new button("address",method_sel.id,"�����ǻ�����̻��˲��ַ����"));
		add("fixline_search",  new button("html/body/div/div[7]/div/div[8]/div/div/form/div/div[2]/a",method_sel.xpath,"����̻��˲�ҳ��Ĳ�ѯ"));
		add("fixline_result",  new button("�㶫ʡ��������������",method_sel.xpaths,"����������Ͷ�����޹�˾����̻��˲���֤��"));
		add("fixline_right_result",  new button("ƥ��ɹ�",method_sel.xpaths,"����̻��˲�ȫƥ��"));
		add("fixline_wrong_result",  new button("���벻����",method_sel.xpaths,"����̻��˲���벻����"));
		add("blacklist_name_input",  new button("name_netloan",method_sel.id,"�����ǻ�������������������"));
		add("blacklist_cid_input",  new button("cid_netloan",method_sel.id,"�����ǻ��������������֤������"));
		add("blacklist_search",  new button("html/body/div/div[7]/div/div[9]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ���������������Ĳ�ѯ"));
		add("blacklist_result",  new button("����ʱ�䣺",method_sel.xpaths,"�����ǻ������������鿴��������"));
		add("UPB_name_input",  new button("name",method_sel.id,"�����ǻ������˵��˲���������"));
		add("UPB_cid_input",  new button("cid",method_sel.id,"�����ǻ������˵��˲����֤������"));
		add("UPB_card_input",  new button("card",method_sel.id,"�����ǻ������˵��˲����п�������"));
		add("UPB_begin_input",  new button("beginDate",method_sel.id,"�����ǻ������˵��˲���ʼʱ������"));
		add("UPB_end_input",  new button("endDate",method_sel.id,"�����ǻ������˵��˲����ʱ������"));
		add("UPB_search",  new button("html/body/div/div[7]/div/div[10]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ������˵��˲�ҳ��Ĳ�ѯ"));
		add("UPB_wrong_result",  new button("����-���֤��һ��",method_sel.xpaths,"�����ǻ������˵��˲���Ϣ��ƥ����ʾ"));
		add("UPB_result",  new button("ũҵ����",method_sel.xpaths,"�����ǻ������˵��˲���֤�ɹ�"));
		add("UPB_upload",  new button("html/body/div/div[7]/div/div[10]/div/div/form/div[3]/input",method_sel.xpath,"�����˵��˲������ϴ���Ȩ�ļ�"));
		add("ATS_name_input",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div/ul/li/input",method_sel.xpath,"�����ǻۺ��ճ���ͳ�Ʊ�����������"));
		add("ATS_cid_input",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div/ul/li[2]/input",method_sel.xpath,"�����ǻۺ��ճ���ͳ�Ʊ������֤������"));
		add("ATS_schedule_input",  new button("select_schedule",method_sel.id,"�����ǻۺ��ճ���ͳ�Ʊ����ѯ��������"));
		add("ATS_search",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻۺ��ճ���ͳ�Ʊ������Ĳ�ѯ"));
		add("ATS_result",  new button("�",method_sel.xpaths,"�����ǻۺ��ճ���ͳ�Ʊ���"));
		add("ATS_wrong_result",  new button("�����֤ʧ��",method_sel.xpaths,"�����ǻۺ��ճ���ͳ�Ʊ���"));
		add("ATS_upload",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div[3]/input",method_sel.xpath,"�����ǻۺ��ճ���ͳ�Ʊ��������ϴ���Ȩ�ļ�"));
		add("PFT_name_input",  new button("fin_name",method_sel.id,"�����ǻ۽��ڽ��׻�����������"));
		add("PFT_cid_input",  new button("fin_cid",method_sel.id,"�����ǻ۽��ڽ��׻������֤������"));
		add("PFT_phone_input",  new button("fin_phone",method_sel.id,"�����ǻ۽��ڽ��׻����ֻ�������"));
		add("PFT_select_input",  new button("select_financial",method_sel.id,"�����ǻ۽��ڽ��׻���ѡ��������"));
		add("PFT_search",  new button("html/body/div/div[7]/div/div[12]/div/div/form/div/div[2]/a",method_sel.xpath,"�����ǻ۽��ڽ��׻������Ĳ�ѯ"));
		add("PFT_wrong_result",  new button("�ֻ���һ�£�֤���ź�������һ��",method_sel.xpaths,"�����ǻ۽��ڽ��׻���"));
		add("PFT_upload",  new button("html/body/div/div[7]/div/div[12]/div/div/form/div[3]/input",method_sel.xpath,"�����ǻ۽��ڽ��׻��������ϴ���Ȩ�ļ�"));
		add("PFT_sele_one",  new button("���ڽ��׻���1--��1��Ľ�ǿ���Ϣ",method_sel.xpaths,"�����ǻ۽��ڽ��׻���1"));
		add("PFT_sele_two",  new button("���ڽ��׻���2--��3���µĽ�ǿ���Ϣ",method_sel.xpaths,"�����ǻ۽��ڽ��׻���2"));
		add("PFT_sele_three",  new button("���ڽ��׻���3--1���ڵ����ÿ���Ϣ",method_sel.xpaths,"�����ǻ۽��ڽ��׻���3"));
		add("PFT_sele_four",  new button("���ڽ��׻���4--���п������Ϣ",method_sel.xpaths,"�����ǻ۽��ڽ��׻���4"));
		add("PFT_sele_ok",  new button("html/body/div/div[7]/div/div[12]/div/div/form/div/ul/li[4]/div[2]/div/a",method_sel.xpath,"�����ǻ۽��ڽ��׻����е�ȷ��"));
		add("PFT_result",  new button("������",method_sel.xpaths,"�����ǻ۽��ڽ��׻��񱨸���֤��"));
		
		
		//UNION
		add("union_name_input",          new button("allian_name",method_sel.id,"��������ҳ����������"));
		add("union_sid_input",           new button("allian_cid",method_sel.id,"��������ҳ�����֤������"));
		add("union_upload",              new button("html/body/div[2]/div[8]/div[2]/form/div/div/div/div[3]/input",method_sel.xpath,"��������ҳ���ϴ�������Ȩ�ļ�"));
		add("union_search",              new button("html/body/div[2]/div[8]/div[2]/form/div/div/div/div/div[2]/a",method_sel.xpath,"��������ҳ��Ĳ�ѯ"));
		add("union_excl_point",          new button("html/body/div[2]/div[8]/div[2]/form/div/div/div/div[3]/i",method_sel.xpath,"��������ҳ���ļ��ϴ�����С̾��-�൱��ˢ��"));
		add("union_wrong_result",        new button("���֤����",method_sel.xpaths,"��������ҳ�����֤����"));
		add("union_result",              new button("�������ڸ�����Ϣ",method_sel.xpaths,"�������˳�������֤��"));
		add("union_money",               new button("html/body/div[2]/div[8]/div/div/div[2]/p/span",method_sel.xpath,"��������ҳ�������"));
		add("union_report_1",            new button("html/body/div/div[3]/div[2]/h3/span",method_sel.xpath,"�������˱���������������Ϣ��¼"));
		add("union_report_2",            new button("html/body/div/div[3]/div[2]/h3[2]/span",method_sel.xpath,"�������˱����б�ִ������Ϣ��¼"));
		add("union_report_3",            new button("html/body/div/div[3]/div[2]/h3[3]/span",method_sel.xpath,"�������˱�����ʧ��������Ϣ��¼"));
		add("batch_upload_data",         new button("�����������",method_sel.xpaths,"��������ҳ�������������"));
		add("batch_upload",              new button("localUrl1",method_sel.id,"��������ҳ�������ϴ�����"));
		add("batch_upload_button",       new button("batchAddButton",method_sel.id,"��������ҳ�������������"));
		add("close_batch",               new button("html/body/div[2]/div[15]/h2/a",method_sel.xpath,"��������ҳ�������ϴ���Ĺر�"));
		
		
		//ACCOUNT
		add("account_control",  new button("�˻�����",method_sel.xpaths,"�˻�����"));
		add("account_expend",  new button("html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/p",method_sel.xpath,"���ѽ��"));
		add("account_search_times",  new button("html/body/div/div[2]/div[2]/div/div[2]/ul/li[3]/p",method_sel.xpath,"��ѯ����"));
		add("account_week",  new button("��������ͳ��",method_sel.xpaths,"����ͳ��"));
		add("account_week_cost",  new button("�����˺�����ͳ��",method_sel.xpaths,"�����˺�����ͳ��"));
		add("account_month",  new button("��������ͳ��",method_sel.xpaths,"����ͳ��"));
		add("account_month_cost",  new button("�����˺�����ͳ��",method_sel.xpaths,"�����˺�����ͳ��"));
		add("account_year",  new button("������������ͳ��",method_sel.xpaths,"��6����ͳ��"));
		add("account_year_cost",  new button("��6�����˺�����ͳ��",method_sel.xpaths,"��6�����˺�����ͳ��"));
		
		
		//SPECIAL
		add("cidandfile_warn",  new button("�ϴ����ļ�����������֤��һ��",method_sel.xpaths,"�ϴ����ļ�����������֤��һ��"));
		
		
		//SETTING
		add("setting_name_input",  new button("username",method_sel.id,"��̨������˻�"));
		add("setting_password_input",  new button("password",method_sel.id,"��̨���������"));
		add("setting_login", new button("html/body/div[3]/div/form/ul/li[3]/input",method_sel.xpath,"��̨����ĵ�½"));
		add("manage_charing",new button("html/body/dl/dd[4]/div",method_sel.xpath,"�Ʒѹ���"));
		add("tariff",        new button("html/body/dl/dd[4]/ul/li/a",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_188",  new button("html/body/div[2]/form/table/tbody/tr[82]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_821",  new button("html/body/div[2]/form/table/tbody/tr[208]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_203",  new button("html/body/div[2]/form/table/tbody/tr[89]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_186",  new button("html/body/div[2]/form/table/tbody/tr[81]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_1",    new button("html/body/div[2]/form/table/tbody/tr[1]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_108",  new button("html/body/div[2]/form/table/tbody/tr[53]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_142",  new button("html/body/div[2]/form/table/tbody/tr[62]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_140",  new button("html/body/div[2]/form/table/tbody/tr[60]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_141",  new button("html/body/div[2]/form/table/tbody/tr[61]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_75",   new button("html/body/div[2]/form/table/tbody/tr[43]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_202",  new button("html/body/div[2]/form/table/tbody/tr[88]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_203",  new button("html/body/div[2]/form/table/tbody/tr[89]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_196",  new button("html/body/div[2]/form/table/tbody/tr[84]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_28",   new button("html/body/div[2]/form/table/tbody/tr[19]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_15",   new button("html/body/div[2]/form/table/tbody/tr[9]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_30",   new button("html/body/div[2]/form/table/tbody/tr[21]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_69",   new button("html/body/div[2]/form/table/tbody/tr[41]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_129",  new button("html/body/div[2]/form/table/tbody/tr[58]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_214",  new button("html/body/div[2]/form/table/tbody/tr[96]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_105",  new button("html/body/div[2]/form/table/tbody/tr[50]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_50",   new button("html/body/div[2]/form/table/tbody/tr[25]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_213",  new button("html/body/div[2]/form/table/tbody/tr[95]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_75",   new button("html/body/div[2]/form/table/tbody/tr[43]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_241",  new button("html/body/div[2]/form/table/tbody/tr[107]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_242",  new button("html/body/div[2]/form/table/tbody/tr[108]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_243",  new button("html/body/div[2]/form/table/tbody/tr[109]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		add("charging_244",  new button("html/body/div[2]/form/table/tbody/tr[110]/td[10]",method_sel.xpath,"�Ʒѹ����µķ��ʱ�"));
		
	}
}
