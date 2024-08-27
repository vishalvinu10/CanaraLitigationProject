package commercialcourt;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
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

public class TC_CC_002 {
	
	
	public class commercialcaseadd {
		

		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    }

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }
		    

		    @Test(priority=1)
		    public void testAddcommercial() throws InterruptedException {
		        driver.get("https://safallitigation.onlinesafe.in/");

		        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
		        usernameField.sendKeys("BU");

		        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
		        signInButton.click();

		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
		        js1.executeScript("arguments[0].click();", clicknpa);
		        
		        JavascriptExecutor js11 = (JavascriptExecutor) driver;
		        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='NPA']//following::span[normalize-space()='Add Cases']"));
		        js11.executeScript("arguments[0].click();", addcase);
		        	        
		        JavascriptExecutor js111 = (JavascriptExecutor) driver;
		        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
		        js111.executeScript("arguments[0].click();", clickthreedots);
		        
		        	       
		        try {
		             
			        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
			        WebElement clickcommercial = driver.findElement(By.xpath("(//a[normalize-space()='Commercial Court'])[1]"));
			        js1111.executeScript("arguments[0].click();", clickcommercial);
			        
			        
			        wait.until(ExpectedConditions.alertIsPresent());
		            // Switch to the alert
		            Alert alert = driver.switchTo().alert();
		            // Print the alert text (optional, for debugging purposes)
		            System.out.println("Alert text: " + alert.getText());
		            // Accept the alert (click OK button)
		            alert.accept();

		        } catch (UnhandledAlertException e) {
		            // This block handles the case where the alert wasn't handled properly
		            System.out.println("Unhandled alert exception caught: " + e.getMessage());
		            // Attempt to switch to the alert and accept it
		            Alert alert = driver.switchTo().alert();
		            alert.accept();

		        } 
		                
		        JavascriptExecutor js11111 = (JavascriptExecutor) driver;
		        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseComCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
		        js11111.executeScript("arguments[0].click();", clickclose);
		        
		        
		        
		        // Attempt to save without filling any data
     			WebElement clicksaveElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComSave']")));
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

		    }
