package testsuit;

public class testcase047 extends base_testcase{

    public static int case_count=0;
	
	public testcase047() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_007";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_ICinfo_pic_report_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
