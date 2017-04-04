package de.riewek.minimal.freemarker;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Template;

public class Main {
	
	public static void main(String[] args) throws Exception {
		FreemarkerConfiguration freemarker = new FreemarkerConfiguration();		
		//http://freemarker.org/docs/pgui_quickstart_gettemplate.html
		Template temp = freemarker.cfg.getTemplate("freemarker-product-html.ftl");
			
		Map<String, Object> root = DataModel.createDataModel();
		
		//http://freemarker.org/docs/pgui_quickstart_merge.html
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
	}

}
