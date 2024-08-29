package commercialcourt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CC_005 {
	
	
	public class commercial {
		

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

//		    @AfterClass
//		    public void tearDown() {
//		        if (driver != null) {
//		            driver.quit();
//		        }
//		    }
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
		    
		   
		    String dateoffiling = generateRandomDate();
		    String suitamount = RandomString(1);
		    String randomInterest = generateRandomInterest(); 
		    String randomMediation = RandomString(1);
		    String randomcaseno = RandomString(1);
		    

		    @Test(priority=1)
		    public void testAddcommercial() throws InterruptedException {
		    	
//		     	driver.get("https://safallitigation.onlinesafe.in/");
		        driver.get("http://192.168.0.137:8955/");

		        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BU");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();

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
		        	         
		        JavascriptExecutor js11111 = (JavascriptExecutor) driver;
		        WebElement clickclose = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='CloseComCustOtherCaseDetailsLoad'] span[aria-hidden='true']")));
		        js11111.executeScript("arguments[0].click();", clickclose);
		        
		        //coborrower/Guarantor/Legal Heirs
		        
		        
		        JavascriptExecutor js111111 = (JavascriptExecutor) driver;
		        WebElement clickaddbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComBorrower']")));
		        js111111.executeScript("arguments[0].click();", clickaddbutton);
		        
		        WebElement clicklegalheirs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ComLegal']")));
		        clicklegalheirs.click();
		        
		        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='ComCheck_1162'])[1]")));
		        if (!checkbox.isSelected()) {
		        	checkbox.click();
		        }
		        
		        WebElement clickaddbutton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComBorrowerCustSave']")));
		        clickaddbutton1.click();
		        WebElement savebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComBorrowerCustOK']")));
		        savebutton.click();
		        
	           //state of court
		        
		        WebElement StateofCourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComState']")));
		        Select StateofCourtSelect = new Select(StateofCourt);
		        StateofCourtSelect.selectByVisibleText("Kerala");
		        
		        //Location of the Court
		        
		        WebElement LocationoftheCourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComDistrict']")));
		        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
		        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
		        
	          //Name of the Court
		        
		        WebElement NameoftheCourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComCourtName']")));
		        Select NameoftheCourtSelect = new Select(NameoftheCourt);
		        NameoftheCourtSelect.selectByVisibleText("Commercial Court");
		        
		        //BENCH
		        
		        WebElement bench = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComBench']")));
		        Select benchSelect = new Select(bench);
		        benchSelect.selectByVisibleText("Addl District Court, Wanaprthy");
		        
		        //cnr number
		        
		        WebElement cNRNOElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComCNRNo']")));
		        cNRNOElement.sendKeys(generateRandomCNRNumber());
		        String generatedCNRNumber = generateRandomCNRNumber();
		        System.out.println("Generated CNR Number: " + generatedCNRNumber);
		        
		        //case type
		        
		        WebElement casetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComCaseTyp']")));
		        Select casetypeSelect = new Select(casetype);
		        casetypeSelect.selectByVisibleText("Com.A.A - (Arbitration Application)");
		        
	          //case stage
		        
		        WebElement casestage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComCaseStage']")));
		        Select casestageSelect = new Select(casestage);
		        casestageSelect.selectByVisibleText("Hearing");
		        
		        //Date of Filing
		        
		        WebElement DateofFiling = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComFilingDate']")));
		        DateofFiling.click();
		        // Find the date picker element
		        WebElement datePicker = driver.findElement(By.xpath("//div[@class='datepicker-days']"));
		        // Get all the days in the calendar
		        List<WebElement> days = datePicker.findElements(By.xpath(".//td[@class='day']"));
		        // Generate a random number within the range of available days
		        Random random = new Random();
		        int randomIndex = random.nextInt(days.size());
		        // Select the random day
		        days.get(randomIndex).click();

	           //Role of Bank
		        
		        WebElement RoleofBank = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComCanaraRole']")));
		        Select RoleofBankSelect = new Select(RoleofBank);
		        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
		        
		        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
		        js1111.executeScript("window.scrollBy(0,2000)");
		        
		        //Suit Amount in Rs.(Actuals)
		        
		        WebElement SuitAmount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComSuitAmount']")));
		        SuitAmount.sendKeys(String.valueOf(suitamount));
		        System.out.println("Generated SuitAmount: " + suitamount);
		        
		        //Interest Claimed (%)
		        
		        WebElement Interest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComInterestClaimed']")));
		        Interest.sendKeys(randomInterest);
		        System.out.println("Generated Interest: " + randomInterest);
		        
		        //Interest Type
		       
		        WebElement InterestType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComInterestTyp']")));
		        Select InterestTypeSelect = new Select(InterestType);
		        InterestTypeSelect.selectByVisibleText("Simple Interest");
		        
		        //Mediation No
		        
		        WebElement Mediation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComMediationNo']")));
		        Mediation.sendKeys(String.valueOf(randomMediation));
		        System.out.println("Generated Mediation: " + randomMediation);
		        
		        //Mediation Year
		        
		        WebElement MediationYear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComMediationYear']")));
		        Select MediationYearSelect = new Select(MediationYear);
		        MediationYearSelect.selectByVisibleText("2024");
		        
		        //Whether Mediation approved
		        
		        WebElement WhetherMediationapproved = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComMediationApprv']")));
		        Select WhetherMediationapprovedSelect = new Select(WhetherMediationapproved);
		        WhetherMediationapprovedSelect.selectByVisibleText("No");
		        
		        WebElement caseno = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComCaseNo']")));
		        caseno.sendKeys(String.valueOf(randomcaseno));
		        System.out.println("Generated caseno: " + randomcaseno);
		        
		        WebElement caseyear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpComCaseYear']")));
		        Select caseyearSelect = new Select(caseyear);
		        caseyearSelect.selectByVisibleText("2024");
		        
		        WebElement clicksave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComSave']")));
		        clicksave.click();
		        
		        Thread.sleep(2000);
		        
		        WebElement clickok =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm.btn.btn-lg.btn-success")));
		        clickok.click();
		        
	           Thread.sleep(2000);
		        
		        WebElement clickok1 =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".confirm.btn.btn-lg.btn-success")));
		        clickok1.click();
		        
		     // ANSI escape code for green text
	           String greenColor = "\u001B[32m";
	           // ANSI escape code to reset the color to default
	           String resetColor = "\u001B[0m";

	           System.out.println(greenColor + "Commercial Case added successfully with minimum length " + resetColor);

	}
		   
		    private String generateRandomDate() {
		        // Define the date range: start and end dates
		        LocalDate startDate = LocalDate.of(2024, 8, 29); // Start date (e.g., January 1, 2000)
		        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)
		        // Generate a random date within the range
		        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
		        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
		        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		        return randomDate.format(formatter);
		    }
		    
		    private String RandomString(int length) {				
				return RandomStringUtils.randomNumeric(length);
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
		

	}}

