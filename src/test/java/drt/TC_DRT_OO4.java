package drt;

import java.time.Duration;
import java.util.Random;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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
import org.apache.commons.lang3.RandomStringUtils;

public class TC_DRT_OO4 {
	

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
//        	driver.close();
//
//        }
//    }

    // Method to generate a random numeric string of specified length
    private String generateRandomNumericString(int length) {
        StringBuilder numericString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numericString.append(random.nextInt(10)); // Generates a random digit between 0-9
        }
        return numericString.toString();
    }
    
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

    @Test(priority = 1)
    public void testAdddrtcase() throws InterruptedException {
        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
        usernameField.sendKeys("BU");

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
        signInButton.click();
        
        Thread.sleep(2000);

        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
        clicknpa.click();
        
        Thread.sleep(2000);

        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='Add Cases']"));
        addcase.click();

        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
        clickthreedots.click();

        WebElement clickdrt = driver.findElement(By.xpath("(//a[normalize-space()='DRT'])[1]"));
        clickdrt.click();

        WebElement clickclose = driver.findElement(By.xpath("//button[@id='CloseDRTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
        clickclose.click();

        WebElement clickaddbutton = driver.findElement(By.xpath("//button[@id='BtnBorrower']"));
        clickaddbutton.click();

        WebElement clicklegalheirs = driver.findElement(By.xpath("//input[@id='LegalHeirDRT']"));
        clicklegalheirs.click();

        WebElement checkbox = driver.findElement(By.xpath("(//input[@id='DRTCheck_1162'])[1]"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement clickaddbutton1 = driver.findElement(By.xpath("//button[@id='BtnDRTBorrowerSave']"));
        clickaddbutton1.click();
        WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnDRTSelectedBorrowerSave']"));
        savebutton.click();

        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpDRTState']"));
        Select StateofCourtSelect = new Select(StateofCourt);
        StateofCourtSelect.selectByVisibleText("Kerala");

        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpDRTDistrict']"));
        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
        LocationoftheCourtSelect.selectByVisibleText("Palakkad");

        WebElement NameoftheCourt = driver.findElement(By.xpath("//select[@id='DrpCourtName']"));
        Select NameoftheCourtSelect = new Select(NameoftheCourt);
        NameoftheCourtSelect.selectByVisibleText("DRT");

        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpBench']"));
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("COIMBATORE");

        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpCaseTyp']"));
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Miscellaneous Application");

        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpCaseStage']"));
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Hearing");

        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtFilingDate']"));
        DateofFiling.sendKeys("01-01-2000");

        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpDRTCanaraRole']"));
        Select RoleofBankSelect = new Select(RoleofBank);
        RoleofBankSelect.selectByVisibleText("Petitioner(s)");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");

        WebElement clickaddbutton2 = driver.findElement(By.xpath("//button[@id='BtnAdvctName']"));
        clickaddbutton2.click();

        WebElement StateofAdvocate = driver.findElement(By.xpath("//select[@id='DrpAdvDRTState']"));
        Select StateofAdvocateSelect = new Select(StateofAdvocate);
        StateofAdvocateSelect.selectByVisibleText("Kerala");
        WebElement DistrictofAdvocate = driver.findElement(By.xpath("//select[@id='DrpAdvDRTDistrict']"));
        Select DistrictofAdvocateSelect = new Select(DistrictofAdvocate);
        DistrictofAdvocateSelect.selectByVisibleText("Palakkad");
        WebElement clicksearchbutton = driver.findElement(By.xpath("//button[@id='BtnAdvIDDSearch']"));
        clicksearchbutton.click();

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='CheckDAdvt_1'])[1]"));
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        WebElement clickaddbutton3 = driver.findElement(By.xpath("//button[@id='BtnAdvctSave']"));
        clickaddbutton3.click();

       
        // Generating a random 50-digit diary number
        WebElement diarynoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDiaryNo']")));
        String generatedDiaryNumber = generateRandomNumericString(50);
        diarynoElement.sendKeys(generatedDiaryNumber);
        System.out.println("Generated Diary Number: " + generatedDiaryNumber);

        // Enter diary year
        WebElement diaryyear = driver.findElement(By.xpath("//select[@id='DrpDiaryYear']"));
        Select diaryyearSelect = new Select(diaryyear);
        diaryyearSelect.selectByVisibleText("2024");

        // Enter CNR No

        WebElement cNRNOElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTCNRNo']")));
        cNRNOElement.sendKeys(generateRandomCNRNumber());
        String generatedCNRNumber = generateRandomCNRNumber();
        System.out.println("Generated CNR Number: " + generatedCNRNumber);

        // Generating a random 50-digit case number
        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtCaseNo']"));
        String generatedCaseNumber = generateRandomNumericString(50);
        caseno.sendKeys(generatedCaseNumber);
        System.out.println("Generated Case Number: " + generatedCaseNumber);

        // Enter case year
        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpCaseYear']"));
        Select caseyearSelect = new Select(caseyear);
        caseyearSelect.selectByVisibleText("2024");

        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnDRTSave']"));
        clicksave.click();

        Thread.sleep(2000);

        WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        clickok.click();

        Thread.sleep(5000);
        
        boolean isSaved = false;

        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                WebElement clickok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
                clickok1.click();
                isSaved = true; // Mark as saved if successful
                break; // Exit loop if successful
            } catch (StaleElementReferenceException e) {
                // Retry locating and clicking the element
                Thread.sleep(1000); // Optional: wait before retrying
            }
        }

        // Print the appropriate message based on the result
        if (isSaved) {
            System.out.println("4) Successfully saved with maximum length");
        } else {
            System.out.println("4) Not saved with maximum length");
        }

	}

}
