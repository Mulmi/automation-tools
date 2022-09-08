import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Datepicker/index.html");

        WebElement datePicker= driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
        datePicker.sendKeys(Keys.TAB);

    }
}
