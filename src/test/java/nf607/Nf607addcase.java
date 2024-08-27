package nf607;

import java.time.Duration;

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

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

	   @Test
	    public void testAddNF607case() throws InterruptedException {
	    	
	    	 driver.get("https://safallitigation.onlinesafe.in/");
	        
	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

//	        Thread.sleep(5000);
	        
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        clicknpa.click();
//	        Thread.sleep(3000);
	        WebElement addcaseNF607 = driver.findElement(By.xpath("//span[normalize-space()='Generate NF607']"));
	        addcaseNF607.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]"));
	        clickthreedots.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement clickNF607 = driver.findElement(By.xpath("(//a[@id='61'])[1]"));
	        clickNF607.click();
	        
//	        Thread.sleep(3000);
	        
	        //page 1
	        
	        
	        WebElement sactionrefno = driver.findElement(By.xpath("//input[@id='TxtSanctionRefNo']"));
	        sactionrefno.sendKeys("225522");
	        WebElement concurrence = driver.findElement(By.xpath("//input[@id='TxtRefNo']"));
	        concurrence.sendKeys("fergerg3232");
	        WebElement sactiondate = driver.findElement(By.xpath("//input[@id='TxtSanctionDate']"));
	        sactiondate.sendKeys("25-07-2024");
	        WebElement ROIsaction = driver.findElement(By.xpath("//input[@id='TxtAtSanction']"));
	        ROIsaction.sendKeys("21");
	        WebElement dateoflimitation = driver.findElement(By.xpath("//input[@id='TxtLimitationDate']"));
	        dateoflimitation.sendKeys("25-07-2024");
	        WebElement ROIpresent = driver.findElement(By.xpath("//input[@id='TxtAtPresent']"));
	        ROIpresent.sendKeys("23");
	        WebElement dateofestablishment = driver.findElement(By.xpath("//input[@id='TxtEstablishmentDate']"));
	        dateofestablishment.sendKeys("25-07-2024");
	        WebElement lineofbusiness = driver.findElement(By.xpath("//input[@id='TxtProfession']"));
	        lineofbusiness.sendKeys("business");
	        WebElement Constitution = driver.findElement(By.xpath("//select[@id='DrpConstitution']"));
	        Select ConstitutionSelect = new Select(Constitution);
	        ConstitutionSelect.selectByVisibleText("Public");
	        WebElement status = driver.findElement(By.xpath("//input[@id='TxtStatus']"));
	        status.sendKeys("frger");
	        
	        //Directors/Partners/Proprietor
	        
	        WebElement clickplusbutton = driver.findElement(By.xpath("//button[@id='BtnDirectors']"));
	        clickplusbutton.click();
	        
	        
	        WebElement type = driver.findElement(By.xpath("//select[@id='DrpTyp']"));
	        Select typeSelect = new Select(type);
	        typeSelect.selectByVisibleText("Directors");
	        
	        WebElement accountno = driver.findElement(By.xpath("//select[@id='DrpDirectrAcNo']"));
	        Select accountnoSelect = new Select(accountno);
	        accountnoSelect.selectByVisibleText("3535465646353");
	        
	        WebElement networthsanction = driver.findElement(By.xpath("//input[@id='TxtNetWorthAtsanctionDirector']"));
	        networthsanction.sendKeys("100000");
	        WebElement networthpresent = driver.findElement(By.xpath("//input[@id='TxtNetWorthAtpresentDirector']"));
	        networthpresent.sendKeys("150000");
	        WebElement name = driver.findElement(By.xpath("//input[@id='TxtDirectorName']"));
	        name.sendKeys("firoz");
	        
	        WebElement clickadd = driver.findElement(By.xpath("//button[@id='BtnDirectorSave']"));
	        clickadd.click();
	        

//	        Thread.sleep(3000);
	        
	        
	        //Co-obligant/guarantor
	        
	        WebElement networthatsanction = driver.findElement(By.xpath("//input[@id='TxtSactionAmt607_229241833']"));
	        networthatsanction.sendKeys("100000");
	        WebElement networthatpresent = driver.findElement(By.xpath("//input[@id='TxtPresentAmt607_229241833']"));
	        networthatpresent.sendKeys("500000");
	        
