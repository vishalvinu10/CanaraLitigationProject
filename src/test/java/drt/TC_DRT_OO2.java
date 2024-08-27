package drt;

import java.time.Duration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DRT_OO2 {
	
		
		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
		    
		    

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		        	driver.close();

		        }
		    }

	 @Test(priority=1)
	    public void testAdddrtcase() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();
	        
	        Thread.sleep(2000);

	        
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        clicknpa.click();
	        
	        Thread.sleep(2000);

	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	        addcase.click();
	        
	        
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	        clickthreedots.click();
	        

	        WebElement clickdrt = driver.findElement(By.xpath("(//a[normalize-space()='DRT'])[1]"));
	        clickdrt.click();
	        
	        
	        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseDRTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        clickclose.click();
	        
	     // Attempt to save without filling any data
	     			WebElement clicksaveElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTSave']")));
	     			clicksaveElement.click();

	     			// Check if any alert or confirmation message appears indicating the page is saved
	     			boolean isPageSaved = false;
	     			try {
	     				WebElement confirmationPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	     				if (confirmationPopup.isDisplayed()) {
	     					isPageSaved = true;
	     				}
	     			} catch (Exception e) {
	     				isPageSaved = false;
	     			}

	     			// Verify and print result
	     			if (isPageSaved) {
	     				System.out.println(" 2) TESTCASE FAILED: Page saved without data entry.");
	     				Assert.fail("Page should not be saved without data entry.");
	     			} else {
	     				System.out.println(" 2) TESTCASE SUCCESS: Page not saved without data entry.");
	     			}
	     		}
}

	        

	 
