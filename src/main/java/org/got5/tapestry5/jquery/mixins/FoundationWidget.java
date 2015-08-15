package org.got5.tapestry5.jquery.mixins;

import org.apache.tapestry5.BindingConstants;
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
 * This mixin allows you to add required javascript file for any foundation component.
 *
 * @since 4.0.1
 *
 *
 * @tapestrydoc
 */
@Import(stylesheet={"classpath:META-INF/modules/foundation/css/foundation.css"})
public class FoundationWidget{
	

	@InjectContainer
	private ClientElement element;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	/**
	 * Parameters to be used during the initialisation of thecomponent.
	 */
	@Parameter
    private JSONObject params;
	
	/**
	 * The name of the foundation component to display.
	 */
	@Parameter(defaultPrefix=BindingConstants.LITERAL,required=true)
    private String widgetName;
	
	@AfterRender
	public void finish(MarkupWriter w){
		
		JSONObject objParam = new	JSONObject();
		objParam.put(widgetName, params);
		JSONObject parameters = new	JSONObject();
		parameters.put("params",objParam);
		parameters.put("id",element.getClientId());
		javaScriptSupport.require("foundation/"+ widgetName).with(parameters);

	}

    
	public String getClientId(){
		return "#"+element.getClientId();
	}

}
