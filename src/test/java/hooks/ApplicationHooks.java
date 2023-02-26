package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	
	@Before
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	
	
	
	@After
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}

}
