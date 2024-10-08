package nclt;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ncltaddcase {
	
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
//	    
	    
		// Method to generate a random 5-digit number
		private String generateRandomDiaryNumber() {
			Random random = new Random();
			int diaryNumber = random.nextInt(90000) + 10000; // Ensures a 5-digit number
			return String.valueOf(diaryNumber);
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
	    
	   

	@Test()
	public void ncltaddcase() throws InterruptedException {
		


		 driver.get("https://safallitigation.onlinesafe.in/");

		 WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		 usernameField.sendKeys("BU");

		 WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		 signInButton.click();
		 
		 JavascriptExecutor clicknpa = (JavascriptExecutor) driver;
		 WebElement clicknpaElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA']")));
		 clicknpa.executeScript("arguments[0].click();", clicknpaElement);
		 
		 JavascriptExecutor clickaddcase = (JavascriptExecutor) driver;
		 WebElement clickaddcaseElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='NPA']//following::span[normalize-space()='Add Cases']")));
		 clickaddcase.executeScript("arguments[0].click();", clickaddcaseElement);
		 
		 
		 JavascriptExecutor clickthreedots = (JavascriptExecutor) driver;
		 WebElement clickthreedotsElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[9]/div[1]/button[1]/i[1]")));
		 clickthreedots.executeScript("arguments[0].click();", clickthreedotsElement);
		 
		 
		 JavascriptExecutor clickNCLT = (JavascriptExecutor) driver;
		 WebElement clickNCLTElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[9]/div[1]/div[1]/a[1]")));
		 clickNCLT.executeScript("arguments[0].click();", clickNCLTElement);
		 
		//MASTER PAGE
		 JavascriptExecutor clickclosebutton = (JavascriptExecutor) driver;
		 WebElement clickclosebuttonElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CloseNCLTCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']")));
		 clickclosebutton.executeScript("arguments[0].click();", clickclosebuttonElement);
		 
		 WebElement provsion =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTProvision']")));
		 provsion.sendKeys("4565");
		 WebElement LEInumber =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTLEINo']")));
		 LEInumber.sendKeys("6757");
		 
		 WebElement nameofthecourt =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCourtName']")));
		 Select nameofthecourtSelect = new Select(nameofthecourt);
		 nameofthecourtSelect.selectByVisibleText("NCLT, Kochi");
		 
		 WebElement bench =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTBench']")));
		 Select benchSelect = new Select(bench);
		 benchSelect.selectByVisibleText("II");
		 
		 WebElement casetype =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCaseTyp']")));
		 Select casetypeSelect = new Select(casetype);
		 casetypeSelect.selectByVisibleText("Company Petition (IBC)");
		 
		 WebElement casestage =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCaseStage']")));
		 Select casestageSelect = new Select(casestage);
		 casestageSelect.selectByVisibleText("Application Accepted");
		 
		 WebElement dateoffiling =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTFilingDate']")));
		 dateoffiling.sendKeys("12-09-2024");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,2000)");
		 
//		 WebElement applicatioU =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTApplicationUSe']")));
//		 Select applicatioUSelect = new Select(applicatioU);
//		 applicatioUSelect.selectByVisibleText("Section 7");
		 
		 WebElement applicatioU = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTApplicationUSe']")));
		 // Creating a Select object
		 Select applicatioUSelect = new Select(applicatioU);
		 // Getting available options from the dropdown
		 System.out.println("Available options in the dropdown:");
		 for (WebElement option : applicatioUSelect.getOptions()) {
			 System.out.println(option.getText());
	        }

		 // Taking input from the user
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the option you want to select: ");
		 String selectedOption = scanner.nextLine();

		 // Selecting the option entered by the user
		 try {
			 	applicatioUSelect.selectByVisibleText(selectedOption);
			 	System.out.println("Selected option applicatioU: " + selectedOption);
	        } catch (Exception e) {
	            System.out.println("The option '" + selectedOption + "' is not available in the dropdown.");
	        }

		 scanner.close();
	    	 
		 WebElement applicanttype =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTApplicationTyp']")));
		 Select applicanttypeSelect = new Select(applicanttype);
		 applicanttypeSelect.selectByVisibleText("Financial Creditor");
		 
		 WebElement clickrespontant =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTRespondent']")));
		 clickrespontant.click();
		 WebElement respontantname =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTRespondent']")));
		 respontantname.sendKeys("amritha");

		 
		 WebElement clickaddElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTRespondentSave']")));
		 clickaddElement.click();
		 WebElement clickpopupok =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
		 clickpopupok.click();

		
		 WebElement roleofbank =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTCanaraRole']")));
		 Select roleofbankSelect = new Select(roleofbank);
		 roleofbankSelect.selectByVisibleText("Petitioner(s)");
		 
		 WebElement intresttype =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTInterestTyp']")));
		 Select intresttypeSelect = new Select(intresttype);
		 intresttypeSelect.selectByVisibleText("Simple Interest");
		 
	        
	 
		 WebElement diarynoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTDiaryNo']")));
		 String generatedDiaryNumber = generateRandomDiaryNumber();
		 diarynoElement.sendKeys(generatedDiaryNumber);
		 System.out.println("Generated Diary Number: " + generatedDiaryNumber);
		 
		 WebElement diaryyearElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpNCLTDiaryYear']")));
		 Select diaryyearElementSelect = new Select(diaryyearElement);
		 diaryyearElementSelect.selectByVisibleText("2024");
		 
		 WebElement cNRNOElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtNCLTCNRNo']")));
		 cNRNOElement.sendKeys(generateRandomCNRNumber());
		 String generatedCNRNumber = generateRandomCNRNumber();
		 System.out.println("Generated CNR Number: " + generatedCNRNumber);
 
		 WebElement CPIBNo =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtCPIBNo']")));
		 CPIBNo.sendKeys("5657");
		 
		 WebElement caseyearElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpCaseYear']")));
		 Select caseyearElementSelect = new Select(caseyearElement);
		 caseyearElementSelect.selectByVisibleText("2024");
		 
		 
		 WebElement clickclosElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CloseNCLTRespondent\"]/span")));
		 clickclosElement.click();
		 
		 WebElement clicksaveeElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNCLTSave']")));
		 clicksaveeElement.click();
		 WebElement clickokElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
		 clickokElement.click();
		 
		 // Verify if the case is successfully saved
	        try {
	        	 WebElement clickokElement1 =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	    		 clickokElement1.click();
	            Assert.assertTrue(clickokElement1.isDisplayed(), "Successfully saved");
	            System.out.println(" 1) Case successfully saved.");
	        } catch (Exception e) {
	            System.out.println(" 1) Case not saved.");
	        }
		
	    }
	
}
	 
	    
	
