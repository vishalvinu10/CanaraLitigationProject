package sarfesi;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eligible {
	
	
	public class sarfesieligible {
		
		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    }
		    

//		    @AfterClass
//		    public void tearDown() {
//		        if (driver != null) {
//		        	driver.close();
//
//		        }
//		    }
		    
		    @Test(priority=1)
		    public void testsarfesieligible() throws InterruptedException {
		    	
		        driver.get("https://safallitigation.onlinesafe.in/");
		        
//		        driver.get("http://192.168.0.137:8955/");

		        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BU");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();

		        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		        WebElement sarfesi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]/span[2]")));
		        js4.executeScript("arguments[0].click();", sarfesi);
		        		        
		        JavascriptExecutor js41 = (JavascriptExecutor) driver;
		        WebElement eligible = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]/span[2]")));
		        js41.executeScript("arguments[0].click();", eligible);
		        		        
		        JavascriptExecutor js5 = (JavascriptExecutor) driver;
		        WebElement eyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]")));
		        js5.executeScript("arguments[0].click();", eyebutton);
		        
		        
		        JavascriptExecutor js51 = (JavascriptExecutor) driver;
		        WebElement othercaseclosebuttom = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CloseSFCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']")));
		        js51.executeScript("arguments[0].click();", othercaseclosebuttom);
		        
		        //security assets
		        
		        JavascriptExecutor js511 = (JavascriptExecutor) driver;
		        WebElement clicksecurityassets = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSarfaesiAsset']")));
		        js511.executeScript("arguments[0].click();", clicksecurityassets);
		        
		        List<String> accountNumbers = Arrays.asList("101151939001", "93173387001", "58270079002", "64909988007", "0769856003707001", "52232963001");

		        for (String accountNumber : accountNumbers) {
		            String xpathExpression = String.format("//input[@id='CheckAcc_%s']", accountNumber);

		            try {
		                WebElement accountCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
		                JavascriptExecutor js = (JavascriptExecutor) driver;
		                js.executeScript("arguments[0].click();", accountCheckbox);

		            } catch (Exception e) {
		                System.out.println("Failed to click account checkbox for account: " + accountNumber + " - " + e.getMessage());
		            }
		        }

		        
		        JavascriptExecutor js531 = (JavascriptExecutor) driver;
		        WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnSarfaesiAssetAdd")));
		        js531.executeScript("arguments[0].click();", add);
		        
//		        Guarantor/Legal Heir/Co-Obligant/Co-Borrower Details
		        
		        JavascriptExecutor js5311 = (JavascriptExecutor) driver;
		        WebElement Guarantor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSarfaesiGuarantor']")));
		        js5311.executeScript("arguments[0].click();", Guarantor);
}}}
