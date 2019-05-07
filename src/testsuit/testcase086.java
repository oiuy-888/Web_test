package testsuit;

public class testcase086 extends base_testcase{

    public static int case_count=0;
	
	public testcase086() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_218";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_PFT_test4();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
