package FindElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\imspr\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//This code is use for get elements from website.
      WebElement userNameTextBox= driver.findElement(By.id("login1"));
      userNameTextBox.sendKeys("jalpa Prajapati");
system.out.println("Test");
        Thread.sleep(3000);
        driver.close();
    }
}
