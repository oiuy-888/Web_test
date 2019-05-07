package testsuit;

public class testcase075 extends base_testcase{

    public static int case_count=0;
	
	public testcase075() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_168";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_blacklist_test1();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
