package mudule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import config.Decode_xml;
import config.button;

public class Actuate extends Decode_xml{
	
	Logger logger = LogManager.getLogger(this.getClass());
	WebDriver driver = new FirefoxDriver();
	WebDriverWait firefox = new WebDriverWait(driver, 15);              //上传文件处受影响、批量查询受影响
	
	public void take_screen(String file_path){
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(file_path));
		} catch (Throwable e) {
			logger.info("截图失败");
			e.printStackTrace();
		}
	}
	
	public void wait(int ms){
		int time = ms*1000;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("等待 "+ ms +"秒");
	}
	
	public void open_web(String url){
		driver.get(url);
	    logger.info("打开网页:"+ url);
	}
	//默认网址
	public void open_web(){
		driver.get(http);
//		driver.get("https://wx.ccxcredit.com/login");
		logger.info("打开网页: "+http);
	}
	
	public void close_web(){	
		driver.quit();    //quit为关闭所有窗口
		logger.info("关闭网页");
	}
	
	public void close_current_web(){	
		driver.close();    //quit为关闭当前窗口
		logger.info("关闭当前网页");
	}
	
	public void max_size() {
//		driver.manage().window().maximize();           /**无需最大化**/
		wait(1);
//		logger.info("网页界面最大化");
	}
	
	
	
	public WebElement find_elenuim_by_id(final String para){
//		WebElement elenium = driver.findElement(By.id(para));
		WebElement elenium = firefox.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.id(para));
			}
		});
		logger.info("寻找元素 By Id :" + para);
		return elenium;
	}
	
	public WebElement find_elenuim_by_name(final String para){
//		WebElement elenium = driver.findElement(By.name(para));
		WebElement elenium = firefox.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.name(para));
			}
		});
		logger.info("寻找元素By Name :" + para);
		return elenium;
	}
	
	public WebElement find_elenuim_by_path(final String para){
//		WebElement elenium = driver.findElement(By.xpath(para));
		WebElement elenium = firefox.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.xpath(para));
			}
		});
		logger.info("寻找元素By Xpath :" + para);
		return elenium;
	}
	
	public WebElement find_elenuim_by_paths(final String para){
//		WebElement elenium = driver.findElement(By.xpath("//*[text()='"+para+"']"));
		WebElement elenium = firefox.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.xpath("//*[text()='"+para+"']"));
			}
		});
		logger.info("寻找元素（文本）By Xpaths :" + para);
		return elenium;
	}
	
	public WebElement find_elenuim_by_partialLinkText(final String para){
//		WebElement elenium = driver.findElement(By.partialLinkText(para));
		WebElement elenium = firefox.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.partialLinkText(para));
			}
		});
		logger.info("寻找元素By Partlinktext :" + para);
		return elenium;
	}
	
	public WebElement find_elenuim_by_classname(final String para){
//		WebElement elenium = driver.findElement(By.className(para));
		WebElement elenium = firefox.until(new ExpectedCondition<WebElement>(){
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.className(para));
			}
		});
		logger.info("寻找元素By Classname :" + para);
		return elenium;
	}
	
	public WebElement sele_met(button mold){
		WebElement result = null;
		switch (mold.mSel){
		case id:
			result = find_elenuim_by_id(mold.attribute);
			break;
		case name:
			result = find_elenuim_by_name(mold.attribute);
			break;
		case xpath:
			result = find_elenuim_by_path(mold.attribute);
			break;
		case xpaths:
			result = find_elenuim_by_paths(mold.attribute);
			break;
		case clsname:
			result = find_elenuim_by_classname(mold.attribute);
			break;
		case parlintext:
			result = find_elenuim_by_partialLinkText(mold.attribute);
			break;
		}
		return result;
	}
	
	public button get_button(String name) throws Exception{
        if(buttons.containsKey(name)) {                          
            return buttons.get(name);
        }else{
            logger.error("元素 '{}' 不在config表单中.",name);
            throw new Exception();
        }
    }
	
	public void click(String para) throws Exception{
		button btn=get_button(para);
		sele_met(btn).click();
		logger.info("点击 :"+ para);
	}

	public void write(String para,String key) throws Exception{
		button btn=get_button(para);
		sele_met(btn).sendKeys(key);
		logger.info("写入 :"+ key);
	}
	
	public String read(String para) throws Exception{
		button btn=get_button(para);
		String readtext = sele_met(btn).getText();
		logger.info("获取文本内容 :"+ readtext);
		return readtext;
	}
	
	public boolean check(String para) throws Exception{
		button btn=get_button(para);
		try {
			sele_met(btn);
			logger.info("寻找元素 " + para + " 成功");
			return true;
		} catch (Exception e) {
			logger.info("寻找元素 " + para + " 失败");
			return false;
		}
	}
	
	public String get_title(){
		String title = driver.getTitle();
		return title;
	}
	
	public String get_url(){
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void switchto(){
		wait(4);    //手动延时等待弹出窗口
		String handle = driver.getWindowHandle();
		for(String handles:driver.getWindowHandles()){
			if(handles.equals(handle)){continue;}
			else{
				driver.switchTo().window(handles); 
				wait(1);
				String title = driver.getTitle();
				logger.info("切换界面到： "+title+" 页");
			}
		}
	}
	
	public void alert_ok(){
		Alert alert = driver.switchTo().alert();
		wait(1);
		alert.accept();
		logger.info("在提示框中点击Ok");
	}
	
	public void alert_cancel(){
		Alert alert = driver.switchTo().alert();
		wait(1);
		alert.dismiss();
		logger.info("在提示框中点击 Cancel");
	}

	public void back(){
		driver.navigate().back();
		logger.info("后退");
		wait(2);
	}
	
	public void forward(){
		driver.navigate().forward();
		logger.info("前进");
		wait(2);
	}
	
	public void refresh(){
		driver.navigate().refresh();
		logger.info("刷新");
		wait(2);
	}
	
	public String getattr(String para) throws Exception{
		button btn=get_button(para);
		String attr = sele_met(btn).getAttribute("innerHTML");
		return attr;
	}
	
	public String page_source() throws Exception{
		String sour = driver.getPageSource().trim();//消去空格
		return sour;
	}
	
	public void frameto(String frame) throws Exception{
		driver.switchTo().frame(frame);
	}
	
	public void frametodefault() throws Exception{
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//通用步骤
	public void enterprise_landing() throws Exception{	
		open_web();
		max_size();
		if(check("user_login")){
			enter_account_password("lishuai","lishuai001");   //测试
		}else{
			logger.error("没有进入登陆界面");
            throw new Exception();
		}
	}
	
	public void enterprise_landing(String acc,String pas) throws Exception{	
		open_web();
		max_size();
		if(check("user_login")){
			enter_account_password(acc,pas);
		}else{
			logger.error("没有进入登陆界面");
            throw new Exception();
		}
	}
	
	public void enter_account_password(String account,String password) throws Exception {
		write("test_account",account);
		write("test_password",password);
		click("enter");
		if(check("out")){
			logger.info("登陆账户: "+account+" 成功");
		}else{
			logger.error("登陆账户: "+account+" 失败");
			throw new Exception();
		}
	}
	
	public void upload(String para, String file) throws Exception {
		button btn=get_button(para);
		File file1 =new File(file);
		sele_met(btn).sendKeys(file1.getAbsolutePath().toString());
		logger.info("上传文件 :"+ file);
	}
	
	public double get_my_money()throws Exception{
		double money;
		click("My_account");
		click("conmuse_result");
		wait(3);      //不设置掩饰会get未刷新的余额
		money = Double.parseDouble(read("my_money"));
		return money;
	}
	
	public void check_source(String para) throws Exception {
		String source = page_source();
		if(source.contains(para)){      
			logger.info("HTML源码中包含： "+para + " ，执行成功");
		}else{
			logger.error("HTML源码中不包含： "+para +" ，执行失败");
			throw new Exception();
		}
	}
	
	public void sum(double val,double cost) throws Exception{
		if(val==cost){
			logger.info("扣费等于"+cost+"，执行成功");
		}else{
			logger.error("扣费不等于"+cost+"，执行失败");
			throw new Exception();
		}
	}
	
}
