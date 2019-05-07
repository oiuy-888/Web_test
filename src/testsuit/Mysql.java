package testsuit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Mysql{
 
	    Logger logger = LogManager.getLogger(this.getClass());
	
		String url = "jdbc:mysql://192.168.100.35:3306";
		String username = "lishuai";
		String passward = "lishuai";
		
		
		String sql = "SELECT COUNT(ID) FROM pccredit.zx_ds_history WHERE ACCOUNT='lishuai'";
		String qqll = "COUNT(ID)";
		
		@Test
		public int contectsql() throws Exception{
			int i=0;
			try{
//				logger.info("����" + url + "���ݿ�");
	     		Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		    	Connection con = DriverManager.getConnection(url,username,passward);	
		    	Statement stmt = con.createStatement();  
		    	ResultSet rs = stmt.executeQuery(sql); 
		    	while(rs.next()){
					i = Integer.parseInt(rs.getString(qqll));
				}
			    rs.close();
		    	stmt.close();
		    	con.close();
			}catch(SQLException e){
				logger.error("���ݿ�����ʧ�ܣ�");  
			    throw new Exception();
			}
			return i;
		}
		
		public void rerecord(int a,int b){
			if(a!=b){
				logger.info("��������޼�¼����������Դ");
			}else{
				logger.info("��������м�¼�����ʻ����");
			}
		}
		
		
		
		
		String sql1 = "SELECT CID FROM pccredit.zx_ds_history";     //���֤��or��ҵ����
		String qqll1 = "CID";
		String sql2 = "SELECT `NAME` FROM pccredit.zx_ds_history";    //����
		String qqll2 = "NAME";
		String sql3 = "SELECT MOBILE FROM pccredit.zx_ds_history";  //�ֻ���
		String qqll3 = "MOBILE";
		String sql4 = "SELECT CARD FROM pccredit.zx_ds_history";    //���п�
		String qqll4 = "CARD";
		public static String[] cid=new String[850000];//��806542����¼
		public static String[] name=new String[850000];
		public static String[] mobile=new String[850000];
		public static String[] card=new String[850000];
		
		public void contectsqltest() throws Exception{
			logger.info("��ȡ���ݿ���Դ����ȴ�...");
			try{int i=0;int j=0;int m=0;int n=0;
				Class.forName("org.gjt.mm.mysql.Driver").newInstance();
				Connection con = DriverManager.getConnection(url,username,passward);	
				Statement stmt = con.createStatement();  
				
				ResultSet rs1 = stmt.executeQuery(sql1); 
				while(rs1.next()){
					if(rs1.getString(qqll1)!=null){
						cid[i++]=rs1.getCharacterStream(qqll1).toString();
					}
				}
				rs1.close();
				ResultSet rs2 = stmt.executeQuery(sql2); 
				while(rs2.next()){
					if(rs2.getString(qqll2)!=null){
						name[j++]=rs2.getString(qqll2);
					}
				}
				rs2.close();
				ResultSet rs3 = stmt.executeQuery(sql3);
				while(rs3.next()){
					if(rs3.getString(qqll3)!=null){
						mobile[m++]=rs3.getString(qqll3);
					}
				}
				rs3.close();
				ResultSet rs4 = stmt.executeQuery(sql4);
				while(rs4.next()){
					if(rs4.getString(qqll4) != null){
						card[n++]=rs4.getString(qqll4);
					}
				}
				rs4.close();
				
				stmt.close();
				con.close();
			}catch(SQLException e){
				logger.error("���ݿ�����ʧ�ܣ�");  
//			    System.exit(0);
			}
		}
		
		public void recordcid(String para){
			for(int i=0;i<cid.length;i++){
				if(para==cid[i]){
					logger.info("�����������֤��/��ҵ���Ƽ�¼�����ʻ����");
					break;
				}
			}
		}
		
		public void recordname(String para){
			for(int i=0;i<name.length;i++){
				if(para==name[i]){
					logger.info("��������������¼�����ʻ����");
					break;
				}
			}
		}
		
		public void recordmobile(String para){
			for(int i=0;i<mobile.length;i++){
				if(para==mobile[i]){
					logger.info("���������ֻ������¼�����ʻ����");
					break;
				}
			}
		}
		
		public void recordcard(String para){
			for(int i=0;i<card.length;i++){
				if(para==card[i]){
					logger.info("�����������п��ż�¼�����ʻ����");
					break;
				}
			}
		}
		
}
