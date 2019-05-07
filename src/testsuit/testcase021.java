package testsuit;

public class testcase021 extends base_testcase{

    public static int case_count=0;
	
	public testcase021() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="GRADE_018";
        logger.info("Now is running function '{}'", function_name);
        my_web.addto_control_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
