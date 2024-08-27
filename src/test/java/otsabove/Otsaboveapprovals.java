package otsabove;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
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


public class Otsaboveapprovals {
	
	
		
		private WebDriver driver;
		private WebDriverWait wait;
		private static final String SCROLL_SCRIPT = "arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});";

		@BeforeClass
		public void setUp() {

			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		}

//		    @AfterClass
//		    public void tearDown() {
//		        if (driver != null) {
//		            driver.quit();
//		        }
//		    }

		@Test(priority=1)
		public void OTSabovetwolacsapprove() throws InterruptedException {
			


			 driver.get("https://safallitigation.onlinesafe.in/");

			 	WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BM");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();

		        WebElement clickots = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]/span[2]")));
		        clickots.click();

		        WebElement approvedraft = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approve/Draft']")));
		        approvedraft.click();

		        
		        
		        //filters
		        
		        WebElement type =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSRvtType']")));
		        Select typeSelect = new Select(type);
		        typeSelect.selectByVisibleText("OTS BL >= 2 Lakhs");
		        
		        WebElement casestatus =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSRvtCaseStatus']")));
		        Select casestatusSelect = new Select(casestatus);
		        casestatusSelect.selectByVisibleText("Approvals");
		        
		        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSRvtSearch']")));
		        clicksearch.click();
		        
		        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[7]/a[1]/i[1]")));
		        clickeyebutton.click();
		        
		        WebElement click4times = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-caret-right']"))); // Replace with your element locator

	            for (int i = 0; i < 4; i++) {
	            	click4times.click();

	            }
	            
	            WebElement clickpaymentdetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='payment-tab']")));
	            clickpaymentdetails.click();
	            
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	    	    js.executeScript("window.scrollBy(0,2000)");
	    	    
	    	     WebElement BMapprove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSApprove']")));
	    	     BMapprove.click();
	    	     
	    	     WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	    	     clickok.click();
	    	     
	    	     WebElement clickokagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	    	     clickokagain.click();
		        
		        
		        

}
}
