package highcourt;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


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
    
    
    String totalcourtfee = RandomString(15);
    String DateofFiling1 = generateRandomDate();
    String DateofReporting1 = generateRandomDate();
    String plainamount1 = RandomString(15);
    String InterestClaimed1 = generateRandomInterest();
    String Damages1 = RandomString(15);
    String Claim1 = RandomString(15);
    String Filing1 = RandomString(50);
    String factofcase1 = randomalphabetString(2000);
    String caseno1 = RandomString(50);
    String Prayer1 = randomalphabetString(2000);
    
    
    
//    String = randomalphabetString();

    @Test(priority=1)
    public void testAddAdvocateonRO() throws InterruptedException {
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
        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]"));
        js3.executeScript("arguments[0].click();", clickthreedots);
        
        
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        WebElement clickhighcort = driver.findElement(By.xpath("(//a[normalize-space()='High Court'])[1]"));
        js4.executeScript("arguments[0].click();", clickhighcort);
        
          
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseHCSCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
        js5.executeScript("arguments[0].click();", clickclose);
        
        //coborrower/Guarantor/Legal Heirs
        
        
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnHSBorrower']"));
        js6.executeScript("arguments[0].click();", clickaddbutton);
        
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='HSLegal']"));
        js7.executeScript("arguments[0].click();", clicklegalheirs);
        
        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='HCSCSelect_1162'])[1]"));
        if (!checkbox.isSelected()) {
        	checkbox.click();
        }
        
        JavascriptExecutor js8 = (JavascriptExecutor) driver;
        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnHSBorrowerSave']"));
        js8.executeScript("arguments[0].click();", clickaddbutton1);
        
        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnHSSelectedBorrowerSave']"));
        js9.executeScript("arguments[0].click();", savebutton);
        
         //state of court
        
        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpHSState']"));
        Select StateofCourtSelect = new Select(StateofCourt);
        StateofCourtSelect.selectByVisibleText("Kerala");
        
        //Location of the Court
        
        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpHSDistrict']"));
        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
        
        //Court Forum
        
        
        WebElement CourtForum = driver.findElement(By.xpath("//select[@id='DrpHSCourtForum']"));
        Select CourtForumSelect = new Select(CourtForum);
        CourtForumSelect.selectByVisibleText("High Court of Kerala");
        
        //bench
        
        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpHSBench']"));
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("High Court of Kerala");
        
        //case type
        
        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpHSCaseTyp']"));
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Appeal");
        
        //case stage
        
        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpHSCaseStage']"));
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Hearing");
        
        //nature of case
        
        WebElement natureofcase = driver.findElement(By.xpath("//select[@id='DrpHSCaseNature']"));
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText("Appeal/Revision");
        
       //Date of Filing
        
        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtHSFilingDate']"));
        DateofFiling.sendKeys(DateofFiling1);
        
        //Date of Reporting
        
        WebElement DateofReporting = driver.findElement(By.xpath("//input[@id='TxtHSReportingDate']"));
        DateofReporting.sendKeys(DateofReporting1);
        
         //Role of Bank
        
        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpHSCanaraRole']"));
        Select RoleofBankSelect = new Select(RoleofBank);
        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
        
        //Whether Monetary Case
        
        WebElement Monetary = driver.findElement(By.xpath("//select[@id='DrpHSMonetaryCase']"));
        Select MonetarySelect = new Select(Monetary);
        MonetarySelect.selectByVisibleText("Yes");
        
        //plainamount
        
        WebElement plainamount = driver.findElement(By.xpath("//input[@id='TxtHSPlaintAmt']"));
        plainamount.sendKeys(plainamount1);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        
        //Interest Claimed (%)
        WebElement InterestClaimed = driver.findElement(By.xpath("//input[@id='TxtHSInterestClaimed']"));
        InterestClaimed.sendKeys(InterestClaimed1);
        
      //Interest Type
	       
        WebElement InterestType = driver.findElement(By.xpath("//select[@id='DrpHSInterestTyp']"));
        Select InterestTypeSelect = new Select(InterestType);
        InterestTypeSelect.selectByVisibleText("Simple Interest");
        
        //Damages claimed
        WebElement Damages = driver.findElement(By.xpath("//input[@id='TxtHSDamageClaimed']"));
        Damages.sendKeys(Damages1);
        
        //Cost / Misc. Claim
        WebElement Claim = driver.findElement(By.xpath("//input[@id='TxtHSMiscClaim']"));
        Claim.sendKeys(Claim1);
        
        //Filing No
        
        WebElement Filing = driver.findElement(By.xpath("//input[@id='TxtHSFilingNo']"));
        Filing.sendKeys(Filing1);
        
        //Filing Year
        
        WebElement FilingYear = driver.findElement(By.xpath("//select[@id='DrpHSFilingYear']"));
        Select FilingYearSelect = new Select(FilingYear);
        FilingYearSelect.selectByVisibleText("2024");
        
        //cnrno 
        
        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtHSFilingNo']"));
        cnrno.sendKeys(generateRandomCNRNumber());
        String generatedCNRNumber = generateRandomCNRNumber();
        System.out.println("Generated CNR Number: " + generatedCNRNumber);
        
        //Case No
        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtHSCaseNo']"));
        caseno.sendKeys(caseno1);
        
        //Case Year
        
        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpHSCaseYear']"));
        Select caseyearSelect = new Select(caseyear);
        caseyearSelect.selectByVisibleText("2024");
      //Fact of Case
        
        WebElement factofcase = driver.findElement(By.xpath("//textarea[@id='TxtHSCaseFact']"));
        factofcase.sendKeys(factofcase1);
        
        //Prayer
        WebElement Prayer = driver.findElement(By.xpath("//textarea[@id='TxtHSPrayer']"));
        Prayer.sendKeys(Prayer1);
 
        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnHSSave']"));
        clicksave.click();
        
        Thread.sleep(2000);
        
        WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        clickok.click();
        
        Thread.sleep(2000);
        
        WebElement clickok1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        clickok1.click();
        

}
	private String RandomString(int length) {
		
		return RandomStringUtils.randomNumeric(length);
	}
	
	 private String randomalphabetString(int length) {
	        return RandomStringUtils.randomAlphabetic(length); // Generate random alphabetic characters
	    }
	 
	 private String generateRandomDate() {
	        // Define the date range: start and end dates
	        LocalDate startDate = LocalDate.of(2024, 8, 21); // Start date (e.g., January 1, 2000)
	        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)

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
	    }
    
}
