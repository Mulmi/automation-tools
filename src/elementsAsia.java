import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class elementsAsia {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        WebElement element = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[5]/div/div[1]/div[4]/div[1]/h4"));
        List<WebElement> items = element.findElements(By.tagName("a"));

        for(WebElement e : items) {
            System.out.println(e.getText());
        }
    }
}