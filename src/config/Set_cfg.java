package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Set_cfg{
	
	Logger logger= LogManager.getLogger(this.getClass());
	
    public enum method_sel{
        id,
        name,
        xpath,
        xpaths,
        clsname,
        parlintext
    }
    private HashMap<String,button> buttonsMap;
    public String name;
    public Set_cfg(){
        buttonsMap=new HashMap<String,button>();
    }

    public void add(String name,button new_button){
        buttonsMap.put(name,new_button);
    }
    public HashMap<String, button> set_map(){return buttonsMap;}
    public void set_default(){}
    public Iterator<Map.Entry<String, button>> get_cfg_iterator(){
        return buttonsMap.entrySet().iterator();
    }
    public void clear_config(){
        buttonsMap.clear();
    }
    public String get_attr(String name){
        String attr=buttonsMap.get(name).attribute;
        return attr;
    }
    public method_sel get_sel(String name){
        return buttonsMap.get(name).mSel;
    }
    public String get_apk_name() {return name;}
    
//    public void print_cfg(){
//        Iterator<Map.Entry<String, button>> iterator = get_cfg_iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, button> entry = iterator.next();
//            String nme=entry.getKey();
//            button btn=entry.getValue();
//        }
//    }
}

