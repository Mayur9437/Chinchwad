package testngPrac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExcludePrac1 {
  
	
	 @Test(groups = {"Recharge"})
	  public void p() 
	  {
		  Reporter.log("This is from p method", true);
	  }

	  @Test(groups = {"Payment"})
	  public void q() 
	  {
		  Reporter.log("This is from q method", true);
	  }

	  @Test(groups = {"Recharge"})
	  public void r() 
	  {
		  Reporter.log("This is from r method", true);
	  }

	  @Test(groups = {"Recharge"})
	  public void s() 
	  {
		  Reporter.log("This is from s method", true);
	  }

	  @Test(groups = {"Payment","Recharge"})
	  public void t() 
	  {
		  Reporter.log("This is from t method", true);
	  }
	
}
