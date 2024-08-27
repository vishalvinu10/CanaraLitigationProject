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

public class Nf817forwardtoro {
	
	private WebDriver driver;
	private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://safallitigation.onlinesafe.in/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Test
    public void testAddcommercial() throws InterruptedException {
        

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
        typeSelect.selectByVisibleText("NF817");
        Thread.sleep(3000);
        
        WebElement search = driver.findElement(By.xpath("//button[@id='BtnNF817ApprvSearch']"));
        search.click();
        
        Thread.sleep(3000);
        
        WebElement clickeyebutton = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]/i[1]"));
        clickeyebutton.click();
        
        Thread.sleep(5000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);
        
        WebElement forwardto = driver.findElement(By.xpath("//select[@id='DrpNF817Forward']"));
        Select forwardtoSelect = new Select(forwardto);
        forwardtoSelect.selectByVisibleText("RO");
        
        WebElement description = driver.findElement(By.xpath("//textarea[@id='TxtNF817Description']"));
        description.sendKeys("forward to RO");
        
        Thread.sleep(2000);
        
        WebElement forward = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnNF817Forward']")));
        forward.click();
        Thread.sleep(2000);
        WebElement clickok = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
        clickok.click();
        Thread.sleep(2000);
        WebElement clickok1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
        clickok1.click();

}}
