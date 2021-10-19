package org.framework.testngdemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingAssertions {
  @Test
  public void assertTest() 
  {
	  //HardAssertion(Assert)
	  
//			System.out.println("Begin");
//				 
//			Assert.assertTrue(true, "Test1");
//			System.out.println("Test 1  passed");
//				  
//			Assert.assertTrue(false,"Test 2");
//			System.out.println("Test2 failed");
//				  
//			Assert.assertTrue(false,"Test 3");
//			System.out.println("Test 3 failed");
//				  
//			System.out.println("End");
		  
	  
	  
	  //SoftAssertion(Verify)
	  
	  System.out.println("Begin");
	  SoftAssert sa = new SoftAssert();
	  
	  sa.assertTrue(true);
	  System.out.println("Test 1 passed");
	  
	  sa.assertTrue(false);
	  System.out.println("Test 2 failed");
	  
	  sa.assertTrue(true);
	  System.out.println("Test 3 passed");
	  
	  System.out.println("End");
	  
	  //Even if one of the tests fails, final message will be "Failed"
//	  sa.assertAll();
  }
}
