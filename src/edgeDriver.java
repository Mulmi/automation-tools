import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeDriver {
    // Go to https://dart-tutorial.com/ and print title and current url to console.
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\mydriver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://dart-tutorial.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());


    }
}
