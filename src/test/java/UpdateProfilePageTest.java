
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class UpdateProfilePageTest {
    @Test
    public void testUpdateProfilePage() throws InterruptedException {
        PasswordEncryptionDecryption p = new PasswordEncryptionDecryption();
        ChromeOptions options = new ChromeOptions();

//        if (System.getenv("GITHUB_ACTIONS") != null) {
//            options.addArguments("--headless=new");
//            options.addArguments("--no-sandbox");
//            options.addArguments("--disable-dev-shm-usage");
//        }
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try{
            driver.get("https://www.naukri.com/nlogin/login");
            System.out.println("TITLE: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());
            System.out.println(driver.getPageSource());
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.findElement(By.id("usernameField")).sendKeys("venkatsai494@gmail.com");
            driver.findElement(By.id("passwordField")).sendKeys(p.decryptPassword(System.getenv("PASSWORD")));
            driver.findElement(By.xpath("//button[text()='Login']")).click();
            Thread.sleep(3000);
            driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//em[contains(@class,'edit')]")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("saveBasicDetailsBtn")).click();
        }
        catch (Exception e){
            driver.quit();
            e.printStackTrace();
        }

    }
}
