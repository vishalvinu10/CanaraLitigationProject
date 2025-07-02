package nclt;

import java.awt.Window;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.hssf.record.ScenarioProtectRecord;
import org.apache.poi.hssf.record.cf.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.devtools.v127.page.model.LifecycleEvent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Admissionorderclaimdetails {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Set implicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    String IRPIBBIelement = RandomString(40);
    String amountclaimedbybankelement = randomnumeric(15);
    String amountclaimedrejectedelement = randomnumeric(15);
    String ClaimAdmitted = randomnumeric(15);
    String ClaimUnderVerification = randomnumeric(15);
    String votingpercentage = generateRandomInterest();
    
    String data = randomnumeric(15);
    String ClaimUnderVerificationtwo = randomnumeric(15);
    String votingpercentagetwo = generateRandomInterest();
    
    
    String datatwo = randomnumeric(15);
    String ClaimUnderVerificationthree = randomnumeric(15);
    String votingpercentagethree = generateRandomInterest();
    
    String datathree = randomnumeric(15);
    String ClaimUnderVerificationfour = randomnumeric(15);
    String votingpercentagefour = generateRandomInterest();
    
    

    @Test
    public void admission() throws InterruptedException {
        driver.get("http://192.168.0.137:8955/");

        // Wait for username field to be visible and then enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("BU");

        // Wait for sign in button to be clickable and then click
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        // Wait for litigation link to be clickable and then click using JavaScript
        WebElement clickLitigation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='waves-effect waves-dark'])[15]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickLitigation);

        // Wait for litigation element to be clickable and then click
        WebElement clickLitigationElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/CaseMasterSetting/CaseListing']")));
        clickLitigationElement.click();
       
        WebElement natureofcase =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCListCaseTyp']")));
		 Select natureofcaseSelect = new Select(natureofcase);
		 natureofcaseSelect.selectByVisibleText("NCLT");
		 
		 WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnCListSearch']")));
		 clicksearch.click();

