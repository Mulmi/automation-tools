import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class iponePrice {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");

        WebElement search= driver.findElement(By.id("gh-search-input"));
        search.sendKeys("iPhone XR (64GB) - Yellow");
        search.submit();

        //*[@id="pricing-price-57528349"]/div/div/div/div/div[1]/div/div/div/span[1]

        WebElement priceA= driver.findElement(By.xpath("/html/body/div[4]/main/div[11]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[4]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/span[1]"));
        String priceA1=priceA.getText();
        System.out.println(priceA1);

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
       Thread. sleep(2000);

        WebElement search1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        search1.sendKeys("iPhone XR (64GB) - Yellow");
        search1.submit();


        WebElement PriceFlip = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]"));
        String PriceFF = PriceFlip.getText();
        System.out.println(PriceFF);
}}
