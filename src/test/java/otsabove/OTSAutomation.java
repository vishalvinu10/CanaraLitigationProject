package otsabove;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

public class OTSAutomation {
	
	public class commercialcaseadd {
		
		private WebDriver driver;
		private WebDriverWait wait;
		private static final String SCROLL_SCRIPT = "arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});";

		@BeforeClass
		public void setUp() {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		}

//		@AfterClass
//		public void tearDown() {
//			if (driver != null) {
//				driver.quit();
//			}
//		}
		
		
		 String  dateofestablishmentField1 = dateofestablishment();
		 String  dateoffirstsanction1 = dateofestablishment();
		 String dateoflastrenewal1 = dateofestablishment();
		 String dateofreporting1 = dateofestablishment();
		 String lossliability1 = RandomString(15);
		 String share1 = generateRandomInterest(); 
		 String suitexpenses1 = RandomString(15);
		 String unappliedintrestmclr1 = RandomString(15);
		 String unappliedintrestdecree1 = RandomString(15);
		 String provision1 = RandomString(15);
		 String otsamtoffered1 = RandomString(15);
		 String waveunapplied1 = RandomString(15);
		 String mclr1 = generateRandomInterest(); 
		 String date1random = dateofestablishment();
		 String date2random = dateofestablishment();
		 String date3random = dateofestablishment();
		 String textfield1random = RandomAlphabetString(4000);
		 String textfield2random = RandomAlphabetString(4000);
		 String textfield3random = RandomAlphabetString(4000);
		 String NotionalUnappliedinterest1 = generateRandomInterest();
		 String cutoffdate1 = dateofestablishment();
		 String rateofintrest1 = generateRandomInterest();
		 String yield1 = generateRandomInterest();
		 String textfield4 = RandomAlphabetString(4000);
		 String amountpayable1 = RandomString(15);
		 String networthgrant1 = RandomString(15);
		 String networthpresent1 = RandomString(15);
		 String factofcase1 = RandomAlphabetString(4000);
		 String valueatthetimeofgrant1 = RandomString(15);
		 String natureatpresent1 = RandomString(15);
		 String valueatpresent1 = RandomString(15);
		 String encumbarance1 = RandomString(15);
		 String natureoflimit1 = RandomString(15);
		 String limitamt1 = RandomString(15);
		 String dateofloan1 = dateofestablishment();
		 String dateofclassifieing1 = dateofestablishment();
		 String amountoutstanding1 = RandomString(15);
		 String recovorytill1  = RandomString(15);
		 String recovoryafter1 = RandomString(15);
		 String totalrecovery1  = RandomString(15);
		 String dateoflastpayment1 =  RandomString(15);
		 String intrestsuspense1 = generateRandomInterest();
		 String suitexpenses11 = RandomString(15);
		 String otherexpenses1 = RandomString(15);
		 
		 
		 

		// Method to read data from the Excel file
		private List<List<String>> readDataFromExcel(String filePath) throws IOException {
			List<List<String>> data = new ArrayList<>();
			FileInputStream fileInputStream = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheetAt(0);

			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) { // Skipping the header row
				Row row = sheet.getRow(i);
				List<String> rowData = new ArrayList<>();

				// First column for "nameofthegroup"
				Cell nameCell = row.getCell(0);
				if (nameCell != null && nameCell.getCellType() == CellType.STRING) {
					rowData.add(nameCell.getStringCellValue());
				}

				// Second column for "originalbranch"
				Cell branchCell = row.getCell(1);
				if (branchCell != null && branchCell.getCellType() == CellType.STRING) {
					rowData.add(branchCell.getStringCellValue());
				}
				
				// third column for "locationofbusinessCell"
				Cell locationofbusinessCell = row.getCell(2);
				if (locationofbusinessCell != null && locationofbusinessCell.getCellType() == CellType.STRING) {
					rowData.add(locationofbusinessCell.getStringCellValue());
				}
		

				// Only add the row if it has data in both columns
				if (!rowData.isEmpty()) {
					data.add(rowData);
				}
			}

			workbook.close();
			fileInputStream.close();
			return data;
		}

		// Method to get random row data (for both nameofthegroup and originalbranch)
		private List<String> getRandomData(List<List<String>> data) {
			Random random = new Random();
			return data.get(random.nextInt(data.size()));
		}

		@Test(priority = 1)
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

