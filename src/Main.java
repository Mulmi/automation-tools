import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
           driver.get("https://amazon.com");

           WebElement box= driver.findElement(By.name("field-keywords"));
           box.sendKeys("disney cinderella book");
           box.submit();
    }
}
