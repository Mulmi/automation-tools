import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationWork6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");

        WebElement userName= driver.findElement(By.id("text"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement logIn= driver.findElement(By.id("login-button"));


        userName.sendKeys("webdriver");
        password.sendKeys("webdriver123");
        logIn.click();
      String message=driver.switchTo().alert().getText();
        System.out.println(message);


      if(message.equals("validation succeeded")) {

          System.out.println("Test Passed");
      } else{
          System.out.println("Test Failed");

          driver.switchTo().alert().getText();
          driver.quit();
      }
      }
    }

