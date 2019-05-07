package testsuit;

public class testcase039 extends base_testcase{

    public static int case_count=0;
	
	public testcase039() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_036";
        logger.info("Now is running function '{}'", function_name);
        my_web.err_input_2dim_card_phone_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
