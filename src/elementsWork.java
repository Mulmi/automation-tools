//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class elementsWork {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver","C:\\mydriver\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.imdb.com/chart/top/?sort=rk,asc&mode=simple&page=1");
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"lister-sort-by-options\"]"));
//// Get element with tag name 'div'
//  //      WebElement element = driver.findElement(By.tagName("strong"));
//
//        // Get all the elements available with tag name 'p'
//        List<WebElement> elements = element.findElements(By.tagName("strong"));
//        for (WebElement e : elements) {
//            System.out.println(e.getText());
//
//
//        }
//    }}
//
