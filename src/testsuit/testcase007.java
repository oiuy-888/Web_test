package testsuit;

public class testcase007 extends base_testcase{

    public static int case_count=0;
	
	public testcase007() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_002";
        logger.info("Now is running function '{}'", function_name);
        my_web.cancel_report_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
