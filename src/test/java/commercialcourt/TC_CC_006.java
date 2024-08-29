package commercialcourt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class TC_CC_006 {
	
	
	 private WebDriver driver;
	    private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().clearDriverCache().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies(); 
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    @Test(priority = 1)
	    public void testAddCommercial() throws InterruptedException {
	        
	        driver.get("http://192.168.0.137:8955/");

	        // Login
	        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	        signInButton.click();

	        // Navigate to add case
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement clicknpa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[2]")));
	        js1.executeScript("arguments[0].click();", clicknpa);

	        JavascriptExecutor js11 = (JavascriptExecutor) driver;
	        WebElement addcase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]/span[2]")));
	        js11.executeScript("arguments[0].click();", addcase);

	        JavascriptExecutor js111 = (JavascriptExecutor) driver;
	        WebElement clickthreedots = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]")));
	        js111.executeScript("arguments[0].click();", clickthreedots);
	        
	        
try {
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        WebElement clickcommercial = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/div[1]/a[4]")));
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

	        // Close popup
	        JavascriptExecutor js11111 = (JavascriptExecutor) driver;
	        WebElement clickclose = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='CloseComCustOtherCaseDetailsLoad'] span[aria-hidden='true']")));
	        js11111.executeScript("arguments[0].click();", clickclose);

	        // Testing Alphabetic Input Rejection
	        String alphabeticInput = "ABCDEF";

	        enterInvalidInputAndCheck("Mediation", alphabeticInput, By.xpath("//input[@id='TxtComMediationNo']"));
	        enterInvalidInputAndCheck("Interest", alphabeticInput, By.xpath("//input[@id='TxtComInterestClaimed']"));
	        enterInvalidInputAndCheck("Suit Amount", alphabeticInput, By.xpath("//input[@id='TxtComSuitAmount']"));
	        enterInvalidInputAndCheck("Case Number", alphabeticInput, By.xpath("//input[@id='TxtComCaseNo']"));

	        System.out.println("Case success: Numeric fields do not allow alphabets.");
try {
	        // Refreshing the page
	        driver.navigate().refresh();
	        
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

	        Thread.sleep(3000);
	        
	     // Close popup
	        JavascriptExecutor js111111 = (JavascriptExecutor) driver;
	        WebElement clickclose1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='CloseComCustOtherCaseDetailsLoad'] span[aria-hidden='true']")));
	        js111111.executeScript("arguments[0].click();", clickclose1);


	        // Testing Special Characters Input Rejection
	        String specialCharacterInput = "@#$%^&*";

	        enterInvalidInputAndCheck("Mediation", specialCharacterInput, By.xpath("//input[@id='TxtComMediationNo']"));
	        enterInvalidInputAndCheck("Interest", specialCharacterInput, By.xpath("//input[@id='TxtComInterestClaimed']"));
	        enterInvalidInputAndCheck("Suit Amount", specialCharacterInput, By.xpath("//input[@id='TxtComSuitAmount']"));
	        enterInvalidInputAndCheck("Case Number", specialCharacterInput, By.xpath("//input[@id='TxtComCaseNo']"));

	        System.out.println("Case success: Special characters are not inputted in numeric fields.");
	    }

	    private void enterInvalidInputAndCheck(String fieldName, String inputValue, By fieldLocator) {
	        WebElement fieldElement = wait.until(ExpectedConditions.elementToBeClickable(fieldLocator));
	        fieldElement.clear();
	        fieldElement.sendKeys(inputValue);

	        String enteredValue = fieldElement.getAttribute("value");
	        if (!enteredValue.equals(inputValue)) {
	            System.out.println("Field '" + fieldName + "' correctly rejected the input: " + inputValue);
	        } else {
	            System.out.println("Field '" + fieldName + "' incorrectly accepted the input: " + inputValue);
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


