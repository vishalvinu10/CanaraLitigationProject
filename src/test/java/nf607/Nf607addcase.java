package nf607;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

public class Nf607addcase {
	
	public class nf607caseadd {
	
	 private WebDriver driver;
	 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	    	WebDriverManager.chromedriver().clearDriverCache().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        
	        
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	    String sactionrefno1 = RandomString(20);
	    String concurrence1 = RandomAlphabets(50);
	    String  sanctiondate1 = dateString();
	    String ROIsanction1 = generateRandomInterest(); 
	    String dateoflimitation1 = dateString();
	    String ROIpresent1 = generateRandomInterest();
	    String dateofestablishment1 = dateString();
	    String lineofbusiness1 = RandomAlphabets(50);
	    String status1 = RandomAlphabets(50);
	    String networthsanction1 = RandomString(15);
	    String networthpresent1 = RandomString(15);
	    String networthatsanction1 = RandomString(15);
	    String networthatpresent1 = RandomString(15);
	    String enjoyingcreditlimits1 = dateString();
	    String termsofrepayment1 = RandomAlphabets(200);
	    String principal1 = RandomString(15);
	    String interest1 = generateRandomInterest(); 
	    String subsidy1 = RandomString(15);
	    String amountoverdue1 = RandomString(15);
	    String amountoverdueintrest1 = generateRandomInterest();
	    String sincewhenoverdue1 = dateString();
	    String limitrs1 = RandomString(15);
	    String security1 = RandomAlphabets(200);
	    String natureofcharge1 = RandomAlphabets(200);
	    String valueatsanction1 = RandomString(15);
	    String valueatpresent1 = RandomString(15);
	    String presentcondition1 = RandomAlphabets(200);
	    String lastinspection1 = dateString();
	    String insurancecover1 = dateString();
	    String accountbecomeirregular1 = dateString();
	    
	    
	    private List<String> readNamesFromExcel(String filePath) throws IOException {
	        List<String> names = new ArrayList<>();
	        FileInputStream fileInputStream = new FileInputStream(new String(filePath));
	        Workbook workbook = new XSSFWorkbook(fileInputStream);
	        Sheet sheet = workbook.getSheetAt(0);
	        for (Row row : sheet) {
	            Cell cell = row.getCell(0);
	            if (cell != null) {
	                names.add(cell.getStringCellValue());
	            }
	        }
	        workbook.close();
	        fileInputStream.close();
	        return names;
	    }

	    private String getRandomName(List<String> names) {
	        Random random = new Random();
	        return names.get(random.nextInt(names.size()));
	    }
	    
	    

	   @Test
	    public void testAddNF607case() throws InterruptedException, IOException {
	    	
	    	 driver.get("https://safallitigation.onlinesafe.in/");
	        
	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();
	        
	        JavascriptExecutor click = (JavascriptExecutor) driver;
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        click.executeScript("arguments[0].click();", clicknpa);
	        
	        JavascriptExecutor click1 = (JavascriptExecutor) driver;
	        WebElement addcaseNF607 = driver.findElement(By.xpath("//span[normalize-space()='Generate NF607']"));
	        click1.executeScript("arguments[0].click();", addcaseNF607);
	        
	        JavascriptExecutor click2 = (JavascriptExecutor) driver;
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]"));
	        click2.executeScript("arguments[0].click();", clickthreedots);
	        
	        JavascriptExecutor click3 = (JavascriptExecutor) driver;
	        WebElement clickNF607 = driver.findElement(By.xpath("(//a[@id='61'])[1]"));
	        click3.executeScript("arguments[0].click();", clickNF607);
	        
	        //page 1
	        
	        WebElement sactionrefno = driver.findElement(By.xpath("//input[@id='TxtSanctionRefNo']"));
	        sactionrefno.sendKeys(sactionrefno1);
	        WebElement concurrence = driver.findElement(By.xpath("//input[@id='TxtRefNo']"));
	        concurrence.sendKeys(concurrence1);
	        WebElement sactiondate = driver.findElement(By.xpath("//input[@id='TxtSanctionDate']"));
	        sactiondate.sendKeys(sanctiondate1);
	        WebElement ROIsaction = driver.findElement(By.xpath("//input[@id='TxtAtSanction']"));
	        ROIsaction.sendKeys(ROIsanction1);
	        WebElement dateoflimitation = driver.findElement(By.xpath("//input[@id='TxtLimitationDate']"));
	        dateoflimitation.sendKeys(dateoflimitation1);
	        WebElement ROIpresent = driver.findElement(By.xpath("//input[@id='TxtAtPresent']"));
	        ROIpresent.sendKeys(ROIpresent1);
	        WebElement dateofestablishment = driver.findElement(By.xpath("//input[@id='TxtEstablishmentDate']"));
	        dateofestablishment.sendKeys(dateofestablishment1);
	        WebElement lineofbusiness = driver.findElement(By.xpath("//input[@id='TxtProfession']"));
	        lineofbusiness.sendKeys(lineofbusiness1);
	        WebElement Constitution = driver.findElement(By.xpath("//select[@id='DrpConstitution']"));
	        Select ConstitutionSelect = new Select(Constitution);
	        ConstitutionSelect.selectByVisibleText("Public");
	        WebElement status = driver.findElement(By.xpath("//input[@id='TxtStatus']"));
	        status.sendKeys(status1);
	        
