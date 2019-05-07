package config;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Datainput {
	
	public static String http = "http://192.168.100.34:7088/ccx-credit/login";
	public static double zero = 0;                               //不扣费
	public static double reportcost = 20;                        //计费码188
	public static double persbussreport = 30;                    //计费码821
	public static double persbussreport1 = 30;                   //计费码203
	public static double persWXreport = 40;                      //计费码186
	public static double gradecost = 10;                         //计费码1       万象评分
	public static double fourdimcost = 10;                       //计费码108   四维核验
	public static double twodimcost_nameid = 10;                 //计费码142
	public static double twodimcost_namecard = 2;                //计费码140
	public static double twodimcost_cardpho = 2;                 //计费码141
	public static double threedimcost = 5;                       //计费码75     三维核验
	public static double ICcompanycost = 20;                     //计费码202   工商企业
	public static double ICpersoncost = 30;                      //计费码203   工商个人
	public static double judcost = 10;                           //计费码196    司法信息
	public static double tradcost = 13;                          //计费码28      商户交易
	public static double PQCcost = 1;                            //计费码15      资格证书
	public static double URTcost = 6;                            //计费码30      银联交易
	public static double fixlinecost = 2;                        //计费码69      政企固话
	public static double blacklistcost = 1;                      //计费码129    黑名单
	public static double UPBcost = 4;                            //计费码214    银联账单身份核验
	public static double UPBcheckcost = 4;                       //计费码105    银联账单
	public static double ATScheckcost = 4;                       //计费码50      航空出行身份核验
	public static double ATScost = 5;                            //计费码213    航空出行
	public static double PFTcheckcost = 5;                       //计费码75      金融画像身份核验
	public static double PFTcost1 = 2.5;                         //计费码241    金融画像1
	public static double PFTcost2 = 2.5;                         //计费码242    金融画像2
	public static double PFTcost3 = 2.5;                         //计费码243    金融画像3
	public static double PFTcost4 = 2.5;                         //计费码244    金融画像4
	public int    netloan = 3;                            //万象币网络贷款负面信息
	public int    risksxbzx = 4;                          //万象币被执行记录
	public int    risksxll = 1;                           //万象币失信老赖
	public int    bacth_upload_money = 15;                 //批量上传获得积分
	public String filepath = "pic\\";                     //授权文件根路径
	
	
	public static String[] case1 = {""};
	public static String[] cas1 = {""};
	public static String[] case2 = {"中诚信征信有限公司"};
	public static String[] cas2 = {"北京文坛定额书刊中心"};
	public static String[] case3 = {"中诚信征信有限公司"};
	public static String[] cas3 = {"北京笑笑哈哈快餐馆"};
	public static String[] case4 = {"华为技术有限公司"};
	public static String[] cas4 = {"北京海天花园文化艺术中心"};
	public static String[] case5 = {""};
	public static String[] cas5 = {""};
	public static String[] case6 = {""};
	public static String[] cas6 = {""};
	public static String[] case7 = {"华为投资控股有限公司"};
	public static String[] cas7 = {"北京啪啪科技有限公司"};
	public static String[] case8 = {"110104001956760"};
	public static String[] cas8 = {"110106019196020"};
	public static String[] case9 = {"110104001956760"};
	public static String[] cas9 = {"1101082935811"};
	public static String[] case10 = {"中诚信征信有限公司"};    //需要是前面查询过的企业
	public static String[] cas10 = {"华为投资控股有限公司"};
	public static String[] case11 = {"lishuaia","lishuai001","中诚信征信有限公司"};
	public static String[] cas11 = {"lishuaia","lishuai001","华为投资控股有限公司"};
	public static String[] case12 = {"中诚信征信有限公司"};
	public static String[] cas12 = {"华为投资控股有限公司"};
	public static String[] case13 = {"中诚信征信有限公司"};
	public static String[] cas13 = {"华为投资控股有限公司"};
	public static String[] case14 = {"中诚信征信有限公司"};
	public static String[] cas14 = {"北京啊牛啊牛餐饮管理有限公司"};
	public static String[] case15 = {"黄泓博", "210112199403022812", "6228480018711170276", "13261464885"};
	public static String[] cas15 = {"黄泓博", "210112199403022812", "6228480018711170276", "13261464885"};//无数据
	public static String[] case16 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108"};
	public static String[] cas16 = {"徐维烈", "422423196104090017", "9559980059713521512", "18171092896"};
	public static String[] case17 = {""};
	public static String[] cas17 = {""};
	public static String[] case18 = {"BatchUploadPerCredit","batchpic"};     //pic路径下的两个文件
	public static String[] cas18 = {"BatchUploadPerCredit","batchpic"};//无数据
	public static String[] case19 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108","314"};   //314为已知的万象分
	public static String[] cas19 = {"孙光峰", "330224196601183718", "6216661400000225555", "13906607647","774"};
	public static String[] case20 = {"邱道洋", "352102197010110433", "6214680120368533", "13561102108","个人失信被执行;"};    //个人失信被执行;为已知的报告内容
	public static String[] cas20 = {"李庆霞 ", "371121197304234249", "371121197304234249", "15092269471","个人失信被执行;"}; 
	public static String[] case21 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108"};
	public static String[] cas21 = {"李庆霞 ", "371121197304234249", "371121197304234249", "15092269471"};
	public static String[] case22 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108","邱道洋", "352102197010110433", "6214680120368533", "13561102108","个人失信被执行;"};
	public static String[] cas22 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108","邱道洋", "352102197010110433", "6214680120368533", "13561102108","个人失信被执行;"};//无数据，该用例不能执行
	public static String[] case23 = {""};
	public static String[] cas23 = {""};
	public static String[] case24 = {"中诚信征信有限公司"};
	public static String[] cas24 = {"华为技术有限公司北京分公司"};
	public static String[] case25 = {"1000company"};
	public static String[] cas25 = {"1000company"};//无数据
	public static String[] case26 = {"王际一","370681198401100039","15810985208"};
	public static String[] cas26 = {"李庆霞","371121197304234249","15810985208"};
	public static String[] case27 = {""};
	public static String[] cas27 = {""};
	public static String[] case28 = {""};
	public static String[] cas28 = {""};
	public static String[] case29 = {"朱佩露","432522199206020911","6228480435343186670","13921169550"};
	public static String[] cas29 = {"陈淑珍","130922198707217223","6227000152530305814","13931756910"};
	public static String[] case30 = {"朱佩露","432522199206020911","6228480435343186670","13921169555"};
	public static String[] cas30 = {"陈淑珍","130922198707217223","6227000152530305814","13931756917"};
	public static String[] case31 = {"朱佩露","432522199206020911","6228480435343186670","13921169555"};
	public static String[] cas31 = {"陈淑珍","130922198707217223","6227000152530305814","13931756917"};
	public static String[] case32 = {"李大龙","432522199206020911"};
	public static String[] cas32 = {"我是谁","130922198707217223"};
	public static String[] case33 = {"朱佩露","432522199206020911"};
	public static String[] cas33 = {"陈淑珍","130922198707217223"};
	public static String[] case34 = {"周良民","111111111111111"};
	public static String[] cas34 = {"周树人","111111111111111"};
	public static String[] case35 = {"朱佩露","432522199206020911"};
	public static String[] cas35 = {"陈淑珍","130922198707217223"};
	public static String[] case36 = {"李大龙","6228480435343186670"};
	public static String[] cas36 = {"李大龙","6227000152530305814"};
	public static String[] case37 = {"朱佩露","6228480435343186670"};
	public static String[] cas37 = {"陈淑珍","6227000152530305814"};
	public static String[] case38 = {"朱佩露","6228480435343186670"};
	public static String[] cas38 = {"陈淑珍","6227000152530305814"};
	public static String[] case39 = {"6228480435343186670","13921169550"};
	public static String[] cas39 = {"6227000152530305814","13921169550"};
	public static String[] case40 = {"6228480435343186670","13921169555"};
	public static String[] cas40 = {"6227000152530305814","13931756917"};
	public static String[] case41 = {"6228480435343186670","13921169555"};
	public static String[] cas41 = {"6227000152530305814","13931756917"};
	public static String[] case42 = {"郑文龙","110103198306150631","15092269471"};
	public static String[] cas42 = {"陈淑珍","130922198707217223","13931756910"};
	public static String[] case43 = {"李帅","15020219910520303X","15092269471"};
	public static String[] cas43 = {"陈淑珍","130922198707217223","13931756917"};
	public static String[] case44 = {"李帅","15020219910520303X","15092269471"};
	public static String[] cas44 = {"陈淑珍","130922198707217223","13931756917"};
	public static String[] case45 = {"中诚信征信有限公司"};
	public static String[] cas45 = {"北京都是宝宠物医院"};
	public static String[] case46 = {"410192000210098"};
	public static String[] cas46 = {"110102602066957"};
	public static String[] case47 = {"410192000210098"};
	public static String[] cas47 = {"110102602066957"};
	public static String[] case48 = {"海信移动技术股份有限公司"};
	public static String[] cas48 = {"李帅开的有有限公司"};//查询不到结果扣费
	public static String[] case49 = {"严益鸿","350621641103405"};
	public static String[] cas49 = {"徐维烈","422423610409001"};
	public static String[] case50 = {"张长校","350204197112242070"};
	public static String[] cas50 = {"徐维烈","422423196104090017"};
	public static String[] case51 = {"哈哈哈","33060219691016053X"};
	public static String[] cas51 = {"没数据","33060219691016053X"};//无数据
	public static String[] case52 = {"哈哈哈"};
	public static String[] cas52 = {"没数据"};
	public static String[] case53 = {"李帅","15020219910520303X"};
	public static String[] cas53 = {"刘开良","370305197801265011"};
	public static String[] case54 = {"北京懂懂商贸有限公司"};
	public static String[] cas54 = {"北京西北马哈牙拉面馆"};
	public static String[] case55 = {"中诚信征信有限公司"};
	public static String[] cas55 = {"亚马逊（中国）投资有限公司"};
	public static String[] case56 = {"姚欣","440105830915063"};
	public static String[] cas56 = {"胡凤兰","320825680626552"};
	public static String[] case57 = {"舒皓","210404197805221846"};
	public static String[] cas57 = {"舒皓","210404197805221846"};//无数据
	public static String[] case58 = {"胡凤兰","32082519680626552X"};
	public static String[] cas58 = {"胡凤兰","32082519680626552X"};//无数据
	public static String[] case59 = {"李帅","15020219910520303X"};
	public static String[] cas59 = {"徐维烈","422423196104090017"};
	public static String[] case60 = {"姚欣","210404197805221846"};
	public static String[] cas60 = {"张三","33060219691016053X"};
	public static String[] case61 = {"11","1113324242434242"};
	public static String[] cas61 = {"11","1113324242434242"};//无数据
	public static String[] case62 = {"11","111"};
	public static String[] cas62 = {"11","111"};//无数据
	public static String[] case63 = {"镇赉县镇赉镇韩氏眼镜店","105220880430027"};
	public static String[] cas63 = {"镇赉县镇赉镇韩氏眼镜店","105220880430027"};
	public static String[] case64 = {"李帅","15020219910520303X"};
	public static String[] cas64 = {"徐维烈","422423196104090017"};
	public static String[] case65 = {"李瑞琪","140428198206230414"};
	public static String[] cas65 = {"李瑞琪","140428198206230414"};
	public static String[] case66 = {"李瑞琪","15020219910520303X"};
	public static String[] cas66 = {"我是谁","140428198206230414"};
	public static String[] case67 = {"蒋承君", "421003910819156", "6214830104263446", "15101567528"};
	public static String[] cas67 = {"高非", "420106741016771", "4392268312664288", "13808609215"};
	public static String[] case68 = {"何浩","132401197912030650","4392268002710078","13811280014"};
	public static String[] cas68 = {"高非", "420106197410167713", "4392268312664288", "13808609215"};
	public static String[] case69 = {"孔祥街","36068119841206051X","6226193580223764","18850061216"};
	public static String[] cas69 = {"孔祥街","36068119841206051X","6226193580223764","18850061216"};//无数据
	public static String[] case70 = {"李瑞琪","140428198206230414","6217000010021423522","18211150696"};
	public static String[] cas70 = {"李瑞琪","140428198206230414","6217000010021423522","18211150696"};//无数据
	public static String[] case71 = {"01069620999","领先未来北京科技有限公司","内蒙古包头"};
	public static String[] cas71 = {"4006165500","京东商城业务客户服务热线","内蒙古包头"};
	public static String[] case72 = {"075527188888","深圳市雅尊投资有限公司","广东省深圳市宝安区宝安区龙华街道和平东路新梅园酒店斜对面"};
	public static String[] cas72 = {"4006165500","京东商城业务客户服务热线","西藏自治区拉萨市拉萨市辖区全区"};
	public static String[] case73 = {"045186517187","湛江市第11小学","广东省湛江市霞山区工农西三路13号"};
	public static String[] cas73 = {"04724190037","湛江市第11小学","广东省湛江市霞山区工农西三路13号"};
	public static String[] case74 = {"王磊","420682198311070551"};
	public static String[] cas74 = {"张三"," 412823199207116818"};
	public static String[] case75 = {"李帅","15020219910520303X"};
	public static String[] cas75 = {"孙速伟","110227199205071812"};
	public static String[] case76 = {"测试","132401197912030650","4392268002710078","2016-05-16","2017-05-15"};
	public static String[] cas76 = {"我是谁","132401197912030650","4392268002710078","2016-05-16","2017-05-15"};
	public static String[] case77 = {"朱佩露","432522199206020911","6228480435343186670","2016-05-16","2017-05-15"};
	public static String[] cas77 = {"高非","420106197410167713","4392268312664288","2016-05-16","2017-05-15"};
	public static String[] case78 = {"李帅","15020219910520303X","6222620910031215506","2016-05-16","2017-05-15"};
	public static String[] cas78 = {"高非","420106197410167713","6222620910031215506","2016-05-16","2017-05-15"};
	public static String[] case79 = {"为什么要换方式","310104198808097213","近12个月"};
	public static String[] cas79 = {"宫保鸡丁","310104198808097213","近12个月"};
	public static String[] case80 = {"韩绪","310104198808097213","近12个月"};
	public static String[] cas80 = {"李帅","15020219910520303X","近12个月"};
	public static String[] case81 = {"朱佩露","432522199206020911","近12个月"};
	public static String[] cas81 = {"高非","420106197410167713","近12个月"};
	public static String[] case82 = {"我是谁","310104198808097213","15092269471"};
	public static String[] cas82 = {"我是群众","15020219910520303X","18362546955"};//姓名和证件号不一致
	public static String[] case83 = {"高雷雷","342422198903244839","18362546955"};
	public static String[] cas83 = {"高非","420106197410167713","13808609215"};
	public static String[] case84 = {"高雷雷","342422198903244839","18362546955"};
	public static String[] cas84 = {"高非","420106197410167713","13808609215"};
	public static String[] case85 = {"高雷雷","342422198903244839","18362546955"};
	public static String[] cas85 = {"高非","420106197410167713","13808609215"};
	public static String[] case86 = {"高雷雷","342422198903244839","18362546955"};
	public static String[] cas86 = {"高非","420106197410167713","13808609215"};
	public static String[] case87 = {"孙琪","22010219921221501"};
	public static String[] cas87 = {"孙琪","22010219921221510"};
	public static String[] case88 = {"钱峻峻","441621691020305"};
	public static String[] cas88 = {"邱道洋","352102701011043"};
	public static String[] case89 = {"邱道洋","352102197010110433"};
	public static String[] cas89 = {"邱道洋","352102197010110433"};//无数据
	public static String[] case90 = {"赖兴","21040419780522184x"};
	public static String[] cas90 = {"赖兴","21040419780522184x"};//无数据
	public static String[] case91 = {"张三","412823199207116818"};
	public static String[] cas91 = {"张三","412823199207116818"};//只有网贷逾期负面信息的个人
	public static String[] case92 = {"杜晓爱","341122199412294214"};
	public static String[] cas92 = {"杜晓爱","341122199412294214"};//只有网贷逾期负面信息和被执行人记录的个人
	public static String[] case93 = {"钱峻峻","441621196910203056"};
	public static String[] cas93 = {"钱峻峻","441621196910203056"};//三项内容均有的个人
	public static String[] case94 = {"AllianImportTemplate"};
	public static String[] cas94 = {"AllianImportTemplate"};//文件名（+15万象币）
	public static String[] case95 = {"xiaoqu","xiaoqu","xiaoqu","xiaoqu","18211150696","","2017-04-20","超级管理员","已开通","xiaoyy","","","","2017-05-04","普通管理员","已开通"};
	public static String[] cas95 = {"xiaoqu","xiaoqu","xiaoqu","xiaoqu","18211150696","","2017-04-20","超级管理员","已开通","xiaoyy","","","","2017-05-04","普通管理员","已开通"};//无数据
	public static String[] case96 = {"0","9988260.3","1010129.2","10998389.5","9999"};
	public static String[] cas96 =  {"0","100623553.38","60835.50","101623553.38","99999"};//线上数据
//	                                 "0","9988260.3","1010129.2","10998389.5","99999"     //测试数据
	public static String[] case97 = {""};
	public static String[] cas97 = {""};
	public static String[] case98 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108","15020219910520303X","314"};
	public static String[] cas98 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108","420106197410167713","314"};
	public static String[] case99 = {"仝文州", "410901197211110837", "6214680120368533", "13561102108"};
	public static String[] cas99 = {"高非", "420106197410167713", "4392268312664288", "13808609215"};
	
	public static String[] casedesc = {
			"0获取后台计费码数值",
			"1点击注册，跳转至注册页面（参数：无）",
			"2在查询页面点击立即更新-验证更新日期刷新(参数：企业名称)",
			"3在查询页面点击“查看企业信用报告（参数：企业名称）",
			"4在查询页面查询输入其它企业名称，点击查询(参数：企业名称)",
			"5输入正确的个人用户用户名和密码后点击登录（参数：无）",
			"6输入正确的企业用户用户名和密码后点击登录（参数：无）",
			"7输入企业名称点击查询（参数：企业名称）",
			"8输入企业注册码（参数：企业注册码）",
			"9输入企业注册码（参数：企业注册码）",
			"10同一机构同一账号，7天内查询同一家企业（参数：企业名称）",
			"11同一机构不同账号，7天内查询同一家企业（参数：用户名，密码，企业名称）",
			"12点击企业报告的立即更新（参数：企业名称）",
			"13在企业报告里，点击股东/高管处的人名（参数：企业名称）",
			"14在法定代表人处，点击该模块的企业名称（参数：企业名称）",
			"15查询有分的报告时-无分数据（参数：姓名，身份证，银行卡，手机号）",
			"16查询有分的报告时-有分数据（参数：姓名，身份证，银行卡，手机号）",
			"17在历史记录点击人的姓名（参数：无）",
			"18查询了一批25条数据（参数：文件名）",
			"19上传了授权文件可以查询此人的信用评分（参数：姓名，身份证，银行卡，手机号，万象分）",
			"20报告结果页查看风险信息（参数：姓名，身份证，银行卡，手机号，风险信息）",
			"21报告结果页点击加入监控（参数：姓名，身份证，银行卡，手机号）",
			"22报告结果页上方输入个人信息，点击查询（参数：姓名1，身份证1，银行卡1，手机号1，姓名2，身份证2，银行卡2，手机号2，风险信息2）",
			"23在历史记录中点击该人的姓名（参数：无）",
			"24添加监控后监控状态为待处理，监控到期日不显示（参数：企业名称）",
			"25上传小于1000条的企业，默认只监控工商信息，监控期限为1年（参数：文件名）",
			"26点击委托监控个人，默认监控的项目，监控期限以及接收方式（参数：姓名，身份证，手机号）",
			"27切换点击个人监控/企业监控（参数：无）",
			"28四维核验处没有输入内容（参数：无）",
			"29输入错误的四维信息进入核验（参数：姓名，身份证，银行卡，手机号）",
			"30输入正确的四维信息进行核验（参数：姓名，身份证，银行卡，手机号）",
			"31配置四维核验的计费码108为10元-不论结果（参数：姓名，身份证，银行卡，手机号）",
			"32输入错误的二维信息进入核验（参数：姓名，身份证）",
			"33输入正确的二维信息进行核验（参数：姓名，身份证）",
			"34查询不到结果的数据（参数：姓名，身份证）",
			"35配置企业报告的计费码142为10元-不论结果（参数：姓名，身份证）",
			"36输入错误的二维信息进入核验（参数：姓名，银行卡）",
			"37输入正确的二维信息进行核验（参数：姓名，银行卡）",
			"38配置二维核验的计算服务码140为10元-不论结果（参数：姓名，银行卡）",
			"39输入错误的二维信息进入核验（参数：银行卡，手机号）",
			"40输入正确的二维信息进行核验（参数：银行卡，手机号）",
			"41配置四维核验的计费码141为10元-不论结果（参数：银行卡，手机号）",
			"42输入错误的三维信息进入核验（参数：姓名，身份证，手机号）",
			"43输入正确的三维信息进行核验（参数：姓名，身份证，手机号）",
			"44配置三维核验的计费码75为10元-不论结果（参数：姓名，身份证，手机号）",
			"45输入企业名称点击查询企业工商信息（参数：企业名称）",
			"46输入企业注册码点击查询企业工商信息（参数：企业注册码）",
			"47企业工商信息报告结果页点击图谱处的“查看更多”（参数：企业注册码）",
			"48配置企业工商信息的计费码202为20元-查询不到结果的企业（参数：企业名称）",
			"49身份证号输入15位身份证号查询个人工商信息（参数：姓名，身份证）",
			"50身份证号输入18位身份证号查询个人工商信息（参数：姓名，身份证）",
			"51身份证号输入带X的身份证号查询个人工商信息（参数：姓名，身份证）",
			"52查询页点击历史记录右上角的“更多”（参数：姓名-有个人工商信息历史纪录）",
			"53配置个人工商信息的计费码203为30元-查询不到结果的个人（参数：姓名，身份证）",
			"54输入查询不到结果的企业查询企业司法信息（参数：企业名称）",
			"55配置查询企业司法信息的权限-有查询结果（参数：企业名称）",
			"56身份证号输入15位身份证号查询个人司法信息（参数：姓名，身份证）",
			"57身份证号输入18位身份证号查询个人司法信息（参数：姓名，身份证）",
			"58身份证号输入带X的身份证号查询个人司法信息（参数：姓名，身份证）",
			"59输入查询不到结果的人查询个人司法信息（参数：姓名，身份证）",
			"60姓名与身份证号不匹配时查询个人司法信息（参数：姓名，身份证）",
			"61输入查询不到结果的企业查询商户交易分析（参数：商户名，商户编码）",
			"62输入能查询到结果的企业查询商户交易分析（参数：商户名，商户编码）",
			"63商户名称与商户编号不匹配时查询商户交易分析（参数：商户名，商户编码）",
			"64搜索查询不到结果的人查询职业资格证书（参数：姓名，身份证）",
			"65搜索能查询到结果的人查询职业资格证书（参数：姓名，身份证）",
			"66姓名与身份证号不匹配查询职业资格证书（参数：姓名，身份证）",
			"67身份证号输入15位身份证号查询银联交易报告（参数：姓名，身份证，银行卡，电话）",
			"68身份证号输入18位身份证号查询银联交易报告（参数：姓名，身份证，银行卡，电话）",
			"69身份证号输入带X的身份证号查询银联交易报告（参数：姓名，身份证，银行卡，电话）",
			"70搜索查询不到结果的人查询银联交易报告（参数：姓名，身份证，银行卡，电话）",
			"71配置查询政企固话核查的权限-有更正报告（参数：固话号码，企业名称，企业地址）",
			"72配置政企固话核查的计费码69为6元-匹配成功（参数：固话号码，企业名称，企业地址）",
			"73配置政企固话核查的计费码69为6元-号码不存在（参数：固话号码，企业名称，企业地址）",
			"74配置查询网贷黑名单的权限，有查询结果（参数：姓名，身份证）",
			"75配置网贷黑名单的计费码195为6元，无查询结果（参数：姓名，身份证）",
			"76姓名与身份证号不匹配查询银联帐单核验（参数：姓名，身份证，银行卡，起始日期，截止日期）",
			"77配置查询银联账单核查报告的权限（参数：姓名，身份证，银行卡，起始日期，截止日期）",
			"78配置银联交易报告的计费码214为6元，核验费用配置（服务号105）为4元（参数：姓名，身份证，银行卡，起始日期，截止日期）",
			"79姓名与身份证号不匹配查询航空出行统计报告（参数：姓名，身份证，查询周期）",
			"80配置查询航空出行报告的权限（参数：姓名，身份证，查询周期）",
			"81配置银联交易报告的计费码213为6元，核验费用配置（服务50）为4元（参数：姓名，身份证，查询周期）",
			"82姓名与身份证号不匹配查询金融交易画像（参数：姓名，身份证，手机号，画像类型）",
			"83查询画像1时，扣核验与画像1的费用（参数：姓名，身份证，手机号，画像类型）",
			"84查询画像1、2时，扣核验与画像1、2的费用（参数：姓名，身份证，手机号，画像类型）",
			"85查询画像1、2、3时，扣核验与画像1、2、3的费用（参数：姓名，身份证，手机号，画像类型）",
			"86查询画像1、2、3、4时，扣核验与画像1、2、3、4的费用（参数：姓名，身份证，手机号，画像类型）",
			"87万象联盟的查询中输入位数不正确的身份证号（参数：姓名，身份证）",
			"88万象联盟的查询中身份证号输入15位身份证号（参数：姓名，身份证）",
			"89万象联盟的查询中身份证号输入18位身份证号（参数：姓名，身份证）",
			"90万象联盟的查询中身份证号输入带X的身份证号（参数：姓名，身份证）",
			"91能够查询到只包含网贷负面信息的对象（参数：姓名，身份证）",
			"92能够查询到包含网贷负面信息和执行记录的对象（参数：姓名，身份证）",
			"93能够查询到包含网贷负面信息和执行记录、老赖信息的对象（参数：姓名，身份证）",
			"94批量上传获得万象币（参数：文件名）",
			"95超级管理员界面，显示该机构下的所有用户，显示账号，姓名等信息（参数：账户名，密码，从左到右从上到下的账户信息）",
			"96超级管理员界面，标题处显示账户余额，消费金额，查询次数（参数：最小余额，最大余额，最小消费额，最大消费额，最大查询次数）",
			"97超级管理员界面，下方显示本周消费统计，本月消费统计，近六个月消费统计（参数：无）",
			"98上传授权文件时随意上传，文件名必须和身份证号一致（参数：姓名，身份证，银行卡，电话，不匹配的身份证号，万象分）",
			"99查询一个功能模块时，上传过此人的授权文件，再次查询网站其它模块时不需要再上传此人的授权文件（参数：姓名，身份证，银行卡，电话）",
	};
	
	
	public static HashMap<Integer,String[]> firstdata=new HashMap<Integer,String[]>();
	public static HashMap<Integer,String[]> seconddata=new HashMap<Integer,String[]>();
	public static HashMap<Integer,String[]> firstmap=new HashMap<Integer,String[]>();
	public static HashMap<Integer,String[]> secondmap=new HashMap<Integer,String[]>();
	public static int m = 100;   //case数目
	
	public void resetpara() throws Exception{
		Class<Datainput> clz = Datainput.class;
		for(int i=1;i<m;i++){
			Field f1 = clz.getField("case"+i);
			Field f2 = clz.getField("cas"+i);
			f1.setAccessible(true);
			f2.setAccessible(true);
			firstdata.put(i, (String[])f1.get(new Datainput()));
			seconddata.put(i, (String[])f2.get(new Datainput()));
			strcpy(firstdata.get(i),seconddata.get(i));
		}
	}

	public void writehashmap() throws Exception{
		Class<Datainput> clz = Datainput.class;
		for(int i=1;i<m;i++){
			Field para2 = clz.getField("case"+i);
			para2.setAccessible(true);
			secondmap.put(i, (String[])para2.get(new Datainput()));
		}
	}
	
	public void readhashmap() throws Exception{
		Class<Datainput> clz = Datainput.class;
		for(int i=1;i<m;i++){
			Field para2 = clz.getField("case"+i);
			para2.set(new Datainput(), firstmap.get(i));
		}
	}
	
	public void strcpy(String[] para1, String[] para2) {
		for(int i = 0; i <para1.length; i++)
		para1[i]=para2[i];   //把2赋给1
	}
}
