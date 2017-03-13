package listeners;

import java.io.IOException;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class ReportGeneratorListeners implements IReporter{

	public void generatAllureReport() {
		   try {
		    Runtime.getRuntime().exec("cmd /c mvn site -Dallure.tests.management.pattern=https://www.facebook.com/%s");
		   } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		                 
		  }

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		generatAllureReport();
		
		
	}
}
