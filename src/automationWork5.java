import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationWork5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName= driver.findElement(By.name("first_name"));
        WebElement lastName= driver.findElement(By.name("last_name"));
        WebElement eMail= driver.findElement(By.name("email"));
        WebElement comments= driver.findElement(By.name("message"));

        firstName.sendKeys("nitu");
        lastName.sendKeys("mulmi");
        eMail.sendKeys("nitu@gmail.com");
        comments.sendKeys("thank you");

        WebElement resetButton= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
        Thread.sleep(2000);
        resetButton.click();

    }
}
