import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementsWork1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");
        driver.manage().window().maximize();



        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement e : elements) {
            System.out.println(e.getText());
        }
    }
}

