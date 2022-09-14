import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class automationassignobject {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

  Scanner sc=new Scanner(System.in);
  System.out.println("which phone you want to search");
  String phone= sc.nextLine();


        driver.get("https://www.amazon.com/");
        WebElement search= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys(phone);

        driver.findElement(By.id("nav-search-submit-button")).click();


        Thread.sleep(3000);
        driver.manage().window().maximize();

        WebElement priceA= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span/span[2]/span[2]"));
        String a1=priceA.getText();
        System.out.println(a1);
        driver.get("https://www.bestbuy.com/");

        WebElement search1= driver.findElement(By.id("gh-search-input"));
        search1.sendKeys(phone);
        search1.submit();

        WebElement priceB= driver.findElement(By.xpath("/html/body/div[4]/main/div[11]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[4]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/span[1]"));
        String priceB1=priceB.getText();
        System.out.println(priceB1);

        String b2 = priceB1.replace("$","");

        double m1 = Double.parseDouble(a1);
        double m2 = Double.parseDouble(b2);

        if(m1<m2){

            System.out.println("amazon price is less by $"+ (m2-m1));
        }else{
            System.out.println("bestbuy price is less by $"+ (m1-m2));
        }}}


