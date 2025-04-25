package task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Head {
public static void main(String[] args) throws InterruptedException{
	WebDriverManager.edgedriver().setup();
	System.out.println("started");
	EdgeOptions Options = new EdgeOptions();
	 Options.addArguments("start-maximized");
	 Options.addArguments("--disabled--popups");
	 Options.addArguments("--disable-notifications");
	 Options.addArguments("-headless");
	 WebDriver driver = new EdgeDriver(Options);
	 System.out.println("ended");
	
	
	
	
	
	
}
}