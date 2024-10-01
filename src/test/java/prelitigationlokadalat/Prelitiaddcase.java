package prelitigationlokadalat;

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

public class Prelitiaddcase {
	
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
    
    
    String refno1 = RandomString(18);
    String settlementamt1 = RandomString(15);
    String dateofaward1 = generateRandomDate();
    String validityofsettlement1 = generateRandomDate();
    String othertermsofdecree1 = RandomString1(500);
    
    
    @Test(priority=1)
    public void addcasepermant() throws InterruptedException {
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
        
        JavascriptExecutor js = (JavascriptExecutor) driver;     
        js.executeScript("window.scrollTo(0, 1000);"); // Scroll down by 500 pixels
        
     
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[4]"));
        js3.executeScript("arguments[0].click();", clickthreedots);
        
      
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        WebElement clickpreliticase = driver.findElement(By.id("121"));
        // Scroll to the element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickpreliticase);	  
        js4.executeScript("arguments[0].click();", clickpreliticase);

        
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        WebElement clickaddbutton = driver.findElement(By.id("BtnPreLitCustomerID"));
        js5.executeScript("arguments[0].click();", clickaddbutton);
        
        //Customer ID
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='PreLitLokSearchBy']"));
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByVisibleText("Customer Name");
      
        
        driver.findElement(By.id("TxtPreLitLokSearchValue")).sendKeys("SAM");
		  
        driver.findElement(By.xpath("//button[@id='BtnPreLitLokSelectCust']")).click();
        
        driver.findElement(By.xpath("//tbody/tr[4]/td[5]/input[1]")).click();
        
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        WebElement add = driver.findElement(By.id("BtnPreLitCustSave"));
        js6.executeScript("arguments[0].click();", add);
        
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        WebElement ok = driver.findElement(By.id("BtnPreLitLokSelectCustSave"));
        js7.executeScript("arguments[0].click();", ok);
        
//        ACCOUNT NUMBER
        
        JavascriptExecutor js8 = (JavascriptExecutor) driver;
        WebElement clickaddbutton1 = driver.findElement(By.id("BtnAccountNo"));
        js8.executeScript("arguments[0].click();", clickaddbutton1);
        
        driver.findElement(By.xpath("(//input[@id='CheckPreLitAcc_2546987456235'])[1]")).click();
        
        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        WebElement add1 = driver.findElement(By.id("BtnPreLitAcSave"));
        js9.executeScript("arguments[0].click();", add1);
        
        //CO-Borrower/Guarantor/Legal Heirs
        
        JavascriptExecutor js10 = (JavascriptExecutor) driver;
        WebElement clickaddbutton4 = driver.findElement(By.xpath("//button[@id='BtnPreLitBorrower']"));
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
        WebElement clickaddbutton5 = driver.findElement(By.id("BtnPreLitSavedata"));
        js11.executeScript("arguments[0].click();", clickaddbutton5);
        
        JavascriptExecutor js14 = (JavascriptExecutor) driver;
        WebElement clicksave = driver.findElement(By.id("BtnPreLitSelectedBorrowerSave"));
        js14.executeScript("arguments[0].click();", clicksave);
        
        WebElement stateofcourt = driver.findElement(By.xpath("//select[@id='DrpPreLitState']"));
        Select stateofcourtSelect = new Select(stateofcourt);
        stateofcourtSelect.selectByVisibleText("Kerala");
        
        WebElement locationofcourt = driver.findElement(By.id("DrpPreLitDistrict"));
        Select locationofcourtSelect = new Select(locationofcourt);
        locationofcourtSelect.selectByVisibleText("Palakkad");
        
        WebElement nameofauthority = driver.findElement(By.id("DrpPreLitAuthorityName"));
        Select nameofauthoritySelect = new Select(nameofauthority);
        nameofauthoritySelect.selectByVisibleText("National Legal Service Authority");
        
        WebElement refno = driver.findElement(By.id("TxtPreLitRefNo"));
        refno.sendKeys(refno1);
        
        WebElement year = driver.findElement(By.id("DrpPreLitYear"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("2024");
        
        WebElement dateofaward = driver.findElement(By.id("TxtPreLitAwardDate"));
        dateofaward.sendKeys(dateofaward1);
        
        WebElement settlementamt = driver.findElement(By.id("TxtPreLitSettlementAmt"));
        settlementamt.sendKeys(settlementamt1);
        
        WebElement validityofsettlement = driver.findElement(By.id("TxtPreLitSettlementValidity"));
        validityofsettlement.sendKeys(validityofsettlement1);
        
        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtPreLitCNRNo']"));
        cnrno.sendKeys(generateRandomCNRNumber());
        
        WebElement othertermsofdecree = driver.findElement(By.id("TxtRevDecree"));
        othertermsofdecree.sendKeys(othertermsofdecree1);
        
        driver.findElement(By.xpath("//button[@id='BtnPreLitSave']")).click();
	    Thread.sleep(2000);
	    {
	      WebElement element = driver.findElement(By.xpath("//button[@id='BtnPreLitSave']"));
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
    private String RandomString1(int length) {
        return RandomStringUtils.randomAlphabetic(length); // Generate random alphabetic characters
    }
    private String generateRandomDate() {
        // Define the date range: start and end dates
        LocalDate startDate = LocalDate.of(2024, 10, 01); // Start date (e.g., January 1, 2000)
        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)

        // Generate a random date within the range
        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);

        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return randomDate.format(formatter);
    }}
        
        
        
        
        
        
        
        
        


