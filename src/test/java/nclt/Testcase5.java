package nclt;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase5 {
	
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
	
    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
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
	    
	    @Test(priority = 1)
	    public void ncltaddcase() throws InterruptedException {
	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	        signInButton.click();

	        WebElement clicknpaElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA']")));
	        clicknpaElement.click();

	        WebElement clickaddcaseElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA']//following::span[normalize-space()='Add Cases']")));
	        clickaddcaseElement.click();

	        WebElement clickthreedotsElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='BOSE V']/..//i[@class='fa fa-ellipsis-v']")));
	        clickthreedotsElement.click();

	        WebElement clickNCLTElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='1_42987221']//i[@class='fa fa-ellipsis-v']//following::a[@id='81']")));
	        clickNCLTElement.click();

	        // MASTER PAGE
	        WebElement clickclosebuttonElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CloseNCLTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']")));
	        clickclosebuttonElement.click();

	        // Enter minimum length data
	        WebElement provsion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTProvision']")));
	        provsion.sendKeys("4"); // Minimum length (1 character)

	        WebElement LEInumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTLEINo']")));
	        LEInumber.sendKeys("6"); // Minimum length (1 character)

	        WebElement nameofthecourt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCourtName']")));
	        Select nameofthecourtSelect = new Select(nameofthecourt);
	        nameofthecourtSelect.selectByVisibleText("NCLT, Kochi");

	        WebElement bench = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTBench']")));
	        Select benchSelect = new Select(bench);
	        benchSelect.selectByVisibleText("II");

	        WebElement casetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCaseTyp']")));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("Company Petition (IBC)");

	        WebElement casestage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCaseStage']")));
	        Select casestageSelect = new Select(casestage);
	        casestageSelect.selectByVisibleText("Application Accepted");

	        WebElement dateoffiling = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTFilingDate']")));
	        dateoffiling.sendKeys("09-08-2024");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");

	        WebElement applicatioU = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTApplicationUSe']")));
	        Select applicatioUSelect = new Select(applicatioU);
	        applicatioUSelect.selectByVisibleText("Section 7");

	        WebElement applicanttype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTApplicationTyp']")));
	        Select applicanttypeSelect = new Select(applicanttype);
	        applicanttypeSelect.selectByVisibleText("Financial Creditor");

	        WebElement clickrespontant = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTRespondent']")));
	        clickrespontant.click();

	        WebElement respontantname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTRespondent']")));
	        respontantname.sendKeys("a"); // Minimum length (1 alphabet character)

	        WebElement clickaddElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTRespondentSave']")));
	        clickaddElement.click();
	        WebElement clickpopupok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        clickpopupok.click();

	        WebElement roleofbank = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCanaraRole']")));
	        Select roleofbankSelect = new Select(roleofbank);
	        roleofbankSelect.selectByVisibleText("Petitioner(s)");

	        WebElement intresttype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTInterestTyp']")));
	        Select intresttypeSelect = new Select(intresttype);
	        intresttypeSelect.selectByVisibleText("Simple Interest");

	        WebElement diarynoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTDiaryNo']")));
	        diarynoElement.sendKeys("1"); // Minimum length (1 character)

	        WebElement diaryyearElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTDiaryYear']")));
	        Select diaryyearElementSelect = new Select(diaryyearElement);
	        diaryyearElementSelect.selectByVisibleText("2024");

	        WebElement cNRNOElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTCNRNo']")));
	        cNRNOElement.sendKeys(generateRandomCNRNumber()); // Generate a random 16-character alphanumeric string

	        WebElement CPIBNo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCPIBNo']")));
	        CPIBNo.sendKeys("5"); // Minimum length (1 character)

	        WebElement caseyearElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCaseYear']")));
	        Select caseyearElementSelect = new Select(caseyearElement);
	        caseyearElementSelect.selectByVisibleText("2024");

	        WebElement clickclosElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CloseNCLTRespondent\"]/span")));
	        clickclosElement.click();

	        WebElement clicksaveeElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTSave']")));
	        clicksaveeElement.click();

	        // Check if the form was saved successfully
	        WebElement clickokElement = null;
	        try {
	            clickokElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        } catch (TimeoutException e) {
	            System.out.println(" 5) Not saved with minimum length");
	        }

	        if (clickokElement != null) {
	            clickokElement.click();
	            System.out.println(" 5) Successfully saved with minimum length");
	        }
	    }

	    

}
