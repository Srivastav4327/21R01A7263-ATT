import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class Week2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\student\\Pictures\\Camera Roll\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
		
		WebElement customerLogin = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		new Actions(driver).moveToElement(customerLogin).perform();
		Thread.sleep(2000);
		WebElement registerBtn = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		registerBtn.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"acc_first_name\"]"));
		firstName.click();
		Thread.sleep(1000);
		firstName.sendKeys("Prashanth");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"acc_last_name\"]"));
		lastName.click();
		Thread.sleep(1000);
		lastName.sendKeys("Kumar");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"acc_user_email\"]"));
		email.click();
		Thread.sleep(1000);
		email.sendKeys("21r01a7227@cmritonline.ac.in");
		
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"acc_user_password\"]"));
		WebElement confirmpassWord = driver.findElement(By.xpath("//*[@id=\"acc_user_passconf\"]"));
		passWord.click();
		Thread.sleep(1000);
		passWord.sendKeys("21r01a7227@cmritonline.ac.in");
		confirmpassWord.click();
		Thread.sleep(1000);
		confirmpassWord.sendKeys("21r01a7227@cmritonline.ac.in");
		
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"acc_mobile_no\"]"));
		phone.click();
		Thread.sleep(1000);
		phone.sendKeys("9817348934");
		
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
		submitBtn.click();
	}

}
