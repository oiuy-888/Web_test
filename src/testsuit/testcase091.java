package testsuit;

public class testcase091 extends base_testcase{

    public static int case_count=0;
	
	public testcase091() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="UNION_007";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_union_test4();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
