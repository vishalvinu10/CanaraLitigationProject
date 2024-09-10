package sarfesi;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eligible {
	
	
	public class sarfesieligible {
		
		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    }
		    

//		    @AfterClass
//		    public void tearDown() {
//		        if (driver != null) {
//		        	driver.close();
//
//		        }
//		    }
		    
		    @Test(priority=1)
		    public void testsarfesieligible() throws InterruptedException {
		    	
		        driver.get("https://safallitigation.onlinesafe.in/");
		        
//		        driver.get("http://192.168.0.137:8955/");

		        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BU");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();

		        JavascriptExecutor js4 = (JavascriptExecutor) driver;
		        WebElement sarfesi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]/span[2]")));
		        js4.executeScript("arguments[0].click();", sarfesi);
		        		        
		        JavascriptExecutor js41 = (JavascriptExecutor) driver;
		        WebElement eligible = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/ul[1]/li[1]/a[1]/span[2]")));
		        js41.executeScript("arguments[0].click();", eligible);
		        
		        // clicking the eye button
		        
		        String[] xpaths = {
		                "//tbody/tr[1]/td[9]/a[1]/i[1]",
		                "//tbody/tr[2]/td[9]/a[1]/i[1]",
		                "//tbody/tr[3]/td[9]/a[1]/i[1]",
		                "//tbody/tr[4]/td[9]/a[1]/i[1]",
		                "//tbody/tr[5]/td[9]/a[1]/i[1]",
		                "//tbody/tr[6]/td[9]/a[1]/i[1]",
		                "//tbody/tr[7]/td[9]/a[1]/i[1]",
		                "//tbody/tr[8]/td[9]/a[1]/i[1]",
		                "//tbody/tr[9]/td[9]/a[1]/i[1]",
		                "//tbody/tr[10]/td[9]/a[1]/i[1]",
		                "//tbody/tr[11]/td[9]/a[1]/i[1]",
		                "//tbody/tr[12]/td[9]/a[1]/i[1]",
		                "//tbody/tr[13]/td[9]/a[1]/i[1]",
		                "//tbody/tr[14]/td[9]/a[1]/i[1]",
		                "//tbody/tr[15]/td[9]/a[1]/i[1]"
		                
		            };

		            // Ask the user which XPath to use
		            Scanner scanner = new Scanner(System.in);
		            System.out.println("Please select which element to click:");
		            for (int i = 0; i < xpaths.length; i++) {
		                System.out.println((i + 1) + ": " + xpaths[i]);
		            }

		            int choice = scanner.nextInt();
		            scanner.close();

		            // Validate the user's choice
		            if (choice < 1 || choice > xpaths.length) {
		                System.out.println("Invalid choice. Exiting.");
		                return;
		            }

		            // Use the selected XPath
		            String selectedXPath = xpaths[choice - 1];

		            try {
		                // Find the element using the selected XPath
		                JavascriptExecutor js5 = (JavascriptExecutor) driver;
		                WebElement eyebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectedXPath)));
		                js5.executeScript("arguments[0].click();", eyebutton);
		                System.out.println("Clicked on the element using XPath: " + selectedXPath);

		            } catch (Exception e) {
		                System.out.println("Failed to click the element - " + e.getMessage());
		            }
		        		        
		      
		        JavascriptExecutor js51 = (JavascriptExecutor) driver;
		        WebElement othercaseclosebuttom = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CloseSFCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']")));
		        js51.executeScript("arguments[0].click();", othercaseclosebuttom);
		        
		        //security assets
		        
		        JavascriptExecutor js511 = (JavascriptExecutor) driver;
		        WebElement clicksecurityassets = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSarfaesiAsset']")));
		        js511.executeScript("arguments[0].click();", clicksecurityassets);
		        
		        // List of account numbers
		        List<String> accountNumbers = Arrays.asList("101151939001", "93173387001", "58270079002", "64909988007", 
		                                                    "0769856003707001", "52232963001", "6466823002", "121749246001", 
		                                                    "11192342478011", "112100264001074123", "27784136XB", 
		                                                    "1156249230006", "31326284OA", "4183603000002001V", 
		                                                    "1875740004304001", "61814468006", "0205768000057001", 
		                                                    "83566613003", "31457943BUILD", "107783836005", 
		                                                    "2100261001064001", "56249230006", "35610652SKCC");

		        for (String accountNumber : accountNumbers) {
		            String xpathExpression = String.format("//input[@id='CheckAcc_%s']", accountNumber);

		            try {
		                // Check if the element is present on the page without waiting too long
		                List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));

		                // Click each visible element
		                for (WebElement element : elements) {
		                    if (element.isDisplayed()) {
		                        JavascriptExecutor js = (JavascriptExecutor) driver;
		                        js.executeScript("arguments[0].click();", element);
		                    }
		                }

		            } catch (Exception e) {
		                System.out.println("Failed to click account checkbox for account: " + accountNumber + " - " + e.getMessage());
		            }
		        }

		        // Proceed to the "Add" section after clicking all visible account checkboxes
		        try {
		            JavascriptExecutor js531 = (JavascriptExecutor) driver;
		            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.id("BtnSarfaesiAssetAdd")));
		            js531.executeScript("arguments[0].click();", add);
		        } catch (Exception e) {
		            System.out.println("Failed to click the 'Add' button - " + e.getMessage());
		        }

		        
//		        Guarantor/Legal Heir/Co-Obligant/Co-Borrower Details
		        
//		        JavascriptExecutor js5311 = (JavascriptExecutor) driver;
//		        WebElement Guarantor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSarfaesiGuarantor']")));
//		        js5311.executeScript("arguments[0].click();", Guarantor);
		        
//		        JavascriptExecutor js5111 = (JavascriptExecutor) driver;
//		        WebElement savebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnSarfaesiSave']")));
//		        js5111.executeScript("arguments[0].click();", savebutton);
//		        
//		        JavascriptExecutor js51111 = (JavascriptExecutor) driver;
//		        WebElement okElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[7]/div[1]/button[1]")));
//		        js51111.executeScript("arguments[0].click();", okElement);
		        
		        
		        
		        
}}}
