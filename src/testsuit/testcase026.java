package testsuit;

public class testcase026 extends base_testcase{

    public static int case_count=0;
	
	public testcase026() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="OBSERVE_014";
        logger.info("Now is running function '{}'", function_name);
        my_web.observe_person_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
