package testsuit;

public class testcase023 extends base_testcase{

    public static int case_count=0;
	
	public testcase023() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="GRADE_021";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_grade_from_history_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
