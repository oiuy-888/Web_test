package testsuit;

public class testcase008 extends base_testcase{

    public static int case_count=0;
	
	public testcase008() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_003-1";
        logger.info("Now is running function '{}'", function_name);
        my_web.cancel_report_with_code_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
