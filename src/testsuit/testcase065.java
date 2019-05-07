package testsuit;

public class testcase065 extends base_testcase{

    public static int case_count=0;
	
	public testcase065() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_107";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_PQCinfo_test1();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
