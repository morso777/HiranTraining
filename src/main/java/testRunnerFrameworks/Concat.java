package testRunnerFrameworks;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Concat {
	
	@Parameters({"stringA", "stringB"})
	@Test ()
	public void testConcact(String a, String b) {		
		String resultado =a + b ;
		Assert.assertEquals( resultado, "I love test automation");
		
	}

}
