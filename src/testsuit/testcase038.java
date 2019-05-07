package testsuit;

public class testcase038 extends base_testcase{

    public static int case_count=0;
	
	public testcase038() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_032";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_2dim_name_card_coat_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
