import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationWork3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName= driver.findElement(By.name("first_name"));
        firstName.sendKeys("nitu");

        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("mulmi");

        WebElement eMail= driver.findElement(By.name("email"));
        eMail.sendKeys("nitu@gmail.com");

        WebElement comments= driver.findElement(By.name("message"));
        comments.sendKeys("thank you");

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();

    }
}
