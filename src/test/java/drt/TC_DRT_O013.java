package drt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import io.qameta.allure.Description;
import net.bytebuddy.utility.RandomString;

public class TC_DRT_O013 {
	
	public class drtcaseadd {
		
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
		    
		    
//
//		    @AfterClass
//		    public void tearDown() {
//		        if (driver != null) {
//		        	driver.close();
//
//		        }
//		    }
		    
		    
		    
		    String totalcourtfee = RandomString(15);
		    String refundcourtfee = RandomString(14);
		    String advocatename = RandomString1(50);
		    String dateoffilingCC = generateRandomDate();
		    String amountofcounterclaim = RandomString(15);
		    String totaladvocatefee = RandomString(15);
		    String advocatefeepaid = RandomString(14);
		    String clerkage = RandomString(15);
		    String intrestclaimed = generateRandomInterest(); 
		    String dateofhearing = generateRandomDate();
		    String purpose = RandomString1(20);
		    String notes = RandomString1(20);
		    String Description = RandomString1(10);
		    String dateoffilingIA = generateRandomDate();
		    String IAnumber = RandomString(30);
		    String fileby = RandomString1(95);
		    String purpose2 = RandomString1(10);
		    String dateoffiling4 = generateRandomDate();
		    String dateofdisposal = generateRandomDate();
		    String dateoffilingappeal = generateRandomDate();
		    String appealfiledby = RandomString1(10);
		    String appealno = RandomString(15);
		    String totaladvocatefee2 = RandomString(15);
		    String advocatefeepaid2 = RandomString(15);
		    String clerkagemiscfee = RandomString(15);
		    String opppartyadv = RandomString1(10);
		    String dateofdisposal3 = generateRandomDate();

