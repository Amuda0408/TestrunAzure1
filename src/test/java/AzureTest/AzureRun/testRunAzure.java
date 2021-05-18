package AzureTest.AzureRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testRunAzure {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuda\\TestRunAzure\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://neuprodprv.www.office.com/");
		//driver.get("http://google.com");
			}
@Test
public void verifyAzure() throws InterruptedException {
	/*driver.findElement(By.xpath("//a[@id=\"hero-banner-sign-in-to-office-365-link\"]")).click();
	//driver.findElement(By.xpath("//div[contains(text(),'Amudapriya Sivaraj')]")).click();
	//driver.findElement((By.xpath("//*[@id='i0116']"))).sendKeys("amudapriya.sivaraj@lntinfotech.com");
	//Thread.sleep(1000);
	driver.findElement(By.id("idSIButton9")).click();
	driver.findElement(By.id("passwordInput")).sendKeys("Apmay2021!");*/
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Office 365 Login | Microsoft Office", "Title is not matched");
	
}
@AfterMethod
public void teardown() {
	driver.quit();
}
}
