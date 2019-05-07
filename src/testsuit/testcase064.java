package testsuit;

public class testcase064 extends base_testcase{

    public static int case_count=0;
	
	public testcase064() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_106";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_PQCinfo_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
