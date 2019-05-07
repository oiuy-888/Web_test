package testsuit;

public class testcase041 extends base_testcase{

    public static int case_count=0;
	
	public testcase041() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_040";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_2dim_card_phone_coat_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
