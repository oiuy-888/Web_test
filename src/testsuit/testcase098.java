package testsuit;

public class testcase098 extends base_testcase{

    public static int case_count=0;
	
	public testcase098() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SPECIAL_001";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_key_file_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
