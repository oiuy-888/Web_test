package testsuit;

public class testcase034 extends base_testcase{

    public static int case_count=0;
	
	public testcase034() {
        super();
    }
	
	@Override
    public void during_run() throws Exception {
        function_name="CLOUD_022";
        logger.info("Now is running function '{}'", function_name);
        my_web.input_norecord_2dim_name_id_test();
    }

    @Override
    public void pre_report() throws Exception {
        this.case_count +=1;
    }

}
