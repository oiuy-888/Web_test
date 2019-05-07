package testsuit;

public class testcase031 extends base_testcase{

    public static int case_count=0;
	
	public testcase031() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_014";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_4dim_coat_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
