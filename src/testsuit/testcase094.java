package testsuit;

public class testcase094 extends base_testcase{

    public static int case_count=0;
	
	public testcase094() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="UNION_029";
        logger.info("Now is running function '{}'", function_name);
        my_web.batch_upload_union_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
