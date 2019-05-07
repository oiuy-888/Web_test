package testsuit;

public class testcase083 extends base_testcase{

    public static int case_count=0;
	
	public testcase083() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_213";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_PFT_test1();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
