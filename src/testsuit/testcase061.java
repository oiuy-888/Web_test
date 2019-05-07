package testsuit;

public class testcase061 extends base_testcase{

    public static int case_count=0;
	
	public testcase061() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_085";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_tradinfo_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
