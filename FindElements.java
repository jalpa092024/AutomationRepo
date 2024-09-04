package FindElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\imspr\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> allElements = driver.findElements(By.tagName("input"));
        for (WebElement w : allElements) {
            System.out.println(w);
        }
System.out.println("For testing git");
        Thread.sleep(3000);
        driver.close();
    }
}
