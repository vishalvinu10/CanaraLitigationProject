package commercialcourt;

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
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_CC_007 {
	

	 private WebDriver driver;
	 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().clearDriverCache().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies(); 
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }


	
	 @Test(priority=1)
	    public void testcommercialapprove() throws InterruptedException {
		 
		 	driver.get("http://192.168.0.137:8955/");
//	        driver.get("https://safallitigation.onlinesafe.in/");

	        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	        usernameField.sendKeys("BM");

	        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	        signInButton.click();
	        
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement clickapprovals = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='waves-effect waves-dark'])[7]")));
	        js1.executeScript("arguments[0].click();", clickapprovals);
	        
	        JavascriptExecutor js11 = (JavascriptExecutor) driver;
	        WebElement approval = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approval']")));
	        js11.executeScript("arguments[0].click();", approval);
	    
	        //filter

	        WebElement NatureofCase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpApprvCaseTyp']")));
	        Select NatureofCaseSelect = new Select(NatureofCase);
	        NatureofCaseSelect.selectByVisibleText("Commercial Court");
	        
	        JavascriptExecutor js111 = (JavascriptExecutor) driver;
	        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnApprvSearch']")));
	        js111.executeScript("arguments[0].click();", search);
	        
	        WebElement caseNumberElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]")); // Adjust the XPath if necessary
	        String selectedCaseNumber = caseNumberElement.getText();
	        System.out.println("The selected case number for approval is: " + selectedCaseNumber);
	        
	       
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@id='BtnSelectApprovl'])[1]")));
	        js1111.executeScript("arguments[0].click();", clickeyebutton);
	        
	      //approval
	        JavascriptExecutor js11111 = (JavascriptExecutor) driver;
	        WebElement approvebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComApprove']")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", approvebutton);       
	        js11111.executeScript("arguments[0].click();", approvebutton);
         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js111111 = (JavascriptExecutor) driver;
	        WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        js111111.executeScript("arguments[0].click();", clickok);
         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js1111111 = (JavascriptExecutor) driver;
	        WebElement clickokagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        js1111111.executeScript("arguments[0].click();", clickokagain);
	        
	        System.out.println("Approved case number: " + selectedCaseNumber + " successfully");
         
     }
         

}
