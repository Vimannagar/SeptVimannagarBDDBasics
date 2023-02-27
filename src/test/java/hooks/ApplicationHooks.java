package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHooks {
	
	
	@Before(order = 1)
	public void beforeHook1()
	{
		System.out.println("Before hook 1 is executing");
	}
	

	@Before(order = 2)
	public void beforeHook2()
	{
		System.out.println("Before hook 2 is executing");
	}
	
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("before step");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step");
	}
	
	
	
	@After(order = 1)
	public void afterHook1()
	{
		System.out.println("After hook 1 is executing");
	}

	@After(order = 2)
	public void afterHook2()
	{
		System.out.println("After hook 2 is executing");
	}
}
