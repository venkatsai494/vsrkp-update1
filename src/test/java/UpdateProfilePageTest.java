import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdateProfilePageTest {
    @Test
    public void testUpdateProfilePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
        driver.findElement(By.id("usernameField")).sendKeys("venkatsai494@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }
}
