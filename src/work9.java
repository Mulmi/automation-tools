//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static java.lang.Thread.*;
//
//
//public class work9 {
//    public static void main(String[] args) throws InterruptedException {
//            System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//
//            driver.get("https://www.flipkart.com/");
//            driver.manage().window().maximize();
//
//          driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click(); //to cancel
//
//            WebElement box= driver.findElement(By.name("q"));
//            box.sendKeys("Rich Dad Poor Dad");
//            box.submit();
//            Thread.sleep(3000);
//
//        String priceInFlipKart=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[1]/div/a[3]/div[1]/div[1]"));
//        System.out.println(priceInFlipKart);
//
//
//// search1.submit();
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
//
//
//
//
////*[@id="container"]/div/div[3]/div[1]/div[2]/div[4]/div/div[1]/div/a[3]/div/div[1];
//       driver.get("https://www.snapdeal.com/");
//       driver.manage().window().maximize();
//        sleep(2000);
//
//       WebElement searchBox=driver.findElement(By.name("keyword"));
//       searchBox.sendKeys("Rich Dad Poor Dad");
//
//      WebElement search= driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button"));
//       search.click();
//
//        String priceInSnap=driver.findElement(By.id("display-price-662489037879")).getText();
//       System.out.println(priceInSnap);
//
////        double exchangerate = 0.0113;
////        double priceInFlipkartInUSD  = priceInFlipKart *exchangerate;
////
////        double priceInSnapUSD  = priceInSnap *exchangerate;
////
////
////        if ( priceInFlipkartInUSD> priceInSnapUSD){
////        System.out.println('priceInSnapUSD is lower price')
////                else
////                System.out.println('priceInflipcart is lower price')
////
//   }}
