package org.framework.testngdemos;

import org.testng.annotations.Test;

public class GroupTestDemo {
	  @Test(groups = {"Login"})
	
	  public void Login() 
	  {
		  System.out.println("Login Test Method \n");
	  }
	  
	  @Test(groups = {"Login"})
	  public void SignOut()
	  {
		 System.out.println("SignOut Test Method \n");
			  
	  }
	  
	  @Test(groups = {"Transaction"})
	  public void Deposit()
	  {
		  System.out.println("Deposit Test Method \n");
	  }
	  
	  @Test(groups = {"Transaction"})
	  public void Withdraw()
	  {
		  System.out.println("Withdraw Test Method \n");
	  }
	  
	  
}
