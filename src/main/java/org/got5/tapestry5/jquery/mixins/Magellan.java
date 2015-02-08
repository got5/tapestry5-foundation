package org.got5.tapestry5.jquery.mixins;

import org.apache.tapestry5.ClientElement;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.AfterRender;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectContainer;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;


/**
 * This mixin allows you to display a  site sticky navigation.
 *
 * @since 4.0.1
 * @see <a href="http://foundation.zurb.com/docs/components/magellan.html">http://foundation.zurb.com/docs/components/magellan.html</a>
 *
 * @tapestrydoc
 */
@Import(stylesheet={"classpath:META-INF/modules/foundation/css/foundation.css"})
public class Magellan{
	

	@InjectContainer
	private ClientElement element;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Parameter
    private JSONObject params;
	
	@AfterRender
	public void finish(MarkupWriter w){

		
		JSONObject objParam = new	JSONObject();
		objParam.put(element.getClientId(), params);
		
		JSONObject parameters = new	JSONObject();
		parameters.put("params",objParam);
		parameters.put("id",element.getClientId());
		javaScriptSupport.require("foundation/magellan").with(parameters);

	}

    
	public String getClientId(){
		return "#"+element.getClientId();
	}

}
