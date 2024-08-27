package nf817;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Nf817addcase {
	
	public class drtcaseadd {
		
		 private WebDriver driver;
		 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://safallitigation.onlinesafe.in/");
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        
	        
	    }

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

	    @Test
	    public void testAddcommercial() throws InterruptedException {
	        

	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

//	        Thread.sleep(5000);
	        
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        clicknpa.click();
	        Thread.sleep(2000);
	        WebElement addcaseNF817 = driver.findElement(By.xpath("//span[normalize-space()='Generate NF817']"));
	        addcaseNF817.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement fromdate = driver.findElement(By.xpath("//input[@id='TxtNF817FromDate']"));
	        fromdate.sendKeys("01-01-2019");
	        WebElement todate = driver.findElement(By.xpath("//input[@id='TxtNF817ToDate']"));
	        todate.sendKeys("06-08-2024");
	        
//	        Thread.sleep(3000);
	        
	        WebElement search = driver.findElement(By.xpath("//button[@id='BtnNF817Search']"));
	        search.click();
	        
	        Thread.sleep(2000);
	        
	        WebElement checkbox = driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]"));
	        if (!checkbox.isSelected()) {
	        	checkbox.click();
	        }
	        
//	        Thread.sleep(1000);
	        WebElement oktoproceed = driver.findElement(By.xpath("//button[@id='BtnNF817OK']"));
	        oktoproceed.click();
	        
//	        Thread.sleep(3000);
	        
	        WebElement reasonforsickness = driver.findElement(By.xpath("//tr[@role='row']//textarea[@class='form-control']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", reasonforsickness);
//         Thread.sleep(3000);
		    reasonforsickness.sendKeys("reason");
//         Thread.sleep(3000);
		    
//         WebElement advocate = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[12]/a[1]/i[1]"));
//		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", advocate);
//         Thread.sleep(3000);
//         advocate.click();
//         Thread.sleep(3000);
//         WebElement Stateofadvocate = driver.findElement(By.xpath("//select[@id='DrpNF817State']"));
//	        Select StateofadvocateSelect = new Select(Stateofadvocate);
//	        StateofadvocateSelect.selectByVisibleText("Kerala");
//	        WebElement districtofadvocate = driver.findElement(By.xpath("//select[@id='DrpNF817District']"));
//	        Select districtofadvocateSelect = new Select(districtofadvocate);
//	        districtofadvocateSelect.selectByVisibleText("Palakkad");
//	        Thread.sleep(3000);
//	        WebElement search1 = driver.findElement(By.xpath("//button[@id='BtnAdvIDDSearch']"));
//	        search1.click();
//	        Thread.sleep(3000);
//	        WebElement checkadv = driver.findElement(By.xpath("(//input[@id='CheckDAdvt_1'])[1]"));
//	        if (!checkadv.isSelected()) {
//	        	checkadv.click();
//	        }
//	        Thread.sleep(3000);
//	        WebElement add = driver.findElement(By.xpath("//button[@id='BtnNF817AdvctSave']"));
//	        add.click();
//	        Thread.sleep(2000);
//	        
//         
         //reccommendations of the branch
         
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
//	        Thread.sleep(3000);
	        
	        
//	        WebElement filesuit = driver.findElement(By.xpath("//input[@id='ChkSuit']"));
//	        if (!filesuit.isSelected()) {
//	        	filesuit.click();
//	        }
	        
	        WebElement save = driver.findElement(By.xpath("//button[@id='BtnNF817Save']"));
	        save.click();
	        Thread.sleep(2000);
	        WebElement ok = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok.click();
	        Thread.sleep(2000);
	        WebElement ok1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok1.click();
	        

	    }}}


