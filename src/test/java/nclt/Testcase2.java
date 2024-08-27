package nclt;

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

	public class Testcase2 {
		
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
				driver.quit();
			}
		}

		@Test
		public void verifyNcltMasterPageDoesNotSaveWithoutDataEntry() throws InterruptedException {
			// Navigate to the login page
			driver.get("https://safallitigation.onlinesafe.in/");

			// Perform login
			WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
			usernameField.sendKeys("BU");

			WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
			signInButton.click();

			// Navigate to NPA -> Add Cases
			WebElement clicknpaElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA']")));
			clicknpaElement.click();

			WebElement clickaddcaseElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA']//following::span[normalize-space()='Add Cases']")));
			clickaddcaseElement.click();

			WebElement clickthreedotsElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='BOSE V']/..//i[@class='fa fa-ellipsis-v']")));
			clickthreedotsElement.click();

			WebElement clickNCLTElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='1_42987221']//i[@class='fa fa-ellipsis-v']//following::a[@id='81']")));
			clickNCLTElement.click();
			
			 WebElement clickclosebuttonElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CloseNCLTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']")));
			 clickclosebuttonElement.click();

			// Attempt to save without filling any data
			WebElement clicksaveElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTSave']")));
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



