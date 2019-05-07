package testsuit;

public class testcase020 extends base_testcase{

    public static int case_count=0;
	
	public testcase020() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="GRADE_015";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_riskinfo_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
