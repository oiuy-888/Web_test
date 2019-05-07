package mudule;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Interner;

public class WX_union extends WX_smart{
	
	Logger logger = LogManager.getLogger(this.getClass());

	public void union_input(String name,String cid) throws Exception{
		write("union_name_input",name);
		write("union_sid_input",cid);
		click("union_excl_point");
		if(!check("uploadinfo")){                      
			upload("union_upload",filepath+cid+".png");
		}
		click("union_search");
		wait(1);
	}
	
	public int get_union_money() throws Exception{
		String para = read("union_money");
		return Integer.parseInt(para);
	}
	
	public void check_union_test() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case87[0],case87[1]);
		if(check("union_wrong_result")){
			logger.info("�е������֤���������ʾ��ִ�гɹ�");
		}else{
			logger.error("û�е������֤���������ʾ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test1() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case88[0],case88[1]);
		click("ok");
		switchto();
		if(check("union_result")){
			logger.info("�ɲ�ѯ���Ŵ���Ϣ��ִ�гɹ�");
		}else{
			logger.error("���ɲ�ѯ���Ŵ���Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test2() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case89[0],case89[1]);
		click("ok");
		switchto();
		if(check("union_result")){
			logger.info("�ɲ�ѯ���Ŵ���Ϣ��ִ�гɹ�");
		}else{
			logger.error("���ɲ�ѯ���Ŵ���Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test3() throws Exception{
		enterprise_landing();
		click("WXunion");
		union_input(case90[0],case90[1]);
		click("ok");
		switchto();
		if(check("union_result")){
			logger.info("�ɲ�ѯ���Ŵ���Ϣ��ִ�гɹ�");
		}else{
			logger.error("���ɲ�ѯ���Ŵ���Ϣ��ִ��ʧ��");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_type(int para) throws Exception{
		click("ok");
		switchto();
		boolean a = read("union_report_1").contains("0����¼");
		boolean b = read("union_report_2").contains("0����¼");
		boolean c = read("union_report_3").contains("0����¼");
		if(para == 1){
			if((!a)&&b&&c){
				logger.info("���ɱ���ֻ��������������Ϣ����Ϣ��ȷ");
			}else{
				logger.error("���ɱ��沢��ֻ��������������Ϣ����Ϣ����");
				throw new Exception();
			}
		}else if(para == 2){
			if((!a)&&(!b)&&c){
				logger.info("���ɱ����������������Ϣ��ִ�м�¼����Ϣ��ȷ");
			}else{
				logger.error("���ɱ��沢��ֻ��������������Ϣ��ִ�м�¼����Ϣ����");
				throw new Exception();
			}
		}else if(para == 3){
			if((!a)&&(!b)&&(!c)){
				logger.info("���ɱ����������������Ϣ��ִ�м�¼��ʧ����������Ϣ��ȷ");
			}else{
				logger.error("���ɱ��沢��ȫ��������Ϣ����");
				throw new Exception();
			}
		}
		switchto();
	}
	
	public void check_union_test4() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		union_input(case91[0],case91[1]);
		check_type(1);
		money2 = get_union_money();
		if(money1-money2==netloan){
			logger.info("����ҿ۳�����unioncost��ִ�гɹ�");
		}else{
			logger.error("����ҿ۳�����unioncost��ִ�гɹ�");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test5() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		union_input(case92[0],case92[1]);
		check_type(2);
		money2 = get_union_money();
		if(money1-money2==netloan+risksxbzx){
			logger.info("����ҿ۳�����netloan+risksxbzx��ִ�гɹ�");
		}else{
			logger.error("����ҿ۳�����netloan+risksxbzx��ִ�гɹ�");
			throw new Exception();
		}
		close_web();
	}
	
	public void check_union_test6() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		union_input(case93[0],case93[1]);
		check_type(3);
		money2 = get_union_money();
		if(money1-money2==netloan+risksxbzx+risksxll){
			logger.info("����ҿ۳�����netloan+risksxbzx+risksxll��ִ�гɹ�");
		}else{
			logger.error("����ҿ۳�����netloan+risksxbzx+risksxll��ִ�гɹ�");
			throw new Exception();
		}
		close_web();
	}
	
	public void batch_upload(String para) throws Exception{
		click("batch_upload_data");
		upload("batch_upload",filepath+para+".xls");
		click("batch_upload_button");
		click("close_batch");
	}
	
	public void batch_upload_union_test() throws Exception{
		int money1,money2;
		enterprise_landing();
		click("WXunion");
		money1 = get_union_money();
		batch_upload(case94[0]);
		refresh();
		money2 = get_union_money();
		if(money2-money1==bacth_upload_money){
			logger.info("�����ϴ��������ҵ���bacth_upload_money��ִ�гɹ�");
		}else{
			logger.error("�����ϴ��������Ҳ�����bacth_upload_money��ִ�гɹ�");
			throw new Exception();
		}
		close_web();
	}
	
}
