package drt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class TC_DRT_009 {
	 WebDriver driver;
	 private WebDriverWait wait;

	

	  @BeforeClass
	    public void setUp() {
		  WebDriverManager.chromedriver().clearDriverCache().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        driver.get("https://safallitigation.onlinesafe.in/"); // Add your application's URL here
	    }
	  
	  @Test
	    public void testApprovals() throws InterruptedException {
		  

	        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ButSignin']")));
	        signInButton.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement clickapprovals = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
	        clickapprovals.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement PUSHBACKpending =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[2]")));
	        PUSHBACKpending.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement clickeyebutton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[7]/a[1]/i[1]")));
	        clickeyebutton.click();
	        
	        Drtcaseadd Drtcaseadd = new Drtcaseadd();
	        String expectedCaseDetails = Drtcaseadd.getCaseDetails();
	        
	        String actualCaseDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtCaseNo']"))).getText();
	        Assert.assertEquals(actualCaseDetails, expectedCaseDetails, "Case details do not match!");
	        System.out.println("Case details match.");
	        
	        
	        driver.navigate().refresh();
	        
	        // Step 6: Verify if fields are editable
	        WebElement fieldToCheck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-block DivCommonSecMain']")));
	        boolean isEditable = fieldToCheck.isEnabled();
	        Assert.assertTrue(isEditable, "Field is not editable.");
	        System.out.println("Field is editable.");
	        
	     // Step 7: Verify if the save button is clickable
	        WebElement saveButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='BtnDRTSave']")));
	        boolean isClickable = saveButton.isEnabled();
	        Assert.assertTrue(isClickable, "Save button is not clickable.");
	        saveButton.click();
	        System.out.println("Save button is clickable and has been clicked.");
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


