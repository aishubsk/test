package task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class absolute {

public static void main(String[] args) {

//system.setproperty("webdriver.edge.driver", "D://test//target//msedgedriver.exe");
 WebDriverManager.edgedriver().setup();
 EdgeOptions Options = new EdgeOptions();
 Options.addArguments("start-maximized");
 WebDriver driver = new EdgeDriver(Options);
 String url =" https://www.amazon.com/ ";
driver.get(url);
WebElement login = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/span/)"));
}}




