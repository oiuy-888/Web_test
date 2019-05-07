package testsuit;

public class testcase028 extends base_testcase{

    public static int case_count=0;
	
	public testcase028() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_001";
        logger.info("Now is running function '{}'", function_name);
        my_web.no_input_4dim_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
