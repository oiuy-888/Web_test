package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import config.Set_cfg.method_sel;

public class button {
	
	    Logger logger= LogManager.getLogger(this.getClass());
	    
	    public String attribute;
	    public method_sel mSel;
	    public String comment;
	    public button(String attribute,method_sel mSel_in,String comm){
	        this.attribute=attribute;
	        this.mSel=mSel_in;
	        this.comment=comm;
	    }
	    public void print(){
	        logger.info("Button : attribute({}) method_sel({}) comment({})",this.attribute,this.mSel,this.comment);
	    }

	    public String pr_out(){
	        String a="attribute("+this.attribute+") method_sel("+this.mSel+") comment("+this.comment+").";
	        return  a;
	    }
}