//		 
//		 WebElement element = driver.findElement(By.xpath("//td[normalize-space()='1']"));
//		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 
		 Thread.sleep(2000);


        // Wait for upload case details to be clickable, scroll into view, and then click
        WebElement uploadCaseDetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[14]/a[1]/i[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", uploadCaseDetails);
        
        Thread.sleep(2000);
        
        uploadCaseDetails.click();
        
        String originalWindow = driver.getWindowHandle();

        WebElement admissionOrderLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admission Order and claim details")));
        admissionOrderLink.click();

     // Wait for the new window to open and switch to it
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

    
//        WebElement elementInSecondWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtAOAdmissionDate']")));
//        elementInSecondWindow.click();
//        elementInSecondWindow.sendKeys("20-10-2024");
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date today = new Date();
        String formattedDate = formatter.format(today);

        // Find the date input field
        WebElement DateofAdmission = driver.findElement(By.xpath("//input[@id='TxtAOAdmissionDate']")); 
        DateofAdmission.clear();
        DateofAdmission.sendKeys(formattedDate);
        
        WebElement LastDateofCIRP = driver.findElement(By.xpath("//input[@id='TxtAOCIRPDate']"));
        LastDateofCIRP.clear();
        LastDateofCIRP.sendKeys(formattedDate);
        
        WebElement nameofirp = driver.findElement(By.id("TxtIRPDtls"));
        nameofirp.sendKeys("An Individual Retirement Plan is a retirement savings account that allows individuals to save for their retirement. "
        		+ "IRPs offer various investment options such as stocks, bonds, and mutual funds. The contributions made to an IRP are often tax-deductible, and "
        		+ "the earnings on the investments grow tax-deferred. This means that you only pay taxes when you withdraw the money during retirement. IRPs provide a "
        		+ "flexible way to save for retirement, allowing you to choose your investment strategy and manag");
        
        WebElement IRPIBBI = driver.findElement(By.id("TxtAOIRPIBBIRegNo"));
        IRPIBBI.clear();
        IRPIBBI.sendKeys(IRPIBBIelement);
        
        WebElement dateofpublcannouncemet = driver.findElement(By.id("TxtAOPublicAnnouncementDate"));
        dateofpublcannouncemet.clear();
        dateofpublcannouncemet.sendKeys(formattedDate);
        
        WebElement dateoffilingclaim= driver.findElement(By.id("TxtAOFilingClaimDate"));
        dateoffilingclaim.clear();
        dateoffilingclaim.sendKeys(formattedDate);
        
        WebElement amountclaimedbybank = driver.findElement(By.id("TxtAOAmtClaimed"));
        amountclaimedbybank.clear();
        amountclaimedbybank.sendKeys(amountclaimedbybankelement);
        
        WebElement amountclaimedrejected = driver.findElement(By.id("TxtAOAmtClaimReject"));
        amountclaimedbybank.clear();
        amountclaimedrejected.sendKeys(amountclaimedrejectedelement);
        
        WebElement reasonsforrejectionElement = driver.findElement(By.id("TxtRejectionRsn"));
        reasonsforrejectionElement.sendKeys("The candidate was not selected due to a lack of relevant experience in the required "
        		+ "skillset and insufficient knowledge of the company's products and services. Additionally, the candidate's communication skills were deemed"
        		+ " inadequate for effective collaboration with the team.The candidate was not selected due to a lack of relevant experience in the "
        		+ "required skillset and insufficient knowledge of the company's products and services. Additionally, the candidate's communication skills were deemed i");
        
        WebElement cocformationdatElement = driver.findElement(By.id("TxtAOCoC"));
        cocformationdatElement.clear();
        cocformationdatElement.sendKeys(formattedDate);
        
        //file upload
        
     
        WebElement fileInput = driver.findElement(By.id("UploadAOFile")); 

        String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\FILE UPLOAD\\10MB1.pdf"; 

        fileInput.sendKeys(filePath);
        
        
        WebElement clickplusbutton = driver.findElement(By.id("BtnAOCreditorMember"));
        clickplusbutton.click();
        
//         Scenario 1 ( click the add button and check if it adds without entering anything.)
        
        WebElement clickElementaddElement = driver.findElement(By.id("BtnAOCreditorSave"));
        clickElementaddElement.click(); 
        

        try {
        	// Check if the modal is present using expected conditions
        	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-body']"))); 
        	System.out.println("Passed: Its not getting saved without entering any data in the fields");
        } catch (TimeoutException e) {
        	System.out.println("Failed: Its getting saved after clicking add button");
        	
        }
        	
        	Thread.sleep(2000);
        	
//        	WebElement closebutton = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
//        	closebutton.click();
        	
        	
//          Scenario 2 ( enter only mandatory fields and save)
        	
//        	clickElementaddElement.click(); 
        	WebElement nameField = driver.findElement(By.id("TxtAOCreditorName")); // Replace with appropriate locator

            // Generate random name with spaces after every 5 letters
            String randomName = generateRandomName(50);

            // Send the generated name to the name field
            nameField.sendKeys(randomName);            
            
            clickElementaddElement.click(); 
            
//      	 Scenario 3 ( enter all fields with maxlength and check if it is saving)
            
            
            
            clickplusbutton.click();
            
            WebElement nameField1 = driver.findElement(By.id("TxtAOCreditorName"));
            String randomName1 = generateRandomName(50);
            nameField1.sendKeys(randomName1);
            
            
            WebElement ClaimAdmitted1 = driver.findElement(By.id("TxtAOCreditorClaimAdmit"));
            ClaimAdmitted1.clear();
            ClaimAdmitted1.sendKeys(ClaimAdmitted);
            
            WebElement ClaimUnderVerification1 = driver.findElement(By.id("TxtAOCreditorClaimVerify"));
            ClaimUnderVerification1.sendKeys(ClaimUnderVerification);
            
            WebElement votigElement = driver.findElement(By.id("TxtAOCreditorVoting"));
            votigElement.sendKeys(votingpercentage);
            
            clickElementaddElement.click();
            
//            data 3
            
            clickplusbutton.click();
            
            WebElement nameField2 = driver.findElement(By.id("TxtAOCreditorName"));
            String randomName2 = generateRandomName(50);
            nameField2.sendKeys(randomName2);
            
            WebElement data1 = driver.findElement(By.id("TxtAOCreditorClaimAdmit"));
            data1.sendKeys(data);
            
            WebElement ClaimUnderVerification2 = driver.findElement(By.id("TxtAOCreditorClaimVerify"));
            ClaimUnderVerification2.sendKeys(ClaimUnderVerificationtwo);
            
            WebElement votigElement1 = driver.findElement(By.id("TxtAOCreditorVoting"));
            votigElement1.sendKeys(votingpercentagetwo);
            
            clickElementaddElement.click();
            
//            data 4
            
            clickplusbutton.click();
            
            WebElement nameField3 = driver.findElement(By.id("TxtAOCreditorName"));
            String randomName3 = generateRandomName(50);
            nameField3.sendKeys(randomName3);
            
            WebElement data2 = driver.findElement(By.id("TxtAOCreditorClaimAdmit"));
            data2.sendKeys(datatwo);
            
            WebElement ClaimUnderVerification3 = driver.findElement(By.id("TxtAOCreditorClaimVerify"));
            ClaimUnderVerification3.sendKeys(ClaimUnderVerificationthree);
            
            WebElement votigElement2 = driver.findElement(By.id("TxtAOCreditorVoting"));
            votigElement2.sendKeys(votingpercentagethree);
            
            clickElementaddElement.click();
            
//          data 5
            
          clickplusbutton.click();
          
          WebElement nameField4 = driver.findElement(By.id("TxtAOCreditorName"));
          String randomName4 = generateRandomName(50);
          nameField4.sendKeys(randomName4);
          
          WebElement data3 = driver.findElement(By.id("TxtAOCreditorClaimAdmit"));
          data3.sendKeys(datathree);
          
          WebElement ClaimUnderVerification4 = driver.findElement(By.id("TxtAOCreditorClaimVerify"));
          ClaimUnderVerification4.sendKeys(ClaimUnderVerificationfour);
          
          WebElement votigElement3 = driver.findElement(By.id("TxtAOCreditorVoting"));
          votigElement3.sendKeys(votingpercentagefour);
          
          clickElementaddElement.click();
          
          
          WebElement savelinkElement =  wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnAOSave")));
          savelinkElement.click();
          
          Thread.sleep(2000);
          
          WebElement savElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
          savElement.click();
          
          WebElement okElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
          okElement.click();
            
      	
        	
}
    
    @Test
    
    public void BMapprovals() throws InterruptedException {
        driver.get("http://192.168.0.137:8955/");

        // Wait for username field to be visible and then enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("BM");

        // Wait for sign in button to be clickable and then click
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        // Wait for litigation link to be clickable and then click using JavaScript
        WebElement clickApprovals = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickApprovals);

        // Wait for litigation element to be clickable and then click
        WebElement clickapproval = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approval']")));
        clickapproval.click();
       
        WebElement natureofcase =  wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpApprvCaseTyp")));
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText("NCLT");
		 
        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnApprvSearch")));
        clicksearch.click();
        
        Thread.sleep(2000);
        
        WebElement clickeyElement = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//i[@id='BtnSelectApprovl'])[1]"))));
        clickeyElement.click();
        
        Thread.sleep(2000);
        
        
        JavascriptExecutor clickadmission = (JavascriptExecutor) driver;
        WebElement scrolltoadmissionorder = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admission Order and claim details")));
        clickadmission.executeScript("arguments[0].click();", scrolltoadmissionorder);
        
        
        String originalWindow = driver.getWindowHandle();


     // Wait for the new window to open and switch to it
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        
         Thread.sleep(2000);

        
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000);");
            
            
//            scenario 4 - (check if pb and approve button is visible)
            
            
            
            WebElement approvebutton = driver.findElement(By.id("BtnAOApprove"));
            WebElement pushbackbutton = driver.findElement(By.id("BtnAORevert"));
            
         // Check if both elements are visible
            if (approvebutton.isDisplayed() && pushbackbutton.isDisplayed()) {
                System.out.println("BM-approve and pushback buttons are visible");
            }
            
            
        
        
    }  
    
    @Test
    
    public void ROapprovals() throws InterruptedException {
        driver.get("http://192.168.0.137:8955/");

        // Wait for username field to be visible and then enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("RO");

        // Wait for sign in button to be clickable and then click
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        // Wait for litigation link to be clickable and then click using JavaScript
        WebElement clickApprovals = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickApprovals);

        // Wait for litigation element to be clickable and then click
        WebElement clickapproval = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approval']")));
        clickapproval.click();
       
        WebElement natureofcase =  wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpApprvCaseTyp")));
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText("NCLT");
		 
        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnApprvSearch")));
        clicksearch.click();
        
        Thread.sleep(2000);
        
        WebElement clickeyElement = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//i[@id='BtnSelectApprovl'])[1]"))));
        clickeyElement.click();
        
        Thread.sleep(2000);
        
        
        JavascriptExecutor clickadmission = (JavascriptExecutor) driver;
        WebElement scrolltoadmissionorder = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admission Order and claim details")));
        clickadmission.executeScript("arguments[0].click();", scrolltoadmissionorder);
        
        
        
        String originalWindow = driver.getWindowHandle();

      

     // Wait for the new window to open and switch to it
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
         Thread.sleep(2000);

        
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000);");
            
            
//            scenario 4 - (check if pb and approve button is visible)
            
            
            
            WebElement approvebutton = driver.findElement(By.id("BtnAOApprove"));
            WebElement pushbackbutton = driver.findElement(By.id("BtnAORevert"));
            
         // Check if both elements are visible
            if (approvebutton.isDisplayed() && pushbackbutton.isDisplayed()) {
                System.out.println("RO - approve and pushback buttons are visible");
            }
    
        
        
    }  
    
    @Test
  
    public void COapprovals() throws InterruptedException {
        driver.get("http://192.168.0.137:8955/");

        // Wait for username field to be visible and then enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("CO");

        // Wait for sign in button to be clickable and then click
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        // Wait for litigation link to be clickable and then click using JavaScript
        WebElement clickApprovals = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickApprovals);

        // Wait for litigation element to be clickable and then click
        WebElement clickapproval = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approval']")));
        clickapproval.click();
       
        WebElement natureofcase =  wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpApprvCaseTyp")));
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText("NCLT");
		 
        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnApprvSearch")));
        clicksearch.click();
        
        Thread.sleep(2000);
        
        WebElement clickeyElement = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//i[@id='BtnSelectApprovl'])[1]"))));
        clickeyElement.click();
        
        Thread.sleep(2000);
        
        
        JavascriptExecutor clickadmission = (JavascriptExecutor) driver;
        WebElement scrolltoadmissionorder = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admission Order and claim details")));
        clickadmission.executeScript("arguments[0].click();", scrolltoadmissionorder);
        
        
        String originalWindow = driver.getWindowHandle();

      

     // Wait for the new window to open and switch to it
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
         Thread.sleep(2000);

        
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000);");
            
            
//            scenario 4 - (check if pb and approve button is visible)
            
            
            
            WebElement approvebutton = driver.findElement(By.id("BtnAOApprove"));
            WebElement pushbackbutton = driver.findElement(By.id("BtnAORevert"));
            
         // Check if both elements are visible
            if (approvebutton.isDisplayed() && pushbackbutton.isDisplayed()) {
                System.out.println("cO - approve and pushback buttons are visible");
            }
            
    }
    
    
    
        
        
    
        
        
        private String RandomString(int length) {
			
			return RandomStringUtils.randomAlphanumeric(length);
		}
        
        
        private String randomnumeric(int length) {
			
			return RandomStringUtils.randomNumeric(length);
		}
        
        public static String generateRandomName(int maxLength) {
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < maxLength; i++) {
                char randomChar = alphabet.charAt(random.nextInt(alphabet.length()));
                sb.append(randomChar);

                if (i % 5 == 4 && i != maxLength - 1) {
                    sb.append(" "); // Add a space after every 5 letters
                }
            }

            return sb.toString();
        }
//		
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