//	        Thread.sleep(3000);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
	        WebElement draft = driver.findElement(By.xpath("//button[@id='BtnTab1Draft']"));
//         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", draft);
	        Thread.sleep(3000);
	        draft.click();
         
         Thread.sleep(2000);
         
         WebElement clickdraftbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
         clickdraftbutton.click();
         Thread.sleep(2000);
         WebElement okbutton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
         okbutton.click();
         Thread.sleep(2000);
         WebElement moveto2 = driver.findElement(By.xpath("//button[@id='BtnMoveto2']"));
         moveto2.click();
	        
	        //page 2
         
//         Thread.sleep(3000);
         
         WebElement LocationofFactory = driver.findElement(By.xpath("//input[@id='TxtFactoryLocation']"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LocationofFactory);
//         Thread.sleep(1000);
         LocationofFactory.sendKeys("palakkad");
//         Thread.sleep(3000);
         WebElement whetherpremises = driver.findElement(By.xpath("//select[@id='DrpPremises']"));
	        Select whetherpremisesSelect = new Select(whetherpremises);
	        whetherpremisesSelect.selectByVisibleText("Freehold");
	        
	        WebElement  enjoyingcreditlimits = driver.findElement(By.xpath("//input[@id='TxtFactoryLocation']"));
	        enjoyingcreditlimits.sendKeys("25-07-2024");
	        
	        //repayment terms
	        
	        WebElement repayment = driver.findElement(By.xpath("//button[@id='BtnTerms']"));
	        repayment.click();
//	        Thread.sleep(3000);
	        WebElement  termsofrepayment = driver.findElement(By.xpath("//input[@id='TxtTermsRepayment']"));
	        termsofrepayment.sendKeys("ctrgrt");
	        WebElement  principal = driver.findElement(By.xpath("//input[@id='TxtRemittedPrincipal']"));
	        principal.sendKeys("5455454");
	        WebElement  interest = driver.findElement(By.xpath("//input[@id='TxtRemittedInterest']"));
	        interest.sendKeys("4443545");
	        WebElement  subsidy = driver.findElement(By.xpath("//input[@id='TxtSubsidy']"));
	        subsidy.sendKeys("6554454");
	        WebElement  amountoverdue = driver.findElement(By.xpath("//input[@id='TxtOverduePrincipal']"));
	        amountoverdue.sendKeys("566565");
	        WebElement  amountoverdueintrest = driver.findElement(By.xpath("//input[@id='TxtOverdueInterest']"));
	        amountoverdueintrest.sendKeys("566556");
	        WebElement  sincewhenoverdue = driver.findElement(By.xpath("//input[@id='TxtOverdueDate']"));
	        sincewhenoverdue.sendKeys("25-07-2024");
//	        Thread.sleep(3000);
	        
	        WebElement add1 = driver.findElement(By.xpath("//button[@id='BtnLimitSave']"));
	        add1.click();
	        
//	        Thread.sleep(3000);
	        
	        //Security Nature
	        
	        WebElement add2 = driver.findElement(By.xpath("//button[@id='BtnSecuritynature']"));
	        add2.click();
//	        Thread.sleep(3000);
	        WebElement  limitrs = driver.findElement(By.xpath("//input[@id='TxtLimit']"));
	        limitrs.sendKeys("435543");
	        WebElement  security = driver.findElement(By.xpath("//input[@id='TxtSecurity']"));
	        security.sendKeys("dverere3");
	        WebElement  natureofcharge = driver.findElement(By.xpath("//input[@id='TxtNatureCharge']"));
	        natureofcharge.sendKeys("gergrtrt");
	        WebElement  valueatsanction = driver.findElement(By.xpath("//input[@id='TxtSanction']"));
	        valueatsanction.sendKeys("454543");
	        WebElement  valueatpresent = driver.findElement(By.xpath("//input[@id='TxtValuePresent']"));
	        valueatpresent.sendKeys("886676");
	        WebElement  presentcondition = driver.findElement(By.xpath("//input[@id='TxtprsntCondition']"));
	        presentcondition.sendKeys("test");
	        WebElement  whetheradequetly = driver.findElement(By.xpath("//input[@id='TxtAdequatly']"));
	        whetheradequetly.sendKeys("test");
	        WebElement  steps = driver.findElement(By.xpath("//textarea[@id='TxtPreservation']"));
	        steps.sendKeys("test");
//	        Thread.sleep(3000);
	        
	        WebElement add3 = driver.findElement(By.xpath("//button[@id='BtnSecuritySave']"));
	        add3.click();
//	        Thread.sleep(3000);
	        
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollBy(0,2000)");
	        
//	        Thread.sleep(5000);
	        
//	        WebElement draft1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
//         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", draft1);
	        WebElement draft1 = driver.findElement(By.xpath("(//button[@id='BtnTab2Draft'])[1]"));
         draft1.click();
         
         Thread.sleep(2000);
         
         WebElement clickdraftbutton1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
         clickdraftbutton1.click();
         Thread.sleep(2000);
         WebElement okbutton1 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
         okbutton1.click();
         Thread.sleep(2000);
         WebElement moveto3 = driver.findElement(By.xpath("(//button[@id='BtnMoveto3'])[1]"));
         moveto3.click();
//         Thread.sleep(3000);
         
   
     
	        // PAGE 3
         
         Thread.sleep(2000);
         
         JavascriptExecutor js2 = (JavascriptExecutor) driver;
         js2.executeScript("window.scrollTo(0, document.body.scrollHeight);");

//         Thread.sleep(5000);

         // Scroll up to the top of the page
         js2.executeScript("window.scrollTo(0, 0);");

//         Thread.sleep(5000);
         
         WebElement regularlyinspected = driver.findElement(By.xpath("//select[@id='DrpSecurityInspected']"));
	        Select regularlyinspectedSelect = new Select(regularlyinspected);
	        regularlyinspectedSelect.selectByVisibleText("Yes");
	        
	        WebElement  lastinspection = driver.findElement(By.xpath("//input[@id='TxtLastInspectionDate']"));
	        lastinspection.sendKeys("26-07-2024");
	        
	        WebElement  insurancecover = driver.findElement(By.xpath("//input[@id='TxtParticularEnable']"));
	        insurancecover.sendKeys("31-07-2024");
	        
//	        Thread.sleep(3000);
	        
	        JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,2000)");
	        
