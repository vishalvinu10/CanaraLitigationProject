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

public class Nf607forwardtoco {
	
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
	
	    public void testNF607forwardtoCO() throws InterruptedException {
	    	
	    	 driver.get("https://safallitigation.onlinesafe.in/");
	        

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("RO");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement clickapprovals = driver.findElement(By.xpath("//body/div[@id='pcoded']/div[@class='pcoded-container navbar-wrapper']/div[@class='pcoded-main-container']/div[@class='pcoded-wrapper']/nav[@class='pcoded-navbar']/div[@id='style-7']/ul[@class='pcoded-item pcoded-left-item']/li[3]/a[1]"));
	        clickapprovals.click();
	        Thread.sleep(3000);
	        WebElement NF607approvals  = driver.findElement(By.xpath("//span[normalize-space()='NF607/NF817 Approval']"));
	        NF607approvals.click();
	        
	        Thread.sleep(3000);
	        
      //filter
	        
	        
	        WebElement fromdate  = driver.findElement(By.xpath("//input[@id='TxtNF817ApprvFromDate']"));
	        fromdate.sendKeys("01-01-1999");
	        WebElement todate  = driver.findElement(By.xpath("//input[@id='TxtNF817ApprvToDate']"));
	        todate.sendKeys("06-08-2024");
	        
	        WebElement casetype = driver.findElement(By.xpath("//select[@id='DrpNF817ApprvCaseType']"));
	        Select casetypeSelect = new Select(casetype);
	        casetypeSelect.selectByVisibleText("NF607");
	        
	        Thread.sleep(3000);
	        
	        WebElement clicksearch  = driver.findElement(By.xpath("//button[@id='BtnNF817ApprvSearch']"));
	        clicksearch.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickeyebutton  = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]"));
	        clickeyebutton.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickonpage6  = driver.findElement(By.xpath("//a[@id='table-tab']"));
	        clickonpage6.click();
	        
	        Thread.sleep(3000);
	        
	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        js5.executeScript("window.scrollBy(0,2000)");
	        
	        Thread.sleep(3000);
	        
	        WebElement forwardto = driver.findElement(By.xpath("//select[@id='DrpNF607Forward']"));
	        Select forwardtoSelect = new Select(forwardto);
	        forwardtoSelect.selectByVisibleText("CO");
	        
	        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtNF607Description']"));
	        description.sendKeys("forward to CO");
	        
	        Thread.sleep(5000);
	        
	        WebElement clickonforward  = driver.findElement(By.xpath("//button[@id='BtnNF607Forward']"));
	        clickonforward.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickok  = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	        clickok.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement clickok1  = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	        clickok1.click();
	        
      }
	        

}
