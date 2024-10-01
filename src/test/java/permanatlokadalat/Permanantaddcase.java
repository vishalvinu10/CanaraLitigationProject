package permanatlokadalat;

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

public class Permanantaddcase {
	
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
    String suitamount1 = RandomString(15);
    String intrest1 = generateRandomInterest();
    String caseno1 = RandomString(5);

	
	
	
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
	        
	     
	        JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[4]"));
	        js3.executeScript("arguments[0].click();", clickthreedots);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;     
	        js.executeScript("window.scrollTo(0, 500);"); // Scroll down by 500 pixels
	        
	        
	        JavascriptExecutor js4 = (JavascriptExecutor) driver;
	        WebElement clickpermanantcase = driver.findElement(By.xpath("(//a[normalize-space()='Permenant LokAdalat'])[1]"));
	        // Scroll to the element
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickpermanantcase);	  
	        js4.executeScript("arguments[0].click();", clickpermanantcase);

	        
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnPrmtCustomerID']"));
	        js5.executeScript("arguments[0].click();", clickaddbutton);
	        
	        //Customer ID
	        
	        WebElement dropdown = driver.findElement(By.xpath("//select[@id='DrpPadaltSearchBy']"));
	        Select dropdownSelect = new Select(dropdown);
	        dropdownSelect.selectByVisibleText("CustomerName");
	      
	        
	        driver.findElement(By.id("TxtPadaltSearchValue")).sendKeys("SAM");
			  
	        driver.findElement(By.id("BtnadaltCustIDSearch")).click();
	        
	        driver.findElement(By.xpath("//tbody/tr[4]/td[7]/input[1]")).click();
	        
	        JavascriptExecutor js6 = (JavascriptExecutor) driver;
	        WebElement add = driver.findElement(By.xpath("//button[@id='BtnadalatcustIDSave']"));
	        js6.executeScript("arguments[0].click();", add);
	        
	        JavascriptExecutor js7 = (JavascriptExecutor) driver;
	        WebElement ok = driver.findElement(By.xpath("//button[@id='BtnadalatustIDOK']"));
	        js7.executeScript("arguments[0].click();", ok);
	        
//	        ACCOUNT NUMBER
	        
	        JavascriptExecutor js8 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnAPrmtountNo']"));
	        js8.executeScript("arguments[0].click();", clickaddbutton1);
	        
	        driver.findElement(By.xpath("(//input[@id='CheckAc_2546987456235'])[1]")).click();
	        
	        JavascriptExecutor js9 = (JavascriptExecutor) driver;
	        WebElement add1 = driver.findElement(By.xpath("//button[@id='BtnPrmtAcSave']"));
	        js9.executeScript("arguments[0].click();", add1);
	        
