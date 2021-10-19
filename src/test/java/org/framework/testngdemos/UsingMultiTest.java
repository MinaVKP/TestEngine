package org.framework.testngdemos;

import org.testng.annotations.Test;

public class UsingMultiTest {
	 
	//Executes in ALPHABETICAL order
  
	 @Test
	 public void Login() 
	 {
		  System.out.println("Login test Method \n");
	 }
	
	@Test
	public void SignOut()
	{
		System.out.println("Sign Out Test Method \n");
	}

	@Test 
	public void Deposit()
	{
		System.out.println("Deposit Test Method \n");
	}

	@Test
	public void Withdraw()
	{
		System.out.println("Withdraw Test Method \n");
	}
	
	
	
}
