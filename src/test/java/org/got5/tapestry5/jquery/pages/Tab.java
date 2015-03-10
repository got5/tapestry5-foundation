package org.got5.tapestry5.jquery.pages;

import org.apache.tapestry5.json.JSONObject;


public class Tab {

	public JSONObject getParams(){
		JSONObject json =  new JSONObject();
		json.put("active_class", "active");// specify the class used for active sections
		json.put("toggleable",true);
        return json;
	}
	
}
