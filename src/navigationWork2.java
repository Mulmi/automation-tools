import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//open google,search Dart Tutorial,open Dart Tutorial website
public class navigationWork2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        WebElement box= driver.findElement(By.name("q"));
        box.sendKeys("Dart Tutorial");
        box.submit();

        WebElement hig = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div/div[1]/div/a/h3"));
        hig.click();

    }
}
