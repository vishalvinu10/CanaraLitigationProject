package drt;

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

public class TC_DRT_0011 {
	
	public class drtcaseadd {
		
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
		    
		    

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		        	driver.close();

		        }
		    }
		    

		    @Test(priority=1)
		    public void testAdddrtcase() throws InterruptedException {
		        driver.get("https://safallitigation.onlinesafe.in/");

		        WebElement usernameField =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BM");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        WebElement approve = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
		        js1.executeScript("arguments[0].click();", approve);
		        
		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        WebElement approvalsElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approval']")));		       
		        js2.executeScript("arguments[0].click();", approvalsElement);
		        
		        Select dropdown = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpApprvCaseTyp']"))));
		        dropdown.selectByVisibleText("DRT");
		        
		        JavascriptExecutor js3 = (JavascriptExecutor) driver;
		        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnApprvSearch']")));		       
		        js3.executeScript("arguments[0].click();", clicksearch);
		        		       
		        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		        WebElement clickeyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[11]/a[1]/i[1]")));		        
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", clickeyebutton);
		        js4.executeScript("arguments[0].click();", clickeyebutton);
	            
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,2000)");
	            
	            WebElement descriptionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtDRTDescription']")));
	            descriptionElement.sendKeys("CASE PUSHBACKED FROM BM");
	            
	            WebElement pushbackbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTRevert']")));
	            pushbackbutton.click();
	            Thread.sleep(2000);
	            JavascriptExecutor js5 = (JavascriptExecutor) driver;
	            WebElement okElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	            js5.executeScript("arguments[0].click();", okElement);
	            Thread.sleep(2000);
	            JavascriptExecutor js6 = (JavascriptExecutor) driver;
	            WebElement okElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-success']")));
	            js6.executeScript("arguments[0].click();", okElement1);
	            	
	            	System.out.println("case pushbacked from BM");
					
				}

}}
