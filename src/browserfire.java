import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//open in firefox driver
public class browserfire {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\mydriver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");

//        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
    }
}
