package org.got5.tapestry5.jquery.pages;

import org.apache.tapestry5.json.JSONObject;


public class DropDown {

	public JSONObject getParams(){
		JSONObject json =  new JSONObject();
		json.put("active_class", "open");// specify the class used for active sections
		json.put("is_hover",false);
        return json;
	}
	
}
