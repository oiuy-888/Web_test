package testsuit;

public class testcase092 extends base_testcase{

    public static int case_count=0;
	
	public testcase092() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="UNION_008";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_union_test5();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
