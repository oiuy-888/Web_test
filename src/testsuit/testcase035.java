package testsuit;

public class testcase035 extends base_testcase{

    public static int case_count=0;
	
	public testcase035() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_025";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_2dim_name_id_coat_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
