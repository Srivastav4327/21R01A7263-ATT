import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver", "C:\\Users\\student\\Music\\chromedriver.exe");
        	WebDriver driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.google.com");
        	WebElement searchBox = driver.findElement(By.name("q"));    
        	searchBox.sendKeys("myntra");
        	searchBox.submit();
 
        	WebElement link = driver.findElement(By.className("DKV0Md"));
        	link.click();
        	Thread.sleep(1000);
		
		WebElement Login = driver.findElement(By.className("desktop-userTitle"));
		new Actions(driver).moveToElement(Login).perform();
		Thread.sleep(2000);
		WebElement registerBtn = driver.findElement(By.className("desktop-linkButton"));
		registerBtn.click();
		
		WebElement phone_number = driver.findElement(By.className("mobileNumberInput"));
		phone_number.click();
		phone_number.sendKeys("9247191127");
		
		WebElement continueBtn = driver.findElement(By.className("submitBottomOption"));
		continueBtn.click();
		
	}

}
