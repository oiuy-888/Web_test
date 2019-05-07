package config;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Config {

	Home_cfg home_cfg = new Home_cfg();	
	public Set_cfg[] configs =new Set_cfg[1];
	public Config(){
		configs[0]=home_cfg;
	}
	
	public void write_to_file(String file_name) throws  Exception{
        Document document= DocumentHelper.createDocument();
        Element root_elem =document.addElement("root");//root
        for (Set_cfg cfg:configs) {
            Element module_elem = root_elem.addElement(cfg.getClass().getSimpleName());
            module_elem.addAttribute("name",cfg.name);
            module_elem.addComment("This is buttons config in "+cfg.name);
            Iterator<Map.Entry<String, button>> iterator = cfg.get_cfg_iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, button> entry = iterator.next();
                String key_t = String.valueOf(entry.getKey());
                button val_t = entry.getValue();
                Element button_elm=module_elem.addElement("Widget");
                button_elm.addAttribute("name",key_t);
                button_elm.addComment(val_t.comment);  //Åú×¢ÐÅÏ¢
                button_elm.addElement("Attribute").addText(val_t.attribute);
                button_elm.addElement("Method_sel").addText(String.valueOf(val_t.mSel));
            }
        }
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        outputFormat.setIndent(true);
        outputFormat.setNewlines(true);
        XMLWriter writer=new XMLWriter(new FileWriter(new File(file_name)),outputFormat);

        writer.write(document);
        writer.close();
    }
	
	public void read_from_file(String file_name) throws  Exception{
        System.out.println("Read file : "+file_name);

        SAXReader reader = new SAXReader();
        Document document= reader.read(new File(file_name));
        Element root=document.getRootElement();
        for(Set_cfg cfg:configs){
            cfg.clear_config();
            System.out.println("module element of "+cfg.getClass().getSimpleName());
            Element module_elm =root.element(cfg.getClass().getSimpleName());
            cfg.name=module_elm.attributeValue("name");
            Iterator<?> iterator=module_elm.elementIterator();
            while(iterator.hasNext()){
                Element cfg_elm= (Element) iterator.next();
                String cfg_name= cfg_elm.attributeValue("name");
                String path=cfg_elm.getPath()+"/comment()";
                Node bbb=cfg_elm.node(1);
                String comm;
                if(bbb.getNodeTypeName().equals("Comment")){

                    comm = bbb.getStringValue();
                }else {
                    comm="";
                }

                String attri=cfg_elm.element("Attribute").getText();
                String msel =cfg_elm.element("Method_sel").getText();
                cfg.add(cfg_name ,new button(attri, Set_cfg.method_sel.valueOf(msel),comm));
            }
        }
    }
	
	public void set_default(){
        for(Set_cfg cfg:configs){
            cfg.set_default();
        }
    }
//    public void print_config(){
//        for(Set_cfg cfg:configs){
//            cfg.print_cfg();
//        }
//    }
}
