import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clickAutmate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        Thread.sleep(3000);

        WebElement check = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]"));
        check.click();
    }
}
