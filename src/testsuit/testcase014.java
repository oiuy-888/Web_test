package testsuit;

public class testcase014 extends base_testcase{

    public static int case_count=0;
	
	public testcase014() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="REPORT_018";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_legals_company_info_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
