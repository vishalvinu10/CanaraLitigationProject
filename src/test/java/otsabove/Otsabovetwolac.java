package otsabove;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Otsabovetwolac {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private static final String SCROLL_SCRIPT = "arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});";

	@BeforeClass
	public void setUp() {

		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
	

	@Test(priority=1)
	public void OTSabovetwolacs() throws InterruptedException, IOException {
		


		 driver.get("https://safallitigation.onlinesafe.in/");

		 WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	        signInButton.click();

	        WebElement clickots = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]/span[2]")));
	        clickots.click();

	        WebElement otsabove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/ul[1]/li[1]/a[1]/span[2]")));
	        otsabove.click();

	        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='BtnOTSCustSelect fa fa-eye']")));
	        clickeyebutton.click();
//	        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")));
//	        clickeyebutton.click();
	 	
		
		
		WebElement nameofthegroup = driver.findElement(By.xpath("//input[@id='TxtOTSGroupName']"));
		nameofthegroup.sendKeys("TEST");
		
		WebElement originalbranch = driver.findElement(By.xpath("//input[@id='TxtOTSOriginalBranch']"));
		originalbranch.sendKeys("palakkad");
		
		WebElement dateofestablishment = driver.findElement(By.xpath("//input[@id='TxtOTSEstablishmentDate']"));
		dateofestablishment.sendKeys("01-07-2024");
		
		WebElement lineofactivity = driver.findElement(By.xpath("//input[@id='TxtOTSActivityLine']"));
		lineofactivity.sendKeys("TEST");
		
		WebElement locationofbusiness = driver.findElement(By.xpath("//input[@id='TxtOTSLocation']"));
		locationofbusiness.sendKeys("palakkad");
		
		WebElement purppose = driver.findElement(By.xpath("//input[@id='TxtOTSCreditFacilityPurpose']"));
		purppose.sendKeys("TEST");
		
		WebElement dateoffirstsanction = driver.findElement(By.xpath("//input[@id='TxtOTSFtSanctnDate']"));
		dateoffirstsanction.sendKeys("29-07-2024");
		
		WebElement authorityoffirstsanction = driver.findElement(By.xpath("//select[@id='DrpOTSFtSanctnAty']"));
	    Select authorityoffirstsanctionSelect = new Select(authorityoffirstsanction);
	    authorityoffirstsanctionSelect.selectByVisibleText("Branch in charge");
	    
	    WebElement dateoflastrenewal = driver.findElement(By.xpath("//input[@id='TxtOTSLastRenewalDate']"));
	    dateoflastrenewal.sendKeys("29-07-2024");
	    
	    WebElement authorityoflastrenewal = driver.findElement(By.xpath("//select[@id='DrpOTSLastRenewalAty']"));
	    Select authorityoflastrenewalSelect = new Select(authorityoflastrenewal);
	    authorityoflastrenewalSelect.selectByVisibleText("Branch in charge");
	    
	    
	    WebElement bankingarrangements = driver.findElement(By.xpath("//input[@id='TxtOTSBankArrangement']"));
	    bankingarrangements.sendKeys("ARRANGED");
	    
	    WebElement namofmember = driver.findElement(By.xpath("//input[@id='TxtOTSMemberName']"));
	    namofmember.sendKeys("david");
	    
	    WebElement share = driver.findElement(By.xpath("//input[@id='TxtOTSShare']"));
	    share.sendKeys("20");
	    
	    WebElement yearofdoubtful = driver.findElement(By.xpath("//input[@id='TxtOTSDoubtfulYear']"));
	    yearofdoubtful.sendKeys("2024");
	    
	    WebElement lossliability = driver.findElement(By.xpath("//input[@id='TxtOTSNPALossLiability']"));
	    lossliability.sendKeys("54654756756");
	    
	    WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtOTSRBIDate']"));
	    dateofreporting.sendKeys("29-07-2024");
	    
	    //draft section to be 
	    
	   
	    WebElement clicknext = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/button[1]")));
	    clicknext.click();
	    

 	   JavascriptExecutor js6 = (JavascriptExecutor) driver;
	    js6.executeScript("window.scrollBy(0,-2000)");
	    
	    //OTS details 2nd page
	    
	    
	    WebElement suitexpenses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")));
	    suitexpenses.sendKeys("100000");
	    WebElement unappliedintrestmclr = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
	    unappliedintrestmclr.sendKeys("50000");
	    WebElement unappliedintrestdecree = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]"));
	    unappliedintrestdecree.sendKeys("50000");
	    WebElement provision = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]"));
	    provision.sendKeys("50000");
	    WebElement otsamtoffered = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]"));
	    otsamtoffered.sendKeys("50000");
	    
	    
	    
	  //draft section to be 
	    
	    WebElement clicknext1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSNextto3']")));
	    clicknext1.click();
	    
	   
	    
	    //present proposal page 3
	    
	    WebElement amountfield =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAcceptRs']")));
	    amountfield.sendKeys("50000");
	    WebElement amountfield1 = driver.findElement(By.xpath("//input[@id='TxtOTSPayableRs1']"));
	    amountfield1.sendKeys("50000");
	    WebElement amountfield2 = driver.findElement(By.xpath("//input[@id='TxtOTSPayableRs2']"));
	    amountfield2.sendKeys("50000");
	    WebElement amountfield3 = driver.findElement(By.xpath("//input[@id='TxtOTSPayableRs3']"));
	    amountfield3.sendKeys("50000");
	    WebElement waveunapplied = driver.findElement(By.xpath("//input[@id='TxtOTSWaiveRs']"));
	    waveunapplied.sendKeys("34544");
	    WebElement mclr = driver.findElement(By.xpath("//input[@id='TxtOTSMCLR1']"));
	    mclr.sendKeys("21");
	    WebElement date1 = driver.findElement(By.xpath("//input[@id='TxtOTSSimpleFrom']"));
	    date1.sendKeys("27-07-2024");
	    WebElement date2 = driver.findElement(By.xpath("//input[@id='TxtOTSMCLR2']"));
	    date2.sendKeys("29-07-2024");
	    WebElement date3 = driver.findElement(By.xpath("//input[@id='TxtOTSMCLR3']"));
	    date3.sendKeys("29-07-2024");
	    WebElement textfield1 = driver.findElement(By.xpath("//textarea[@id='TxtOTSUAI']"));
	    textfield1.sendKeys("fdrgerher");
	    WebElement textfield2 = driver.findElement(By.xpath("//textarea[@id='TxtOTSOtherClauses']"));
	    textfield2.sendKeys("cdhtrrrjy");
	    WebElement textfield3 = driver.findElement(By.xpath("//textarea[@id='TxtOTSCompliance']"));
	    textfield3.sendKeys("ifewiyfiuey");
	    
	    WebElement NotionalUnappliedinterest = driver.findElement(By.xpath("//input[@id='TxtOTSUnapplied']"));
	    NotionalUnappliedinterest.sendKeys("23");
	    
	    
	    //draft section is here
	    
	    WebElement clicknext2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[8]/div[1]/div[1]/button[1]")));
	    clicknext2.click();
	    
	   
	    
	    //compromise policy page 4
	    
	    WebElement comptomisepolicy =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSCompromisePolicy']")));
        Select comptomisepolicySelect = new Select(comptomisepolicy);
        comptomisepolicySelect.selectByVisibleText("Yes");
        
        WebElement cutoffdate = driver.findElement(By.xpath("//input[@id='TxtOTSCutoffDate']"));
        cutoffdate.sendKeys("29-07-2024");
        WebElement rateofintrest = driver.findElement(By.xpath("//input[@id='TxtOTSIntrstRateCutoffDate']"));
        rateofintrest.sendKeys("21");
        WebElement yield = driver.findElement(By.xpath("//input[@id='TxtOTSYield']"));
        yield.sendKeys("21");
        WebElement textfield = driver.findElement(By.xpath("//textarea[@id='TxtOTSJustification']"));
        textfield.sendKeys("frherhrw");
        WebElement amountpayable = driver.findElement(By.xpath("//input[@id='TxtOTSComprmspolicyAmt']"));
        amountpayable.sendKeys("200000");
        
        //draft part is here
        
        
        WebElement clicknext3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/button[1]")));
	    clicknext3.click();
	    
	    //Proprietor/partners
	    
	    //namesoftheProprietors
	    
	    
	    WebElement clickplus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSPartners']")));
	    clickplus.click();
	    
	    WebElement type = driver.findElement(By.xpath("//select[@id='DrpOTSPartnerType']"));
        Select typeSelect = new Select(type);
        typeSelect.selectByVisibleText("Borrower");
        
        // Select account number with fallback
        

        
        // Wait until the dropdown element is clickable
	    WebElement dropdownElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpOTSPartnerAcNo")));

	    // Create an instance of the Select class
	    Select dropdown1 = new Select(dropdownElement1);

	    // Get all options in the dropdown
	    List<WebElement> allOptions1 = dropdown1.getOptions();

	    // Remove the first option if it is "Select"
	    if (allOptions1.size() > 0 && allOptions1.get(0).getText().equalsIgnoreCase("Select")) {
	        allOptions1.remove(0);
	    }

	    // Ensure there are remaining options to select from
	    if (allOptions1.size() > 0) {
	        // Choose a random option (excluding the "Select" option)
	        Random random1 = new Random();
	        int randomIndex1 = random1.nextInt(allOptions1.size());

	        // Select the chosen option
	        dropdown1.selectByIndex(randomIndex1 + 1); // +1 to adjust for removed "Select" option

	        // Log the selected option (for debugging purposes)
	        System.out.println("Selected option: " + allOptions1.get(randomIndex1).getText());
	    } else {
	        System.out.println("No options available in the dropdown.");
	    }

   
        WebElement name = driver.findElement(By.xpath("//input[@id='TxtOTSPropBorrowerName']"));
        name.sendKeys("prithviraj");
        
        WebElement networthgrant = driver.findElement(By.xpath("//input[@id='TxtOTSPropNetWorthGrant']"));
        networthgrant.sendKeys("200000");
        WebElement networthpresent= driver.findElement(By.xpath("//input[@id='TxtOTSPropNetWorthPresent']"));
        networthpresent.sendKeys("300000");
        WebElement factofcase= driver.findElement(By.xpath("//textarea[@id='TxtOTSNetworthVariatn']"));
        factofcase.sendKeys("test");
        
        WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSPartnersSave']")));
        add.click();
        
        //details of other assets
        
        WebElement clickplus1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSAssets']")));
	    clickplus1.click();
	    

	    
	    
	    // Locate the dropdown element
	    

	 // Wait until the dropdown element is clickable
	    WebElement dropdownElement11 = wait.until(ExpectedConditions.elementToBeClickable(By.id("DrpOTSAssetAcNo")));

	    // Create an instance of the Select class
	    Select dropdown11 = new Select(dropdownElement11);

	    // Get all options in the dropdown
	    List<WebElement> allOptions11 = dropdown11.getOptions();

	    // Remove the first option if it is "Select"
	    if (allOptions11.size() > 0 && allOptions11.get(0).getText().equalsIgnoreCase("Select")) {
	        allOptions11.remove(0);
	    }

	    // Ensure there are remaining options to select from
	    if (allOptions11.size() > 0) {
	        // Choose a random option (excluding the "Select" option)
	        Random random1 = new Random();
	        int randomIndex1 = random1.nextInt(allOptions11.size());

	        // Select the chosen option
	        dropdown11.selectByIndex(randomIndex1 + 1); // +1 to adjust for removed "Select" option

	        // Log the selected option (for debugging purposes)
	        System.out.println("Selected option: " + allOptions11.get(randomIndex1).getText());
	    } else {
	        System.out.println("No options available in the dropdown.");
	    }

	    

        WebElement type1 = driver.findElement(By.xpath("//select[@id='DrpOTSAssetPartnerType']"));
        Select type1Select = new Select(type1);
        type1Select.selectByVisibleText("Borrower");
        WebElement nameoftheborrower= driver.findElement(By.xpath("//input[@id='TxtOTSBorrowerName']"));
        nameoftheborrower.sendKeys("test");
        WebElement natureofasset= driver.findElement(By.xpath("//input[@id='TxtOTSAssetNatureGrant']"));
        natureofasset.sendKeys("test");
        WebElement valueatthetimeofgrant= driver.findElement(By.xpath("//input[@id='TxtOTSGrantValue']"));
        valueatthetimeofgrant.sendKeys("100000");
        WebElement natureatpresent= driver.findElement(By.xpath("//input[@id='TxtOTSAssetNaturePresent']"));
        natureatpresent.sendKeys("100000");
        WebElement valueatpresent= driver.findElement(By.xpath("//input[@id='TxtOTSPresentValue']"));
        valueatpresent.sendKeys("100000");
        WebElement encumbarance= driver.findElement(By.xpath("//input[@id='TxtOTSEncumbrance']"));
        encumbarance.sendKeys("100000");
        
        
        
        WebElement clickadd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]")));
        clickadd.click();
        
        
        
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,2000)");
        
        //draft code is here
        
        WebElement clicknext4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[3]/div[1]/div[1]/button[1]")));
	    clicknext4.click();

	   //credit facilities page 6
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-1000)");
	    
	    //particulars of credit facilitis
	    WebElement natureoflimit= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")));
	    natureoflimit.sendKeys("100000");
	    WebElement limitamt= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
	    limitamt.sendKeys("100000");
	    WebElement dateofloan= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
	    dateofloan.sendKeys("30-07-2024");
	    
	    
	    WebElement dateofclassifieing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")));
	    ((JavascriptExecutor) driver).executeScript(SCROLL_SCRIPT, dateofclassifieing);
	    dateofclassifieing.sendKeys("30-07-2024");
	    WebElement amountoutstanding= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/input[1]"));
	    amountoutstanding.sendKeys("300000");
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,1000)");
	    
	    
	    //details of recovery..
	    
	    WebElement recovorytill=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")));
	    recovorytill.sendKeys("4545654");
	    WebElement recovoryafter= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
	    recovoryafter.sendKeys("435354");
	    WebElement totalrecovery= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
	    totalrecovery.sendKeys("43344");
	    WebElement dateoflastpayment= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]"));
	    dateoflastpayment.sendKeys("30-07-2024");
	    WebElement amtoflastpayment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]")));
	    ((JavascriptExecutor) driver).executeScript(SCROLL_SCRIPT, amtoflastpayment);

	    WebElement intrestsuspense=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")));
	    intrestsuspense.sendKeys("22");
	    WebElement suitexpenses1=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/input[1]")));
	    suitexpenses1.sendKeys("44345345");

	    WebElement otherexpenses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/input[1]")));
	    ((JavascriptExecutor) driver).executeScript(SCROLL_SCRIPT, otherexpenses);
	    otherexpenses.sendKeys("655677576");
