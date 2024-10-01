package civilcourt;

import org.testng.annotations.BeforeTest;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.interactions.Actions;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Civilcourtaddcase {
	

	 private WebDriver driver;
	 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }
//
//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
	    
	    // Method to generate a random alphanumeric string of 16 characters
	    private String generateRandomCNRNumber() {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder cnrNumber = new StringBuilder();    
	        Random random = new Random();
	        for (int i = 0; i < 16; i++) {
	            cnrNumber.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        return cnrNumber.toString();
	    }
	    
	    String suitamtElement1 = RandomString(15);
	    String intrestclaimed1 = generateRandomInterest();
	    String filingnoElement1 = RandomString(4);  //50
	    String casenumberElement1 = RandomString(4);  //50
	    String filingdateElement1 = generateTodayDate();
	    
	    
	  @Test
	  public void civilcourtaddcase() throws InterruptedException {
		  
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
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[3]"));
	        js111.executeScript("arguments[0].click();", clickthreedots);
	        
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        WebElement clickcivil = driver.findElement(By.id("1"));
	        js1111.executeScript("arguments[0].click();", clickcivil);
	        
	        JavascriptExecutor close1 = (JavascriptExecutor) driver;
	        WebElement closebuttonElement = driver.findElement(By.xpath("//button[@id='CloseCCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        close1.executeScript("arguments[0].click();", closebuttonElement);
	        
	        JavascriptExecutor add = (JavascriptExecutor) driver;
			WebElement addbuttonelement =  driver.findElement(By.id("BtnCCCustomerID"));
	        add.executeScript("arguments[0].click();", addbuttonelement);
	        
	        
		    driver.findElement(By.id("DrpCCSearchBy")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("DrpCCSearchBy"));
		      dropdown.findElement(By.xpath("//option[. = 'Customer Name']")).click();
		    }
		    driver.findElement(By.id("TxtCCSearchValue")).click();
		    driver.findElement(By.id("TxtCCSearchValue")).sendKeys("SAM");
		    driver.findElement(By.id("BtnConCaseCustIDSearch")).click();
	
	    {
	      WebElement element = driver.findElement(By.id("BtnConCaseCustIDSearch"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".odd:nth-child(5) #CheckCustomerList_86028525")).click();
	    driver.findElement(By.id("BtnCCCustIDSave")).click();
	    {
	      WebElement element = driver.findElement(By.id("BtnCCCustIDSave"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("BtnCCCustIDOK")).click();
	    driver.findElement(By.id("BtnCCAccountNo")).click();
	    driver.findElement(By.id("CheckAcc_2546987456235")).click();
	    driver.findElement(By.id("BtnCCAcSave")).click();
	    driver.findElement(By.id("BtnCCBorrower")).click();
	    
	    
//	    driver.findElement(By.id("CivilCheck_237203088")).click();
//	    driver.findElement(By.id("CivilCheck_119225950")).click();
//	    driver.findElement(By.id("CivilCheck_88933260")).click();
//	    driver.findElement(By.id("CivilCheck_256931991")).click();
//	    driver.findElement(By.id("CivilCheck_318791823")).click();
//	    driver.findElement(By.id("CivilCheck_254604313")).click();
//	    driver.findElement(By.id("CivilCheck_89875555")).click();
//	    driver.findElement(By.cssSelector(".even:nth-child(8) > .text-center")).click();
//	    driver.findElement(By.id("CivilCheck_101224000")).click();
//	    driver.findElement(By.id("CivilCheck_85796758")).click();
//	    driver.findElement(By.id("CivilCheck_229601144")).click();
	    
	    List<WebElement> checkboxes1 = driver.findElements(By.className("Checkboxcheckcondition"));

        // Loop through the list and check each checkbox
        for (WebElement checkbox : checkboxes1) {
            // Check if the checkbox is not already selected
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        System.out.println("All checkboxes in gurantor have been checked.");
        
	    driver.findElement(By.id("BtnCCCBorrowerSave")).click();
	    js11.executeScript("window.scrollTo(0,0)");
	    driver.findElement(By.id("BtnCCBorrowIDOK")).click();
	    driver.findElement(By.id("DrpCCState")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCState"));
	      dropdown.findElement(By.xpath("//option[. = 'Kerala']")).click();
	    }
	    driver.findElement(By.id("DrpCCDistrict")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCDistrict"));
	      dropdown.findElement(By.xpath("//option[. = 'Palakkad']")).click();
	    }
	    driver.findElement(By.id("DrpCCCourtName")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCCourtName"));
	      dropdown.findElement(By.xpath("//option[. = 'CIVIL COURT']")).click();
	    }
	    driver.findElement(By.id("DrpCCBench")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCBench"));
	      dropdown.findElement(By.xpath("//option[. = 'District Civil Court Complex-1']")).click();
	    }
	    driver.findElement(By.id("DrpCCCaseTyp")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCCaseTyp"));
	      dropdown.findElement(By.xpath("//option[. = 'First Appeal']")).click();
	    }
	    driver.findElement(By.id("DrpCCCaseStage")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCCaseStage"));
	      dropdown.findElement(By.xpath("//option[. = 'Hearing']")).click();
	    }
	    WebElement filingdateElement = driver.findElement(By.id("TxtCCFilingDate"));
	    filingdateElement.sendKeys(filingdateElement1);
	    
	    
	    
	    driver.findElement(By.id("DrpCCCanaraRole")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCCanaraRole"));
	      dropdown.findElement(By.xpath("//option[. = 'Petitioner(s)']")).click();
	    }
	    
	   
	    WebElement suitamtElement = driver.findElement(By.id("TxtCCSuitAmount"));
	    suitamtElement.sendKeys(suitamtElement1);
	    
	    WebElement intrestclaimed =driver.findElement(By.id("TxtCCInterestClaimed"));
	    intrestclaimed.sendKeys(intrestclaimed1);
	    
	    
	    driver.findElement(By.id("DrpCCInterestTyp")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCInterestTyp"));
	      dropdown.findElement(By.xpath("//option[. = 'Simple Interest']")).click();
	    }
	    
	    
	    WebElement filingnoElement = driver.findElement(By.id("TxtCCFilingNo"));
	    filingnoElement.sendKeys(filingnoElement1);
	    System.out.println("Generated filing Number: " + filingnoElement1);
	    
	    driver.findElement(By.id("DrpCCFilingYear")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("DrpCCFilingYear"));
	      dropdown.findElement(By.xpath("//option[. = '2024']")).click();
	    }
	    
	    
	   WebElement cnrnoElement =  driver.findElement(By.id("TxtCCCNRNo"));
	   cnrnoElement.sendKeys(generateRandomCNRNumber());
	   System.out.println("Generated cnr Number: " + generateRandomCNRNumber());
	  
	   WebElement casenumberElement = driver.findElement(By.id("TxtCCCaseNo"));
	   casenumberElement.sendKeys(casenumberElement1);
	   System.out.println("Generated case Number: " + casenumberElement1);
	   
	   
	   WebElement dropdown = driver.findElement(By.id("DrpCCCaseYear"));
	   Select dropdownSelect = new Select(dropdown);
	   dropdownSelect.selectByVisibleText("2024");
	    
	    driver.findElement(By.id("BtnCCSave")).click();
	    Thread.sleep(2000);
	    {
	      WebElement element = driver.findElement(By.id("BtnCCSave"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".confirm")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".confirm")).click();
	  }
	  
		private String RandomString(int length) {
			
			return RandomStringUtils.randomNumeric(length);
		}
		
//		 private String generateRandomDate() {
//		        // Define the date range: start and end dates
//		        LocalDate startDate = LocalDate.of(2024, 10, 01); // Start date (e.g., January 1, 2000)
//		        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)
//
//		        // Generate a random date within the range
//		        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
//		        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
//
//		        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
//		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		        return randomDate.format(formatter);
//		    }
		 
		 private String generateTodayDate() {
			    // Get today's date
			    LocalDate todayDate = LocalDate.now();

			    // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			    
			    // Return the formatted date
			    return todayDate.format(formatter);
			}
		
		  private String generateRandomInterest() {
		        // Define the range for the interest rate
		        double minInterest = 1.0; // Minimum interest rate (e.g., 1%)
		        double maxInterest = 15.0; // Maximum interest rate (e.g., 15%)

		        // Generate a random interest rate within the range
		        double randomInterest = minInterest + (maxInterest - minInterest) * ThreadLocalRandom.current().nextDouble();

		        // Format the interest rate to 2 decimal places
		        return String.format("%.2f", randomInterest);
		    }
			    }
	