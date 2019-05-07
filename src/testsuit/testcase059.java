package testsuit;

public class testcase059 extends base_testcase{

    public static int case_count=0;
	
	public testcase059() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="SMART_067";
        logger.info("Now is running function '{}'", function_name);
        my_web.check_judinfo_person_test3();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
