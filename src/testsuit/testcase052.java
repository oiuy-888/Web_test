package testsuit;

public class testcase052 extends base_testcase{

    public static int case_count=0;
	
	public testcase052() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_027";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_more_default_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
