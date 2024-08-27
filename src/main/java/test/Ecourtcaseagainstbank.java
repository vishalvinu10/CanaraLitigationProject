package test;

import java.time.Duration;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Ecourtcaseagainstbank {
	
	private WebDriver driver;
	private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @DataProvider(name = "claimData")
    public Object[][] claimData() {
        return new Object[][]{
            {"yyomyjyhty554568", "998"},
            {"mnscnrno12345628", "323"}
        };
    }

    @Test(priority = 1, dataProvider = "claimData", invocationCount = 1)
    public void ecourtclaimagainstbank(String cnrnoValue, String caseNoValue) throws InterruptedException {

        driver.get("https://safallitigation.onlinesafe.in/");

        WebElement usernameField =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("BU");

        WebElement signInButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

//        Thread.sleep(5000);

        WebElement clickecourt= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/NPA/ECourtCaseListingDetails']")));
        clickecourt.click();
        Thread.sleep(5000);
        WebElement click3dots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[1]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", click3dots);
        Thread.sleep(3000);
        click3dots.click();
        
        WebElement clickclaimagainstbank= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[19]/div[1]/div[1]/a[1]")));
        clickclaimagainstbank.click();
         
//        Thread.sleep(3000);
         
       //customer details
        WebElement clickplus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseCustomerID']")));
        clickplus.click();
//        Thread.sleep(3000);
        
        WebElement searchby = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConSearchBy']")));
        Select searchbySelect = new Select(searchby);
        searchbySelect.selectByVisibleText("Customer Name");
        
        WebElement searchvalue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConSearchValue']")));
        searchvalue.sendKeys("BOSE V");
        
//        Thread.sleep(3000);
        
        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseCustIDSearch']")));
        clicksearch.click();
        
//        Thread.sleep(2000);
        
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]")));
        if (!checkbox.isSelected()) {
        	checkbox.click();
        }
//        Thread.sleep(2000);
        WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseCustIDSave']")));
        add.click();
//        Thread.sleep(2000);
        WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseCustIDOK']")));
        clickok.click();
//        Thread.sleep(2000);
        
        //coborrower
        
        WebElement clickplus1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConBorrower']")));
        clickplus1.click();
//        Thread.sleep(3000);
        WebElement clicklegalheirs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ConLegal']")));
        clicklegalheirs.click();
//        Thread.sleep(1000);
        WebElement checkbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/input[1]")));
        if (!checkbox1.isSelected()) {
        	checkbox1.click();
        }
//        Thread.sleep(3000);
        WebElement add1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConBorrowerSave']")));
        add1.click();
//        Thread.sleep(3000);
        WebElement clickok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConSelectedBorrowerSave']")));
        clickok1.click();
        
        //account number
//        Thread.sleep(3000);
        WebElement addbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseAccountNo']")));
        addbutton.click();
//        Thread.sleep(2000);
        WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")));
        if (!checkbox2.isSelected()) {
        	checkbox2.click();
        }
//        Thread.sleep(2000);
        WebElement addbutton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnConCaseAcSave']")));
        addbutton1.click();
//        Thread.sleep(2000);

       
        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConState']")));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText("Kerala");

        WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConDistrict']")));
        Select locationSelect = new Select(location);
        locationSelect.selectByVisibleText("Palakkad");

        WebElement nameofcourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCourtForum']")));
        Select nameofcourtSelect = new Select(nameofcourt);
        nameofcourtSelect.selectByVisibleText("Civil Court");

        WebElement bench = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseBench']")));
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("District Courts Complex-1");

        WebElement casetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCaseTyp']")));
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Miscellaneous Application (MA)");

        WebElement casestage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCaseStage']")));
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Hearing");

        WebElement natureofcase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCaseNature']")));
        Select natureofcaseSelect = new Select(natureofcase);
        natureofcaseSelect.selectByVisibleText("Bank Guarantee/LC Matters");

        WebElement dateoffiling = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseFilingDate']")));
        dateoffiling.clear();
//        Thread.sleep(2000);
        WebElement dateoffiling1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='29']")));
        dateoffiling1.click();
//        Thread.sleep(2000);
        WebElement dateofreporting = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseReportingDate']")));
        dateofreporting.sendKeys("29-07-2024");

        WebElement cnrno = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCNRNo']")));
        cnrno.sendKeys(cnrnoValue);

        WebElement caseno = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseCaseNo']")));
        caseno.clear();      //can be removed
        caseno.sendKeys(caseNoValue);

        WebElement caseyear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseCaseYear']")));
        Select caseyearSelect = new Select(caseyear);
        caseyearSelect.selectByVisibleText("2024");

       

        WebElement whethermonetary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseMonetaryCase']")));
        Select whethermonetarySelect = new Select(whethermonetary);
        whethermonetarySelect.selectByVisibleText("Yes");

        WebElement plainamount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCasePlaintAmt']")));
        plainamount.sendKeys("400000");
        WebElement intrestclaimed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseInterestClaimed']")));
        intrestclaimed.sendKeys("21");
        WebElement intresttype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConCaseInterestTyp']")));
        Select intresttypeSelect = new Select(intresttype);
        intresttypeSelect.selectByVisibleText("Simple Interest");
        WebElement damagesclaimed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseDamageClaimed']")));
        damagesclaimed.sendKeys("50000");
        WebElement miscclaimed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConCaseMiscClaim']")));
        miscclaimed.sendKeys("30000");
        WebElement factofcase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtConCaseCaseFact']")));
        factofcase.sendKeys("fact");
        WebElement prayer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtConCasePrayer']")));
        prayer.sendKeys("prayer");

//        Thread.sleep(2000);
        WebElement dateofjudgement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConExeJudgmentDate']")));
        dateofjudgement.sendKeys("29-07-2024");
        WebElement dateofEP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConExeEPDate']")));
        dateofEP.sendKeys("29-07-2024");
        WebElement amountofEP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConExeEPAmt']")));
        amountofEP.sendKeys("100000");
        WebElement intrest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConExeInterestAward']")));
        intrest.sendKeys("15");
        WebElement intresttype1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpConExeInterestTyp']")));
        Select intresttypeSelect1 = new Select(intresttype1);
        intresttypeSelect1.selectByVisibleText("Simple Interest");
        WebElement opppartyadvocate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtConExeAdvoctOppParty']")));
        opppartyadvocate.sendKeys("aswin m");
        

        WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/button[7]")));
        save.click();

//        Thread.sleep(2000);

        WebElement ok =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
        ok.click();

//        Thread.sleep(2000);

        WebElement ok1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
        ok1.click();
    }
}