		    @Test(priority=1)
		    public void testAdddrtcase() throws InterruptedException {
		        driver.get("https://safallitigation.onlinesafe.in/");

		        WebElement usernameField =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BU");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        WebElement LITIGATION = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Litigation']")));
		        js1.executeScript("arguments[0].click();", LITIGATION);
		        
		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        WebElement caselisting = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.alert'][normalize-space()='Litigation']")));		       
		        js2.executeScript("arguments[0].click();", caselisting);
		        
		        Select dropdown = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCListCaseTyp']"))));
		        dropdown.selectByVisibleText("DRT");

		        
		        JavascriptExecutor js3 = (JavascriptExecutor) driver;
		        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnCListSearch']")));		       
		        js3.executeScript("arguments[0].click();", clicksearch);
		        
		        Thread.sleep(2000);  //if working normally avoid this
		        		       
		        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		        WebElement uploadcasedetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[14]/a[1]/i[1]")));		        
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", uploadcasedetails);
		        js4.executeScript("arguments[0].click();", uploadcasedetails);
		        
		      
	            
	            //advocate and professional fee details (first part)
	            
		        WebElement tableElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='DivDRTCaseAdvocateHdn']"))); 		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", tableElement);
	            
		        WebElement totalcourtfee1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDTotalCourtFee']")));		       
		        totalcourtfee1.sendKeys(totalcourtfee);
		        WebElement refundElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDRefundCourtFee']")));		       
		        refundElement.sendKeys(refundcourtfee);
		        
		        WebElement advocatename1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDAdvctOppPart']")));		       
		        advocatename1.sendKeys(advocatename);
		        
		        JavascriptExecutor js5 = (JavascriptExecutor) driver;
		        WebElement clicksave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTCDAdvctSave']")));		       
		        js5.executeScript("arguments[0].click();", clicksave);
		        
		        Thread.sleep(2000);
		        
		        JavascriptExecutor js6 = (JavascriptExecutor) driver;
		        WebElement okElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js6.executeScript("arguments[0].click();", okElement);
		        
		        Thread.sleep(2000);
		        
		        JavascriptExecutor js7 = (JavascriptExecutor) driver;
		        WebElement okElementagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js7.executeScript("arguments[0].click();", okElementagain);
		        
		        //advocate add using + button
		        
		        
		        JavascriptExecutor js8 = (JavascriptExecutor) driver;
		        WebElement clickplusbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTCDAdvctDtls']")));		       
		        js8.executeScript("arguments[0].click();", clickplusbutton);
		        
		        WebElement State = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTADState']")));
		        Select StateSelect = new Select(State);
		        StateSelect.selectByVisibleText("Kerala");
		        
		        WebElement district = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTADDistrict']")));
		        Select districtSelect = new Select(district);
		        districtSelect.selectByVisibleText("Palakkad");
		        
		        WebElement advname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTCDAdvocateName']")));
		        Select advnameSelect = new Select(advname);
		        advnameSelect.selectByVisibleText("PRADEEP");
		        
		        WebElement totaladvfee = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDTtlAdvctFee']")));		       
		        totaladvfee.sendKeys(totaladvocatefee);
		        WebElement advfeepaid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDAdvctFeePaid']")));		       
		        advfeepaid.sendKeys(advocatefeepaid);
		        WebElement clerkage1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDClerkageFee']")));		       
		        clerkage1.sendKeys(clerkage);
		        
		        JavascriptExecutor js9 = (JavascriptExecutor) driver;
		        WebElement addElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnCDAdvctDtlsSave']")));		       
		        js9.executeScript("arguments[0].click();", addElement);
		        Thread.sleep(2000);
		        JavascriptExecutor js10 = (JavascriptExecutor) driver;
		        WebElement savElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js10.executeScript("arguments[0].click();", savElement);
		        Thread.sleep(2000);
		        JavascriptExecutor js101 = (JavascriptExecutor) driver;
		        WebElement okElement2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js101.executeScript("arguments[0].click();", okElement2);
		        
		        
		        //counter claim section
		        
		        WebElement tableElement1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='DVCounterClaim']"))); 		        
		        JavascriptExecutor js11 = (JavascriptExecutor) driver;
	            js11.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", tableElement1);
	            
	            WebElement dateoffiling = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtFilingCounterClaim']")));		       
	            dateoffiling.sendKeys(dateoffilingCC);
	            WebElement amountElementCC = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAmtCounterClaim']")));		       
	            amountElementCC.sendKeys(amountofcounterclaim);
	            
	            WebElement intrestclaimed1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCDInterestClaimed']")));		       
	            intrestclaimed1.sendKeys(intrestclaimed);
	            
	            WebElement intresttype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCDInterestTyp']")));
		        Select intresttypeSelect = new Select(intresttype);
		        intresttypeSelect.selectByVisibleText("Simple Interest");
		        
		        JavascriptExecutor js12 = (JavascriptExecutor) driver;
		        WebElement savElement2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTCDCounterClaimSave']")));		       
		        js12.executeScript("arguments[0].click();", savElement2);
		        Thread.sleep(2000);
		        JavascriptExecutor js13 = (JavascriptExecutor) driver;
		        WebElement savElement3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js13.executeScript("arguments[0].click();", savElement3);
		        Thread.sleep(2000);
		        JavascriptExecutor js14 = (JavascriptExecutor) driver;
		        WebElement okElement3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js14.executeScript("arguments[0].click();", okElement3);
		        
		        //court proceedings
		        
		        WebElement tableElement2 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='DivDRTCaseCourtProceedHdn']"))); 		        
		        JavascriptExecutor js111 = (JavascriptExecutor) driver;
	            js111.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", tableElement2);
	            JavascriptExecutor js15 = (JavascriptExecutor) driver;
		        WebElement clickplusElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTCDCourtProceed']")));		       
		        js15.executeScript("arguments[0].click();", clickplusElement);
		        WebElement stage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCPStage']")));
		        Select stageSelect = new Select(stage);
		        stageSelect.selectByVisibleText("Hearing");
		        WebElement dateofhearing1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCPHearingDate']")));		       
		        dateofhearing1.sendKeys("18-08-2024");
		        WebElement purpose1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtCPPurpose']")));		       
		        purpose1.sendKeys(purpose);
		        WebElement notes1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtCPNotes']")));		       
		        notes1.sendKeys(notes);
		        
		        JavascriptExecutor js121 = (JavascriptExecutor) driver;
		        WebElement savElement4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnCPSave']")));		       
		        js121.executeScript("arguments[0].click();", savElement4);
		        Thread.sleep(2000);
		        JavascriptExecutor js131 = (JavascriptExecutor) driver;
		        WebElement savElement5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js131.executeScript("arguments[0].click();", savElement5);
		        Thread.sleep(2000);
		        JavascriptExecutor js141 = (JavascriptExecutor) driver;
		        WebElement okElement4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js141.executeScript("arguments[0].click();", okElement4);
		        
		        
		        //upload documents
		        
		        WebElement tableElement3 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='DivDRTCaseDocumentHdn']"))); 		        
		        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	            js1111.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", tableElement3);
		        WebElement doctype1 = driver.findElement(By.xpath("//select[@id='DrpDocumentTyp']"));
		        Select doctypeSelect1 = new Select(doctype1);
		        doctypeSelect1.selectByVisibleText("PDF");
		        
		        WebElement uploadfile1 = driver.findElement(By.xpath("//input[@id='UploadDRTFile']"));
		        String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
		        uploadfile1.sendKeys(filePath);
		        WebElement desc = driver.findElement(By.xpath("//textarea[@id='TxtDRTDescription']"));
		        desc.sendKeys("document");
				           
		        WebElement clickupload = driver.findElement(By.xpath("//button[@id='BtnDocUpload']"));
		        clickupload.click();
		        Thread.sleep(1000);
		        WebElement save4 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		        save4.click();
		        Thread.sleep(1000);
		  	      
		        WebElement ok4 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
		  	      ok4.click();
		        
		        
