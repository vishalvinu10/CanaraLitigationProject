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

public class TC_CC_009 {
	
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
	        
	        Thread.sleep(2000);
	        
	        WebElement caseNumberElement =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]"))); // Adjust the XPath if necessary
	        String selectedCaseNumber = caseNumberElement.getText();
	        System.out.println("The selected case number is: " + selectedCaseNumber);
	        
	       
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@id='BtnSelectApprovl'])[1]")));
	        js1111.executeScript("arguments[0].click();", clickeyebutton);
	        
	      //approval
	        JavascriptExecutor js11111 = (JavascriptExecutor) driver;
	        WebElement reject = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnComReject']")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reject);       
	        js11111.executeScript("arguments[0].click();", reject);
         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js111111 = (JavascriptExecutor) driver;
	        WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        js111111.executeScript("arguments[0].click();", clickok);
         
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js1111111 = (JavascriptExecutor) driver;
	        WebElement clickokagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	        js1111111.executeScript("arguments[0].click();", clickokagain);
	        
	        System.out.println("Rejected case number: " + selectedCaseNumber + " successfully");
	        
	        JavascriptExecutor pro = (JavascriptExecutor) driver;
	        WebElement Profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='waves-effect waves-light']//i[@class='fa fa-angle-down']")));
	        pro.executeScript("arguments[0].click();", Profile);
	        
	        JavascriptExecutor logout = (JavascriptExecutor) driver;
	        WebElement clicklogout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
	        logout.executeScript("arguments[0].click();", clicklogout);
	        
	        WebElement usernameField1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
	        usernameField1.sendKeys("BU");

	        WebElement signInButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
	        signInButton1.click();
	        
	        JavascriptExecutor appv = (JavascriptExecutor) driver;
	        WebElement clickapprovals1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
	        appv.executeScript("arguments[0].click();", clickapprovals1);
	        
	        JavascriptExecutor pushpend = (JavascriptExecutor) driver;
	        WebElement pushbackpending = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='pcoded-hasmenu pcoded-trigger']//li[1]//a[1]//span[2]")));
	        pushpend.executeScript("arguments[0].click();", pushbackpending);
	           
	        WebElement casestatus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpFilterType']")));
	        Select casestatusSelect = new Select(casestatus);
	        casestatusSelect.selectByVisibleText("Rejected");
	        
	        JavascriptExecutor search1 = (JavascriptExecutor) driver;
	        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnRPSearch']")));
	        search1.executeScript("arguments[0].click();", clicksearch);
	    
	        Thread.sleep(2000);
	        
	        WebElement caseNumber =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[4]"))); // Adjust the XPath if necessary
	        String selectedCaseNumber1 = caseNumber.getText();
	              
	        if (selectedCaseNumber.equals(selectedCaseNumber1)) {
	            System.out.println("Success: The case number rejected matches the case number in rejected list which is " + selectedCaseNumber);
	        } else {
	            System.out.println("Error: The case number rejected does not match the case number in rejected list.");
	        }
	   

}}
