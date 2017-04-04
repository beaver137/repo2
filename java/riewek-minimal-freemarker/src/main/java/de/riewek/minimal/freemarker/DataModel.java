//http://freemarker.org/docs/pgui_quickstart_createdatamodel.html
package de.riewek.minimal.freemarker;

import java.util.HashMap;
import java.util.Map;

public class DataModel {

	public static Map<String, Object> createDataModel() {
		// Create the root hash. We use a Map here, but it could be a JavaBean too.
		Map<String, Object> root = new HashMap<>();

		// Put string "user" into the root
		root.put("user", "Big Joe");

		// Create the "latestProduct" hash. We use a JavaBean here, but it could be a Map too.
		Product latest = new Product();
		latest.setUrl("products/greenmouse.html");
		latest.setName("green mouse");
		// and put it into the root
		root.put("latestProduct", latest);
		
		return root;
	}
	
}