//	        Thread.sleep(3000);
	        
	        WebElement draft2 = driver.findElement(By.xpath("(//button[@id='BtnTab3Draft'])[1]"));
         draft2.click();
         
         Thread.sleep(2000);
         
         WebElement clickdraftbutton2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
         clickdraftbutton2.click();
         Thread.sleep(2000);
         WebElement okbutton2 = driver.findElement(By.xpath("(//button[@class='confirm btn btn-lg btn-success'])[1]"));
         okbutton2.click();
         Thread.sleep(2000);
         WebElement moveto4 = driver.findElement(By.xpath("(//button[@id='BtnMoveto4'])[1]"));
         moveto4.click();
         Thread.sleep(1000);
         
         
         //page 4
         
         JavascriptExecutor js4 = (JavascriptExecutor) driver;
         js4.executeScript("window.scrollTo(0, document.body.scrollHeight);");

         Thread.sleep(2000);

         // Scroll up to the top of the page
         js4.executeScript("window.scrollTo(0, 0);");

//         Thread.sleep(1000);
         
         WebElement  accountbecomeirregular = driver.findElement(By.xpath("//input[@id='TxtAcIrregular']"));
         accountbecomeirregular.sendKeys("26-07-2024");
         
//         Thread.sleep(3000);
	        
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        js5.executeScript("window.scrollBy(0,2000)");
	        
//	        Thread.sleep(3000);
	        
	        WebElement draft3 = driver.findElement(By.xpath("(//button[@id='BtnTab4Draft'])[1]"));
	        draft3.click();
         
	        Thread.sleep(2000);
         
         WebElement clickdraftbutton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
         clickdraftbutton3.click();
         Thread.sleep(2000);
         WebElement okbutton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
         okbutton3.click();
         Thread.sleep(2000);
         WebElement moveto5 = driver.findElement(By.xpath("(//button[@id='BtnMoveto5'])[1]"));
         moveto5.click();
         Thread.sleep(2000);
         
         
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
	    
}
}     

 	   
 	       
     	        
     	      
     	        
     	      