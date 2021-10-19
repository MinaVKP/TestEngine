package org.framework.testngdemos;

import org.testng.annotations.Test;

public class UsingPriorityAttribute {
	
	// To change the order of execution use PRIORITY attribute
	
  @Test(priority = 1)
  public void Login() 
  {
	  System.out.println("Login Test Method \n");
  }
  
  @Test(priority = 4)
  public void SignOut()
  {
	 System.out.println("SignOut Test Method \n");
		  
  }
  
  @Test(priority =2)
  public void Deposit()
  {
	  System.out.println("Deposit Test Method \n");
  }
  
  @Test(priority=3)
  public void Withdraw()
  {
	  System.out.println("Withdraw Test Method \n");
  }
  
  
  
}
