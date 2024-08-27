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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class TC_DRT_008 {
	
	public class drtcaseadd {
		
		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		    	
		        WebDriverManager.chromedriver().clearDriverCache().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
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
		    public void testAdddrtcase() throws InterruptedException {
		        driver.get("https://safallitigation.onlinesafe.in/");

		        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
		        usernameField.sendKeys("BM");

		        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
		        signInButton.click();
		        
		        Thread.sleep(2000);

		        WebElement approve = driver.findElement(By.xpath("//span[@data-i18n='nav.basic-components.main'][normalize-space()='Approvals']"));
		        approve.click();
		        
		        Thread.sleep(2000);

		        WebElement approvalsElement = driver.findElement(By.xpath("//span[normalize-space()='Approval']"));
		        approvalsElement.click();
		        
		        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='DrpApprvCaseTyp']")));
		        dropdown.selectByVisibleText("DRT");
		        
		        WebElement fromDateField = driver.findElement(By.xpath("//input[@id='TxtApprvFilingDate']"));
		       
		        WebElement toDateField = driver.findElement(By.xpath("//input[@id='TxtApprvFilingTo']"));
		        
		        // Generate random dates
		        String randomFromDate = generateRandomDate();
		        String randomToDate = generateRandomDate();
		        
		        // Enter random dates into the fields
//		        fromDateField.clear();
		        fromDateField.sendKeys(randomFromDate);
//		        toDateField.clear();
		        Thread.sleep(2000);
		        toDateField.sendKeys(randomToDate);
		        
		        Thread.sleep(2000);
		        
		        // Verify that the values are entered correctly
		        Assert.assertEquals(fromDateField.getAttribute("value"), randomFromDate, "From Date field is not correctly populated");
		        Assert.assertEquals(toDateField.getAttribute("value"), randomToDate, "To Date field is not correctly populated");
		        
		        // Print success message
		        System.out.println(" 8) Dates entered in the From Date and To Date fields are fetching: " + randomFromDate + " to " + randomToDate);
		        
		        driver.navigate().refresh();
		        
		        Thread.sleep(2000);
		        
		        Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='DrpApprvCaseTyp']")));
		        dropdown1.selectByVisibleText("DRT");
		        Thread.sleep(3000);
		        WebElement search = driver.findElement(By.xpath("//input[@id='TxtApprvFilingTo']"));
		        search.click();
		        
		        Thread.sleep(2000);
		        
		        // Verify that the table is filtered
		        WebElement table = driver.findElement(By.xpath("//div[@id='Tbl_CaseApprvl_wrapper']"));

		        boolean isTableFiltered = table.getText().contains("DRT");
		        Assert.assertTrue(isTableFiltered, "Table is not filtered as expected");
		        System.out.println("Search worked as expected");
		        
		        driver.navigate().refresh();
		        
		        //reset
		        
		        WebElement FromDateField = driver.findElement(By.xpath("//input[@id='TxtApprvFilingDate']"));
		        WebElement ToDateField = driver.findElement(By.xpath("//input[@id='TxtApprvFilingTo']"));
		        WebElement resetButton = driver.findElement(By.xpath("//button[@id='BtnApprResetFilter']"));
		        
		        FromDateField.sendKeys("01-01-2020");
		        ToDateField.sendKeys("31-12-2020");
		        
		        Thread.sleep(2000);
		        
		        resetButton.click();
		        
		        Thread.sleep(2000);
		        
		        Assert.assertEquals(FromDateField.getAttribute("value"), "", " From Date field is not cleared");
		        Assert.assertEquals(ToDateField.getAttribute("value"), "", " To Date field is not cleared");
		        
		        System.out.println("RESET button successfully cleared all fields.");
		        
		        driver.navigate().refresh();
		        
		        try {
		        
		        Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@id='DrpApprvCaseTyp']")));
		        dropdown3.selectByVisibleText("DRT");
		        WebElement search1 = driver.findElement(By.xpath("//button[@id='BtnApprvSearch']"));
		        search1.click();
		        
		        Thread.sleep(2000);
		        
		      
		            WebElement clickeyebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[11]/a[1]/i[1]"));

		            // Scroll the element into view (optional, but recommended for better handling)
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", clickeyebutton);
		            clickeyebutton.click();

		            // Wait for the page to load after clicking (adjust timeout as needed)
		            Thread.sleep(2000); // Replace with a more robust waiting mechanism if necessary

		            WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='DRT Cases']")));
		            
		            // Now get the title using getText
		            String expectedTitle = "DRT CASES";
		            String actualTitle = titleElement.getText();

		            if (actualTitle.equals(expectedTitle)) {
		                System.out.println("Page title is: " + actualTitle + " (Matches expected)");
		            } else {
		                System.out.println("Page title is: " + actualTitle + " (Does not match expected)");
		            }
		        } catch (Exception e) {
		            System.err.println("Error occurred: " + e.getMessage());
		        } finally {
		            driver.quit();
		        }
		    }

		    // Helper method to generate a random date
		    private String generateRandomDate() {
		        // Define the date range
		        String startDate = "01-01-2020";  // Start date
		        String endDate = "31-12-2023";    // End date

		        // Parse the dates into Date objects
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		        Date start = null;
		        Date end = null;
		        try {
		            start = dateFormat.parse(startDate);
		            end = dateFormat.parse(endDate);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        // Generate a random date between the start and end dates
		        long randomMillis = ThreadLocalRandom.current().nextLong(start.getTime(), end.getTime());
		        Date randomDate = new Date(randomMillis);

		        // Return the date in the desired format
		        return dateFormat.format(randomDate);
		    }
		        
		   
		}
		        

}
