package testsuit;

public class testcase000 extends base_testcase{
	
	public static int case_count=0;
	
	public testcase000() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SETTING";
        logger.info("Now is running function '{}'", function_name);
        my_web.setting_charge();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
