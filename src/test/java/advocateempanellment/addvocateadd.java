package advocateempanellment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.commons.lang3.RandomStringUtils;
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

public class addvocateadd {
	
	public class commercialcaseadd {
		

		 private WebDriver driver;
		 private WebDriverWait wait;

		    @BeforeClass
		    public void setUp() {
		    	WebDriverManager.chromedriver().clearDriverCache().setup();
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    }

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }
		    
		    String dateofbirth = randombirthdate();
		    String  dateOfEnrollmentField1 = randomenrollmentdate();
		    String mobilenumber = Randommobilenumber(10);
		    String randomEmail = generateRandomEmail();
		    
		    
		    private List<String> readNamesFromExcel(String filePath) throws IOException {
		        List<String> names = new ArrayList<>();
		        FileInputStream fileInputStream = new FileInputStream(new String(filePath));
		        Workbook workbook = new XSSFWorkbook(fileInputStream);
		        Sheet sheet = workbook.getSheetAt(0);
		        for (Row row : sheet) {
		            Cell cell = row.getCell(0);
		            if (cell != null) {
		                names.add(cell.getStringCellValue());
		            }
		        }
		        workbook.close();
		        fileInputStream.close();
		        return names;
		    }

		    private String getRandomName(List<String> names) {
		        Random random = new Random();
		        return names.get(random.nextInt(names.size()));
		    }
		    
		   
		    	@Test(priority=1)
		    	public void testAddAdvocate() throws InterruptedException, IOException {
		    		
//		    	driver.get("http://192.168.0.137:8955/");	
		        driver.get("https://safallitigation.onlinesafe.in/");

		        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TxtAuthvalue\"]")));
		        usernameField.sendKeys("BU");

		        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ButSignin\"]")));
		        signInButton.click();		
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        WebElement advEmpanelment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Advocate Empanelment']")));
		        js1.executeScript("arguments[0].click();", advEmpanelment);
		        
		        JavascriptExecutor adv = (JavascriptExecutor) driver;
		        WebElement addAdv = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Empanelment/AdvocateEmpanelment']")));
		        adv.executeScript("arguments[0].click();", addAdv);
		        
		        String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\vishal\\randomnamesexcel.xlsx";
		        List<String> names = readNamesFromExcel(filePath);
		        String randomName = getRandomName(names);

		        WebElement advocateNameField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpNamAdvocate']")));
		        advocateNameField.sendKeys(randomName);

		        WebElement dateOfBirthField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpBirthDate']")));
		        dateOfBirthField.sendKeys(dateofbirth);

		        WebElement qualificationDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpAdEmpEduQualification']")));
		        Select qualificationSelect = new Select(qualificationDropdown);
		        qualificationSelect.selectByVisibleText("LLB");

		        WebElement dateOfEnrollmentField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpEnrolmentDate']")));
		        dateOfEnrollmentField.sendKeys(dateOfEnrollmentField1);

		        WebElement totalExperienceDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpAdEmpTotalExperience']")));
		        Select totalExperienceSelect = new Select(totalExperienceDropdown);
		        totalExperienceSelect.selectByVisibleText("1");

		        WebElement monthsDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpAdEmpMonths']")));
		        Select monthsSelect = new Select(monthsDropdown);
		        monthsSelect.selectByVisibleText("3");
		        
		        JavascriptExecutor emp = (JavascriptExecutor) driver;
		        WebElement empPractice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpPracticeArea']")));
		        emp.executeScript("arguments[0].click();", empPractice);

		        WebElement empPracticeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpAdvAreaOfPractice']")));
		        Select empPracticeDropdownSelect = new Select(empPracticeDropdown);
		        empPracticeDropdownSelect.selectByVisibleText("Criminal");
		        
		        JavascriptExecutor emp1 = (JavascriptExecutor) driver;
		        WebElement addEmpPractice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdAreaPracticingSave']")));
		        emp1.executeScript("arguments[0].click();", addEmpPractice);
		        
		        JavascriptExecutor emp11 = (JavascriptExecutor) driver;
		        WebElement closeEmpPractice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdAreaPracticingClose']")));
		        emp11.executeScript("arguments[0].click();", closeEmpPractice);

		        WebElement incomeTax = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpAdEmpIncomeTax']")));
		        Select incomeTaxSelect = new Select(incomeTax);
		        incomeTaxSelect.selectByVisibleText("Yes");

		        WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='DrpAdEmpCategory']")));
		        Select categorySelect = new Select(category);
		        categorySelect.selectByVisibleText("GENERAL");

		        WebElement exEmployee = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpExemployee']")));
		        exEmployee.sendKeys("safe");
		        
		        JavascriptExecutor emp111 = (JavascriptExecutor) driver;
		        WebElement empWith = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpEmpanelledwith']")));
		        emp111.executeScript("arguments[0].click();", empWith);

		        WebElement empWithText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpanelledWith']")));
		        empWithText.sendKeys("xyz");
		        
		        JavascriptExecutor emp1111 = (JavascriptExecutor) driver;
		        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpanelledWithSave']")));
		        emp1111.executeScript("arguments[0].click();", addButton);
		        
		        JavascriptExecutor emp11111 = (JavascriptExecutor) driver;
		        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpanelledWithClose']")));
		        emp11111.executeScript("arguments[0].click();", closeButton);
		        
		        JavascriptExecutor emp111111 = (JavascriptExecutor) driver;
		        WebElement pracWithState = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpState']")));
		        emp111111.executeScript("arguments[0].click();", pracWithState);

		        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='CheckState_1426']")));
		        if (!checkbox.isSelected()) {
		            checkbox.click();
		        }
		        
		        JavascriptExecutor add = (JavascriptExecutor) driver;
		        WebElement addButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnStateSave']")));
		        add.executeScript("arguments[0].click();", addButton1);
		        
		        JavascriptExecutor prac = (JavascriptExecutor) driver;
		        WebElement pracWithDistrict = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpDistrict']")));
		        prac.executeScript("arguments[0].click();", pracWithDistrict);

		        WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='odd']//input[@id='CheckDist_1426']")));
		        if (!checkbox2.isSelected()) {
		            checkbox2.click();
		        }
		        
		        JavascriptExecutor addb = (JavascriptExecutor) driver;
		        WebElement addButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnDistrictSave']")));
		        addb.executeScript("arguments[0].click();", addButton2);

		        // Address
		        WebElement residentialAddress = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtAdEmpResidentAdress']")));
		        residentialAddress.sendKeys("palakkad");

		        WebElement checkbox3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']")));
		        if (!checkbox3.isSelected()) {
		            checkbox3.click();
		        }

		        WebElement mobileNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpMobileNo']")));
		        mobileNumber.sendKeys(mobilenumber);

		        WebElement emailId = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpEmailID']")));
		        emailId.sendKeys(randomEmail);

		        // Upload documents
		        WebElement docType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TxtAdEmpUDDocumentTyp']")));
		        docType.sendKeys("picture");

		        WebElement docDesc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtAdEmpUDDescription']")));
		        docDesc.sendKeys("picture");

		        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='UploadAdEmpUDPermission']"));
		        String pathofthefile = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
		        uploadFile.sendKeys(pathofthefile);
		        
		        JavascriptExecutor click = (JavascriptExecutor) driver;
		        WebElement clickUpload = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdEmpUpload']")));
		        click.executeScript("arguments[0].click();", clickUpload);

		        // Confirmation details
		        WebElement confirmation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtAdEmpEligibilityConfirm']")));
		        confirmation.sendKeys("confirmed");

		        WebElement grounds = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='TxtAdEmpAdvocateGround']")));
		        grounds.sendKeys("recommended");

		        // Save button
		        JavascriptExecutor click1 = (JavascriptExecutor) driver;
		        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='BtnAdvSave']")));
		        click1.executeScript("arguments[0].click();", saveButton);

		        Thread.sleep(2000);
		        
		        JavascriptExecutor confirm = (JavascriptExecutor) driver;
		        WebElement confirmSaveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
		        confirm.executeScript("arguments[0].click();", confirmSaveButton);

		        System.out.println("Advocate named " + randomName + " added successfully by BU");
		    }
		    
		    	private String randombirthdate() {
		        // Define the date range: start and end dates
		        LocalDate startDate = LocalDate.of(2000, 1, 1); // Start date (e.g., January 1, 2000)
		        LocalDate endDate = LocalDate.of(2000, 12, 31); // End date (current date)

		        // Generate a random date within the range
		        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
		        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);

		        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		        return randomDate.format(formatter);
		    }
		    
		    	private String randomenrollmentdate() {
		        // Define the date range: start and end dates
		        LocalDate startDate = LocalDate.of(2024, 1, 1); // Start date (e.g., January 1, 2000)
		        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)

		        // Generate a random date within the range
		        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
		        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);

		        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		        return randomDate.format(formatter);
		    }
		    
		    	private String Randommobilenumber(int length) {
				
				return RandomStringUtils.randomNumeric(length);
			}
		    	
		    	// Method to generate a random email
		        public  String generateRandomEmail() {
		            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		            StringBuilder email = new StringBuilder();
		            Random random = new Random();

		            // Generate random prefix
		            for (int i = 0; i < 8; i++) {
		                email.append(characters.charAt(random.nextInt(characters.length())));
		            }

		            // Add domain
		            email.append("@example.com");
		            return email.toString();
		        }
		    }

}
