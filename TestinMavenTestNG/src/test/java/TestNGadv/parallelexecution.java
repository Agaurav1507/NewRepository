package TestNGadv;

import org.testng.annotations.Test;

import Utilities.seleniumutility;

public class parallelexecution extends seleniumutility{
	
	@Test
	
	public void tcone() {
		
		setup("chrome","https://www.google.com");
		
		cleanup();
		
	}
	
	@Test
	
	public void tctwo() {
		
		setup("firefox","https://www.google.com");
		
		cleanup();
	}

}
