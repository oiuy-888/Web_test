package testsuit;

public class testcase045 extends base_testcase{

    public static int case_count=0;
	
	public testcase045() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_002";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_ICinfo_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
