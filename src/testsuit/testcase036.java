package testsuit;

public class testcase036 extends base_testcase{

    public static int case_count=0;
	
	public testcase036() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_027";
        logger.info("Now is running function '{}'", function_name);
        my_web.err_input_2dim_name_card_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
