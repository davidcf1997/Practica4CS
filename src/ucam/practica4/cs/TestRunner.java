package ucam.practica4.cs;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		 Result resultadoError = JUnitCore.runClasses(TestJUnit.class);
		 for (Failure fallo : resultadoError.getFailures()) {
			 System.out.println("\n"+fallo.toString());
		 }
		 System.out.println("\nTest succesful: "+resultadoError.wasSuccessful());
	}

}
