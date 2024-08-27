package drt;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DRT_OO7 {
	
	public class drtcaseadd {
		
		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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

		        
		        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
		        clicknpa.click();
		        
		        Thread.sleep(2000);

		        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
		        addcase.click();
		        
		        // Enter Customer ID and click Search
		        WebElement customerIdField = driver.findElement(By.xpath("//input[@id='TxtNPACustID']"));
		        WebElement searchButton = driver.findElement(By.xpath("//button[@id='BtnNPASearch']"));
		        
		        customerIdField.clear();
		        customerIdField.sendKeys("42987221");
		        searchButton.click();
		        
		        Thread.sleep(2000);
		        
		        // Verify that the table is filtered
		        WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
		      
		        boolean isTableFiltered = table.getText().contains("42987221");
		        Assert.assertTrue(isTableFiltered, "Table is not filtered as expected");
		        System.out.println("Search worked as expected");
		        
		        // Enter data in other fields
		        WebElement npaFromDateField = driver.findElement(By.xpath("//input[@id='TxtNPAFromDate']"));
		        WebElement npaToDateField = driver.findElement(By.xpath("//input[@id='TxtNPAToDate']"));
		        WebElement accountNumberField = driver.findElement(By.xpath("//input[@id='TxtNPAtAcNo']"));
		        WebElement bookLiabilityFromField = driver.findElement(By.xpath("//input[@id='TxtNPABookLiabilityFrom']"));
		        WebElement bookLiabilityToField = driver.findElement(By.xpath("//input[@id='TxtNPABookLiabilityTo']"));
		        WebElement contractualLiabilityFromField = driver.findElement(By.xpath("//input[@id='TxtNPAContractualLiabilityFrom']"));
		        WebElement contractualLiabilityToField = driver.findElement(By.xpath("//input[@id='TxtNPAContractualLiabilityTo']"));
		        WebElement resetButton = driver.findElement(By.xpath("//button[@id='BtnResetFilter']"));
		        
		        // Fill in all fields
		        npaFromDateField.sendKeys("01-01-2020");
		        npaToDateField.sendKeys("12-31-2020");
		        accountNumberField.sendKeys("1234567890");
		        bookLiabilityFromField.sendKeys("1000");
		        bookLiabilityToField.sendKeys("5000");
		        contractualLiabilityFromField.sendKeys("2000");
		        contractualLiabilityToField.sendKeys("6000");
		        
		        Thread.sleep(2000);
		        
		        WebElement justclickElement = driver.findElement(By.xpath("//div[@class='card-block']//div[@class='row']"));
		        justclickElement.click();
		        // Click RESET button
		        resetButton.click();
		        
		        Thread.sleep(2000);
		        
		        // Verify all fields are cleared
		        Assert.assertEquals(npaFromDateField.getAttribute("value"), "", "NPA From Date field is not cleared");
		        Assert.assertEquals(npaToDateField.getAttribute("value"), "", "NPA To Date field is not cleared");
		        Assert.assertEquals(accountNumberField.getAttribute("value"), "", "Account Number field is not cleared");
		        Assert.assertEquals(bookLiabilityFromField.getAttribute("value"), "", "Book Liability From field is not cleared");
		        Assert.assertEquals(bookLiabilityToField.getAttribute("value"), "", "Book Liability To field is not cleared");
		        Assert.assertEquals(contractualLiabilityFromField.getAttribute("value"), "", "Contractual Liability From field is not cleared");
		        Assert.assertEquals(contractualLiabilityToField.getAttribute("value"), "", "Contractual Liability To field is not cleared");
		        
		        // Print success message
		        System.out.println("RESET button successfully cleared all fields.");
		    }
		        

}}
