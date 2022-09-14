import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class PriceCompareUsers {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which book do you want to search: ");
        String book = sc.nextLine();


        System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement search = driver.findElement(By.name("keyword"));
        search.sendKeys(book);

        WebElement button = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span"));
        button.click();
        Thread.sleep(2000);

        WebElement FirstPrice = driver.findElement(By.xpath("//*[@id=\"display-price-623405955519\"]"));
        String finalprice = FirstPrice.getText();
        System.out.println(finalprice);


        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(1500);

        WebElement search1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        search1.sendKeys(book);
// search1.submit();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
        Thread.sleep(2000);

        WebElement SecondPrice = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a[3]/div[1]/div[1]"));
        String lastprice = SecondPrice.getText();
        System.out.println(lastprice);

        String p1= finalprice.replace("Rs. ","");
        String p2 = lastprice.replace("₹","");

        double m1 = Double.parseDouble(p1)* 0.0079;
        double m2 = Double.parseDouble(p2) * 0.013;

        if(m1<m2){

            System.out.println("snapdeal price is less by $"+ (m2-m1));
        }else{
            System.out.println("flipcart price is less by $"+ (m1-m2));
        }


    }
}

