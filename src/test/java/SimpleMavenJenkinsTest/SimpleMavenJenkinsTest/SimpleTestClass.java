package SimpleMavenJenkinsTest.SimpleMavenJenkinsTest;

import org.testng.annotations.Test;

public class SimpleTestClass {

	@Test( groups ="SimpleTryPrint")
	public static void TryPrint() throws Exception{
		
		// simple print
		System.out.println("Hello Gili Maven test");
		System.out.println("Gili");
		System.out.println("Gilush");
	}
}
