package commercialcourt;

import java.time.Duration;
import java.util.Random;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class commercialcaseadd {
	

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
	    
	    //generate random suitamunt
	    
	    Random random = new Random();
	    int randomSuitAmount = 100000 + random.nextInt(900000);
	    
	    //generate random intrest
	    
	    Random random1 = new Random();
	    // Generate a whole number part between 10 and 99 (to ensure a two-digit number)
	    int wholeNumberPart = 10 + random1.nextInt(90);
	    // Generate a decimal part between 0 and 9
	    int decimalPart = random1.nextInt(10);
	    // Combine whole number and decimal parts
	    String randomInterest = wholeNumberPart + "." + decimalPart;
	 
	 
	 //generate random mediation
	 Random random2 = new Random();
	 int randomMediation = 100000 + random2.nextInt(900000);
	    
	 //generate random case number
	 Random random3 = new Random();
	 int randomcaseno = 100000 + random3.nextInt(900000);
	       



	    @Test(priority=1)
	    public void testAddcommercial() throws InterruptedException {
	    	
	    
//	        driver.get("http://192.168.0.137:8955/");
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
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	        js111.executeScript("arguments[0].click();", clickthreedots);
	        
	        try {
	             
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        WebElement clickcommercial = driver.findElement(By.xpath("(//a[normalize-space()='Commercial Court'])[1]"));
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
	        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseComCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        js11111.executeScript("arguments[0].click();", clickclose);
	        
	        
	        //coborrower/Guarantor/Legal Heirs
	        
	        
	        JavascriptExecutor js111111 = (JavascriptExecutor) driver;
	        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnComBorrower']"));
	        js111111.executeScript("arguments[0].click();", clickaddbutton);
	        
	        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='ComLegal']"));
	        clicklegalheirs.click();
	        
	        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='ComCheck_1162'])[1]"));
	        if (!checkbox.isSelected()) {
	        	checkbox.click();
	        }
	        
	        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnComBorrowerCustSave']"));
	        clickaddbutton1.click();
	        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnComBorrowerCustOK']"));
	        savebutton.click();
	        
            //state of court
	        
	        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpComState']"));
	        Select StateofCourtSelect = new Select(StateofCourt);
	        StateofCourtSelect.selectByVisibleText("Kerala");
	        
	        //Location of the Court
	        
	        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpComDistrict']"));
	        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
	        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
	        
           //Name of the Court
	        
	        WebElement NameoftheCourt = driver.findElement(By.xpath("//select[@id='DrpComCourtName']"));
	        Select NameoftheCourtSelect = new Select(NameoftheCourt);
	        NameoftheCourtSelect.selectByVisibleText("Commercial Court");
	        
	        //BENCH
	        
	        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpComBench']"));
	        Select benchSelect = new Select(bench);
	        benchSelect.selectByVisibleText("Addl District Court, Wanaprthy");
	        
	        
	        //cnr number
	        
	        WebElement cNRNOElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtComCNRNo']")));
	        cNRNOElement.sendKeys(generateRandomCNRNumber());
	        String generatedCNRNumber = generateRandomCNRNumber();
	        System.out.println("Generated CNR Number: " + generatedCNRNumber);
	        
	        //case type
	        
	        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpComCaseTyp']"));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("Com.A.A - (Arbitration Application)");
	        
           //case stage
	        
	        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpComCaseStage']"));
	        Select casestageSelect = new Select(casestage);
	        casestageSelect.selectByVisibleText("Hearing");
	        
	        //Date of Filing
	        
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("document.getElementById('TxtComFilingDate').value='04-05-2024'");
	        
//	        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtComFilingDate']"));
//	        DateofFiling.sendKeys("06-08-2024");
	        
            //Role of Bank
	        
	        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpComCanaraRole']"));
	        Select RoleofBankSelect = new Select(RoleofBank);
	        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
	        
	        
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        js1111.executeScript("window.scrollBy(0,2000)");
	        
	        
	        //Suit Amount in Rs.(Actuals)
	        
	        WebElement SuitAmount = driver.findElement(By.xpath("//input[@id='TxtComSuitAmount']"));
	        SuitAmount.sendKeys(String.valueOf(randomSuitAmount));
	        System.out.println("Generated SuitAmount: " + randomSuitAmount);
	        
	        //Interest Claimed (%)
	        
	        WebElement Interest = driver.findElement(By.xpath("//input[@id='TxtComInterestClaimed']"));
	        Interest.sendKeys(randomInterest);
	        System.out.println("Generated Interest: " + randomInterest);
	        
	        //Interest Type
	       
	        WebElement InterestType = driver.findElement(By.xpath("//select[@id='DrpComInterestTyp']"));
	        Select InterestTypeSelect = new Select(InterestType);
	        InterestTypeSelect.selectByVisibleText("Simple Interest");
	        
	        //Mediation No
	        
	        WebElement Mediation = driver.findElement(By.xpath("//input[@id='TxtComMediationNo']"));
	        Mediation.sendKeys(String.valueOf(randomMediation));
	        System.out.println("Generated Mediation: " + randomMediation);
	        
	        //Mediation Year
	        
	        WebElement MediationYear = driver.findElement(By.xpath("//select[@id='DrpComMediationYear']"));
	        Select MediationYearSelect = new Select(MediationYear);
	        MediationYearSelect.selectByVisibleText("2024");
	        
	        //Whether Mediation approved
	        
	        WebElement WhetherMediationapproved = driver.findElement(By.xpath("//select[@id='DrpComMediationApprv']"));
	        Select WhetherMediationapprovedSelect = new Select(WhetherMediationapproved);
	        WhetherMediationapprovedSelect.selectByVisibleText("No");
	        
	        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtComCaseNo']"));
	        caseno.sendKeys(String.valueOf(randomcaseno));
	        System.out.println("Generated caseno: " + randomcaseno);
	        
	        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpComCaseYear']"));
	        Select caseyearSelect = new Select(caseyear);
	        caseyearSelect.selectByVisibleText("2024");
	        
	        WebElement clicksave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComSave']")));
	        clicksave.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement clickok =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        clickok.click();
	        
            Thread.sleep(2000);
	        
	        WebElement clickok1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        clickok1.click();
	        
	     // ANSI escape code for green text
            String greenColor = "\u001B[32m";
            // ANSI escape code to reset the color to default
            String resetColor = "\u001B[0m";

            System.out.println(greenColor + "Commercial Case added successfully " + resetColor);

	     
	        
	    }}


