import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPhone {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\homeworkSelenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://iteaua-develop.demo.gns-it.com/");
        Thread.sleep(3000);
        By phoneNumber = By.className("phone_header");
        WebElement phoneheader = driver.findElement(phoneNumber);
        String phoneValue = phoneheader.getText();
        phoneValue = phoneValue.substring(3);
        phoneValue = phoneValue.replaceAll("\\(", "");
        phoneValue = phoneValue.replaceAll("\\)", "");
        phoneValue = phoneValue.replaceAll(" ", "");
        System.out.println(phoneValue);
        driver.quit();
    }
}
