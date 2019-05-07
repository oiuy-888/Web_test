package testsuit;

public class testcase002 extends base_testcase{
	
    public static int case_count=0;
	
	public testcase002() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="HOME_PAGE_021";
        logger.info("Now is running function '{}'", function_name);
        my_web.enter_company_page_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
