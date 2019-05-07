package testsuit;

public class testcase044 extends base_testcase{

    public static int case_count=0;
	
	public testcase044() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_052";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_3dim_coat_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
