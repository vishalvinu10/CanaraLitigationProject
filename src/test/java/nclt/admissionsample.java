package nclt;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class admissionsample {
    
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        
        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");  // Disable extensions
        options.addArguments("--disable-infobars");    // Disable infobars
        options.addArguments("--headless");             // Run in headless mode
        options.addArguments("--no-sandbox");           // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test()
    public void admission() throws InterruptedException {
        driver.get("http://192.168.0.137:8955/");

        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
        usernameField.sendKeys("BU");

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
        signInButton.click();

        JavascriptExecutor litigation = (JavascriptExecutor) driver;
        WebElement clicklitigation = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]"));
        litigation.executeScript("arguments[0].click();", clicklitigation);

        WebElement clicklitigationElement = driver.findElement(By.xpath("//a[@href='/CaseMasterSetting/CaseListing']"));
        litigation.executeScript("arguments[0].click();", clicklitigationElement);

        Thread.sleep(3000); // Consider replacing with a wait for specific condition

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");

        WebElement UploadCaseDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[14]/a[1]/i[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", UploadCaseDetails);
        UploadCaseDetails.click();

        js.executeScript("window.scrollBy(0, 150)");

        WebElement admissionorderlink = driver.findElement(By.linkText("Admission Order and claim details"));
        js.executeScript("arguments[0].click();", admissionorderlink);

        Thread.sleep(5000); // Consider replacing with a wait for specific condition

        WebElement OAdmissionDate = driver.findElement(By.id("TxtAOAdmissionDate"));
        OAdmissionDate.click();
    }
}
