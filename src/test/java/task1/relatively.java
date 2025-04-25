package task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relatively {
public static void main(String[] args) throws InterruptedException{


	//system.setproperty("webdriver.edge.driver", "D://test//target//msedgedriver.exe");
	 WebDriverManager.edgedriver().setup();
	 EdgeOptions Options = new EdgeOptions();
	 Options.addArguments("start-maximized");
	 WebDriver driver = new EdgeDriver(Options);
	 String url=" https://www.amazon.com/ ";
	 driver.get(url);
   Thread.sleep(30000);
WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
 Thread.sleep(2000);
   login.click();
	 







}}
