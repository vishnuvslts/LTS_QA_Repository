package Common;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {private static ExtentReports extent;




public static ExtentReports createInstance(String fileName) {
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
   
    
    htmlReporter.config().setTheme(Theme.STANDARD);
    htmlReporter.config().setDocumentTitle(fileName);
    htmlReporter.config().setEncoding("utf-8");
    htmlReporter.config().setReportName(fileName);
    
    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
    extent.setSystemInfo("Automation Tester", "Vishnu VS");
    extent.setSystemInfo("Organization", "LTS");
    extent.setSystemInfo("Build no", "DSA_001");
    
    
    return extent;
}


 public static String screenshotPath;
public static String screenshotName;

public static void captureScreenshot() throws Exception, SQLException {

	File scrFile = ((TakesScreenshot) DriverManager.getDriver(screenshotName)).getScreenshotAs(OutputType.FILE);

	Date d = new Date();
	screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

	try {
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\screenshot\\" + screenshotName));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
}
