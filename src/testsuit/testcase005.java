package testsuit;

public class testcase005 extends base_testcase{

    public static int case_count=0;
	
	public testcase005() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="HOME_PAGE_069";
        logger.info("Now is running function '{}'", function_name);
        my_web.personal_user_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
