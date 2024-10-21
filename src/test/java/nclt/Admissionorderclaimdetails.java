package nclt;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Admissionorderclaimdetails {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Set implicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Test
    public void admission() {
        driver.get("https://safallitigation.onlinesafe.in/");

        // Wait for username field to be visible and then enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
        usernameField.sendKeys("BU");

        // Wait for sign in button to be clickable and then click
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
        signInButton.click();

        // Wait for litigation link to be clickable and then click using JavaScript
        WebElement clickLitigation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickLitigation);

        // Wait for litigation element to be clickable and then click
        WebElement clickLitigationElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/CaseMasterSetting/CaseListing']")));
        clickLitigationElement.click();

        // Wait for upload case details to be clickable, scroll into view, and then click
        WebElement uploadCaseDetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[14]/a[1]/i[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", uploadCaseDetails);
        uploadCaseDetails.click();
        
        String originalWindow = driver.getWindowHandle();

        WebElement admissionOrderLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admission Order and claim details")));
        admissionOrderLink.click();

     // Wait for the new window to open and switch to it
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Now you can interact with the second window
        // For example, wait for an element to be visible and interact with it
        WebElement elementInSecondWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TxtAOAdmissionDate']")));
        elementInSecondWindow.click();
        elementInSecondWindow.sendKeys("20-10-2024");
        
      
        
        
    }}