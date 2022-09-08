import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickers {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Datepicker/index.html");
String month="October 2022";
        WebElement datePicker= driver.findElement(By.xpath("//*[@id=\"datepicker\"]/span/i"));
    datePicker.click();
    Thread.sleep(3000);
while(true)
{
    String text = driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).getText();
    if (text.equals(month))
    {
       break;
    }
  else
   {
     driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
   }
    driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td[contains(text(),'20')]")).click();
}}}
