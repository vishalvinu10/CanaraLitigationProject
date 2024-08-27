package nf607;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.NoSuchElementException;
import java.util.function.Function;


public class Nf607fluentwait {
	
	  public class nf607caseadd {
		    
	        private WebDriver driver;
	        private Wait<WebDriver> wait;

	        @BeforeClass
	        public void setUp() {
	            WebDriverManager.chromedriver().clearDriverCache().setup();
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            
	            // Setting up Fluent Wait
	            wait = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(30))
	                    .pollingEvery(Duration.ofSeconds(5))
	                    .ignoring(NoSuchElementException.class);
	        }

//	        @AfterClass
//	        public void tearDown() {
//	            if (driver != null) {
//	                driver.quit();
//	            }
//	        }

	        @Test
	        public void testAddNF607case() throws InterruptedException {
	            
	            driver.get("https://safallitigation.onlinesafe.in/");
	            
	            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	            usernameField.sendKeys("BU");

	            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	            signInButton.click();

	            WebElement clicknpa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='waves-effect waves-dark'])[2]")));
	            clicknpa.click();

	            WebElement addcaseNF607 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Generate NF607']")));
	            addcaseNF607.click();

	            WebElement clickthreedots = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]")));
	            clickthreedots.click();

	            WebElement clickNF607 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@id='61'])[1]")));
	            clickNF607.click();

	            // Page 1
	            WebElement sactionrefno = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtSanctionRefNo']")));
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

	            // Directors/Partners/Proprietor
	            WebElement clickplusbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDirectors']")));
	            clickplusbutton.click();

	            WebElement type = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='DrpTyp']")));
	            Select typeSelect = new Select(type);
	            typeSelect.selectByVisibleText("Directors");

	            WebElement accountno = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='DrpDirectrAcNo']")));
	            Select accountnoSelect = new Select(accountno);
	            accountnoSelect.selectByVisibleText("3535465646353");

	            WebElement networthsanction = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtNetWorthAtsanctionDirector']")));
	            networthsanction.sendKeys("100000");
	            WebElement networthpresent = driver.findElement(By.xpath("//input[@id='TxtNetWorthAtpresentDirector']"));
	            networthpresent.sendKeys("150000");
	            WebElement name = driver.findElement(By.xpath("//input[@id='TxtDirectorName']"));
	            name.sendKeys("firoz");

	            WebElement clickadd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDirectorSave']")));
	            clickadd.click();

	            // Co-obligant/guarantor
	            WebElement networthatsanction = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtSactionAmt607_229241833']")));
	            networthatsanction.sendKeys("100000");
	            WebElement networthatpresent = driver.findElement(By.xpath("//input[@id='TxtPresentAmt607_229241833']"));
	            networthatpresent.sendKeys("500000");

	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,2000)");

	            WebElement draft = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnTab1Draft']")));
	            draft.click();
	            
	            WebElement clickdraftbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	            clickdraftbutton.click();
	            WebElement okbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	            okbutton.click();
	            WebElement moveto2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnMoveto2']")));
	            moveto2.click();

	            // Page 2
	            WebElement LocationofFactory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtFactoryLocation']")));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LocationofFactory);
	            LocationofFactory.sendKeys("palakkad");

	            WebElement whetherpremises = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='DrpPremises']")));
	            Select whetherpremisesSelect = new Select(whetherpremises);
	            whetherpremisesSelect.selectByVisibleText("Freehold");

	            WebElement enjoyingcreditlimits = driver.findElement(By.xpath("//input[@id='TxtFactoryLocation']"));
	            enjoyingcreditlimits.sendKeys("25-07-2024");

	            // Repayment terms
	            WebElement repayment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnTerms']")));
	            repayment.click();

	            WebElement termsofrepayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtTermsRepayment']")));
	            termsofrepayment.sendKeys("ctrgrt");
	            WebElement principal = driver.findElement(By.xpath("//input[@id='TxtRemittedPrincipal']"));
	            principal.sendKeys("5455454");
	            WebElement interest = driver.findElement(By.xpath("//input[@id='TxtRemittedInterest']"));
	            interest.sendKeys("4443545");
	            WebElement subsidy = driver.findElement(By.xpath("//input[@id='TxtSubsidy']"));
	            subsidy.sendKeys("6554454");
	            WebElement amountoverdue = driver.findElement(By.xpath("//input[@id='TxtOverduePrincipal']"));
	            amountoverdue.sendKeys("566565");
	            WebElement amountoverdueintrest = driver.findElement(By.xpath("//input[@id='TxtOverdueInterest']"));
	            amountoverdueintrest.sendKeys("566556");
	            WebElement sincewhenoverdue = driver.findElement(By.xpath("//input[@id='TxtOverdueDate']"));
	            sincewhenoverdue.sendKeys("25-07-2024");

	            WebElement add1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnLimitSave']")));
	            add1.click();

	            // Security Nature
	            WebElement add2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSecuritynature']")));
	            add2.click();

	            WebElement limitrs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtLimit']")));
	            limitrs.sendKeys("435543");
	            WebElement security = driver.findElement(By.xpath("//input[@id='TxtSecurity']"));
	            security.sendKeys("dverere3");
	            WebElement natureofcharge = driver.findElement(By.xpath("//input[@id='TxtNatureCharge']"));
	            natureofcharge.sendKeys("gergrtrt");
	            WebElement presentvalue = driver.findElement(By.xpath("//input[@id='TxtValueSecurity']"));
	            presentvalue.sendKeys("454543");
	            WebElement remarks1 = driver.findElement(By.xpath("//input[@id='TxtRemarks']"));
	            remarks1.sendKeys("dscacsd");
	            WebElement remarks2 = driver.findElement(By.xpath("//textarea[@id='TxtremarksSecurity']"));
	            remarks2.sendKeys("fsgfsgfsg");

	            WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSecuritySave']")));
	            save.click();

	            WebElement tab2draft = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnTab2Draft']")));
	            tab2draft.click();

	            WebElement clickok2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	            clickok2.click();

	            WebElement moveto3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnMoveto3']")));
	            moveto3.click();

	            // Page 3
	            WebElement contact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtPersonnel']")));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contact);
	            contact.sendKeys("gergrgr");
	            WebElement telephone = driver.findElement(By.xpath("//input[@id='TxtPhone']"));
	            telephone.sendKeys("5435354354");

	            WebElement clickadd3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnPersonnel']")));
	            clickadd3.click();

	            WebElement tab3draft = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnTab3Draft']")));
	            tab3draft.click();

	            WebElement clickok3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	            clickok3.click();

	            WebElement moveto4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnMoveto4']")));
	            moveto4.click();

	            // Page 4
	            WebElement briefhistory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='TxtHistory']")));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", briefhistory);
	            briefhistory.sendKeys("rfrfrf");

	            WebElement managementteam = driver.findElement(By.xpath("//textarea[@id='TxtManagement']"));
	            managementteam.sendKeys("gergr");

	            WebElement briefreason = driver.findElement(By.xpath("//textarea[@id='TxtReasons']"));
	            briefreason.sendKeys("gtgtgt");

	            WebElement clicksubmit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnTab4Save']")));
	            clicksubmit.click();

	            WebElement clickok4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	            clickok4.click();
	            
	            System.out.println("Case added successfully.");
	        }
	    }
	}


