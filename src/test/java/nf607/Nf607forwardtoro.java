package nf607;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Nf607forwardtoro {
	
	 private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	    	WebDriverManager.chromedriver().clearDriverCache().setup();
	        driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	        
	        
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	    @Test
	
	
	    public void testNF607forwardtoRO() throws InterruptedException {
	    	
	    	 driver.get("https://safallitigation.onlinesafe.in/");
	        

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BM");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement clickapprovals = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[4]/a[1]"));
	        clickapprovals.click();
	        Thread.sleep(3000);
	        WebElement approvals = driver.findElement(By.xpath("//span[normalize-space()='NF607/NF817 Approval']"));
	        approvals.click();
	        
	        Thread.sleep(3000);
	        
	        //filter
	        WebElement fromdate = driver.findElement(By.xpath("//input[@id='TxtNF817ApprvFromDate']"));
	        fromdate.sendKeys("01-01-2000");
	        WebElement todate = driver.findElement(By.xpath("//input[@id='TxtNF817ApprvToDate']"));
	        todate.sendKeys("06-08-2024");
	        WebElement type = driver.findElement(By.xpath("//select[@id='DrpNF817ApprvCaseType']"));
	        Select typeSelect = new Select(type);
	        typeSelect.selectByVisibleText("NF607");
	        Thread.sleep(3000);
	        
	        WebElement search = driver.findElement(By.xpath("//button[@id='BtnNF817ApprvSearch']"));
	        search.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickeyebutton = driver.findElement(By.xpath("(//i[@class='EditApprovalDetails fa fa-eye fnt-18 fnt-bold text-violet'])[1]"));
	        clickeyebutton.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement click6page = driver.findElement(By.xpath("(//a[normalize-space()='6'])[1]"));
	        click6page.click();
	        
	        Thread.sleep(2000);
	        
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        js5.executeScript("window.scrollBy(0,2000)");
	        
	        Thread.sleep(2000);
	        
	        WebElement forward = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]/fieldset[1]/select[1]"));
	        Select forwardSelect = new Select(forward);
	        forwardSelect.selectByVisibleText("RO");
	        
	        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtNF607Description']"));
	        description.sendKeys("forward to RO");
	        
	        Thread.sleep(2000);
	        
	        WebElement forwardbutton = driver.findElement(By.xpath("//button[@id='BtnNF607Forward']"));
	        forwardbutton.click();
	        Thread.sleep(2000);
	        WebElement ok = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok.click();
	        Thread.sleep(2000);
	        WebElement ok1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok1.click();
	        
	    }
	        

}