	        //Directors/Partners/Proprietor
	        JavascriptExecutor click4 = (JavascriptExecutor) driver;
	        WebElement clickplusbutton = driver.findElement(By.xpath("//button[@id='BtnDirectors']"));
	        click4.executeScript("arguments[0].click();", clickplusbutton);
	        
	        
	        WebElement type = driver.findElement(By.xpath("//select[@id='DrpTyp']"));
	        Select typeSelect = new Select(type);
	        typeSelect.selectByVisibleText("Directors");
	        
	        WebElement accountno = driver.findElement(By.xpath("//select[@id='DrpDirectrAcNo']"));
	        Select accountnoSelect = new Select(accountno);
	        accountnoSelect.selectByVisibleText("3535465646353");
	        
	        WebElement networthsanction = driver.findElement(By.xpath("//input[@id='TxtNetWorthAtsanctionDirector']"));
	        networthsanction.sendKeys(networthsanction1);
	        WebElement networthpresent = driver.findElement(By.xpath("//input[@id='TxtNetWorthAtpresentDirector']"));
	        networthpresent.sendKeys(networthpresent1);
	        
	        String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\vishal\\randomnamesexcel.xlsx";
	        List<String> names = readNamesFromExcel(filePath);
	        String randomName = getRandomName(names);

	        WebElement name = driver.findElement(By.xpath("//input[@id='TxtDirectorName']"));
	        name.sendKeys(randomName);
	        
	        JavascriptExecutor click5 = (JavascriptExecutor) driver;
	        WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnDirectorSave']"));
	        click5.executeScript("arguments[0].click();", clickadd);
	        
	         
	        //Co-obligant/guarantor
	        
	        List<String> accountNumbers = Arrays.asList("229241833", "71485907");

	        for (String accountNumber : accountNumbers) {
	            String xpathExpression = String.format("//input[@id='TxtSactionAmt607_%s']", accountNumber);

	            try {
	                WebElement networthatsanction = driver.findElement(By.xpath(xpathExpression));
	                networthatsanction.sendKeys(networthatsanction1);

	            } catch (Exception e) {
	                System.out.println("Failed to click account checkbox for account: " + accountNumber + " - " + e.getMessage());
	            }
	        }
	        
	        List<String> accountNumbers1 = Arrays.asList("229241833","71485907");

	        for (String accountNumber : accountNumbers1) {
	            String xpathExpression = String.format("//input[@id='TxtPresentAmt607_%s']", accountNumber);

	            try {
	                WebElement networthatpresent = driver.findElement(By.xpath(xpathExpression));
	                networthatpresent.sendKeys(networthatpresent1);

	            } catch (Exception e) {
	                System.out.println("Failed to click account checkbox for account: " + accountNumber + " - " + e.getMessage());
	            }
	        }
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        JavascriptExecutor click6 = (JavascriptExecutor) driver;
	        WebElement draft = driver.findElement(By.xpath("//button[@id='BtnTab1Draft']"));
	        click6.executeScript("arguments[0].click();", draft);
         
	        Thread.sleep(2000);
         
	        JavascriptExecutor click7 = (JavascriptExecutor) driver;
	        WebElement clickdraftbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        click7.executeScript("arguments[0].click();", clickdraftbutton);
	        Thread.sleep(2000);
	        JavascriptExecutor click8 = (JavascriptExecutor) driver;
	        WebElement okbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        click8.executeScript("arguments[0].click();", okbutton);
	        Thread.sleep(2000);
	        JavascriptExecutor click9 = (JavascriptExecutor) driver;
	        WebElement moveto2 = driver.findElement(By.xpath("//button[@id='BtnMoveto2']"));
	        click9.executeScript("arguments[0].click();", moveto2);
	        
	        //page 2
             
