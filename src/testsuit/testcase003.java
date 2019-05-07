package testsuit;

public class testcase003 extends base_testcase{
	
    public static int case_count=0;
	
	public testcase003() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="HOME_PAGE_022";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_report_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
