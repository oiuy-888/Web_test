package testsuit;

public class testcase015 extends base_testcase{

    public static int case_count=0;
	
	public testcase015() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_043-1";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_0grade_personal_report_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