//		        details of interim 
		        
		        
		        WebElement tableElement31 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='DivDRTCaseIAHdn']"))); 		        
		        JavascriptExecutor js11111 = (JavascriptExecutor) driver;
	            js11111.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", tableElement31);
	            
	            JavascriptExecutor js1411 = (JavascriptExecutor) driver;
		        WebElement cliclplusElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTCDInterimApp']")));		       
		        js1411.executeScript("arguments[0].click();", cliclplusElement);
		        
		        WebElement dateoffilingia = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtIADate']")));		       
		        dateoffilingia.sendKeys(dateoffilingIA);
		        
		        WebElement iAnoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtIANo']")));		       
		        iAnoElement.sendKeys(IAnumber);
		        
		        WebElement iayearElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpIAYear']")));
		        Select iayearElementSelect = new Select(iayearElement);
		        iayearElementSelect.selectByVisibleText("2024");
		        
		        WebElement filebyElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtFileBy']")));		       
		        filebyElement.sendKeys(fileby);
		        
		        WebElement purpose2eElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtCDPurpose']")));		       
		        purpose2eElement.sendKeys(purpose2);
		        
		        WebElement dateoffilingElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCounterRply']")));		       
		        dateoffilingElement1.sendKeys(dateoffiling4);
		        
		        WebElement dateofdisposalElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDisposalIA']")));		       
		        dateofdisposalElement.sendKeys(dateofdisposal);
		        
		        WebElement whetheranyElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterAppealIA']")));
		        Select whetheranyElementSelect = new Select(whetheranyElement);
		        whetheranyElementSelect.selectByVisibleText("Yes");
		        
		        WebElement dateoffilingappealElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterFilingAppealDate']")));		       
		        dateoffilingappealElement.sendKeys(dateoffilingappeal);
		        
		        WebElement appealfiledbyElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtDRTInterAppealFiledBy']")));		       
		        appealfiledbyElement.sendKeys(appealfiledby);
		        
		        WebElement AppellateCourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterAppellateCourt']")));
		        Select AppellateCourtSelect = new Select(AppellateCourt);
		        AppellateCourtSelect.selectByVisibleText("DRT");
		        
		        WebElement bench = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterBench']")));
		        Select benchSelect = new Select(bench);
		        benchSelect.selectByVisibleText("AHMEDABAD2");
		        
		        WebElement casetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterCaseType']")));
		        Select casetypeSelect = new Select(casetype);
		        casetypeSelect.selectByVisibleText("Original Application (OA)");
		        
		        WebElement appealno1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterAppealNo']")));		       
		        appealno1.sendKeys(appealno);
		        
		        WebElement appealyear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterAppealYear']")));
		        Select appealyearSelect = new Select(appealyear);
		        appealyearSelect.selectByVisibleText("2024");
		        
		        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterState']")));
		        Select stateSelect = new Select(state);
		        stateSelect.selectByVisibleText("Kerala");
		        
		        WebElement district1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterDistrict']")));
		        Select district1Select = new Select(district1);
		        district1Select.selectByVisibleText("Palakkad");
		        
		        WebElement advocatename = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpDRTInterAdvocateName']")));
		        Select advocatenameSelect = new Select(advocatename);
		        advocatenameSelect.selectByVisibleText("PRADEEP");
		        
		        WebElement totaladvocatefee1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterTtlAdvctFee']")));		       
		        totaladvocatefee1.sendKeys(totaladvocatefee2);
		        
		        WebElement advocatefeepaid1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterAdvctFeePaid']")));		       
		        advocatefeepaid1.sendKeys(advocatefeepaid2);
		        
		        WebElement clerkagemiscfee1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterClerkageFee']")));		       
		        clerkagemiscfee1.sendKeys(clerkagemiscfee);
		        
		        WebElement opppartyadvElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterOppPartyAdvocat']")));		       
		        opppartyadvElement.sendKeys(opppartyadv);
		        
		        WebElement dateofdisposalElement2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTInterDatedisposalAppeal']")));		       
		        dateofdisposalElement2.sendKeys(dateofdisposal3);
		        
		       
		        JavascriptExecutor js12111 = (JavascriptExecutor) driver;
		        WebElement savElement41 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnInterimAppDtlsSave']")));		       
		        js12111.executeScript("arguments[0].click();", savElement41);
		        Thread.sleep(2000);
		        JavascriptExecutor js13111 = (JavascriptExecutor) driver;
		        WebElement savElement5111 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js13111.executeScript("arguments[0].click();", savElement5111);
		        Thread.sleep(2000);
		        JavascriptExecutor js131111 = (JavascriptExecutor) driver;
		        WebElement savElement51111 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));		       
		        js131111.executeScript("arguments[0].click();", savElement51111);
		        
		        // ANSI escape code for green text
		        String greenColor = "\u001B[32m";
		        // ANSI escape code to reset the color to default
		        String resetColor = "\u001B[0m";

		        System.out.println(greenColor + "litigatiion part done successfully " + resetColor);
		       
}

			private String RandomString(int length) {
				
				return RandomStringUtils.randomNumeric(length);
			}
		    private String RandomString1(int length) {
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
			    }}
