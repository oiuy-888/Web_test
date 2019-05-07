package testsuit;

public class testcase057 extends base_testcase{

    public static int case_count=0;
	
	public testcase057() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_065";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_judinfo_person_test1();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
