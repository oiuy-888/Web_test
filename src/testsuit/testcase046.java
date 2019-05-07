package testsuit;

public class testcase046 extends base_testcase{

    public static int case_count=0;
	
	public testcase046() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_003";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_ICinfo_by_code_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
