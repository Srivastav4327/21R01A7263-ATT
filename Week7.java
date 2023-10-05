import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week7 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable (update this path according to your system)
        System.setProperty("webdriver.chrome.driver", "C:\\a1\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search input element
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter "CMRIT" into the search input
        searchBox.sendKeys("CMRIT");

        // Submit the search form
        searchBox.submit();

        // Wait for a few seconds (you can use explicit waits for better handling)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
