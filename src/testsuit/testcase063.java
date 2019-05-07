package testsuit;

public class testcase063 extends base_testcase{

    public static int case_count=0;
	
	public testcase063() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_088";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_tradinfo_test2();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
