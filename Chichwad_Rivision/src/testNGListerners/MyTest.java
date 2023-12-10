package testNGListerners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListerners.Listener.class)
public class MyTest 
{
  @Test
  public void a() 
  {
	  Assert.fail();
	  Reporter.log("This is from a method", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("This is from b method", true);
  }
  
  @Test
  public void c() 
  {
	  Assert.fail();
	  Reporter.log("This is from c method", true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("This is from d method", true);
  }
}
