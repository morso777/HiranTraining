package testRunnerFrameworks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTests {
	
	
	@AfterClass
	public void afterClass () {
	System.out.println ("After Class");
	}
	
	@BeforeClass
	public void beforeClass () {
	System.out.println ("Before Class");
	}
	
	
	@AfterMethod
	public void logout () {
	System.out.println ("Logout from the app");
	}
	
	@BeforeMethod
	public void login () {
	System.out.println ("Login to the app");
	}
	
		

	@AfterTest
	public void afterTest () {
	System.out.println ("After test");
	}
	
	@BeforeTest
	public void beforeTest () {
	System.out.println ("Before test");
	}
	
	
	
	//@Test (priority =1)
	@Test (groups = {"grupo1"})
	public void testConcact() {
		System.out.println ("Test 1");
	}

	//@Test (priority =2)
	@Test (groups = {"grupo2"})
	public void testCount() {
		System.out.println ("Test 2");
	}
	
	//@Test (priority =3)
	@Test (groups = {"grupo3"})
	public void testConcact2() {
		System.out.println ("Test 3");
	}
	
	//@Test (priority =4)
	@Test (groups = {"grupo1"})
	public void testCount2() {
		System.out.println ("Test 4");
	}
	
	
	
	
}
