package ucam.practica3.cs;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerPartition {

	public static void main(String[] args) {
		 Result resultadoError = JUnitCore.runClasses(TestPartition1.class, TestPartition2.class);
		 for (Failure fallo : resultadoError.getFailures()) {
			 System.out.println("\n"+fallo.toString());
		 }
		 System.out.println("\nTest succesful: "+resultadoError.wasSuccessful());
	}

}
