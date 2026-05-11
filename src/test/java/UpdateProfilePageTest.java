import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdateProfilePageTest {
    @Test
    public void testUpdateProfilePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
    }
}
