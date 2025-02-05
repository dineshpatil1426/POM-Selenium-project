package com.Ecommerce.qa.util;

import com.Ecommerce.qa.base.TestBase;

public class Testutil extends TestBase {
 
	public static long PAGE_LOAD_TIMEOUT=20;
	
	public static long IMPLICITY_WAIT=20;	
	
	
	
	public void SwitchtoFrame() {
		
		driver.switchTo().frame("mainpanel");
	}
}
