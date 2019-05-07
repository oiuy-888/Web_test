package testsuit;

public class testcase070 extends base_testcase{

    public static int case_count=0;
	
	public testcase070() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_127";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_UTRinfo_test3();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
