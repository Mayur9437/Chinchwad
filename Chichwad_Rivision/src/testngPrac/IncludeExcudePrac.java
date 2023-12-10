package testngPrac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExcudePrac {
  @Test (groups = {"Payment"})
  public void a() 
  {
	  Reporter.log("This is from a method", true);
  }

  @Test(groups = {"Recharge"})
  public void b() 
  {
	  Reporter.log("This is from b method", true);
  }

  @Test(groups = {"Payment"})
  public void c() 
  {
	  Reporter.log("This is from c method", true);
  }

  @Test(groups = {"Recharge"})
  public void d() 
  {
	  Reporter.log("This is from d method", true);
  }

  @Test(groups = {"Payment","Recharge"})
  public void e() 
  {
	  Reporter.log("This is from e method", true);
  }






}