			// Reading data from Excel
			String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\vishal\\otsrandom.xlsx";  // Update this with the actual file path
			List<List<String>> excelData = readDataFromExcel(filePath);

			// Get random data for nameofthegroup and originalbranch
			List<String> randomData = getRandomData(excelData);
			String randomNameOfGroup = randomData.get(0);  // First column value
			String randomOriginalBranch = randomData.get(1);  // Second column value
			String randomlocationofbusiness = randomData.get(2);
			String randomNameOfMember = randomData.get(0); 

			// Using the random data from Excel
			WebElement nameofthegroup = driver.findElement(By.xpath("//input[@id='TxtOTSGroupName']"));
			nameofthegroup.sendKeys(randomNameOfGroup);  // Input random name of the group

			WebElement originalbranch = driver.findElement(By.xpath("//input[@id='TxtOTSOriginalBranch']"));
			originalbranch.sendKeys(randomOriginalBranch);  // Input random original branch

			WebElement dateofestablishment = driver.findElement(By.xpath("//input[@id='TxtOTSEstablishmentDate']"));
			dateofestablishment.sendKeys(dateofestablishmentField1);
			
			WebElement lineofactivity = driver.findElement(By.xpath("//input[@id='TxtOTSActivityLine']"));
			lineofactivity.sendKeys("TEST");
			
			WebElement locationofbusiness = driver.findElement(By.xpath("//input[@id='TxtOTSLocation']"));
			locationofbusiness.sendKeys(randomlocationofbusiness);
			
			WebElement purppose = driver.findElement(By.xpath("//input[@id='TxtOTSCreditFacilityPurpose']"));
			purppose.sendKeys("TEST");
			
			WebElement dateoffirstsanction = driver.findElement(By.xpath("//input[@id='TxtOTSFtSanctnDate']"));
			dateoffirstsanction.sendKeys(dateoffirstsanction1);
			
			WebElement authorityoffirstsanction = driver.findElement(By.xpath("//select[@id='DrpOTSFtSanctnAty']"));
		    Select authorityoffirstsanctionSelect = new Select(authorityoffirstsanction);
		    authorityoffirstsanctionSelect.selectByVisibleText("Branch in charge");
		    
		    WebElement dateoflastrenewal = driver.findElement(By.xpath("//input[@id='TxtOTSLastRenewalDate']"));
		    dateoflastrenewal.sendKeys(dateoflastrenewal1);
		    
//		    WebElement authorityoflastrenewal = driver.findElement(By.xpath("//select[@id='DrpOTSLastRenewalAty']"));
//		    Select authorityoflastrenewalSelect = new Select(authorityoflastrenewal);
//		    authorityoflastrenewalSelect.selectByVisibleText("Branch in charge");
		    
		    WebElement authorityoflastrenewal = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSLastRenewalAty']")));
			 // Creating a Select object
			 Select authorityoflastrenewalSelect = new Select(authorityoflastrenewal);
			 // Getting available options from the dropdown
			 System.out.println("Available options in the dropdown:");
			 for (WebElement option : authorityoflastrenewalSelect.getOptions()) {
				 System.out.println(option.getText());
		        }

			 // Taking input from the user
			 Scanner scanner = new Scanner(System.in);
			 System.out.print("Enter the option you want to select: ");
			 String selectedOption = scanner.nextLine();

			 // Selecting the option entered by the user
			 try {
				 authorityoflastrenewalSelect.selectByVisibleText(selectedOption);
				 	System.out.println("Selected option applicatioU: " + selectedOption);
		        } catch (Exception e) {
		            System.out.println("The option '" + selectedOption + "' is not available in the dropdown.");
		        }

			 scanner.close();
		    	 
		    
		    
		    WebElement bankingarrangements = driver.findElement(By.xpath("//input[@id='TxtOTSBankArrangement']"));
		    bankingarrangements.sendKeys("ARRANGED");
		    
		    WebElement namofmember = driver.findElement(By.xpath("//input[@id='TxtOTSMemberName']"));
		    namofmember.sendKeys(randomNameOfMember);
		    
		    WebElement share = driver.findElement(By.xpath("//input[@id='TxtOTSShare']"));
		    share.sendKeys(share1);
		    
		    WebElement yearofdoubtful = driver.findElement(By.xpath("//input[@id='TxtOTSDoubtfulYear']"));
		    yearofdoubtful.sendKeys("2024");
		    
