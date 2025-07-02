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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Nf817addcase {
	
	public class drtcaseadd {
		
		 private WebDriver driver;
		 private WebDriverWait wait;
		 List<String> inputData = new ArrayList<>(); 

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("http://192.168.0.137:8955/");
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        
	        // Define input data here
	        inputData.add("But I must explain to you how all this mistaken idea of denouncing pleasure and "
	        		+ "praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer "
	        		+ "of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those "
	        		+ "who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or "
	        		+ "desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure."
	        		+ " To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right "
	        		+ "to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure");
	        inputData.add("Data2");
	        inputData.add("Data3");
	        inputData.add("Data4");
	        inputData.add("Data5");
	        inputData.add("Data6");
	        inputData.add("Data7");
	        
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

	        
	        JavascriptExecutor npaclick = (JavascriptExecutor) driver;
	        WebElement clicknpa = driver.findElement(By.linkText("NPA"));
	        npaclick.executeScript("arguments[0].click();", clicknpa);
//	        Thread.sleep(2000);
	        WebElement addcaseNF817 = driver.findElement(By.linkText("Generate NF817"));
	        addcaseNF817.click();
	        
//	        Thread.sleep(3000);
	        
	        JavascriptExecutor clickaccept = (JavascriptExecutor) driver;
	        WebElement accept = driver.findElement(By.id("CloseNF817ImpNote"));
	        clickaccept.executeScript("arguments[0].click();", accept);
	        
	        WebElement fromdate = driver.findElement(By.xpath("//input[@id='TxtNF817FromDate']"));
	        fromdate.sendKeys("01-01-2025");
	        
	        WebElement todate = driver.findElement(By.xpath("//input[@id='TxtNF817ToDate']"));
	        LocalDate today = LocalDate.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        String todayString = today.format(formatter);
	        todate.sendKeys(todayString);
	        
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
	        
	        Thread.sleep(2000);
	        	    

         //reccommendations of the branch
         
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");

	        // Iterate through the data and input into respective textareas
	        for (int i = 1; i <= inputData.size(); i++) { // Start from 1 as index starts from 1 in xpath
	            String xpath = "(//textarea[@class='form-control'])[" + i + "]";
	            try {
	                WebElement reasonforsickness = driver.findElement(By.xpath(xpath));
	                reasonforsickness.clear();
	                reasonforsickness.sendKeys(inputData.get(i - 1)); 
	            } catch (org.openqa.selenium.NoSuchElementException e) {
	                System.out.println("Textarea with index " + i + " not found. Skipping.");
	                continue; // Skip to the next iteration
	                
	               
	            }
	        }
	        // Proceed to the next step if all textareas are handled or some were skipped
	        
	        WebElement save = driver.findElement(By.xpath("//button[@id='BtnNF817Save']"));
	        save.click();
	        Thread.sleep(2000);
	        WebElement ok = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok.click();
	        Thread.sleep(2000);
	        WebElement ok1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]"));
	        ok1.click();
	        

	    }}}


