import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChrome {
   public static String driverPath = "C:/Users/hp/Downloads/Desktop/chromedriver_win32/";
   public static WebDriver driver;
	
	
	public static void main(String[] args){
		System.out.println("Launching chrome!");
		System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
	}
}