//	    otherexpenses.click();
	    
	    //draft code is here
	    
	    WebElement justclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pcoded-inner-content']")));
	    justclick.click();
	    
	    WebElement clicknext5 = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnOTSNextto7")));
	    clicknext5.click();
	    
	    //securities page 7
	    
	    //details of case of immovable properties
	    
	    WebElement natureoftitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSTitleNature']")));
        Select natureoftitleSelect = new Select(natureoftitle);
        natureoftitleSelect.selectByVisibleText("Owned");
        WebElement natureofproperty=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSPptyNature']")));
        natureofproperty.sendKeys("test");
        WebElement locationofproperty=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSPptyLocation']")));
        locationofproperty.sendKeys("palakkad");
        WebElement surveyno=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSSurveyNo']")));
        surveyno.sendKeys("546675676876878");
        WebElement extant=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSExtant']")));
        extant.sendKeys("efregrrs");
        WebElement locationaladvandage=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSLocationAdv']")));
        locationaladvandage.sendKeys("dfbfbtb");
        WebElement satuatorydues=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSStatutoryDues']")));
        satuatorydues.sendKeys("frere");
        WebElement observation=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSSecurityConditn']")));
        observation.sendKeys("frere");
        WebElement inspection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSSecrtyInspctn']")));
        Select inspectionSelect = new Select(inspection);
        inspectionSelect.selectByVisibleText("Yes");
        WebElement dateoflastinspection=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSLtInspctnDate']")));
        dateoflastinspection.sendKeys("30-07-2024");
        WebElement observationsoflastinspection=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSLtInspctnObsrvtn']")));
        observationsoflastinspection.sendKeys("xewfrht");
        
        WebElement securitiesandaction=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSSecurityAction']")));
        securitiesandaction.sendKeys("grhereger");
        WebElement listofobservation=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSObsrvatnValReport']")));
        listofobservation.sendKeys("ferhtrj6j");
        WebElement whethercolorphotogaph = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSColorPhotogrph']")));
        Select whethercolorphotogaphSelect = new Select(whethercolorphotogaph);
        whethercolorphotogaphSelect.selectByVisibleText("Yes");
        
        WebElement dateoftakingpossesion=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSPossessionDate']")));
        dateoftakingpossesion.sendKeys("21-07-2024");
        WebElement dateofdisposal=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSDisposalDate']")));
        dateofdisposal.sendKeys("30-07-2024");
        WebElement amtrealised=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSRealizedAmt']")));
        amtrealised.sendKeys("3456546");
        WebElement presentposition=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSPresentPositn1']")));
        presentposition.sendKeys("test");
        WebElement whetheranyexpense=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSExpenceincurred']")));
        whetheranyexpense.sendKeys("grhtrtr");
        
        //draft code is here
        
        WebElement clicknext6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[7]/div[1]/div[1]/button[1]")));
	    clicknext6.click();
	    JavascriptExecutor js11 = (JavascriptExecutor) driver;
	    js11.executeScript("window.scrollBy(0,-1000)");
	    
	    
	    //Liability details page 7
	    
	    WebElement liablitywithotherbanks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSLiabilityOtherBank']")));
	    liablitywithotherbanks.sendKeys("test");
	    WebElement actionstaken = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSBankAction']")));
	    actionstaken.sendKeys("actions taken");
	    WebElement details = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSDirectIndirect']")));
	    details.sendKeys("details of direct and indirect");
	    
	    JavascriptExecutor js111 = (JavascriptExecutor) driver;
        js111.executeScript("window.scrollBy(0,2000)");
	    
	    //Details in respect of DICGC/CGFSI/ECGC/CGFMU

	    WebElement reasonsifnot = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")));
	    reasonsifnot.sendKeys("reason");
	    WebElement relavantdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")));
	    relavantdate.sendKeys("20-07-2024");
	    WebElement liablityason = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")));
	    liablityason.sendKeys("30-07-2024");
	    WebElement dateofclaim = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]")));
	    dateofclaim.sendKeys("30-07-2024");
	    WebElement amountofclaim = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")));
	    amountofclaim.sendKeys("665676");
	    WebElement dateofclaimsettled = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/input[1]")));
	    dateofclaimsettled.sendKeys("30-07-2024");
	    WebElement amountofclaimsettled = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/input[1]")));
	    amountofclaimsettled.sendKeys("4656565");
	    WebElement presentbalance = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]/input[1]")));
	    presentbalance.sendKeys("6678575");
	    WebElement specifyreasons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[12]/input[1]")));
	    specifyreasons.sendKeys("ererrv");
	    WebElement ECGCclaimamount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[13]/input[1]")));
	    ECGCclaimamount.sendKeys("4455465");
	    WebElement noteligiblereason = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[14]/input[1]")));
	    noteligiblereason.sendKeys("erhtty");
	    
	    WebElement justclick1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[4]/div[1]")));
	    justclick1.click();
	    
	    //draft code is here
	    
	    WebElement clicknext7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[4]/div[1]/div[1]/button[1]")));
	    clicknext7.click();
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("window.scrollBy(0,-1000)");
	    
	    //details of sickness page 8
	    
	    WebElement dateofsickness = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSSicknessDate']")));
	    dateofsickness.sendKeys("30-07-2024");
	    WebElement dateofclosure = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSClosureDate']")));
	    dateofclosure.sendKeys("30-07-2024");
	    WebElement reasons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSClosureRsn']")));
	    reasons.sendKeys("dhtrd");
	    WebElement dateofwindingup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSWindingDate']")));
	    dateofwindingup.sendKeys("30-07-2024");
	    WebElement whetherolisappointed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSAppointedOL']")));
        Select whetherolisappointedSelect = new Select(whetherolisappointed);
        whetherolisappointedSelect.selectByVisibleText("Yes");
        WebElement actionstakenfordisposal = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtDisposalActn']")));
        actionstakenfordisposal.sendKeys("thtyytn");
        WebElement dateofclaim1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSClaimDate']")));
        dateofclaim1.sendKeys("30-07-2024");
        WebElement amountofclaim1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSClaimAmt']")));
        amountofclaim1.sendKeys("3435345");
        WebElement chargespaid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSChargesPaid']")));
        chargespaid.sendKeys("445454");
        WebElement presentposition1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSPresentPositn']")));
        presentposition1.sendKeys("jfjfg");
        WebElement actionstaken1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSRecoveryActn']")));
        actionstaken1.sendKeys("tgtrhtrht");
        WebElement dateoflegalnotice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSLegalNoticeDate']")));
        dateoflegalnotice.sendKeys("30-07-2024");
        WebElement responseforlegalnotice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSResLegalNotice']")));
        responseforlegalnotice.sendKeys("response");
        WebElement whetherloanpapers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSLoanPaper']")));
        Select whetherloanpapersSelect = new Select(whetherloanpapers);
        whetherloanpapersSelect.selectByVisibleText("Yes");
        WebElement ifsuitisnotfiled = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSSuitnotFiledRsn']")));
        ifsuitisnotfiled.sendKeys("suit");
        WebElement dateoffilingsuit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSFilingSuitDate']")));
        dateoffilingsuit.sendKeys("30-07-2024");
        WebElement suitclaim = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSSuitClaim']")));
        suitclaim.sendKeys("45466");
        WebElement suitexpenses2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-4']//input[@id='TxtOTSSuitExpense']")));
        suitexpenses2.sendKeys("5465577");
        WebElement dateofdecree = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSDecreeDate']")));
        dateofdecree.sendKeys("30-07-2024");
        WebElement finalorderspassed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSFinalOrders']")));
        finalorderspassed.sendKeys("30-07-2024");
        WebElement amount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAmount']")));
        amount.sendKeys("565756");
        WebElement costandintrests = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSInterstAwarded']")));
        costandintrests.sendKeys("6565765");
        WebElement othertermsofdecree = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOtherTermDecree']")));
        othertermsofdecree.sendKeys("htrhtrh");
        WebElement dateofRCissued = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtRCIssuedDate']")));
        dateofRCissued.sendKeys("30-07-2024");
        WebElement amtrcissued = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAmtIssuedDate']")));
        amtrcissued.sendKeys("546565");
        WebElement dateofdemandnotice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSDemandNoticeDate']")));
        dateofdemandnotice.sendKeys("30-07-2024");
        WebElement dateoffilingep= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSFilingEPDate']")));
        dateoffilingep.sendKeys("30-07-2024");
        WebElement amtoffilingep= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAmtCourtCase']")));
        amtoffilingep.sendKeys("30-07-2024");
        WebElement ifepnotfiled= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSEPFiled']")));
        ifepnotfiled.sendKeys("trgtrhtht");
        WebElement presentposition2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSPresentPositnSuit']")));
        presentposition2.sendKeys("freerg");
        
        WebElement appealfiled = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSAppealfiled']")));
        Select appealfiledSelect = new Select(appealfiled);
        appealfiledSelect.selectByVisibleText("Yes");
        WebElement appealdate= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAplDate']")));
        appealdate.sendKeys("30-07-2024");
        WebElement appealpurpose= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAplPurpose']")));
        appealpurpose.sendKeys("fgerher");
        WebElement presentposition4= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAplPresentPositn']")));
        presentposition4.sendKeys("test");
        //advocate
        WebElement clickplus2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdvName']")));
        clickplus2.click();
        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSState']")));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("Kerala");
        WebElement district = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSDistrict']")));
        Select districtSelect = new Select(district);
        districtSelect.selectByVisibleText("Palakkad");
        WebElement clicksearch= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSAdvIDDSearch']")));
        clicksearch.click();
        WebElement checkbox3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]"));
        if (!checkbox3.isSelected()) {
            checkbox3.click();
        }
        WebElement add1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSAdvctSave']")));
        add1.click();
        
        //draft code is here
        
        WebElement clicknext8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/div[5]/div[1]/div[1]/button[1]")));
	    clicknext8.click();
	    JavascriptExecutor js3 = (JavascriptExecutor) driver;
	    js3.executeScript("window.scrollBy(0,-1000)");
	    
	    
	    //Brief background page 9
	    
	    WebElement textfield4= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSDirectIndirectAD']")));
	    textfield4.sendKeys("test");
	    WebElement clickradiobutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/input[1]")));
	    clickradiobutton.click();
	    

	    
	    WebElement whetherauctionconducted = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[10]/div[6]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/label[1]/span[1]")));
	    whetherauctionconducted.click();
	    WebElement dateofauction= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAuctionDate']")));
	    dateofauction.sendKeys("30-07-2024");
	    WebElement reserveprice= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSReservePrice']")));
	    reserveprice.sendKeys("4345654");
	    WebElement whetherauctionbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[10]/div[6]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/label[1]/span[1]")));
	    whetherauctionbutton.click();
	    WebElement amtrealized= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAmntRealised']")));
	    amtrealized.sendKeys("45464646");
	    
	    //draft code will be here
	    
	    WebElement clicknext9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[10]/div[8]/div[1]/div[1]/button[2]")));
	    clicknext9.click();
	    JavascriptExecutor js4 = (JavascriptExecutor) driver;
	    js4.executeScript("window.scrollBy(0,-1000)");
	    
	    
	    //staff details page 10
	    
	    WebElement stafflapses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSstafflapses']")));
        Select stafflapsesSelect = new Select(stafflapses);
        stafflapsesSelect.selectByVisibleText("Yes");
        WebElement dateofinvestigation= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSInvestReportDate']")));
        dateofinvestigation.sendKeys("30-07-2024");
        WebElement reasonsofdelay= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSDelayRsn']")));
        reasonsofdelay.sendKeys("delay");
        WebElement natureoflapses= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSLapseNature']")));
        natureoflapses.sendKeys("frehtrh");
        WebElement yettobeidentified= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSIdDelayRsn']")));
        yettobeidentified.sendKeys("ggrgtrg");
        WebElement whethervigilance= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSChargesheet']")));
        whethervigilance.sendKeys("egregwg");
        WebElement lapsesonthepart= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSAcFollowup']")));
        lapsesonthepart.sendKeys("gjtjtyh");
        WebElement actionstaken3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSOfficials']")));
        actionstaken3.sendKeys("frwgerget");
        
        
        WebElement growthrecommentation= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSGroundRec']")));
        growthrecommentation.sendKeys("gtrhrhhr");
        
        //delegation of power
        WebElement unappliedint= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSUnappliedInt']")));
        unappliedint.sendKeys("345435");
        WebElement compromiseamt= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSCompromiseAmt']")));
        compromiseamt.sendKeys("55555");
        
        WebElement releaseofprovision= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSProvisionRelease']")));
        releaseofprovision.sendKeys("45455465");
        
        //draft code will be here
        
        
        WebElement clicknext10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[11]/div[8]/div[1]/div[1]/button[2]")));
	    clicknext10.click();
	    JavascriptExecutor js7 = (JavascriptExecutor) driver;
	    js7.executeScript("window.scrollBy(0,-2000)");
	    
	    //payment details page 11
	    
	    WebElement sourceofpayment= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtEngineNo']")));
	    sourceofpayment.sendKeys("source");
	    WebElement addinformation= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtOTSDirectIndirectS']")));
	    addinformation.sendKeys("info");
	    
	   
	    
	    WebElement circleoff = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='TxtOTSCircleOffice']")));
        Select circleoffSelect = new Select(circleoff);
        circleoffSelect.selectByVisibleText("CIRCLE OFFICE THIRUVANANTHAPURAM");
        WebElement officenotedated= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSOfficeNote']")));
        officenotedated.sendKeys("30-07-2024");
        WebElement accofms= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSProvisionReleaseS']")));
        accofms.sendKeys("john");
        WebElement constituentsof= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSConstituents']")));
        constituentsof.sendKeys("test");
        
        
        
        //draft code is here
        
        WebElement savebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnTabCheckSave']")));
        savebutton.click();
       
        WebElement clicksubmit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Submit']")));
        clicksubmit.click();
       
        
        WebElement handleok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
        handleok.click();

}}
