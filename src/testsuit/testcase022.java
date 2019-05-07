package testsuit;

public class testcase022 extends base_testcase{

    public static int case_count=0;
	
	public testcase022() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="GRADE_019";
        logger.info("Now is running function '{}'", function_name);
        my_web.recheck_grade_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
