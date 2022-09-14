
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
//to screenshot & save in c drive in hello folder
public class screenShot1 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.target.com/");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\mydriver\\hello\\screenshot.png"));  //copy path
    }
}
