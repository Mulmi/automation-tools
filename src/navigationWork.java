import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigationWork {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://dart-tutorial.com");
                    Thread.sleep(2000);
        WebElement hig = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[2]/a"));
        hig.click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
}
