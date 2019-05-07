package testsuit;

public class testcase037 extends base_testcase{

    public static int case_count=0;
	
	public testcase037() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_028";
        logger.info("Now is running function '{}'", function_name);
        my_web.right_input_2dim_name_card_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
