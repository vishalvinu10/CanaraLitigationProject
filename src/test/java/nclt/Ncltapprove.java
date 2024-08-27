package nclt;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ncltapprove {
	

	public class ncltapprovecase {
		
		private WebDriver driver;
		private WebDriverWait wait;
		private static final String SCROLL_SCRIPT = "arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});";
		

		@BeforeClass
		public void setUp() throws InterruptedException {

			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			


		}

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }
		    

			@Test(priority=1)
			public void ncltapprove() throws InterruptedException {
				
				

		
				 driver.get("https://safallitigation.onlinesafe.in/");

				 WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
				 usernameField.sendKeys("BM");

				 WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
				 signInButton.click();
				 
				 Thread.sleep(2000);
				 
				 WebElement clickapprovalsElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]/span[2]"));
				 clickapprovalsElement.click();
				 
				 Thread.sleep(2000);
				 
				 WebElement clickapprovals = driver.findElement(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']//following::span[normalize-space()='Approval']"));
				 clickapprovals.click();
				 
				 WebElement natureofcasElement = driver.findElement(By.xpath("//select[@id='DrpApprvCaseTyp']"));
				 Select natureofcasElementtSelect = new Select(natureofcasElement);
				 natureofcasElementtSelect.selectByVisibleText("NCLT");
				 			 
				 WebElement clicksearchElement =driver.findElement(By.xpath("//button[@id='BtnApprvSearch']"));
				 clicksearchElement.click();
		
				 WebElement eyebuttonElement = driver.findElement(By.xpath("//tbody/tr[1]/td[11]/a[1]/i[1]"));
				 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",eyebuttonElement);
				 
//				 Thread.sleep(2000);

				 
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0, 2000);");  
				 
				 Thread.sleep(2000);
				 
				 
				 WebElement clickapprovElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/button[2]"));
				 clickapprovElement.click();
				 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickapprovElement);
				 
				 Thread.sleep(2000);
				 
				 WebElement clickokElement =  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
				 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickokElement);

				 Thread.sleep(2000);
				 


boolean isSaved = false;

for (int attempt = 0; attempt < 3; attempt++) {
    try {
    	 WebElement clickokElement1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
    	 clickokElement1.click();
        isSaved = true; // Mark as saved if successful
        break; // Exit loop if successful
    } catch (StaleElementReferenceException e) {
        // Retry locating and clicking the element
        Thread.sleep(1000); // Optional: wait before retrying
    }
}
				 
//	     		 WebElement clickokElement1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
//				 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickokElement1);

				 
				 
			}
		    

	}}
