package revenuerecovery;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Revenueaddcase {
	
	
	private WebDriver driver;
	private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
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

    String dateoffiling1 = generateRandomDate();
    String amountalaimed1 = RandomString(15);
    String intrest1 = generateRandomInterest();
    String caseno1 = RandomString(5);

	
	
	
	 @Test(priority=1)
	    public void addcaserevenue() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        js1.executeScript("arguments[0].click();", clicknpa);
	        
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
	        js2.executeScript("arguments[0].click();", addcase);
	        
	     
	        JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	        js3.executeScript("arguments[0].click();", clickthreedots);
	        
	        
	        JavascriptExecutor js4 = (JavascriptExecutor) driver;
	        WebElement clickrevenuerecovery = driver.findElement(By.xpath("(//a[normalize-space()='Revenue Recovery'])[1]"));
	        js4.executeScript("arguments[0].click();", clickrevenuerecovery);
	        
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnRevCustomerID']"));
	        js5.executeScript("arguments[0].click();", clickaddbutton);
	        
	        //Customer ID
	        
	        WebElement dropdown = driver.findElement(By.id("DrpRenenueRSearchBy"));
	        dropdown.findElement(By.xpath("//option[. = 'Customer Name']")).click();
	      
		   
	        driver.findElement(By.id("TxtRenenueRSearchValue")).click();
	        
	        driver.findElement(By.id("TxtRenenueRSearchValue")).sendKeys("SAM");
			  
	        driver.findElement(By.id("BtnRenenueRSelectCust")).click();
	        
	        driver.findElement(By.xpath("(//input[@id='CheckRevCustomerList_86028525'])[2]")).click();
	        
	        JavascriptExecutor js6 = (JavascriptExecutor) driver;
	        WebElement add = driver.findElement(By.xpath("//button[@id='BtnRevCustSave']"));
	        js6.executeScript("arguments[0].click();", add);
	        
	        JavascriptExecutor js7 = (JavascriptExecutor) driver;
	        WebElement ok = driver.findElement(By.xpath("//button[@id='BtnRevenueRSelectCustSave']"));
	        js7.executeScript("arguments[0].click();", ok);
	        
	        
	        //account number
	        
	        JavascriptExecutor js8 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton2 = driver.findElement(By.xpath("//button[@id='BtnRevAccountNo']"));
	        js8.executeScript("arguments[0].click();", clickaddbutton2);
	        
	        
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/input[1]")).click();
	        
	        JavascriptExecutor js9 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton3 = driver.findElement(By.xpath("//button[@id='BtnRevAcSave']"));
	        js9.executeScript("arguments[0].click();", clickaddbutton3);
	        
	        
	        //CO-Borrower/Guarantor/Legal Heirs
	        
	        JavascriptExecutor js10 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton4 = driver.findElement(By.xpath("//button[@id='BtnRevBorrower']"));
	        js10.executeScript("arguments[0].click();", clickaddbutton4);
	        
	        
	        
	        List<WebElement> checkboxes = driver.findElements(By.className("Checkboxcheckcondition"));

            // Loop through the list and check each checkbox
            for (WebElement checkbox : checkboxes) {
                // Check if the checkbox is not already selected
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }

            System.out.println("All checkboxes in coborrower have been checked.");
            
            
	        JavascriptExecutor js11 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton5 = driver.findElement(By.xpath("//button[@id='BtnRevBorrowerSave']"));
	        js11.executeScript("arguments[0].click();", clickaddbutton5);
	        
	        
	        JavascriptExecutor js12 = (JavascriptExecutor) driver;
	        WebElement clickgurantorbutton = driver.findElement(By.xpath("//input[@id='GuarantorRev']"));
	        js12.executeScript("arguments[0].click();", clickgurantorbutton);
	        
	        List<WebElement> checkboxes1 = driver.findElements(By.className("Checkboxcheckcondition"));

            // Loop through the list and check each checkbox
            for (WebElement checkbox : checkboxes1) {
                // Check if the checkbox is not already selected
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }

            System.out.println("All checkboxes in gurantor have been checked.");
            
            JavascriptExecutor js13 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton6 = driver.findElement(By.xpath("//button[@id='BtnRevBorrowerSave']"));
	        js13.executeScript("arguments[0].click();", clickaddbutton6);
	        
	        
	        JavascriptExecutor js14 = (JavascriptExecutor) driver;
	        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnRRSelectedBorrowerSave']"));
	        js14.executeScript("arguments[0].click();", clicksave);
	        
	        WebElement state =  driver.findElement(By.xpath("//select[@id='DrpRevState']"));
	        Select stateSelect = new Select(state);
	        stateSelect.selectByVisibleText("Kerala");
	        
	        WebElement location =  driver.findElement(By.xpath("//select[@id='DrpRevDistrict']"));
	        Select locationSelect = new Select(location);
	        locationSelect.selectByVisibleText("Palakkad");
	        
	        WebElement nameoftheautority =  driver.findElement(By.xpath("//select[@id='DrpRevAuthorityName']"));
	        Select nameoftheautoritySelect = new Select(nameoftheautority);
	        nameoftheautoritySelect.selectByVisibleText("District Magistrate");
	        
	        WebElement dateoffiling =  driver.findElement(By.xpath("//input[@id='TxtRevFilingDate']"));
	        dateoffiling.sendKeys(dateoffiling1);
	        System.out.println("date of filing is: " + dateoffiling1);
	        
	        WebElement amountalaimed =  driver.findElement(By.xpath("//input[@id='TxtRevAmtClaimed']"));
	        amountalaimed.sendKeys(amountalaimed1);
	        
	        WebElement intrest =  driver.findElement(By.xpath("//input[@id='TxtRevInterestClaim']"));
	        intrest.sendKeys(intrest1);
	           
	        WebElement intresttype =  driver.findElement(By.xpath("//select[@id='DrpRevInterestTyp']"));
	        Select intresttypeSelect = new Select(intresttype);
	        intresttypeSelect.selectByVisibleText("Simple Interest");
	        
	        WebElement cnrno =  driver.findElement(By.xpath("//input[@id='TxtRevCNRNo']"));
	        cnrno.sendKeys( generateRandomCNRNumber());
	        
	        WebElement caseno =  driver.findElement(By.xpath("//input[@id='TxtRevCaseNo']"));
	        caseno.sendKeys(caseno1);
	        System.out.println("Case Number entered: " + caseno1);
	        
	        WebElement caseyear =  driver.findElement(By.xpath("//select[@id='DrpRevCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        JavascriptExecutor js15 = (JavascriptExecutor) driver;
	        WebElement clicksavebutton = driver.findElement(By.xpath("//button[@id='BtnRevSave']"));
	        js15.executeScript("arguments[0].click();", clicksavebutton);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js16 = (JavascriptExecutor) driver;
	        WebElement clickokbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        js16.executeScript("arguments[0].click();", clickokbutton);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js17 = (JavascriptExecutor) driver;
	        WebElement clickokbutton1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        js17.executeScript("arguments[0].click();", clickokbutton1);
	       
	       
	 }
	 
	 private String RandomString(int length) {
			
			return RandomStringUtils.randomNumeric(length);
		}
		
//		 private String randomalphabetString(int length) {
//		        return RandomStringUtils.randomAlphabetic(length); // Generate random alphabetic characters
//		    }
//		 
		 private String generateRandomDate() {
		        // Define the date range: start and end dates
		        LocalDate startDate = LocalDate.of(2024, 9, 1); // Start date (e.g., January 1, 2000)
		        LocalDate endDate = LocalDate.of(2024, 9, 26); // End date (current date)

		        // Generate a random date within the range
		        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
		        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);

		        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		        return randomDate.format(formatter);
		    }
		    private String generateRandomInterest() {
		        // Define the range for the interest rate
		        double minInterest = 1.0; // Minimum interest rate (e.g., 1%)
		        double maxInterest = 15.0; // Maximum interest rate (e.g., 15%)

		        // Generate a random interest rate within the range
		        double randomInterest = minInterest + (maxInterest - minInterest) * ThreadLocalRandom.current().nextDouble();

		        // Format the interest rate to 2 decimal places
		        return String.format("%.2f", randomInterest);
		    
	    
	}}
