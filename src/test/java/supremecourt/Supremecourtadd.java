package supremecourt;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Supremecourtadd {
	
	public class Highcourtcaseadd {
		
		private WebDriver driver;
		private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
//	    
	    
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
	    
	    
	    String filingnumber1 = RandomString(5);  //50
//	    String dateoffiling1 = generateRandomDate();
//	    String dateofreporting1 = generateRandomDate();
	    String PlaintAmount1 = RandomString(15);
	    String intrestclaimed1 = generateRandomInterest();
	    String damagesclaimed1 = RandomString(15);
	    String miscclaim1 = RandomString(15);
	    String casenumber1 = RandomString(5);
//	    String factofcase1 = randomalphabetString(2000);
//	    String prayer1 = randomalphabetString(2000);
	    
	    
	    
	    @Test(priority=1)
	    public void testAddAdvocateonRO() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.id("TxtAuthvalue"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.id("ButSignin"));
	        signInButton.click();
	  
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        js1.executeScript("arguments[0].click();", clicknpa);
	        
	        
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	        js2.executeScript("arguments[0].click();", addcase);
	        
	        
	        JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]"));
	        js3.executeScript("arguments[0].click();", clickthreedots);
	        
	        
	        JavascriptExecutor js4 = (JavascriptExecutor) driver;
	        WebElement clicksupremecourt = driver.findElement(By.id("6"));
	        js4.executeScript("arguments[0].click();", clicksupremecourt);
	        
	          
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        WebElement clickclose = driver.findElement(By.cssSelector("#CloseHCSCCustOtherCaseDetailsLoad > span"));
	        js5.executeScript("arguments[0].click();", clickclose);
	        
	        
	        
	        driver.findElement(By.id("BtnHSCustomerID")).click();
	        // 12 | mouseOver | id=BtnHSCustomerID | 
	        {
	          WebElement element = driver.findElement(By.id("BtnHSCustomerID"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element).perform();
	        }
	        // 13 | mouseOut | id=BtnHSCustomerID | 
	        {
	          WebElement element = driver.findElement(By.tagName("body"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element, 0, 0).perform();
	        }
	        // 14 | click | id=DrpHSSearchBy | 
	        driver.findElement(By.id("DrpHSSearchBy")).click();
	        // 15 | select | id=DrpHSSearchBy | label=Customer Name
	        {
	          WebElement dropdown = driver.findElement(By.id("DrpHSSearchBy"));
	          dropdown.findElement(By.xpath("//option[. = 'Customer Name']")).click();
	        }
	        // 16 | click | id=TxtHSSearchValue | 
	        driver.findElement(By.id("TxtHSSearchValue")).click();
	        // 17 | type | id=TxtHSSearchValue | SAM
	        driver.findElement(By.id("TxtHSSearchValue")).sendKeys("SAM");
	        // 18 | click | id=BtnHSCaseCustIDSearch | 
	        driver.findElement(By.id("BtnHSCaseCustIDSearch")).click();
	        // 19 | click | css=.odd:nth-child(5) #CheckCustomerList_86028525 | 
	        driver.findElement(By.cssSelector(".odd:nth-child(5) #CheckCustomerList_86028525")).click();
	        // 20 | click | id=BtnHSCustIDSave | 
	        driver.findElement(By.id("BtnHSCustIDSave")).click();
	        // 21 | click | id=BtnHSCustOK | 
	        driver.findElement(By.id("BtnHSCustOK")).click();
	        // 22 | click | id=BtnHSAccountNo | 
	        driver.findElement(By.id("BtnHSAccountNo")).click();
	        // 23 | mouseOver | id=BtnHSAccountNo | 
	        {
	          WebElement element = driver.findElement(By.id("BtnHSAccountNo"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element).perform();
	        }
	        // 24 | mouseOut | id=BtnHSAccountNo | 
	        {
	          WebElement element = driver.findElement(By.tagName("body"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element, 0, 0).perform();
	        }
	        // 25 | click | id=CheckAcc_2546987456235 | 
	        driver.findElement(By.id("CheckAcc_2546987456235")).click();
	        // 26 | click | id=BtnHSAcSave | 
	        driver.findElement(By.id("BtnHSAcSave")).click();
	        // 27 | click | id=BtnHSBorrower | 
	        driver.findElement(By.id("BtnHSBorrower")).click();
	        // 28 | mouseOver | id=BtnHSBorrower | 
	        {
	          WebElement element = driver.findElement(By.id("BtnHSBorrower"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element).perform();
	        }
	        // 29 | mouseOut | id=BtnHSBorrower | 
	        {
	          WebElement element = driver.findElement(By.tagName("body"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element, 0, 0).perform();
	        }
	        // 30 | click | id=HCSCSelect_237203088 | 
	        driver.findElement(By.id("HCSCSelect_237203088")).click();
	        // 31 | click | id=HCSCSelect_119225950 | 
	        driver.findElement(By.id("HCSCSelect_119225950")).click();
	        // 32 | click | id=HCSCSelect_88933260 | 
	        driver.findElement(By.id("HCSCSelect_88933260")).click();
	        // 33 | click | id=HCSCSelect_256931991 | 
	        driver.findElement(By.id("HCSCSelect_256931991")).click();
	        // 34 | click | id=HCSCSelect_318791823 | 
	        driver.findElement(By.id("HCSCSelect_318791823")).click();
	        // 35 | click | id=HCSCSelect_254604313 | 
	        driver.findElement(By.id("HCSCSelect_254604313")).click();
	        // 36 | click | id=HCSCSelect_89875555 | 
	        driver.findElement(By.id("HCSCSelect_89875555")).click();
	        // 37 | click | id=BtnHSBorrowerSave | 
	        driver.findElement(By.id("BtnHSBorrowerSave")).click();
	        // 38 | mouseOver | id=BtnHSBorrowerSave | 
	        {
	          WebElement element = driver.findElement(By.id("BtnHSBorrowerSave"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element).perform();
	        }
	        // 39 | mouseOut | id=BtnHSBorrowerSave | 
	        {
	          WebElement element = driver.findElement(By.tagName("body"));
	          Actions builder = new Actions(driver);
	          builder.moveToElement(element, 0, 0).perform();
	        }
	        // 40 | click | id=BtnHSSelectedBorrowerSave | 
	        driver.findElement(By.id("BtnHSSelectedBorrowerSave")).click();
	             

	        WebElement state = driver.findElement(By.xpath("//select[@id='DrpHSState']"));
	        Select stateSelect = new Select(state);
	        stateSelect.selectByVisibleText("Kerala");
	        
	        WebElement location = driver.findElement(By.xpath("//select[@id='DrpHSDistrict']"));
	        Select locationSelect = new Select(location);
	        locationSelect.selectByVisibleText("Palakkad");
	        
	        WebElement courtforum = driver.findElement(By.xpath("//select[@id='DrpHSCourtForum']"));
	        Select courtforumSelect = new Select(courtforum);
	        courtforumSelect.selectByVisibleText("Supreme Court");
	        
	        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpHSBench']"));
	        Select benchSelect = new Select(bench);
	        benchSelect.selectByVisibleText("Additional District Court, Keshod");
	        
	        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpHSCaseTyp']"));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("Appeal");
	        
	        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpHSCaseStage']"));
	        Select casestageSelect = new Select(casestage);
	        casestageSelect.selectByVisibleText("Appeal Allowed");
	        
	        WebElement natureofcase = driver.findElement(By.xpath("//select[@id='DrpHSCaseNature']"));
	        Select natureofcaseSelect = new Select(natureofcase);
	        natureofcaseSelect.selectByVisibleText("Appeal/Revision");
	        
	        WebElement dateoffiling = driver.findElement(By.xpath("//input[@id='TxtHSFilingDate']"));
	        dateoffiling.sendKeys("23-09-2024");
	        
	        WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtHSReportingDate']"));
	        dateofreporting.sendKeys("23-09-2024");
	        
	        WebElement roleofbank = driver.findElement(By.xpath("//select[@id='DrpHSCanaraRole']"));
	        Select roleofbankSelect = new Select(roleofbank);
	        roleofbankSelect.selectByVisibleText("Petitioner(s)");
	        
	        
	        WebElement whethermonetorycase = driver.findElement(By.xpath("//select[@id='DrpHSMonetaryCase']"));
	        Select whethermonetorycaseSelect = new Select(whethermonetorycase);
	        whethermonetorycaseSelect.selectByVisibleText("Yes");
	        
	        WebElement PlaintAmount = driver.findElement(By.xpath("//input[@id='TxtHSPlaintAmt']"));
	        PlaintAmount.sendKeys(PlaintAmount1);
	        
	        WebElement intrestclaimed = driver.findElement(By.xpath("//input[@id='TxtHSInterestClaimed']"));
	        intrestclaimed.sendKeys(intrestclaimed1);
	        
	        
	        WebElement intresttype = driver.findElement(By.xpath("//select[@id='DrpHSInterestTyp']"));
	        Select intresttypeSelect = new Select(intresttype);
	        intresttypeSelect.selectByVisibleText("Simple Interest");
	        
	        WebElement damagesclaimed = driver.findElement(By.xpath("//input[@id='TxtHSDamageClaimed']"));
	        damagesclaimed.sendKeys(damagesclaimed1);
	        
	        WebElement miscclaim = driver.findElement(By.xpath("//input[@id='TxtHSMiscClaim']"));
	        miscclaim.sendKeys(miscclaim1);
	        
	        WebElement filingnumber = driver.findElement(By.xpath("//input[@id='TxtHSFilingNo']"));
	        filingnumber.sendKeys(filingnumber1);
	        
	        WebElement filingyear = driver.findElement(By.xpath("//select[@id='DrpHSFilingYear']"));
	        Select filingyearSelect = new Select(filingyear);
	        filingyearSelect.selectByVisibleText("2024");
	        
	        
	        WebElement cnrnumber = driver.findElement(By.xpath("//input[@id='TxtHSCNRNo']"));
	        cnrnumber.sendKeys(generateRandomCNRNumber());
	        System.out.println("Generated CNR Number: " + generateRandomCNRNumber());
	        
	        WebElement casenumber = driver.findElement(By.xpath("//input[@id='TxtHSCaseNo']"));
	        casenumber.sendKeys(casenumber1);
	        System.out.println("Generated CASE Number: " + casenumber1);
	        
	        
	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpHSCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        WebElement factofcase = driver.findElement(By.xpath("//textarea[@id='TxtHSCaseFact']"));
	        factofcase.sendKeys("gsfgesk");
	        
	        WebElement prayer = driver.findElement(By.xpath("//textarea[@id='TxtHSPrayer']"));
	        prayer.sendKeys("desjfgesu");
	        
	        WebElement save = driver.findElement(By.xpath("//button[@id='BtnHSSave']"));
	        save.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement ok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        ok.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement okagain = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        okagain.click();
	        
	    }      
	        private String RandomString(int length) {
	    		
	    		return RandomStringUtils.randomNumeric(length);
	    	}
	    	
	    	 private String randomalphabetString(int length) {
	    	        return RandomStringUtils.randomAlphabetic(length); // Generate random alphabetic characters
	    	    }
	    	 
//	    	 private String generateRandomDate() {
//	    	        // Define the date range: start and end dates
//	    	        LocalDate startDate = LocalDate.of(2024, 9, 23); // Start date (e.g., January 1, 2000)
//	    	        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)
//
//	    	        // Generate a random date within the range
//	    	        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
//	    	        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
//
//	    	        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
//	    	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//	    	        return randomDate.format(formatter);
//	    	    }
	    	    private String generateRandomInterest() {
	    	        // Define the range for the interest rate
	    	        double minInterest = 1.0; // Minimum interest rate (e.g., 1%)
	    	        double maxInterest = 15.0; // Maximum interest rate (e.g., 15%)

	    	        // Generate a random interest rate within the range
	    	        double randomInterest = minInterest + (maxInterest - minInterest) * ThreadLocalRandom.current().nextDouble();

	    	        // Format the interest rate to 2 decimal places
	    	        return String.format("%.2f", randomInterest);
	    	    }

}}
