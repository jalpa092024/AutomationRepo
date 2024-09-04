package FindElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWithXpath {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\imspr\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Find elements with xpath
        WebElement userNameTextBox= driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("jalpa Prajapati123");

        //Find elements with and condition in xpath
//        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='password' and @name='passwd']"));
//        passwordTextBox.sendKeys("jalpa@123");

        //using text() function
//        WebElement pLink=driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
//        pLink.click();

        //using starts-with
//        WebElement pLink=driver.findElement(By.xpath("//u[starts-with(text(),'Forgot')]"));
//        pLink.click();

//using starts-with attribute
//        WebElement pLink=driver.findElement(By.xpath("//input[starts-with(@class,'signinbtn')]"));
//        pLink.click();
    //using contains method
//        WebElement pLink=driver.findElement(By.xpath("//input[contains(@class,'signinbtn')]"));
//        pLink.click();

//using contains with any related value-contains is use for VALUE CHANGE dynamically.
//        WebElement pLink=driver.findElement(By.xpath("//input[contains(@class,'t')]"));
//        pLink.click();
        //Using clear Method
        userNameTextBox.clear();
        //
        WebElement pLink=driver.findElement(By.xpath("//u[starts-with(text(),'Forgot')]"));
        System.out.println(pLink.getText());
        Thread.sleep(3000);
        driver.close();
    }
}
