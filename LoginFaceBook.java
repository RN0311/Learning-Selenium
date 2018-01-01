import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class LoginFaceBook {
	   public static String driverPath = "C:/Users/hp/Downloads/Desktop/chromedriver_win32/";
	   public static WebDriver driver;
	   
	   
	   public static void main(String[] args){
			System.out.println("Launching Facebook!");
			System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("http://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("your-email-id");
			driver.findElement(By.id("pass")).sendKeys("your-password");
			driver.findElement(By.id("u_0_2")).click();;
			
	   }

}
