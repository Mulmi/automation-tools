import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
//Compare prizes from 2 website of book "Rich Dad Poor Dad" and display message whose price is low.
//www.snapdeal.com
//www.flipkart.com
public class PriceCompare {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

                driver.manage().window().maximize();
                Thread.sleep(1500);

                WebElement search = driver.findElement(By.name("keyword"));
                search.sendKeys("rich dad poor dad");

                WebElement button = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span"));
                button.click();
                Thread.sleep(2000);

                WebElement PriceSnap = driver.findElement(By.xpath("//*[@id=\"display-price-623405955519\"]"));
                String PriceSF = PriceSnap.getText();
                System.out.println(PriceSF);


                driver.get("https://www.flipkart.com/");

                        driver.manage().window().maximize();
                Thread.sleep(1500);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
                Thread.sleep(1500);

                WebElement search1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
                search1.sendKeys("rich dad poor dad");
// search1.submit();
                driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
                Thread.sleep(2000);

                WebElement PriceFlip = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a[3]/div/div[1]"));
                String PriceFF = PriceFlip.getText();
                System.out.println(PriceFF);

                String p1= PriceSF.replace("Rs. ","");
                String p2 = PriceFF.replace("₹","");

                double m1 = Double.parseDouble(p1)* 0.0079;
                double m2 = Double.parseDouble(p2) * 0.013;

                if(m1<m2){

                    System.out.println("snapdeal price is less by $"+ (m2-m1));
                }else{
                    System.out.println("flipcart price is less by $"+ (m1-m2));
                }


            }
        }


