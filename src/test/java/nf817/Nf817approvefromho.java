package nf817;

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

public class Nf817approvefromho {
	
	public class Nf607approvefromho {
		
		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		    	WebDriverManager.chromedriver().clearDriverCache().setup();
		        driver = new ChromeDriver();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		       
		        driver.manage().window().maximize();
		        
		        
		    }

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }
		
		    @Test
	 	    public void testNF817approveHO() throws InterruptedException {
	 	    	
	 	    	 driver.get("https://safallitigation.onlinesafe.in/");
	 	        

	 	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	 	        usernameField.sendKeys("HO");

	 	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	 	        signInButton.click();
	 	        
	 	        Thread.sleep(5000);
	 	        
	 	        WebElement clickapprovals = driver.findElement(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']"));
	 	        clickapprovals.click();
	 	        Thread.sleep(3000);
	 	        WebElement NF607approvals  = driver.findElement(By.xpath("//span[normalize-space()='NF607/NF817 Approval']"));
	 	        NF607approvals.click();
	 	        
	 	        Thread.sleep(3000);
	 	        
		        //filter
	 	        
	 	        
	 	        WebElement fromdate  = driver.findElement(By.xpath("(//input[@id='TxtNF817ApprvFromDate'])[1]"));
	 	        fromdate.sendKeys("01-01-1999");
	 	        WebElement todate  = driver.findElement(By.xpath("(//input[@id='TxtNF817ApprvToDate'])[1]"));
	 	        todate.sendKeys("06-08-2024");
	 	        
	 	        WebElement casetype = driver.findElement(By.xpath("(//select[@id='DrpNF817ApprvCaseType'])[1]"));
	 	        Select casetypeSelect = new Select(casetype);
	 	        casetypeSelect.selectByVisibleText("NF817");
	 	        
	 	       WebElement search = driver.findElement(By.xpath("//button[@id='BtnNF817ApprvSearch']"));
	 	        search.click();
	 	        
	 	        Thread.sleep(3000);
	 	        
	 	        WebElement clickeyebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]/i[1]"));
	 	        clickeyebutton.click();
	 	        
	 	        Thread.sleep(5000);
	 	        
	 	        JavascriptExecutor js = (JavascriptExecutor) driver;
	 	        js.executeScript("window.scrollBy(0,2000)");
	 	        Thread.sleep(3000);
	 	        
	 	        
	 	       WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtNF817Description']"));
	 	        description.sendKeys("approved from HO");
	 	        
	 	        Thread.sleep(2000);
	 	        
	 	        WebElement clickapprove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/button[2]")));
	 	       clickapprove.click();
	 	        Thread.sleep(2000);
	 	        WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
	 	        clickok.click();
	 	        Thread.sleep(2000);
	 	        WebElement clickok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
	 	        clickok1.click();
	}
	}


}
