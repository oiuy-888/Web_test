package testsuit;

public class testcase012 extends base_testcase{

    public static int case_count=0;
	
	public testcase012() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_010";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_report_from_data_source_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
