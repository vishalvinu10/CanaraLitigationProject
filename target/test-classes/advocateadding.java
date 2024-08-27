package safalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class advocateadding {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     
	     
	     
	    // JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	     driver.get("https://safallitigation.onlinesafe.in/");
	     
	     driver.manage().window().maximize();
	     
	     WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]")); 
	     usernameField.sendKeys("BU");
	     
	     WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	     signInButton.click();
	     
	     Thread.sleep(5000);
	     
	     WebElement advempanell = driver.findElement(By.xpath("//span[normalize-space()='Advocate Empanelment']"));
	     advempanell.click();
	     
	     WebElement addadv = driver.findElement(By.xpath("//a[@href='/Empanelment/AdvocateEmpanelment']"));
	     addadv.click();
	     
	     
	     WebElement advocateNameField = driver.findElement(By.xpath("//input[@id='TxtAdEmpNamAdvocate']"));
	     advocateNameField.sendKeys("tamara");
         WebElement dateOfBirthField = driver.findElement(By.xpath("//input[@id='TxtAdEmpBirthDate']"));
         dateOfBirthField.sendKeys("01-07-2000");
         WebElement qualificationDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpEduQualification']"));
         Select qualificationSelect = new Select(qualificationDropdown);
         qualificationSelect.selectByVisibleText("LLB");
         WebElement dateOfEnrollmentField = driver.findElement(By.xpath("//input[@id='TxtAdEmpEnrolmentDate']"));
         dateOfEnrollmentField.sendKeys("02-07-2024");
         WebElement totalExperienceDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpTotalExperience']"));
         Select totalExperienceSelect = new Select(totalExperienceDropdown);
         totalExperienceSelect.selectByVisibleText("1");
         WebElement monthsDropdown = driver.findElement(By.xpath("//select[@id='DrpAdEmpMonths']"));
         Select monthsSelect = new Select(monthsDropdown);
         monthsSelect.selectByVisibleText("3");
         WebElement emppractice = driver.findElement(By.xpath("//button[@id='BtnAdEmpPracticeArea']"));
         emppractice.click();
         WebElement emppracticedropdown = driver.findElement(By.xpath("//select[@id='DrpAdvAreaOfPractice']"));
         Select emppracticedropdown1 = new Select(emppracticedropdown);
         emppracticedropdown1.selectByVisibleText("Criminal");
         WebElement addemppractice = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingSave']"));
         addemppractice.click();
         WebElement closeemppractice = driver.findElement(By.xpath("//button[@id='BtnAdAreaPracticingClose']"));
         closeemppractice.click();
         WebElement incometax = driver.findElement(By.xpath("//select[@id='DrpAdEmpIncomeTax']"));
         Select incometax1 = new Select(incometax);
         incometax1.selectByVisibleText("Yes");
         WebElement category = driver.findElement(By.xpath("//select[@id='DrpAdEmpCategory']"));
         Select category1 = new Select(category);
         category1.selectByVisibleText("GENERAL");
         WebElement xemp = driver.findElement(By.xpath("//input[@id='TxtAdEmpExemployee']"));
         xemp.sendKeys("safe");
         WebElement empwith = driver.findElement(By.xpath("//button[@id='BtnAdEmpEmpanelledwith']"));
         empwith.click();
         WebElement empwithtext = driver.findElement(By.xpath("//input[@id='TxtAdEmpanelledWith']"));
         empwithtext.sendKeys("xyz");
         WebElement addbutton = driver.findElement(By.xpath("//button[@id='BtnAdEmpanelledWithSave']"));
         addbutton.click();
         WebElement closebutton = driver.findElement(By.xpath("//button[@id='BtnAdEmpanelledWithClose']"));
         closebutton.click();
         WebElement pracwithstate = driver.findElement(By.xpath("//button[@id='BtnAdEmpState']"));
         pracwithstate.click();
         
         
         WebElement checkbox = driver.findElement(By.xpath("//input[@id='CheckState_1432']"));
         if (!checkbox.isSelected()) {
             
             checkbox.click();
         }
         
         
         WebElement addbutton1 = driver.findElement(By.xpath("//button[@id='BtnStateSave']"));
         addbutton1.click();
         
         WebElement pracwithdistrict = driver.findElement(By.xpath("//button[@id='BtnAdEmpDistrict']"));
         pracwithdistrict.click();
         
         WebElement clickonnext = driver.findElement(By.xpath("//a[@id='Tbl_DistrictList_next']"));
         clickonnext.click();
         
         WebElement checkbox3 = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/input[1]"));
         if (!checkbox3.isSelected()) {
             
             checkbox3.click();
         }
         
         
         WebElement checkbox2 = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/input[1]"));
         if (!checkbox2.isSelected()) {
             
             checkbox2.click();
         }
         
         WebElement addbutton2 = driver.findElement(By.xpath("//button[@id='BtnDistrictSave']"));
         addbutton2.click();
         
         //address
         
         WebElement residentialaddress = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpResidentAdress']"));
         residentialaddress.sendKeys("palakkad");
         
         WebElement checkbox4 = driver.findElement(By.xpath("//div[@id='CheckHide']//span[1]//*[name()='svg']"));
         if (!checkbox4.isSelected()) {
             
             checkbox4.click();
         }
         
         WebElement mobilenumber = driver.findElement(By.xpath("//input[@id='TxtAdEmpMobileNo']"));
         mobilenumber.sendKeys("9879655443");
         
         WebElement emailid = driver.findElement(By.xpath("//input[@id='TxtAdEmpEmailID']"));
         emailid.sendKeys("tamara@gmail.com");
         
         
         //upload documents
         
         WebElement doctype = driver.findElement(By.xpath("//input[@id='TxtAdEmpUDDocumentTyp']"));
         doctype.sendKeys("picture");
         
         WebElement docdesc = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpUDDescription']"));
         docdesc.sendKeys("picture");
         
         
         WebElement uploadfile1 = driver.findElement(By.xpath("//input[@id='UploadAdEmpUDPermission']"));
         String filePath = "C:\\Users\\mvish\\OneDrive\\Desktop\\SAFE\\field alignment issue.jpg";
         uploadfile1.sendKeys(filePath);
         
         
         WebElement clickupload = driver.findElement(By.xpath("//button[@id='BtnAdEmpUpload']"));
         clickupload.click();
         
         //confirmation details
         
         WebElement confirmation = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpEligibilityConfirm']"));
         confirmation.sendKeys("confirmed");
         
         WebElement Grounds = driver.findElement(By.xpath("//textarea[@id='TxtAdEmpAdvocateGround']"));
         Grounds.sendKeys("recommended");
         
//         SAVE BUTTON
         
         Thread.sleep(3000);
         
         WebElement savebutton = driver.findElement(By.xpath("//button[@id='BtnAdvSave']"));
         savebutton.click();
         
         Thread.sleep(5000);
         
         WebElement confirmsavebutton = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
         confirmsavebutton.click();
         
	}

}    

}
