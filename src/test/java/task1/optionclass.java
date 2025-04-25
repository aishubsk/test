package task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Capabilities;


import io.github.bonigarcia.wdm.WebDriverManager;

public class optionclass {
	public static void main(String[] args) throws InterruptedException{

		WebDriverManager.edgedriver().setup();
		 EdgeOptions Options = new EdgeOptions();
		 Options.addArguments("start-maximized");
		 Options.addArguments("--disable-notifications");
		 Options.addArguments("browserName","MicrosoftEdge");
		 WebDriver driver = new EdgeDriver(Options);
		 
		 
		 DesiredCapabilities cap= new DesiredCapabilities();
		 cap.setCapability("microsoftname" , "windows11");
		 cap.setCapability("version" , "1992");
	System.out.println("browser:" + cap.getCapability("browser name")); 
   System.out.println("version is:" + cap.getCapability("version")); 
		 
		 
		 
	
	
	
	
	
	
	
	
	
	}}

