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

public class TC_DRT_0012 {
	
	
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
		        
		        
		        JavascriptExecutor js7 = (JavascriptExecutor) driver;
		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        js7.executeScript("arguments[0].click();", signInButton);
		        

		        JavascriptExecutor js5 = (JavascriptExecutor) driver;
		        WebElement approve = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']")));
		        js5.executeScript("arguments[0].click();", approve);
		       
		        
		        JavascriptExecutor js6 = (JavascriptExecutor) driver;
		        WebElement approvalsElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Approval']")));
		        js6.executeScript("arguments[0].click();", approvalsElement);
		        
		        Select dropdown = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpApprvCaseTyp']"))));
		        dropdown.selectByVisibleText("DRT");
		        
		        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		        WebElement clicksearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnApprvSearch']")));
		        js4.executeScript("arguments[0].click();", clicksearch);
		        
		       Thread.sleep(2000);
		       
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	            WebElement clickeyebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[11]/a[1]/i[1]"));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", clickeyebutton);
	            js1.executeScript("arguments[0].click();", clickeyebutton);
	            
	          
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,2000)");
	            
	            WebElement descriptionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtDRTDescription']")));
	            descriptionElement.sendKeys("CASE REJECTED FROM BM");
	            
	            WebElement rejectbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDRTReject']")));
	            rejectbutton.click();
	            
	            Thread.sleep(2000);

	            JavascriptExecutor js11 = (JavascriptExecutor) driver;
	            WebElement okElement = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	            js11.executeScript("arguments[0].click();", okElement);
	            System.out.println("case rejected successfully");
	            
	            Thread.sleep(2000);
	            JavascriptExecutor js2 = (JavascriptExecutor) driver;
	            WebElement okElement1 = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	            js2.executeScript("arguments[0].click();", okElement1);
	 	            
	            	
					
				}
	

}}



