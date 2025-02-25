import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SeleniumDemoBlazeTest {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open the DemoBlaze website
            driver.get("https://www.demoblaze.com/");
            
            // Implicit wait for elements to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            // Verify the title of the page
            if (driver.getTitle().contains("STORE")) {
                System.out.println("Test Passed: Homepage loaded successfully");
            } else {
                System.out.println("Test Failed: Title does not match");
            }
        } catch (Exception e) {
            System.out.println("Test Failed: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
