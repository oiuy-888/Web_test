package testsuit;

public class testcase009 extends base_testcase{

    public static int case_count=0;
	
	public testcase009() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_003-2";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_report_with_code_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