	        WebElement LocationofFactory = driver.findElement(By.xpath("//input[@id='TxtFactoryLocation']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LocationofFactory);

	        LocationofFactory.sendKeys("palakkad");

	        WebElement whetherpremises = driver.findElement(By.xpath("//select[@id='DrpPremises']"));
	        Select whetherpremisesSelect = new Select(whetherpremises);
	        whetherpremisesSelect.selectByVisibleText("Freehold");
	        
	        WebElement enjoyingcreditlimits = driver.findElement(By.xpath("//input[@id='TxtFactoryLocation']"));
	        enjoyingcreditlimits.sendKeys(enjoyingcreditlimits1);
	        
	        //repayment terms
	        JavascriptExecutor click10 = (JavascriptExecutor) driver;
	        WebElement repayment = driver.findElement(By.xpath("//button[@id='BtnTerms']"));
	        click10.executeScript("arguments[0].click();", repayment);

	        WebElement  termsofrepayment = driver.findElement(By.xpath("//input[@id='TxtTermsRepayment']"));
	        termsofrepayment.sendKeys(termsofrepayment1);
	        WebElement  principal = driver.findElement(By.xpath("//input[@id='TxtRemittedPrincipal']"));
	        principal.sendKeys(principal1);
	        WebElement  interest = driver.findElement(By.xpath("//input[@id='TxtRemittedInterest']"));
	        interest.sendKeys(interest1);
	        WebElement  subsidy = driver.findElement(By.xpath("//input[@id='TxtSubsidy']"));
	        subsidy.sendKeys(subsidy1);
	        WebElement  amountoverdue = driver.findElement(By.xpath("//input[@id='TxtOverduePrincipal']"));
	        amountoverdue.sendKeys(amountoverdue1);
	        WebElement  amountoverdueintrest = driver.findElement(By.xpath("//input[@id='TxtOverdueInterest']"));
	        amountoverdueintrest.sendKeys(amountoverdueintrest1);
	        WebElement  sincewhenoverdue = driver.findElement(By.xpath("//input[@id='TxtOverdueDate']"));
	        sincewhenoverdue.sendKeys(sincewhenoverdue1);
	        
	        JavascriptExecutor click11 = (JavascriptExecutor) driver;
	        WebElement add1 = driver.findElement(By.xpath("//button[@id='BtnLimitSave']"));
	        click11.executeScript("arguments[0].click();", add1);
	        
	        //Security Nature
	        JavascriptExecutor click12 = (JavascriptExecutor) driver;
	        WebElement add2 = driver.findElement(By.xpath("//button[@id='BtnSecuritynature']"));
	        click12.executeScript("arguments[0].click();", add2);

	        WebElement  limitrs = driver.findElement(By.xpath("//input[@id='TxtLimit']"));
	        limitrs.sendKeys(limitrs1);
	        WebElement  security = driver.findElement(By.xpath("//input[@id='TxtSecurity']"));
	        security.sendKeys(security1);
	        WebElement  natureofcharge = driver.findElement(By.xpath("//input[@id='TxtNatureCharge']"));
	        natureofcharge.sendKeys(natureofcharge1);
	        WebElement  valueatsanction = driver.findElement(By.xpath("//input[@id='TxtSanction']"));
	        valueatsanction.sendKeys(valueatsanction1);
	        WebElement  valueatpresent = driver.findElement(By.xpath("//input[@id='TxtValuePresent']"));
	        valueatpresent.sendKeys(valueatpresent1);
	        WebElement  presentcondition = driver.findElement(By.xpath("//input[@id='TxtprsntCondition']"));
	        presentcondition.sendKeys(presentcondition1);
	        WebElement  whetheradequetly = driver.findElement(By.xpath("//input[@id='TxtAdequatly']"));
	        whetheradequetly.sendKeys("test");
	        WebElement  steps = driver.findElement(By.xpath("//textarea[@id='TxtPreservation']"));
	        steps.sendKeys("test");
	        
	        JavascriptExecutor click13 = (JavascriptExecutor) driver;
	        WebElement add3 = driver.findElement(By.xpath("//button[@id='BtnSecuritySave']"));
	        click13.executeScript("arguments[0].click();", add3);
	        
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollBy(0,2000)");
	        
	        JavascriptExecutor click14 = (JavascriptExecutor) driver;	        
	        WebElement draft1 = driver.findElement(By.xpath("(//button[@id='BtnTab2Draft'])[1]"));
	        click14.executeScript("arguments[0].click();", draft1);
         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click15 = (JavascriptExecutor) driver;
	        WebElement clickdraftbutton1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	        click15.executeScript("arguments[0].click();", clickdraftbutton1);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click16 = (JavascriptExecutor) driver;
	        WebElement okbutton1 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
	        click16.executeScript("arguments[0].click();", okbutton1);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click17 = (JavascriptExecutor) driver;
	        WebElement moveto3 = driver.findElement(By.xpath("(//button[@id='BtnMoveto3'])[1]"));
	        click17.executeScript("arguments[0].click();", moveto3);

	        // PAGE 3
         
	        Thread.sleep(2000);
         
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        js2.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	        // Scroll up to the top of the page
	        js2.executeScript("window.scrollTo(0, 0);");
 
	        WebElement regularlyinspected = driver.findElement(By.xpath("//select[@id='DrpSecurityInspected']"));
	        Select regularlyinspectedSelect = new Select(regularlyinspected);
	        regularlyinspectedSelect.selectByVisibleText("Yes");
	        
	        WebElement  lastinspection = driver.findElement(By.xpath("//input[@id='TxtLastInspectionDate']"));
	        lastinspection.sendKeys(lastinspection1);
	        
	        WebElement  insurancecover = driver.findElement(By.xpath("//input[@id='TxtParticularEnable']"));
	        insurancecover.sendKeys(insurancecover1);
	        	        
	        JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,2000)");
	        
	        JavascriptExecutor click18 = (JavascriptExecutor) driver;
	        WebElement draft2 = driver.findElement(By.xpath("(//button[@id='BtnTab3Draft'])[1]"));
	        click18.executeScript("arguments[0].click();", draft2);
	         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click19 = (JavascriptExecutor) driver; 
	        WebElement clickdraftbutton2 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
	        click19.executeScript("arguments[0].click();", clickdraftbutton2);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click20 = (JavascriptExecutor) driver; 
	        WebElement okbutton2 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
	        click20.executeScript("arguments[0].click();", okbutton2);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click21 = (JavascriptExecutor) driver; 
	        WebElement moveto4 = driver.findElement(By.xpath("(//button[@id='BtnMoveto4'])[1]"));
	        click21.executeScript("arguments[0].click();", moveto4);
	        	        
	        //page 4
         
	        JavascriptExecutor js4 = (JavascriptExecutor) driver;
	        js4.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	        Thread.sleep(2000);

	        // Scroll up to the top of the page
        	js4.executeScript("window.scrollTo(0, 0);");

        	WebElement  accountbecomeirregular = driver.findElement(By.xpath("//input[@id='TxtAcIrregular']"));
        	accountbecomeirregular.sendKeys(accountbecomeirregular1);
         	        
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        js5.executeScript("window.scrollBy(0,2000)");	
	        
	        JavascriptExecutor click22 = (JavascriptExecutor) driver; 
	        WebElement draft3 = driver.findElement(By.xpath("(//button[@id='BtnTab4Draft'])[1]"));
	        click22.executeScript("arguments[0].click();", draft3);
         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click23 = (JavascriptExecutor) driver;
	        WebElement clickdraftbutton3 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
	        click23.executeScript("arguments[0].click();", clickdraftbutton3);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click24 = (JavascriptExecutor) driver;
	        WebElement okbutton3 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
	        click24.executeScript("arguments[0].click();", okbutton3);
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor click25 = (JavascriptExecutor) driver;
	        WebElement moveto5 = driver.findElement(By.xpath("(//button[@id='BtnMoveto5'])[1]"));
	        click25.executeScript("arguments[0].click();", moveto5);
	 
	        //page  5
         
	        WebElement  reason = driver.findElement(By.xpath("//textarea[@id='TxtRsnAbvRecmndation']"));
	        reason.sendKeys("test purpose");
         
	        WebElement draft4 = driver.findElement(By.xpath("(//button[@id='BtnTab5Draft'])[1]"));
	        draft4.click();
	        	     
	        Thread.sleep(2000);
         
	        WebElement clickdraftbutton4 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        clickdraftbutton4.click();
	        Thread.sleep(2000);
	        WebElement okbutton4 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        okbutton4.click();
	        Thread.sleep(2000);
	        WebElement moveto6 = driver.findElement(By.xpath("(//button[normalize-space()='Move to 6'])[1]"));
	        moveto6.click();
	        Thread.sleep(2000);
         
	        //page  6
         
	        WebElement draft5 = driver.findElement(By.xpath("(//button[@id='BtnTab6Draft'])[1]"));
	        draft5.click();
         
	        Thread.sleep(2000);
	        
	        WebElement clickdraftbutton5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        clickdraftbutton5.click();
	        Thread.sleep(2000);
	        WebElement okbutton5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        okbutton5.click();
	        Thread.sleep(2000);
	        WebElement save = driver.findElement(By.xpath("(//button[@id='BtnTab5Save'])[1]"));
	        save.click();
	        Thread.sleep(2000);
	        WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        submit.click();
	        Thread.sleep(2000);
	        WebElement ok = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok.click();
         
	    }
	   
	   private String RandomString(int length) {
			
			return RandomStringUtils.randomNumeric(length);
		}
	   
	    private String RandomAlphabets(int length) {
	        return RandomStringUtils.randomAlphabetic(length); // Generate random alphabetic characters
	    }
	    
	    private String dateString() {
	        // Define the date range: start and end dates
	        LocalDate startDate = LocalDate.of(2024, 9, 3); // Start date (e.g., January 1, 2000)
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
}     

 	   
 	       
     	        
     	      
     	        
     	      