package testsuit;

public class testcase018 extends base_testcase{

    public static int case_count=0;
	
	public testcase018() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_069";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_personal_report_batch_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
