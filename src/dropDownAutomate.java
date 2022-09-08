import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownAutomate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");


        Select dropDown = new Select(driver.findElement(By.id("dropdowm-menu-3")));
        dropDown.selectByVisibleText("JQuery");

    }
}
