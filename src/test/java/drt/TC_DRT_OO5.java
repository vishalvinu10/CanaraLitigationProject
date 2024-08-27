package drt;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
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

public class TC_DRT_OO5 {
	
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
	
    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	        	driver.close();

	        }
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
    
    @Test(priority=1)
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
        
        //coborrower/Guarantor/Legal Heirs
        
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
        
        //state of court
        
        WebElement StateofCourt = driver.findElement(By.xpath("//select[@id='DrpDRTState']"));
        Select StateofCourtSelect = new Select(StateofCourt);
        StateofCourtSelect.selectByVisibleText("Kerala");
        
        //Location of the Court
        
        WebElement LocationoftheCourt = driver.findElement(By.xpath("//select[@id='DrpDRTDistrict']"));
        Select LocationoftheCourtSelect = new Select(LocationoftheCourt);
        LocationoftheCourtSelect.selectByVisibleText("Palakkad");
        
        //Name of the Court
        
        WebElement NameoftheCourt = driver.findElement(By.xpath("//select[@id='DrpCourtName']"));
        Select NameoftheCourtSelect = new Select(NameoftheCourt);
        NameoftheCourtSelect.selectByVisibleText("DRT");
        
        //BENCH
        
        WebElement bench = driver.findElement(By.xpath("//select[@id='DrpBench']"));
        Select benchSelect = new Select(bench);
        benchSelect.selectByVisibleText("COIMBATORE");
        
        //case type
        
        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpCaseTyp']"));
        Select casetypeSelect = new Select(casetype);
        casetypeSelect.selectByVisibleText("Miscellaneous Application");
        
        //case stage
        
        WebElement casestage = driver.findElement(By.xpath("//select[@id='DrpCaseStage']"));
        Select casestageSelect = new Select(casestage);
        casestageSelect.selectByVisibleText("Hearing");
        
        //Date of Filing
        
        WebElement DateofFiling = driver.findElement(By.xpath("//input[@id='TxtFilingDate']"));
        DateofFiling.sendKeys("01-01-2000");
        
        //Role of Bank
        
        WebElement RoleofBank = driver.findElement(By.xpath("//select[@id='DrpDRTCanaraRole']"));
        Select RoleofBankSelect = new Select(RoleofBank);
        RoleofBankSelect.selectByVisibleText("Petitioner(s)");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        
        //Bank’s Advocate
        
        WebElement clickaddbutton2 = driver.findElement(By.xpath("//button[@id='BtnAdvctName']"));
        clickaddbutton2.click();
        
        WebElement StateofAdvocate = driver.findElement(By.xpath("//select[@id='DrpAdvDRTState']"));
        Select StateofAdvocateSelect = new Select(StateofAdvocate);
        StateofAdvocateSelect.selectByVisibleText("Kerala");
        WebElement DistrictofAdvocate = driver.findElement(By.xpath("//select[@id='DrpAdvDRTDistrict']"));
        Select DistrictofAdvocateSelect = new Select(DistrictofAdvocate);
        DistrictofAdvocateSelect.selectByVisibleText("Palakkad");
        WebElement clicksearchbutton= driver.findElement(By.xpath("//button[@id='BtnAdvIDDSearch']"));
        clicksearchbutton.click();
        
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='CheckDAdvt_1'])[1]"));
        if (!checkbox2.isSelected()) {
        	checkbox2.click();
        }
        
        WebElement clickaddbutton3 = driver.findElement(By.xpath("//button[@id='BtnAdvctSave']"));
        clickaddbutton3.click();
        
        //diary no
        
   
   	 WebElement diarynoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDiaryNo']")));
   	diarynoElement.sendKeys("2");
        
        //diary year
	 WebElement diaryyear = driver.findElement(By.xpath("//select[@id='DrpDiaryYear']"));
	 Select diaryyearSelect = new Select(diaryyear);
	 diaryyearSelect.selectByVisibleText("2024");
        
        //CNR No
      
        
        WebElement cNRNOElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtDRTCNRNo']")));
        cNRNOElement.sendKeys(generateRandomCNRNumber());
        String generatedCNRNumber = generateRandomCNRNumber();
        System.out.println("Generated CNR Number: " + generatedCNRNumber);
        
        WebElement caseno = driver.findElement(By.xpath("//input[@id='TxtCaseNo']"));
        caseno.sendKeys("4");
        
        
        WebElement caseyear = driver.findElement(By.xpath("//select[@id='DrpCaseYear']"));
        Select caseyearSelect = new Select(caseyear);
        caseyearSelect.selectByVisibleText("2024");
        
        WebElement clicksave = driver.findElement(By.xpath("//button[@id='BtnDRTSave']"));
        clicksave.click();
        
        Thread.sleep(2000);
        
        WebElement clickok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
        clickok.click();
        
        Thread.sleep(5000);
        
//        WebElement clickok1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
//        clickok1.click();
        
            
            WebElement clickok1 = null;
	        try {
	        	clickok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
	        } catch (TimeoutException e) {
	            System.out.println(" 5) Not saved with minimum length");
	        }

	        if (clickok1 != null) {
	        	clickok1.click();
	            System.out.println(" 5) Successfully saved with minimum length");
	        }
	    }

	    




}


