package example;

import config.Config;
import config.Decode_xml;
import ui.Control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Test1 extends Control{

    Logger logger = LogManager.getLogger(this.getClass().getName());
    LoggerContext ctx=(LoggerContext) LogManager.getContext(false);
	
	HashMap<String,Integer> testcase_times  =new HashMap<String,Integer>();
    HashMap<String,Boolean> testcase_result =new HashMap<String,Boolean>();//for one loop
    HashMap<String,Boolean> testcase_results=new HashMap<String,Boolean>();
    ArrayList<String> case_list =new ArrayList<String>();
    static String[] false_case;
    
    Document document= DocumentHelper.createDocument();
    Element summaryElement=document.addElement("TestCaseSummary");
    Config all_config =new Config();
    Decode_xml decode_xml = new Decode_xml();
	
    public static void main(String[] args) throws Exception {
//    	Config cfg = new Config();
//    	cfg.set_default();
//    	cfg.write_to_file("web.xml");                         //编辑web.xml文件，无新添加内容不用生成
    	
    	Control control = new Control();
    	control.test_ui();
    }
    
    public String[] set_cases() throws Exception{
    	String[] cases=null;
    	
    	/**CHARGING**/
    	cases=add_testcase(cases,"testcase000",1);
    	/**HOME_PAGE**/
    	cases=add_testcase(cases,"testcase001",homepage[0]);
    	cases=add_testcase(cases,"testcase002",homepage[1]);
    	cases=add_testcase(cases,"testcase003",homepage[2]);
    	cases=add_testcase(cases,"testcase004",homepage[3]);
//    	cases=add_testcase(cases,"testcase005",homepage[4]);
    	cases=add_testcase(cases,"testcase006",homepage[5]);
    	/**REPORT**/
    	cases=add_testcase(cases,"testcase007",wxreport[0]);
    	cases=add_testcase(cases,"testcase008",wxreport[1]);
    	cases=add_testcase(cases,"testcase009",wxreport[2]);
    	cases=add_testcase(cases,"testcase010",wxreport[3]);
//    	cases=add_testcase(cases,"testcase011",wxreport[4]);
    	cases=add_testcase(cases,"testcase012",wxreport[5]);
    	cases=add_testcase(cases,"testcase013",wxreport[6]);
    	cases=add_testcase(cases,"testcase014",wxreport[7]);
    	cases=add_testcase(cases,"testcase015",wxreport[8]);
    	cases=add_testcase(cases,"testcase016",wxreport[9]);
    	cases=add_testcase(cases,"testcase017",wxreport[10]);
//    	cases=add_testcase(cases,"testcase018",wxreport[11]);
    	/**GRADE**/
    	cases=add_testcase(cases,"testcase019",wxgrade[0]);
    	cases=add_testcase(cases,"testcase020",wxgrade[1]);
    	cases=add_testcase(cases,"testcase021",wxgrade[2]);
    	cases=add_testcase(cases,"testcase022",wxgrade[3]);
    	cases=add_testcase(cases,"testcase023",wxgrade[4]);
    	/**OBSERVE**/
    	cases=add_testcase(cases,"testcase024",wxobserve[0]);
//    	cases=add_testcase(cases,"testcase025",wxobserve[1]);
    	cases=add_testcase(cases,"testcase026",wxobserve[2]);
    	cases=add_testcase(cases,"testcase027",wxobserve[3]);
    	/**CLOUD**/
    	cases=add_testcase(cases,"testcase028",wxcloud[0]);
    	cases=add_testcase(cases,"testcase029",wxcloud[1]);
    	cases=add_testcase(cases,"testcase030",wxcloud[2]);
    	cases=add_testcase(cases,"testcase031",wxcloud[3]);
    	cases=add_testcase(cases,"testcase032",wxcloud[4]);
    	cases=add_testcase(cases,"testcase033",wxcloud[5]);
    	cases=add_testcase(cases,"testcase034",wxcloud[6]);
    	cases=add_testcase(cases,"testcase035",wxcloud[7]);
    	cases=add_testcase(cases,"testcase036",wxcloud[8]);
    	cases=add_testcase(cases,"testcase037",wxcloud[9]);
    	cases=add_testcase(cases,"testcase038",wxcloud[10]);
    	cases=add_testcase(cases,"testcase039",wxcloud[11]);
    	cases=add_testcase(cases,"testcase040",wxcloud[12]);
    	cases=add_testcase(cases,"testcase041",wxcloud[13]);
    	cases=add_testcase(cases,"testcase042",wxcloud[14]);
    	cases=add_testcase(cases,"testcase043",wxcloud[15]);
    	cases=add_testcase(cases,"testcase044",wxcloud[16]);
    	/**SMART**/
    	cases=add_testcase(cases,"testcase045",wxsmart[0]);
    	cases=add_testcase(cases,"testcase046",wxsmart[1]);
    	cases=add_testcase(cases,"testcase047",wxsmart[2]);
    	cases=add_testcase(cases,"testcase048",wxsmart[3]);
    	cases=add_testcase(cases,"testcase049",wxsmart[4]);
    	cases=add_testcase(cases,"testcase050",wxsmart[5]);
    	cases=add_testcase(cases,"testcase051",wxsmart[6]);
    	cases=add_testcase(cases,"testcase052",wxsmart[7]);
    	cases=add_testcase(cases,"testcase053",wxsmart[8]);
    	cases=add_testcase(cases,"testcase054",wxsmart[9]);
    	cases=add_testcase(cases,"testcase055",wxsmart[10]);
    	cases=add_testcase(cases,"testcase056",wxsmart[11]);
    	cases=add_testcase(cases,"testcase057",wxsmart[12]);
    	cases=add_testcase(cases,"testcase058",wxsmart[13]);
    	cases=add_testcase(cases,"testcase059",wxsmart[14]);
    	cases=add_testcase(cases,"testcase060",wxsmart[15]);
    	cases=add_testcase(cases,"testcase061",wxsmart[16]);
    	cases=add_testcase(cases,"testcase062",wxsmart[17]);
    	cases=add_testcase(cases,"testcase063",wxsmart[18]);
    	cases=add_testcase(cases,"testcase064",wxsmart[19]);
    	cases=add_testcase(cases,"testcase065",wxsmart[20]);
    	cases=add_testcase(cases,"testcase066",wxsmart[21]);
    	cases=add_testcase(cases,"testcase067",wxsmart[22]);
    	cases=add_testcase(cases,"testcase068",wxsmart[23]);
    	cases=add_testcase(cases,"testcase069",wxsmart[24]);
    	cases=add_testcase(cases,"testcase070",wxsmart[25]);
    	cases=add_testcase(cases,"testcase071",wxsmart[26]);
    	cases=add_testcase(cases,"testcase072",wxsmart[27]);
    	cases=add_testcase(cases,"testcase073",wxsmart[28]);
    	cases=add_testcase(cases,"testcase074",wxsmart[29]);
    	cases=add_testcase(cases,"testcase075",wxsmart[30]);
    	cases=add_testcase(cases,"testcase076",wxsmart[31]);
    	cases=add_testcase(cases,"testcase077",wxsmart[32]);
    	cases=add_testcase(cases,"testcase078",wxsmart[33]);
    	cases=add_testcase(cases,"testcase079",wxsmart[34]);
    	cases=add_testcase(cases,"testcase080",wxsmart[35]);
    	cases=add_testcase(cases,"testcase081",wxsmart[36]);
//    	cases=add_testcase(cases,"testcase082",wxsmart[37]);
//    	cases=add_testcase(cases,"testcase083",wxsmart[38]);
//    	cases=add_testcase(cases,"testcase084",wxsmart[39]);
//    	cases=add_testcase(cases,"testcase085",wxsmart[40]);
//    	cases=add_testcase(cases,"testcase086",wxsmart[41]);
    	/**UNION**/
    	cases=add_testcase(cases,"testcase087",wxunion[0]);
    	cases=add_testcase(cases,"testcase088",wxunion[1]);
    	cases=add_testcase(cases,"testcase089",wxunion[2]);
    	cases=add_testcase(cases,"testcase090",wxunion[3]);
    	cases=add_testcase(cases,"testcase091",wxunion[4]);
    	cases=add_testcase(cases,"testcase092",wxunion[5]);
    	cases=add_testcase(cases,"testcase093",wxunion[6]);
    	cases=add_testcase(cases,"testcase094",wxunion[7]);
    	/**ACCOUNT**/
    	cases=add_testcase(cases,"testcase095",myaccount[0]);
    	cases=add_testcase(cases,"testcase096",myaccount[1]);
    	cases=add_testcase(cases,"testcase097",myaccount[2]);
    	/**SPECIAL**/
    	cases=add_testcase(cases,"testcase098",baseweb[0]);
    	cases=add_testcase(cases,"testcase099",baseweb[1]);
    	
		return cases;
    }
    
    public String[] add_testcase(String[] run_list,String testcase_in,int times){
        String [] arr_add=new String[times];
        String [] com_array;
        case_list.add(testcase_in);
        Arrays.fill(arr_add, testcase_in);
        if(run_list != null){
            com_array=new String[run_list.length+arr_add.length];
            System.arraycopy(run_list, 0, com_array, 0, run_list.length);
            System.arraycopy(arr_add, 0, com_array, run_list.length, arr_add.length);
        }else{
            com_array=arr_add;
        }
        testcase_times.put(testcase_in, times);
        return com_array;
    }
    
    @Before
    public void setUp() throws Exception{
    	File file = new File("log");
    	delefile(file);                               //删除log记录
        String config_file_name="web.xml";
        all_config.read_from_file(config_file_name);
        decode_xml.get_config(all_config);
        }
    
	@Test
    public void run() throws Exception{
		 boolean result=false;
	     String[] testcases=set_cases();
	     
	     for(int j=0;j<1;j++){                    //执行轮次
	            Method method=null;
	            for(String b:testcases){
	                String log_file = "log/"+j+"/"+b;
	                Class<?> cls    = Class.forName("testsuit."+b);
	                Field run_cnt=cls.getField("run_count");
	                Field cse_cnt=cls.getField("case_count");
	                log_file=log_file.concat("_"+run_cnt.get(null).toString());
	                System.setProperty("filename", log_file);
	                ctx.reconfigure();

	                Constructor<?>[] cons=cls.getConstructors();
	                Constructor<?> defCon=cons[0];
	                Object obj=defCon.newInstance();
	                method=obj.getClass().getMethod("process");
	                result=(Boolean)method.invoke(obj);
	                Boolean value=testcase_result.get(b);
	                logger.debug("Result is {},original result is {} ",result,value);
	                if(value != null){
	                    value &= result;
	                }else {
	                    value =  result;
	                }
	                testcase_result.put(b,value);
	                int set_times=testcase_times.get(b);
	                int cse_times=Integer.parseInt(cse_cnt.get(null).toString());
	                logger.info("TestCase : '{}' is {}!",b,result?"SUCCESS":"FAILED");
	                logger.info("TEST_TOP : {} set_times is {} case_times is {}",b,set_times,cse_times);
	                if((cse_times%set_times)==0){
	                	logger.info("TEST_TOP : case '{}' all finished. now get html file.",b);
	                    Method HTML_m=obj.getClass().getMethod("xmlToHtml");
	                    HTML_m.invoke(obj);
	                }
	                method=obj.getClass().getMethod("cycle_add");
	            }
	            xmlfile_write(j);
	            method.invoke(null);
	            testcase_result.clear();
	     }

	}
	
	public void xmlfile_write(int j) throws Exception{
        write_summary_xml(j);
        xmlToHtml("./log/"  + "xml/" + j + "_summary.xml", "./src/utils/summary.xsl", "./log/" +
                  "/" + j + "_summary.html");
    }
	     
	public void xmlToHtml(String xmlFile,String xslFile,String html) {
        try {
            File htmlFile = new File(html);
            htmlFile.createNewFile();
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(new StreamSource(
                    xslFile));
            transformer.transform(new StreamSource(xmlFile), new StreamResult(new FileOutputStream(htmlFile)));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
	
	public void write_summary_xml(int j) {
        summaryElement.addComment("This is a summary report of all testcases.");
        for(String key :case_list){
        	String val= String.valueOf(testcase_times.get(key));
        	if(Integer.parseInt(val) != 0){
        		Boolean rst= testcase_result.get(key);
        		
        		logger.debug("result of testcase {} is {}",key,rst);
        		String rst_tString=null;
            	if(rst){
            		rst_tString="Passed";
            	}else{
            	    rst_tString="Failed";
            	}
            	Element testcaseElement =summaryElement.addElement("TestCase");
            	testcaseElement.addElement("Name").addText(key);
            	testcaseElement.addElement("Cycle").addText(val);
            	testcaseElement.addElement("Result").addText(rst_tString);
            	testcaseElement.addElement("Detail").addText("./html/"+key+"_cycle_"+j+".html");
        	}
        }

        try{
            File xml_dir=new File("log/"+"xml/");
            if(!xml_dir.exists()){
                xml_dir.mkdir();
            }
            XMLWriter writer = new XMLWriter(new FileWriter(new File("log/"+"xml/"+j+"_summary.xml")));
            writer.write(document);
            writer.close();
            summaryElement.clearContent();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void delefile(File f){
    	if(f==null){
    		return;
    	}else if(f.exists()){
    		if(f.isFile()){
    			f.delete();
    		}else if(f.isDirectory()){
    			String[] str = f.list();
    			if(str==null){
    				f.delete();
    			}else{
    				for(String st :str){
    					delefile(new File(f,st));
    				}
    				f.delete();
    			}
    		}
    	}
    }
    
}
