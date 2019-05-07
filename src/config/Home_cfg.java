package config;

public class Home_cfg extends Set_cfg{

	public Home_cfg(){
		super();
	}
	
	@Override
    public void set_default() {
		this.name = "Config";
		add("login",new button("//*[text()='登录']",method_sel.xpath,"起始页面登录跳转"));
		add("user_login",new button("//*[text()='用户名']",method_sel.xpath,"验证是否跳转到用户名登录界面"));
		add("test_account",new button("account",method_sel.id,"账户"));
		add("test_password",new button("pwd_input_ip",method_sel.id,"密码"));
		add("enter",new button("button_id",method_sel.id,"登录"));
		add("out",new button("退出",method_sel.xpaths,"退出"));
		add("ls",new button("//*[text()='lishuai']",method_sel.xpath,"账户名称"));
		add("Home",new button("//*[text()='首页']",method_sel.xpath,"首页"));
		add("WXreport",new button("//*[text()='万象报告']",method_sel.xpath,"万象报告"));
		add("WXgrade",new button("//*[text()='万象评分']",method_sel.xpath,"万象评分"));
		add("WXobserve",new button("//*[text()='万象动察']",method_sel.xpath,"万象动察"));
		add("WXcloud",new button("//*[text()='万象云盾']",method_sel.xpath,"万象云盾"));
		add("WXsmart",new button("//*[text()='万象智慧']",method_sel.xpath,"万象智慧"));
		add("WXunion",new button("//*[text()='万象联盟']",method_sel.xpath,"万象联盟"));
		add("My_account",new button("//span[contains(text(),'我的账户')]",method_sel.xpath,"查询我哦的账户"));
		
		
		//HOME
		add("agency_information",new button("机构注册信息",method_sel.xpaths,"注册机构信息用于验证是否进入界面"));
		add("company_web",new button("//*[text()='公司网址']",method_sel.xpath,"公司网址用于检验是否进入界面"));
		add("enroll",new button("注册",method_sel.parlintext,"首页的注册"));	
		add("orgname",new button("orgName",method_sel.id,"中诚信征信有限公司"));	
		add("search",new button("//*[text()='查询']",method_sel.xpath,"查询"));
		add("reg_num",new button("注册号",method_sel.xpaths,"注册号"));
		add("80.00",new button("80.00 万元",method_sel.xpaths,"80.00万注册资本"));
		add("3.00",new button("3.00 万元（人民币）",method_sel.xpaths,"3.00万注册资本"));
		add("update",new button("//*[text()='立即更新']",method_sel.xpath,"立即更新"));
		add("data",new button("base_info_updata",method_sel.clsname,"最后更新日期"));
		add("company_report",new button("//*[text()='查看企业信用报告']",method_sel.xpath,"查看企业信用报告"));
		add("conmuse_result",new button("统计",method_sel.parlintext,"消费统计栏"));
		add("my_money",new button("consume_count_cor",method_sel.clsname,"我的余额"));
		add("ok",new button("确定",method_sel.xpaths,"提示框中的确定"));
		add("cancel",new button("取消",method_sel.xpaths,"提示框中的取消"));
		add("info1",new button("包含内容：",method_sel.xpaths,"万象报告页的包含内容提示"));
		add("info2",new button("采用大数据建模技术，对个人信用相关的身份属性、信用记录、履约能力、行为特质和社交影响五大维度进行综合评估。",method_sel.xpaths,"万象评分页的包含提示内容"));
		add("info3",new button("选择监控企业或者监控个人",method_sel.xpaths,"万象动察页的包含内容提示"));
		add("info4",new button("四维验证",method_sel.xpaths,"万象云盾页的包含内容提示"));
		add("info5",new button("航空出行统计报告",method_sel.xpaths,"万象智慧页的包含内容提示"));
		add("info6",new button("万象币",method_sel.xpaths,"万象联盟页的包含内容提示"));
		
		
		//REPORT
		add("cost_remind",  new button("确定",method_sel.xpaths,"通用界面的扣费提醒中的确定"));
		add("cost_remind0",  new button("html/body/div[3]/div[6]/div[2]",method_sel.xpath,"通用界面的扣费提醒中的信息"));
		add("cost_remind1",  new button("html/body/div[2]/div[6]/div[2]",method_sel.xpath,"通用界面的扣费提醒中的信息"));
		add("maosai",  new button("html/body/div[2]/div[8]/div/div[3]/div/div[3]/ul/li/div[2]/p/a/strong",method_sel.xpath,"企业报告中的董事长人选"));
		add("personal_business_info_report",  new button("工商信息报告（个人）",method_sel.xpaths,"工商信息报告（个人）标题"));
		add("company_state",  new button("在营（开业）",method_sel.xpaths,"毛赛个人报告中的企业状态"));
		add("report_time",  new button("报告时间：",method_sel.xpaths,"董事长人选个人工商信息报告的报告时间"));
		add("report_host",  new button("报告主体：",method_sel.xpaths,"报告主体"));
		add("legal_person",  new button("html/body/div[2]/div[8]/div/div[2]/ul/li[4]/strong",method_sel.xpath,"企业报告中的法定代表人"));
		add("beijingda",  new button("html/body/div[2]/div[8]/div/div[3]/div[4]/div/ul/li/h2/a/strong",method_sel.xpath,"企业报告中的法定代表人跳转的企业"));
		add("check_person",  new button("查个人",method_sel.xpaths,"万象报告中查个人"));
		add("check_company",  new button("查企业",method_sel.xpaths,"万象报告中查企业"));
		add("person_name",  new button("name",method_sel.id,"万象报告中查个人填写的姓名"));
		add("cid",  new button("cid",method_sel.id,"万象报告中查个人填写的身份证号"));
		add("card",  new button("card",method_sel.id,"万象报告中查个人填写的银行卡号"));
		add("phone",  new button("phone",method_sel.id,"万象报告中查个人填写的手机号"));
		add("uploadinfo",  new button("个人授权文件已上传",method_sel.xpaths,"上传个人授权文件状态提示-已上传"));
		add("uploadinfo1",  new button("授权文件不存在，",method_sel.xpaths,"上传个人授权文件状态提示-未上传（未使用）"));
		add("upload",  new button("localUrl",method_sel.id,"上传个人授权文件"));
		add("search_batch",  new button("批量查询",method_sel.xpaths,"万象报告个人查询界面的批量查询"));
		add("search_batch1",  new button("batchQueryPerReport",method_sel.id,"万象报告个人查询界面上传文件后的批量查询"));
		add("search1",  new button("queryPerReportBtn",method_sel.id,"万象报告个人查询界面的查询"));
		add("addtotail",  new button("加入监控",method_sel.xpaths,"加入监控"));
		add("noenough_info",  new button("信息不足,不予评分",method_sel.xpaths,"信息不足,不予评分"));
		add("tongwenzhou",  new button("html/body/div[3]/div[9]/div[2]/ul/li/a",method_sel.xpath,"查报告-查个人-历史记录第一条"));
		add("excel_batch",  new button("localUrlXsl",method_sel.id,"+ 上传Excel文件"));
		add("zip_batch",  new button("localUrlZip",method_sel.id,"+ 上传授权文件压缩包"));
		add("upload_batch",  new button("batchQueryPerReport",method_sel.id,"批量上传"));
		add("wait_batch",  new button("正在查询中，请稍作等待...",method_sel.xpaths,"正在查询中，请稍作等待..."));
		add("search_longtime",  new button("认",method_sel.parlintext,"查询时间过长提示"));
		add("ok1",  new button("认",method_sel.parlintext,"查询时间过长提示栏的确认"));
		
		
		//GRADE
		add("add2contr",  new button("加入监",method_sel.parlintext,"加入监控"));
		add("contr_object",  new button("监控目标",method_sel.xpaths,"监控目标"));
		add("search2",  new button("queryScoreBtn",method_sel.id,"万象评分界面的查询"));
		add("ok2",  new button("html/body/div[8]/div/div/input",method_sel.xpath,"加入监控的确定"));
		add("tongwenzhou1",  new button("html/body/div/div[8]/div[2]/ul/li/a",method_sel.xpath,"万象评分历史记录第一条"));
		
		
		//OBSERVE
		add("obs_company",  new button("企业监控",method_sel.xpaths,"企业监控"));
		add("obs_person",  new button("个人监控",method_sel.xpaths,"个人监控"));
		add("obs_company1",  new button("img_entrty",method_sel.id,"企业监控图"));
		add("obs_person1",  new button("img_person",method_sel.id,"个人监控图"));
		add("ok3",  new button("html/body/div/div[5]/div/div/input",method_sel.xpath,"加入监控的确定"));
		add("penging",  new button("待处理",method_sel.xpaths,"企业监控状态的待处理"));
		add("--",  new button("--",method_sel.xpaths,"企业监控的到期日显示"));
		add("example",  new button("样本",method_sel.xpaths,"样本"));
		add("obs_batch",  new button("批量添加监控",method_sel.xpaths,"企业监控界面的批量添加监控"));
		add("obs_upload",  new button("localUrl",method_sel.id,"批量添加监控，请上传Excel文件"));
		add("obs_enturst",  new button("委托监控",method_sel.xpaths,"委托监控"));
		add("obs_companyname",  new button("orgname",method_sel.id,"输入公司完整名称"));
		add("start_obs",  new button("加入监控",method_sel.xpaths,"企业加入监控"));
		add("start_obs_batch",  new button("批量添加监控",method_sel.xpaths,"批量添加监控，开始批量监控"));
		add("choose_obs",  new button("选择监控企业或者监控个人",method_sel.xpaths,"选择监控企业或者监控个人"));
		add("half_year",  new button("html/body/div/div/table/tbody/tr[6]/td[4]",method_sel.xpath,"个人监控期限默认为半年"));
		add("one_year",  new button("一年",method_sel.xpaths,"企业监控期限默认为一年"));
		add("ICinfo1",  new button("html/body/div/div[2]/table/tbody/tr[3]/td[2]",method_sel.xpath,"监控类型的绝对路径"));
		add("ICinfo2",  new button("html/body/div/div[2]/table/tbody/tr[4]/td[2]",method_sel.xpath,"监控类型的绝对路径"));
		add("ICinfo3",  new button("html/body/div/div[2]/table/tbody/tr[5]/td[2]",method_sel.xpath,"监控类型的绝对路径"));
		add("check",  new button("查看",method_sel.xpaths,"进入到查看详情界面"));
		add("mobilephone",  new button("mobilePhone",method_sel.id,"个人监控输入手机号栏"));
		
		
		//CLOUD
		add("4check",  new button("html/body/div/div[7]/div/div/div/form/div/div/div/a",method_sel.xpath,"四维验证的绝对路径"));
		add("2check",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div[2]/div/a",method_sel.xpath,"二维验证的绝对路径"));
		add("3check",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/div/a",method_sel.xpath,"三维验证的绝对路径"));
		add("req_name",  new button("name-error",method_sel.id,"姓名必填"));
		add("req_id",  new button("identity_id-error",method_sel.id,"身份证必填"));
		add("req_card",  new button("card-error",method_sel.id,"银行卡号必填"));
		add("req_phone",  new button("phone-error",method_sel.id,"手机号必填"));
		add("4name",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li/input",method_sel.xpath,"四维验证姓名"));
		add("4id",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li[2]/input",method_sel.xpath,"四维验证身份证号"));
		add("4card",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li[3]/input",method_sel.xpath,"四维验证银行卡号"));
		add("4phone",  new button("html/body/div/div[7]/div/div/div/form/div/div/ul/li[4]/input",method_sel.xpath,"四维验证手机号"));
		add("3name",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/ul/li/input",method_sel.xpath,"三维验证姓名"));
		add("3id",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/ul/li[2]/input",method_sel.xpath,"三维验证身份证号"));
		add("3phone",  new button("html/body/div/div[7]/div/div/div[3]/form/div/div/ul/li[3]/input",method_sel.xpath,"三维验证手机号"));
		add("2name",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li/input",method_sel.xpath,"二维验证姓名"));
		add("2id",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li[2]/input",method_sel.xpath,"二维验证身份证号"));
		add("2card",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li[3]/input",method_sel.xpath,"二维验证银行卡号"));
		add("2phone",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div/ul/li[4]/input",method_sel.xpath,"二维验证手机号"));
		add("4errinfo",  new button("验证失败",method_sel.xpaths,"验证失败提示"));
		add("4sucinfo",  new button("匹配成功",method_sel.xpaths,"验证成功提示"));
		add("4norecordinfo",  new button("库中无记录",method_sel.xpaths,"库中无记录提示"));
		add("name_id",  new button("姓名＋身份证号",method_sel.xpaths,"姓名＋身份证号"));
		add("name_card",  new button("姓名＋银行卡号",method_sel.xpaths,"姓名＋银行卡号"));
		add("card_phone",  new button("银行卡号＋手机号",method_sel.xpaths,"银行卡号＋手机号"));
		add("2dim_choose",  new button("html/body/div/div[7]/div/div/div[2]/form/div/div",method_sel.xpath,"二维验证类型选择"));
		add("3errinfo",  new button("手机号一致，证件号和姓名不一致",method_sel.xpaths,"三维验证失败提示（手机号存在）"));
		add("3errinfo1",  new button("号码不存在",method_sel.xpaths,"三维验证失败提示（手机号不存在）"));
		
		
		//SMART
		add("ICinfo",  new button("工商信息",method_sel.xpaths,"万象智慧工商信息"));
		add("judinfo",  new button("司法信息",method_sel.xpaths,"万象智慧司法信息"));
		add("tradinfo",  new button("商户交易分析",method_sel.xpaths,"万象智慧商户交易分析"));
		add("PQCinfo",  new button("职业资格证书",method_sel.xpaths,"万象智慧职业资格证书"));
		add("UTRinfo",  new button("银联交易报告",method_sel.xpaths,"万象智慧银联交易报告"));
		add("fixlineinfo",  new button("政企固话核查",method_sel.xpaths,"万象智慧政企固话核查"));
		add("blacklistinfo",  new button("网贷黑名单",method_sel.xpaths,"万象智慧网贷黑名单"));
		add("UPBinfo",  new button("银联账单核查",method_sel.xpaths,"万象智慧银联账单核查"));
		add("ATSinfo",  new button("航空出行统计报告",method_sel.xpaths,"万象智慧航空出行统计报告"));
		add("PFTinfo",  new button("金融交易画像",method_sel.xpaths,"万象智慧金融交易画像"));
		add("eduinfo",  new button("学历信息",method_sel.xpaths,"万象智慧学历信息"));
		add("operatorinfo",  new button("手机运营商信息",method_sel.xpaths,"万象智慧手机运营商信息"));
		add("locationinfo",  new button("手机号码归属地信息",method_sel.xpaths,"万象智慧手机号码归属地信息"));
		add("IC_company_input",  new button("orgname_ic",method_sel.id,"工商信息-查企业输入框"));
		add("IC_personname_input",  new button("person_name_ic",method_sel.id,"工商信息-查个人姓名输入框"));
		add("IC_personid_input",  new button("person_orgname_ic",method_sel.id,"工商信息-查个人证件号输入框"));
		add("konglingqiang",  new button("孔令强",method_sel.xpaths,"企业查询报告检测点"));
		add("lihongjie",  new button("李红杰",method_sel.xpaths,"企业查询报告检测点"));
		add("hierarchy",  new button("层级图",method_sel.xpaths,"关联图谱中的层级图验证点"));
		add("more",  new button("html/body/div/div[3]/div/div/a",method_sel.xpath,"报告中的查看更多"));
		add("no_result",  new button("没有查询到结果",method_sel.xpaths,"没有查询到结果"));
		add("IC_check_company",  new button("html/body/div/div[7]/div/div[3]/ul/li",method_sel.xpath,"万象智慧中工商信息查企业"));
		add("IC_check_person",  new button("html/body/div/div[7]/div/div[3]/ul/li[2]",method_sel.xpath,"万象智慧中工商信息查个人"));
		add("IC_person_result",  new button("漳州市阳益食品有限公司",method_sel.xpaths,"严益鸿个人报告验证点"));
		add("IC_person_result1",  new button("联冠物流(福建)股份有限公司",method_sel.xpaths,"张长校个人报告验证点"));
		add("IC_person_result2",  new button("西宁金粉世界餐饮娱乐有限公司",method_sel.xpaths,"李帅个人报告验证点"));
		add("IC_person_search",  new button("html/body/div/div[7]/div/div[3]/div/form[2]/div/div/div[2]/a",method_sel.xpath,"万象智慧工商信息查个人中的查询"));
		add("IC_company_search",  new button("查询",method_sel.xpaths,"万象智慧工商信息查企业中的查询"));
		add("more1",  new button("更多",method_sel.parlintext,"万象智慧工商信息页面的更多"));
		add("IC_default",  new button("html/body/div/div[7]/div[2]/div[5]/div/div/table/tbody/tr/td[2]/p/a",method_sel.xpath,"检测历史默认在万象智慧-工商信息处"));
		add("jud_check_company",  new button("html/body/div/div[7]/div/div[4]/ul/li",method_sel.xpath,"万象智慧中司法信息查企业"));
		add("jud_check_person",  new button("html/body/div/div[7]/div/div[4]/ul/li[2]",method_sel.xpath,"万象智慧中司法信息查个人"));
		add("jud_company_input",  new button("orgname_elisor",method_sel.id,"司法信息-查企业输入框"));
		add("jud_personname_input",  new button("name_elisor",method_sel.id,"司法信息-查个人姓名输入框"));
		add("jud_personcid_input",  new button("cid_elisor",method_sel.id,"司法信息-查个人证件号输入框"));
		add("jud_person_search",  new button("html/body/div/div[7]/div/div[4]/div/div[2]/form/div/div[2]/a",method_sel.xpath,"万象智慧司法信息查个人中的查询"));
		add("jud_company_search",  new button("html/body/div/div[7]/div/div[4]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧司法信息查企业中的查询"));
		add("jud_details",  new button("司法类型",method_sel.xpaths,"万象智慧司法信息详情界面"));
		add("trad_name_input",  new button("mname",method_sel.id,"万象智慧商户交易分析姓名输入"));
		add("trad_cid_input",  new button("midpid",method_sel.id,"万象智慧商户交易分析商户编号输入"));
		add("trad_search",  new button("html/body/div/div[7]/div/div[5]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧商户交易分析中的查询"));
		add("trad_result",  new button("100%",method_sel.xpaths,"111商户交易报告验证点"));
		add("trad_result1",  new button("64%",method_sel.xpaths,"105220880430027商户交易报告验证点"));
		add("PQC_name_input",  new button("name_cert",method_sel.id,"万象智慧职业资格证书姓名输入"));
		add("PQC_cid_input",  new button("cid_cert",method_sel.id,"万象智慧职业资格证书身份证号输入"));
		add("PQC_search",  new button("html/body/div/div[7]/div/div[6]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧职业资格证书中的查询"));
		add("PQC_result",  new button("吉林市职业技能鉴定中心",method_sel.xpaths,"李瑞琦职业资格证书验证点"));
		add("PQC_excl_point",  new button("html/body/div/div[7]/div/div[6]/div/div/form/div[3]/i",method_sel.xpath,"上传授权文件前刷新的叹号标识"));
		add("UTR_name_input",  new button("name_transaction",method_sel.id,"万象智慧银联交易报告姓名输入"));
		add("UTR_cid_input",  new button("cid_transaction",method_sel.id,"万象智慧银联交易报告身份证号输入"));
		add("UTR_card_input",  new button("card_transaction",method_sel.id,"万象智慧银联交易报告银行卡号输入"));
		add("UTR_phone_input",  new button("mobile_transaction",method_sel.id,"万象智慧银联交易报告手机号输入"));
		add("UTR_search",  new button("html/body/div/div[7]/div/div[7]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧银联交易报告的查询"));
		add("UTR_result",  new button("荆州市",method_sel.xpaths,"蒋承君银联交易报告验证点"));
		add("UTR_result1",  new button("VISA卡（VIS）银联标识卡",method_sel.xpaths,"何浩银联交易报告验证点"));
		add("UTR_result2",  new button("62银联标准卡",method_sel.xpaths,"孔祥街银联交易报告验证点"));
		add("UTR_upload",  new button("html/body/div/div[7]/div/div[7]/div/div/form/div[3]/input",method_sel.xpath,"银联交易报告界面的上传授权文件"));
		add("fixline_phone_input",  new button("fixedPhone",method_sel.id,"万象智慧政企固话核查号码输入"));
		add("fixline_name_input",  new button("cname",method_sel.id,"万象智慧政企固话核查名称输入"));
		add("fixline_address_input",  new button("address",method_sel.id,"万象智慧政企固话核查地址输入"));
		add("fixline_search",  new button("html/body/div/div[7]/div/div[8]/div/div/form/div/div[2]/a",method_sel.xpath,"政企固话核查页面的查询"));
		add("fixline_result",  new button("广东省深圳市龙华新区",method_sel.xpaths,"深圳市雅尊投资有限公司政企固话核查验证点"));
		add("fixline_right_result",  new button("匹配成功",method_sel.xpaths,"政企固话核查全匹配"));
		add("fixline_wrong_result",  new button("号码不存在",method_sel.xpaths,"政企固话核查号码不存在"));
		add("blacklist_name_input",  new button("name_netloan",method_sel.id,"万象智慧网贷黑名单姓名输入"));
		add("blacklist_cid_input",  new button("cid_netloan",method_sel.id,"万象智慧网贷黑名单身份证号输入"));
		add("blacklist_search",  new button("html/body/div/div[7]/div/div[9]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧网贷黑名单界面的查询"));
		add("blacklist_result",  new button("报告时间：",method_sel.xpaths,"万象智慧网贷黑名单查看详情链接"));
		add("UPB_name_input",  new button("name",method_sel.id,"万象智慧银联账单核查姓名输入"));
		add("UPB_cid_input",  new button("cid",method_sel.id,"万象智慧银联账单核查身份证号输入"));
		add("UPB_card_input",  new button("card",method_sel.id,"万象智慧银联账单核查银行卡号输入"));
		add("UPB_begin_input",  new button("beginDate",method_sel.id,"万象智慧银联账单核查起始时间输入"));
		add("UPB_end_input",  new button("endDate",method_sel.id,"万象智慧银联账单核查结束时间输入"));
		add("UPB_search",  new button("html/body/div/div[7]/div/div[10]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧银联账单核查页面的查询"));
		add("UPB_wrong_result",  new button("姓名-身份证不一致",method_sel.xpaths,"万象智慧银联账单核查信息不匹配提示"));
		add("UPB_result",  new button("农业银行",method_sel.xpaths,"万象智慧银联账单核查验证成功"));
		add("UPB_upload",  new button("html/body/div/div[7]/div/div[10]/div/div/form/div[3]/input",method_sel.xpath,"银联账单核查界面的上传授权文件"));
		add("ATS_name_input",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div/ul/li/input",method_sel.xpath,"万象智慧航空出行统计报告姓名输入"));
		add("ATS_cid_input",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div/ul/li[2]/input",method_sel.xpath,"万象智慧航空出行统计报告身份证号输入"));
		add("ATS_schedule_input",  new button("select_schedule",method_sel.id,"万象智慧航空出行统计报告查询周期输入"));
		add("ATS_search",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧航空出行统计报告界面的查询"));
		add("ATS_result",  new button("深航",method_sel.xpaths,"万象智慧航空出行统计报告"));
		add("ATS_wrong_result",  new button("身份验证失败",method_sel.xpaths,"万象智慧航空出行统计报告"));
		add("ATS_upload",  new button("html/body/div/div[7]/div/div[11]/div/div/form/div[3]/input",method_sel.xpath,"万象智慧航空出行统计报告界面的上传授权文件"));
		add("PFT_name_input",  new button("fin_name",method_sel.id,"万象智慧金融交易画像姓名输入"));
		add("PFT_cid_input",  new button("fin_cid",method_sel.id,"万象智慧金融交易画像身份证号输入"));
		add("PFT_phone_input",  new button("fin_phone",method_sel.id,"万象智慧金融交易画像手机号输入"));
		add("PFT_select_input",  new button("select_financial",method_sel.id,"万象智慧金融交易画像选择画像类型"));
		add("PFT_search",  new button("html/body/div/div[7]/div/div[12]/div/div/form/div/div[2]/a",method_sel.xpath,"万象智慧金融交易画像界面的查询"));
		add("PFT_wrong_result",  new button("手机号一致，证件号和姓名不一致",method_sel.xpaths,"万象智慧金融交易画像"));
		add("PFT_upload",  new button("html/body/div/div[7]/div/div[12]/div/div/form/div[3]/input",method_sel.xpath,"万象智慧金融交易画像界面的上传授权文件"));
		add("PFT_sele_one",  new button("金融交易画像1--近1年的借记卡信息",method_sel.xpaths,"万象智慧金融交易画像1"));
		add("PFT_sele_two",  new button("金融交易画像2--近3个月的借记卡信息",method_sel.xpaths,"万象智慧金融交易画像2"));
		add("PFT_sele_three",  new button("金融交易画像3--1年内的信用卡信息",method_sel.xpaths,"万象智慧金融交易画像3"));
		add("PFT_sele_four",  new button("金融交易画像4--银行卡相关信息",method_sel.xpaths,"万象智慧金融交易画像4"));
		add("PFT_sele_ok",  new button("html/body/div/div[7]/div/div[12]/div/div/form/div/ul/li[4]/div[2]/div/a",method_sel.xpath,"万象智慧金融交易画像中的确定"));
		add("PFT_result",  new button("核验结果",method_sel.xpaths,"万象智慧金融交易画像报告验证点"));
		
		
		//UNION
		add("union_name_input",          new button("allian_name",method_sel.id,"万象联盟页面姓名输入"));
		add("union_sid_input",           new button("allian_cid",method_sel.id,"万象联盟页面身份证号输入"));
		add("union_upload",              new button("html/body/div[2]/div[8]/div[2]/form/div/div/div/div[3]/input",method_sel.xpath,"万象联盟页面上传个人授权文件"));
		add("union_search",              new button("html/body/div[2]/div[8]/div[2]/form/div/div/div/div/div[2]/a",method_sel.xpath,"万象联盟页面的查询"));
		add("union_excl_point",          new button("html/body/div[2]/div[8]/div[2]/form/div/div/div/div[3]/i",method_sel.xpath,"万象联盟页面文件上传处的小叹号-相当于刷新"));
		add("union_wrong_result",        new button("身份证有误",method_sel.xpaths,"万象联盟页面身份证有误"));
		add("union_result",              new button("网贷逾期负面信息",method_sel.xpaths,"万象联盟出报告验证点"));
		add("union_money",               new button("html/body/div[2]/div[8]/div/div/div[2]/p/span",method_sel.xpath,"万象联盟页面万象币"));
		add("union_report_1",            new button("html/body/div/div[3]/div[2]/h3/span",method_sel.xpath,"万象联盟报告中网贷负面信息记录"));
		add("union_report_2",            new button("html/body/div/div[3]/div[2]/h3[2]/span",method_sel.xpath,"万象联盟报告中被执行人信息记录"));
		add("union_report_3",            new button("html/body/div/div[3]/div[2]/h3[3]/span",method_sel.xpath,"万象联盟报告中失信老赖信息记录"));
		add("batch_upload_data",         new button("批量添加数据",method_sel.xpaths,"万象联盟页面批量添加数据"));
		add("batch_upload",              new button("localUrl1",method_sel.id,"万象联盟页面批量上传链接"));
		add("batch_upload_button",       new button("batchAddButton",method_sel.id,"万象联盟页面批量添加数据"));
		add("close_batch",               new button("html/body/div[2]/div[15]/h2/a",method_sel.xpath,"万象联盟页面批量上传后的关闭"));
		
		
		//ACCOUNT
		add("account_control",  new button("账户管理",method_sel.xpaths,"账户管理"));
		add("account_expend",  new button("html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/p",method_sel.xpath,"消费金额"));
		add("account_search_times",  new button("html/body/div/div[2]/div[2]/div/div[2]/ul/li[3]/p",method_sel.xpath,"查询次数"));
		add("account_week",  new button("本周消费统计",method_sel.xpaths,"本周统计"));
		add("account_week_cost",  new button("本周账号消费统计",method_sel.xpaths,"本周账号消费统计"));
		add("account_month",  new button("本月消费统计",method_sel.xpaths,"本月统计"));
		add("account_month_cost",  new button("本月账号消费统计",method_sel.xpaths,"本月账号消费统计"));
		add("account_year",  new button("近六个月消费统计",method_sel.xpaths,"近6个月统计"));
		add("account_year_cost",  new button("近6个月账号消费统计",method_sel.xpaths,"近6个月账号消费统计"));
		
		
		//SPECIAL
		add("cidandfile_warn",  new button("上传的文件名必须和身份证号一致",method_sel.xpaths,"上传的文件名必须和身份证号一致"));
		
		
		//SETTING
		add("setting_name_input",  new button("username",method_sel.id,"后台管理的账户"));
		add("setting_password_input",  new button("password",method_sel.id,"后台管理的密码"));
		add("setting_login", new button("html/body/div[3]/div/form/ul/li[3]/input",method_sel.xpath,"后台管理的登陆"));
		add("manage_charing",new button("html/body/dl/dd[4]/div",method_sel.xpath,"计费管理"));
		add("tariff",        new button("html/body/dl/dd[4]/ul/li/a",method_sel.xpath,"计费管理下的费率表"));
		add("charging_188",  new button("html/body/div[2]/form/table/tbody/tr[82]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_821",  new button("html/body/div[2]/form/table/tbody/tr[208]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_203",  new button("html/body/div[2]/form/table/tbody/tr[89]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_186",  new button("html/body/div[2]/form/table/tbody/tr[81]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_1",    new button("html/body/div[2]/form/table/tbody/tr[1]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_108",  new button("html/body/div[2]/form/table/tbody/tr[53]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_142",  new button("html/body/div[2]/form/table/tbody/tr[62]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_140",  new button("html/body/div[2]/form/table/tbody/tr[60]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_141",  new button("html/body/div[2]/form/table/tbody/tr[61]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_75",   new button("html/body/div[2]/form/table/tbody/tr[43]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_202",  new button("html/body/div[2]/form/table/tbody/tr[88]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_203",  new button("html/body/div[2]/form/table/tbody/tr[89]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_196",  new button("html/body/div[2]/form/table/tbody/tr[84]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_28",   new button("html/body/div[2]/form/table/tbody/tr[19]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_15",   new button("html/body/div[2]/form/table/tbody/tr[9]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_30",   new button("html/body/div[2]/form/table/tbody/tr[21]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_69",   new button("html/body/div[2]/form/table/tbody/tr[41]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_129",  new button("html/body/div[2]/form/table/tbody/tr[58]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_214",  new button("html/body/div[2]/form/table/tbody/tr[96]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_105",  new button("html/body/div[2]/form/table/tbody/tr[50]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_50",   new button("html/body/div[2]/form/table/tbody/tr[25]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_213",  new button("html/body/div[2]/form/table/tbody/tr[95]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_75",   new button("html/body/div[2]/form/table/tbody/tr[43]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_241",  new button("html/body/div[2]/form/table/tbody/tr[107]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_242",  new button("html/body/div[2]/form/table/tbody/tr[108]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_243",  new button("html/body/div[2]/form/table/tbody/tr[109]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		add("charging_244",  new button("html/body/div[2]/form/table/tbody/tr[110]/td[10]",method_sel.xpath,"计费管理下的费率表"));
		
	}
}
