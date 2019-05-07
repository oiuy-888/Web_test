package testsuit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import mudule.Base_web;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class base_testcase extends Mysql{
	
	Logger logger = LogManager.getLogger(this.getClass());
	
	public int firstrecord;
	public int secondrecord;
	public static int run_count = 0;
    public static int err_count = 0;
    public static int ext_loop_cycle = 0;
    public String function_name;
    boolean screen_shot;
    boolean result;
	String case_name;
	//实例化问题
	Base_web my_web = new Base_web();
	
	public static void cycle_add() {
        ext_loop_cycle++;
    }
	
	public boolean process() {
        result=false;
        build();
        run();
        logger.debug("After run result is {}",result);
        report();
        logger.debug("After report result is {}",result);
        ending();
        logger.debug("After ending result is {}",result);
        return result;
    }
	
	public base_testcase(){
        case_name = this.getClass().getSimpleName();
        screen_shot = false;
    }

	
	public void run() {
        try {
            pre_run();
            during_run();
            post_run();
            result=true;
            logger.debug("In run_try : result is {}",result);
        }catch (Exception e){
            logger.info("This is run error.");
            catch_body();
            logger.info(e.getMessage(),e);
        }  
    }
	
	public void pre_run() throws Exception{
        logger.info("Enter Testcase : "+case_name);
        //add by lishuai
        try{
        	firstrecord=contectsql();
        }catch (Exception e) {
        	logger.info(e.getMessage(),e);
		}
        //add 2017-8-16
    }
    public void during_run() throws Exception {              //在case中重定义
    }
    public void post_run() throws Exception {
    	//add by lishuai
    	try{
    		secondrecord=contectsql();
        	rerecord(firstrecord,secondrecord);
    	}catch (Exception e) {
    		logger.info(e.getMessage(),e);
		}
    	//add 2017-8-16
    }

	public void build() {
        try {
            pre_build();
            during_build();
            post_build();
        }catch (Exception e){
            logger.info("This is build error.");
        }
    }
	
	public void pre_build() throws Exception {
    }
    public void during_build() throws Exception {
    }
    public void post_build() throws Exception {
    }
	
	public void report() {
        try {
            pre_report();
            during_report();
            post_report();
        }catch (Exception e){
            logger.info("This is report error.");
        }
    }
	
	public void pre_report() throws Exception {
    }
    public void during_report() throws Exception {
        write_xml_after_testcase_finish(result);
    }
    public void post_report() throws Exception {
    }

    public void ending() {
        try{
            pre_ending();
            during_ending();
            post_ending();
        }
        catch (Exception e){
            logger.info("This is ending error.");
        }
    }
    
    public void pre_ending() throws Exception{
    }
    public void during_ending() throws Exception{
    }
    public void post_ending() throws Exception{
        logger.info("Let web back to home view.");
        //用力执行完毕后初始化操作，浏览器方面暂无操作
    }
    
    public void xmlToHtml(){
        String xmldir ="./log/"+"xml/";
        String htmldir="./log/"+"html/";
        String xmlFile=xmldir+case_name+"_cycle_"+ext_loop_cycle+".xml";
        String xslFile="./src/utils/Detail.xsl";//单条用例执行结果html配置文件
        String html   =htmldir+case_name+"_cycle_"+ext_loop_cycle+".html";

        File html_dir=new File(htmldir);
        if(!html_dir.exists()){
            html_dir.mkdir();
        }
        try {
            File htmlFile = new File(html);
            htmlFile.createNewFile();
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(new StreamSource(xslFile));
            // 灏唜ml鏂囦欢杞崲鎴恏tml鏂囦欢
            transformer.transform(new StreamSource(xmlFile), new StreamResult(new FileOutputStream(htmlFile)));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
    
    public void write_xml_after_testcase_finish(boolean result) {
        String xmldir="./log/"+"xml/";
        File xml_dir=new File(xmldir);
        if(!xml_dir.exists()){
            xml_dir.mkdir();
        }
        try {
            xml_process(xmldir+case_name+"_cycle_"+ext_loop_cycle+".xml", run_count, case_name, result);
        } catch (Exception e) {
            // DONE Auto-generated catch block
            logger.error("testcase : process detail xml file error.");
        }
        logger.debug("run_count ={}",run_count);

        run_count += 1;
    }
    
    public void xml_process(String filename,int run_count,String case_name,boolean result) throws Exception {
        SAXReader saxReader=new SAXReader();
        Document document;
        Element root;
        XMLWriter writer;
        try {
            document=saxReader.read(new File(filename));
            root=document.getRootElement();
        } catch (DocumentException e) {
            logger.info("{} : file '{}' is not exist, create it.",case_name,filename);
            document= DocumentHelper.createDocument();
            root=document.addElement("TestCaseDetail");
        }
        Element ts=root.addElement("TestCase");
        ts.addElement("NO").setText(String.valueOf(run_count));
        ts.addElement("Result").setText(String.valueOf(result));
        String snapshot_text=screen_shot?"../"+ext_loop_cycle+"/"+case_name+"_"+run_count+".png":"NONE";

        ts.addElement("SnapShot").setText(snapshot_text);
        ts.addElement("Log").setText("../"+ext_loop_cycle+"/"+case_name+"_"+run_count+".log");
        screen_shot=false;
        try {
            writer=new XMLWriter(new FileWriter(new File(filename)));
            writer.write(document);
            writer.close();
        } catch (Exception ex) {
            logger.error("Can't write to xml file.");
            throw new Exception(ex);
        }
    }
	
	public void catch_body(){
        err_count++;       
        logger.info("Screenshot-->./{}/{}/{}_{}.png",ext_loop_cycle,case_name,String.valueOf(run_count),String.valueOf(function_name));
        screen_shot=true;
        result=false;
        String screenshot=case_name+"_"+String.valueOf(run_count)+".png";
        String snapshot_path="./log/"+ext_loop_cycle+"/";
        my_web.take_screen(snapshot_path+screenshot);
        logger.info("Screenshot saved.");
        try {
			//适用于一切异常终止的操作，这里浏览器异常没有考虑进去
        	my_web.close_web();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
