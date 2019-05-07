package testsuit;

public class testcase001 extends base_testcase{
	
	public static int case_count=0;
	
	public testcase001() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="HOME_PAGE_001";
        logger.info("Now is running function '{}'", function_name);        
        my_web.click_sign_in_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
