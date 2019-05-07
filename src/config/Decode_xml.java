package config;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import config.Config;
import config.Set_cfg;

public class Decode_xml extends Datainput{
	
	Logger logger = LogManager.getLogger(this.getClass());
	private Set_cfg config;
	Config all_config =new Config();
	public static HashMap<String, button> buttons;
	
	public Decode_xml(){
		super();
	}
	
	public String get_apk_name(){
		return config.get_apk_name();
	}
	
	public String get_attr(String name){
        return this.config.get_attr(name);
    }
	
	public void get_config(Config in_all_cfg) throws Exception{
        this.all_config=in_all_cfg;
        set_configs();
    }
	
	public void set_cfg(Set_cfg cfg) throws Exception{
        this.config=cfg;
        set_map();
    }
	
	public void set_map(){
        this.buttons=config.set_map();
    }
	
    public void set_configs() throws Exception{
    	this.set_cfg(all_config.configs[0]);
    }

}
