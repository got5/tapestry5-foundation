package org.got5.tapestry5.jquery;

import org.apache.tapestry5.test.SeleniumTestCase;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;

public class DropDownTest extends SeleniumTestCase {

    private static final String DROPDOWN_MENU_SELECTOR = "//a[@id='any']";

    private static final String DROPDOWN_CONTENT =  "//*[@id='tinyDrop']";

   
	@Test
    public void testDropDownComponent(){

    	open("/DropDown");

    	new Wait()
        {
            @Override
            public boolean until()
            {
                return isElementPresent(DROPDOWN_MENU_SELECTOR + "[contains(@class,'button')]");
            }

        }.wait("The a element should have the button class : " + getAttribute(DROPDOWN_MENU_SELECTOR + "@class"), FoundationTestConstants.TIMEOUT);

        click(DROPDOWN_MENU_SELECTOR);

        new Wait()
        {
            @Override
            public boolean until()
            {
            	String ariaHidden =  getAttribute("//*[@id='tinyDrop']@aria-hidden");
                return ariaHidden.contains("false");
            }
        }.wait("The tinyDrop element should be visible ", FoundationTestConstants.TIMEOUT);

    }

}