		    WebElement lossliability = driver.findElement(By.xpath("//input[@id='TxtOTSNPALossLiability']"));
		    lossliability.sendKeys(lossliability1);
		    
		    WebElement dateofreporting = driver.findElement(By.xpath("//input[@id='TxtOTSRBIDate']"));
		    dateofreporting.sendKeys(dateofreporting1);
		    
		    //draft section to be 
		    
		    
		    WebElement clicknext = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/button[1]")));
		    clicknext.click();
		    	
		    
		    JavascriptExecutor js6 = (JavascriptExecutor) driver;
		    js6.executeScript("window.scrollBy(0,-2000)");
		    
		    //OTS details 2nd page
		  
		    WebElement suitexpenses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")));
		    suitexpenses.sendKeys(suitexpenses1);
		    WebElement unappliedintrestmclr = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
		    unappliedintrestmclr.sendKeys(unappliedintrestmclr1);
		    WebElement unappliedintrestdecree = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]"));
		    unappliedintrestdecree.sendKeys(unappliedintrestdecree1);
		    WebElement provision = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]"));
		    provision.sendKeys(provision1);
		    WebElement otsamtoffered = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]"));
		    otsamtoffered.sendKeys(otsamtoffered1);
		 		      
		    //draft section to be 
		    
		    WebElement clicknext1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnOTSNextto3']")));
		    clicknext1.click();
		    
		    //present proposal page 3
		    
		    WebElement amountfield =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtOTSAcceptRs']")));
		    amountfield.clear();
		    amountfield.sendKeys("100000");
		    WebElement amountfield1 = driver.findElement(By.xpath("//input[@id='TxtOTSPayableRs1']"));
		    amountfield1.sendKeys("50000");
		    WebElement amountfield2 = driver.findElement(By.xpath("//input[@id='TxtOTSPayableRs2']"));
		    amountfield2.sendKeys("25000");
		    WebElement amountfield3 = driver.findElement(By.xpath("//input[@id='TxtOTSPayableRs3']"));
		    amountfield3.sendKeys("25000");
		    WebElement waveunapplied = driver.findElement(By.xpath("//input[@id='TxtOTSWaiveRs']"));
		    waveunapplied.sendKeys(waveunapplied1);
		    WebElement mclr = driver.findElement(By.xpath("//input[@id='TxtOTSMCLR1']"));
		    mclr.sendKeys(mclr1);
		    WebElement date1 = driver.findElement(By.xpath("//input[@id='TxtOTSSimpleFrom']"));
		    date1.sendKeys(date1random);
		    WebElement date2 = driver.findElement(By.xpath("//input[@id='TxtOTSMCLR2']"));
		    date2.sendKeys(date2random);
		    WebElement date3 = driver.findElement(By.xpath("//input[@id='TxtOTSMCLR3']"));
		    date3.sendKeys(date3random);
		    WebElement textfield1 = driver.findElement(By.xpath("//textarea[@id='TxtOTSUAI']"));
		    textfield1.sendKeys(textfield1random);
		    WebElement textfield2 = driver.findElement(By.xpath("//textarea[@id='TxtOTSOtherClauses']"));
		    textfield2.sendKeys(textfield2random);
		    WebElement textfield3 = driver.findElement(By.xpath("//textarea[@id='TxtOTSCompliance']"));
		    textfield3.sendKeys(textfield3random);
		    
		    WebElement NotionalUnappliedinterest = driver.findElement(By.xpath("//input[@id='TxtOTSUnapplied']"));
		    NotionalUnappliedinterest.sendKeys(NotionalUnappliedinterest1);
		    
		    //draft section is here
		    
		    WebElement clicknext2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[8]/div[1]/div[1]/button[1]")));
		    clicknext2.click();   
		    
		    
		    
		    //compromise policy page 4
		    
		    WebElement comptomisepolicy =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpOTSCompromisePolicy']")));
	        Select comptomisepolicySelect = new Select(comptomisepolicy);
	        comptomisepolicySelect.selectByVisibleText("Yes");
	        
	        WebElement cutoffdate = driver.findElement(By.xpath("//input[@id='TxtOTSCutoffDate']"));
	        cutoffdate.sendKeys(cutoffdate1);
	        WebElement rateofintrest = driver.findElement(By.xpath("//input[@id='TxtOTSIntrstRateCutoffDate']"));
	        rateofintrest.sendKeys(rateofintrest1);
	        WebElement yield = driver.findElement(By.xpath("//input[@id='TxtOTSYield']"));
	        yield.sendKeys(yield1);
	        WebElement textfield = driver.findElement(By.xpath("//textarea[@id='TxtOTSJustification']"));
	        textfield.sendKeys(textfield4);
	        WebElement amountpayable = driver.findElement(By.xpath("//input[@id='TxtOTSComprmspolicyAmt']"));
	        amountpayable.sendKeys(amountpayable1);
	        
	        //draft part is here

	        WebElement clicknext3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/button[1]")));
		    clicknext3.click();
		    
		    //Proprietor/partners page 4
		    
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
	        name.sendKeys(randomNameOfGroup);
	        
	        WebElement networthgrant = driver.findElement(By.xpath("//input[@id='TxtOTSPropNetWorthGrant']"));
	        networthgrant.sendKeys(networthgrant1);
	        WebElement networthpresent= driver.findElement(By.xpath("//input[@id='TxtOTSPropNetWorthPresent']"));
	        networthpresent.sendKeys(networthpresent1);
	        WebElement factofcase= driver.findElement(By.xpath("//textarea[@id='TxtOTSNetworthVariatn']"));
	        factofcase.sendKeys(factofcase1);
	        
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
	        valueatthetimeofgrant.sendKeys(valueatthetimeofgrant1);
	        WebElement natureatpresent= driver.findElement(By.xpath("//input[@id='TxtOTSAssetNaturePresent']"));
	        natureatpresent.sendKeys(natureatpresent1);
	        WebElement valueatpresent= driver.findElement(By.xpath("//input[@id='TxtOTSPresentValue']"));
	        valueatpresent.sendKeys(valueatpresent1);
	        WebElement encumbarance= driver.findElement(By.xpath("//input[@id='TxtOTSEncumbrance']"));
	        encumbarance.sendKeys(encumbarance1);
	        
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
		    natureoflimit.sendKeys(natureoflimit1);
		    WebElement limitamt= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
		    limitamt.sendKeys(limitamt1);
		    WebElement dateofloan= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
		    dateofloan.sendKeys(dateofloan1);
		    
		    
		    WebElement dateofclassifieing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")));
		    ((JavascriptExecutor) driver).executeScript(SCROLL_SCRIPT, dateofclassifieing);
		    dateofclassifieing.sendKeys(dateofclassifieing1);
		    WebElement amountoutstanding= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/input[1]"));
		    amountoutstanding.sendKeys(amountoutstanding1);
		    
		    JavascriptExecutor js1 = (JavascriptExecutor) driver;
		    js1.executeScript("window.scrollBy(0,1000)");
		    
		    
		    //details of recovery..
		    
		    WebElement recovorytill=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")));
		    recovorytill.sendKeys(recovorytill1);
		    WebElement recovoryafter= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
		    recovoryafter.sendKeys(recovoryafter1);
		    WebElement totalrecovery= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
		    totalrecovery.sendKeys(totalrecovery1);
		    WebElement dateoflastpayment= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]"));
		    dateoflastpayment.sendKeys(dateoflastpayment1);
		    WebElement amtoflastpayment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]")));
		    ((JavascriptExecutor) driver).executeScript(SCROLL_SCRIPT, amtoflastpayment);

		    WebElement intrestsuspense=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")));
		    intrestsuspense.sendKeys(intrestsuspense1);
		    WebElement suitexpenses1=  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/input[1]")));
		    suitexpenses1.sendKeys(suitexpenses11);

		    WebElement otherexpenses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/input[1]")));
		    ((JavascriptExecutor) driver).executeScript(SCROLL_SCRIPT, otherexpenses);
		    otherexpenses.sendKeys(otherexpenses1);
//		    otherexpenses.click();
		    
		    //draft code is here
		    
		    WebElement justclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pcoded-inner-content']")));
		    justclick.click();
		    
		    WebElement clicknext5 = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnOTSNextto7")));
		    clicknext5.click();
		    ////
		    
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
		    
		    

		}
		
    	private String dateofestablishment() {
	        // Define the date range: start and end dates
	        LocalDate startDate = LocalDate.of(2024, 1, 1); // Start date (e.g., January 1, 2000)
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
		
	    private String RandomAlphabetString(int length) {
	        return RandomStringUtils.randomAlphabetic(length); // Generate random alphabetic characters
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
}
