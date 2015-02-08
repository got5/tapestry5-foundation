package org.got5.tapestry5.jquery.pages;

import org.apache.tapestry5.json.JSONObject;


public class Magellan {

	public JSONObject getParams(){
		JSONObject json =  new JSONObject();
		json.put("active_class", "active");// specify the class used for active sections
		json.put("threshold",0);// pixels from the top of destination for it to be considered active
		json.put("throttle_delay",50); // calculation throttling to increase framerate
		json.put("fixed_top",0); // top distance in pixels assigend to the fixed element on scroll
		json.put("offset_by_height",true); // whether to offset the destination by the expedition height. Usually you want this to be true, unless your expedition is on the side.
        return json;
	}
	
}
