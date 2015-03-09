package org.got5.tapestry5.jquery;

import org.apache.tapestry5.test.SeleniumTestCase;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;

public class MagellanTest extends SeleniumTestCase {

    @Test
    public void testMagellanlMixin() {

        open("/magellan");
        waitForPageToLoad();
        clickOnMagellanLink("1");
    }
        
    
    public void clickOnMagellanLink(final String num)
    {
	    click("//*[@id='MagellanContainer']/dl/dd["+num+"]/a");        
	    new Wait()
	    {
	        @Override
	        public boolean until()
	        {
	            return getAttribute("//*[@id='MagellanContainer']/dl/dd["+num+"]@class").contains("active");
	        }
	    }.wait(num+" should be actived", FoundationTestConstants.TIMEOUT);
    }

}