//	        CO-Borrower/Guarantor/Legal Heirs
//	        
//	        JavascriptExecutor js10 = (JavascriptExecutor) driver;
//	        WebElement clickaddbutton2 = driver.findElement(By.xpath("//button[@id='BtnPrmtBorrower']"));
//	        js10.executeScript("arguments[0].click();", clickaddbutton2); 
//	        
//	        
//	        //loop through the checkbox and click all
//	        
//	        
//	        List<WebElement> checkboxes = driver.findElements(By.className("Checkboxcheckcondition"));
//
//            // Loop through the list and check each checkbox
//            for (WebElement checkbox : checkboxes) {
//                // Check if the checkbox is not already selected
//                if (!checkbox.isSelected()) {
//                    checkbox.click();
//                }
//            }
//            
//            
//            WebElement modalButton = driver.findElement(By.id("PrmtCOBorrowerModal"));  // Locator for opening the modal
//            modalButton.click();
//
//            // Wait for the modal to appear
//            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
//
//            // Scroll the modal content using JavaScript, assuming modal body has a class or ID
//            JavascriptExecutor js55 = (JavascriptExecutor) driver;
//            js55.executeScript("document.querySelector('.modal-body').scrollTop += 500");  // Modify selector as per modal structure
//
//            // Optionally, click on the element inside the modal after scrolling
//            WebElement elementInModal = driver.findElement(By.xpath("(//input[@id='DRTCheck_123413366'])[1]"));
//            elementInModal.click();
 
        
//     
//            WebElement clickaddbutton3 = driver.findElement(By.xpath("//button[@id='BtnPrmtCOBorrowerSave']"));
//            JavascriptExecutor js81 = (JavascriptExecutor) driver;
//            js81.executeScript("arguments[0].scrollIntoView(true);", clickaddbutton3);
//
//            System.out.println("All checkboxes in coborrower have been checked.");
//
//           
//            JavascriptExecutor add11 = (JavascriptExecutor) driver;	        
//	        add11.executeScript("arguments[0].click();", clickaddbutton3); 
//	        
//	        JavascriptExecutor ok1 = (JavascriptExecutor) driver;
//	        WebElement clickok = driver.findElement(By.xpath("//button[@id='BtnPrmtCOSelectedBorrowerSave']"));
//	        ok1.executeScript("arguments[0].click();", clickok); 
	        
	        WebElement stateofcourt = driver.findElement(By.id("DrpPrmtState"));
	        Select stateofcourtSelect = new Select(stateofcourt);
	        stateofcourtSelect.selectByVisibleText("Kerala");
	        
	        WebElement locationofcourt = driver.findElement(By.id("DrpPrmtDistrict"));
	        Select locationofcourtSelect = new Select(locationofcourt);
	        locationofcourtSelect.selectByVisibleText("Palakkad");
	        
	        WebElement nameofcourt = driver.findElement(By.id("DrpPrmtCourtName"));
	        Select nameofcourtSelect = new Select(nameofcourt);
	        nameofcourtSelect.selectByVisibleText("Permanent Lok adalat");
	        
	        WebElement dateoffiling = driver.findElement(By.id("TxtPrmtFilingDate"));
	        dateoffiling.sendKeys(dateoffiling1);
	        
	        WebElement canararole = driver.findElement(By.id("DrpPrmtCanaraRole"));
	        Select canararoleSelect = new Select(canararole);
	        canararoleSelect.selectByVisibleText("Petitioner(s)");
	        
	        JavascriptExecutor petitioner1 = (JavascriptExecutor) driver;
	        WebElement petitioner = driver.findElement(By.id("BtnPrmtPetitioner"));
	        petitioner1.executeScript("arguments[0].click();", petitioner);
	        
	        WebElement petetionernamElement =  driver.findElement(By.id("TxtPAPetitioner"));
	        petetionernamElement.sendKeys("dewkfgewuigf");
	        
	        JavascriptExecutor add111 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton31 = driver.findElement(By.id("BtnPAPetitionerSave"));
	        add111.executeScript("arguments[0].click();", clickaddbutton31); 
	        
	        JavascriptExecutor ok11 = (JavascriptExecutor) driver;
	        WebElement clickokbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        ok11.executeScript("arguments[0].click();", clickokbutton); 
	        
	        //respontant
	        
	        JavascriptExecutor respontant1 = (JavascriptExecutor) driver;
	        WebElement respontant = driver.findElement(By.id("BtnPrmtRespondent"));
	        respontant1.executeScript("arguments[0].click();", respontant);
	        
	        WebElement respontantnamElement =  driver.findElement(By.id("TxtPARespondent"));
	        respontantnamElement.sendKeys("dsgerherhervsger");
	        
	        JavascriptExecutor add1111 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton311 = driver.findElement(By.id("BtnPARespondentSave"));
	        add1111.executeScript("arguments[0].click();", clickaddbutton311); 
	        
	        JavascriptExecutor ok111 = (JavascriptExecutor) driver;
	        WebElement clickokbutton1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        ok111.executeScript("arguments[0].click();", clickokbutton1); 
	        
	        WebElement suitamount = driver.findElement(By.id("TxtPrmtSuitAmount"));
	        suitamount.sendKeys(suitamount1);
	        
	        WebElement intrestclaimed = driver.findElement(By.id("TxtPrmtInterestClaimed"));
	        intrestclaimed.sendKeys(intrest1);
	        
	        WebElement intresttype = driver.findElement(By.id("DrpPrmtInterestTyp"));
	        Select intresttypeSelect = new Select(intresttype);
	        intresttypeSelect.selectByVisibleText("Simple Interest");
	        
	        // banks advocate
	        
	        JavascriptExecutor adv = (JavascriptExecutor) driver;
	        WebElement addadvocate = driver.findElement(By.id("BtnPrmtAdvctName"));
	        adv.executeScript("arguments[0].click();", addadvocate); 
	        
	        WebElement selectadv = driver.findElement(By.id("DrpAdvPerState"));
	        Select selectadvSelect = new Select(selectadv);
	        selectadvSelect.selectByVisibleText("Kerala");
	        
	        WebElement districtofadv = driver.findElement(By.id("PerAdvPrmtDistrict"));
	        Select districtofadvSelect = new Select(districtofadv);
	        districtofadvSelect.selectByVisibleText("Palakkad");
	        
	        JavascriptExecutor search = (JavascriptExecutor) driver;
	        WebElement search1 = driver.findElement(By.id("BtnAdvIPerSearch"));
	        search.executeScript("arguments[0].click();", search1); 
	        
	        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).click();
	        
	        JavascriptExecutor addd = (JavascriptExecutor) driver;
	        WebElement addd1 = driver.findElement(By.id("BtnPrmtAdvctSave"));
	        addd.executeScript("arguments[0].click();", addd1); 
	        
	        WebElement cnrno = driver.findElement(By.xpath("//input[@id='TxtPrmtCNRNo']"));
	        cnrno.sendKeys(generateRandomCNRNumber());
	        
	        WebElement caseno = driver.findElement(By.id("TxtPrmtCaseNo"));
	        caseno.sendKeys(caseno1);
	        System.out.println("Case Number entered: " + caseno1);
	        
	        WebElement caseyear = driver.findElement(By.id("DrpPrmtCaseYear"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        JavascriptExecutor js15 = (JavascriptExecutor) driver;
	        WebElement clicksavebutton = driver.findElement(By.id("BtnPrmtSave"));
	        js15.executeScript("arguments[0].click();", clicksavebutton);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js16 = (JavascriptExecutor) driver;
	        WebElement clickokbutton11 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        js16.executeScript("arguments[0].click();", clickokbutton11);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js17 = (JavascriptExecutor) driver;
	        WebElement clickokbutton111 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        js17.executeScript("arguments[0].click();", clickokbutton111);
	       
	       
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
		        LocalDate startDate = LocalDate.of(2024, 9, 30); // Start date (e.g., January 1, 2000)
		        LocalDate endDate = LocalDate.of(2024, 10, 26); // End date (current date)

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
