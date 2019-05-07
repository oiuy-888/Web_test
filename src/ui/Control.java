package ui;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import config.Datainput;
import example.Test1;
import mudule.Actuate;

public class Control extends Datainput{
	
	public static String[] src1 = {"case001","case002","case003","case004","case005","case006"};
	public static String[] src2 = {"case007","case008","case009","case010","case011","case012","case013","case014","case015","case016","case017","case018"};
	public static String[] src3 = {"case019","case020","case021","case022","case023"};
	public static String[] src4 = {"case024","case025","case026","case027"};
	public static String[] src5 = {"case028","case029","case030","case031","case032","case033","case034","case035","case036","case037","case038","case039","case040","case041","case042","case043","case044"};
	public static String[] src6 = {"case045","case046","case047","case048","case049","case050","case051","case052","case053","case054","case055","case056","case057","case058","case059","case060","case061",
			                "case062","case063","case064","case065","case066","case067","case068","case069","case070","case071","case072","case073","case074","case075","case076","case077","case078",
			                "case079","case080","case081","case082","case083","case084","case085","case086"};
	public static String[] src7 = {"case087","case088","case089","case090","case091","case092","case093","case094"};
	public static String[] src8 = {"case095","case096","case097"};
	public static String[] src9 = {"case098","case099"};
	
	public static int[] homepage  = new int[100];
	public static int[] wxreport  = new int[100];
	public static int[] wxgrade   = new int[100];
	public static int[] wxobserve = new int[100];
	public static int[] wxcloud   = new int[100];
	public static int[] wxsmart   = new int[100];
	public static int[] myaccount = new int[100];
	public static int[] wxunion   = new int[100];
	public static int[] baseweb   = new int[100];

	public void init_array(){
		for(int i=0;i<100;i++){
			homepage[i]=1;
			wxreport[i]=1;
			wxgrade[i]=1;
			wxobserve[i]=1;
			wxcloud[i]=1;
			wxsmart[i]=1;
			myaccount[i]=1;
			wxunion[i]=1;
			baseweb[i]=1;
			}
	}

	public void test_ui(){
		init_array();
		final JFrame jframe = new JFrame("菜单界面");
		jframe.setBounds(0, 0, 305, 700);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jframe.setLayout(null);
		
		final JTextField weburl = new JTextField("http://192.168.100.34:7088/credit/login");
		weburl.setEditable(true);
		weburl.setBounds(50, 10, 200, 30);
		jframe.add(weburl);
		
		JButton button1=new JButton(new AbstractAction("首页") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_homepage homepage = new Control_homepage();
			}
		});
		button1.setBounds(100, 50, 100, 30);
		jframe.add(button1);
	    
		
		JButton button2=new JButton(new AbstractAction("万象报告") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_wxreport wxreport = new Control_wxreport();
			}
		});
		button2.setBounds(100, 100, 100, 30);
		jframe.add(button2);
		
		
		JButton button3=new JButton(new AbstractAction("万象评分") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_wxgrade wxgrade = new Control_wxgrade();
			}
		});
		button3.setBounds(100, 150, 100, 30);
		jframe.add(button3);
		
		
		JButton button4=new JButton(new AbstractAction("万象动察") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_wxobserve wxobserve = new Control_wxobserve();
			}
		});
		button4.setBounds(100, 200, 100, 30);
		jframe.add(button4);
		
		
		JButton button5=new JButton(new AbstractAction("万象云盾") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_wxcloud wxcloud = new Control_wxcloud();
			}
		});
		button5.setBounds(100, 250, 100, 30);
		jframe.add(button5);
		
		
		JButton button6=new JButton(new AbstractAction("万象智慧") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_wxsmart wxsmart = new Control_wxsmart();
			}
		});
		button6.setBounds(100, 300, 100, 30);
		jframe.add(button6);
		
		
		JButton button7=new JButton(new AbstractAction("万象联盟") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_wxunion wxunion = new Control_wxunion();
			}
		});
		button7.setBounds(100, 350, 100, 30);
		jframe.add(button7);
		
		
		JButton button8=new JButton(new AbstractAction("我的账户") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_myaccount myaccount = new Control_myaccount();
			}
		});
		button8.setBounds(100, 400, 100, 30);
		jframe.add(button8);
		
		
		JButton button9=new JButton(new AbstractAction("特殊用例") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Control_baseweb baseweb = new Control_baseweb();
			}
		});
		button9.setBounds(100, 450, 100, 30);
		jframe.add(button9);
		
		
		JButton button10=new JButton(new AbstractAction("确定") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				Test1 test = new Test1();
				try {
					http = weburl.getText();
					test.setUp();
					test.run();   
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button10.setBounds(100, 550, 100, 30);
		jframe.add(button10);
		
		
		JButton button11=new JButton(new AbstractAction("查看报告") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = new File("log\\0_summary.html");
				Runtime ce = Runtime.getRuntime();
				try {
					ce.exec("cmd /c start "+file.getAbsolutePath());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		button11.setBounds(0, 600, 100, 30);
		jframe.add(button11);
		
		
		JButton button12=new JButton(new AbstractAction("替换数据") {
			@Override
			public void actionPerformed(ActionEvent e) {
				Datainput datainput = new Datainput();
				try {
					datainput.resetpara();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button12.setBounds(187, 600, 100, 30);
		jframe.add(button12);
		
		
		JButton button13=new JButton(new AbstractAction("数据输入") {	
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Data_input datainput = new Data_input();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button13.setBounds(100, 500, 100, 30);
		jframe.add(button13);
		
		
		jframe.validate();
		jframe.repaint();
	}

	
	

}
