package testsuit;

public class testcase096 extends base_testcase{

    public static int case_count=0;
	
	public testcase096() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="ACCOUNT_017_1";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_account_test1();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
