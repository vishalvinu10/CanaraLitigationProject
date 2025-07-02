package civilcourt;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.interactions.Actions;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import java.util.Scanner;
import java.util.ArrayList;
import org.openqa.selenium.support.ui.Select;
import java.util.*;


public class Civilcourtaddcase {
	

	 private WebDriver driver;
	 private WebDriverWait wait;

	    @BeforeClass
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }
//
//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
	    
	    // Method to generate a random alphanumeric string of 16 characters
	    private String generateRandomCNRNumber() {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder cnrNumber = new StringBuilder();    
	        Random random = new Random();
	        for (int i = 0; i < 16; i++) {
	            cnrNumber.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        return cnrNumber.toString();
	    }
	    
	    String suitamtElement1 = RandomString(15);
	    String intrestclaimed1 = generateRandomInterest();
	    String filingnoElement1 = RandomString(4);  //50
	    String casenumberElement1 = RandomString(4);  //50
	    String filingdateElement1 = generateTodayDate();
	    
	    
	  @Test
	  public void civilcourtaddcase() throws InterruptedException {
		  
	    	driver.get("http://192.168.0.137:8955/");
	    	
	        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"TxtAuthvalue\"]"));
	        usernameField.sendKeys("BU");

	        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"ButSignin\"]"));
	        signInButton.click();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement clicknpa = driver.findElement(By.xpath("(//a[@class='waves-effect waves-dark'])[2]"));
	        js1.executeScript("arguments[0].click();", clicknpa);
	        
	        JavascriptExecutor js11 = (JavascriptExecutor) driver;
	        WebElement addcase = driver.findElement(By.xpath("//span[normalize-space()='NPA']//following::span[normalize-space()='Add Cases']"));
	        js11.executeScript("arguments[0].click();", addcase);
	        	 
	   	 
	        JavascriptExecutor js111 = (JavascriptExecutor) driver;
	        WebElement clickthreedots = driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[3]"));
	        js111.executeScript("arguments[0].click();", clickthreedots);
	        
	        JavascriptExecutor js1111 = (JavascriptExecutor) driver;
	        WebElement clickcivil = driver.findElement(By.id("1"));
	        js1111.executeScript("arguments[0].click();", clickcivil);
	        
	        JavascriptExecutor close1 = (JavascriptExecutor) driver;
	        WebElement closebuttonElement = driver.findElement(By.xpath("//button[@id='CloseCCCustOtherCaseDetailsLoad']//span[@aria-hidden='true'][normalize-space()='×']"));
	        close1.executeScript("arguments[0].click();", closebuttonElement);
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        JavascriptExecutor add = (JavascriptExecutor) driver;
            WebElement customerAddButton = driver.findElement(By.id("BtnCCCustomerID"));
            add.executeScript("arguments[0].click();", customerAddButton);

            // Select 'Customer Name' from dropdown
            WebElement dropdown = driver.findElement(By.id("DrpCCSearchBy"));
            dropdown.click();
            dropdown.findElement(By.xpath("//option[. = 'Customer Name']")).click();

            // === Get input from user via Scanner ===
            System.out.print("Enter customer name to search: ");
            String customerName = scanner.nextLine();

            // Enter customer name in the search field
            WebElement searchInput = driver.findElement(By.id("TxtCCSearchValue"));
            searchInput.click();
            searchInput.clear();
            searchInput.sendKeys(customerName);

            // Click the search button
            WebElement searchButton = driver.findElement(By.id("BtnConCaseCustIDSearch"));
            searchButton.click();
            
            Thread.sleep(2000);

           

         
//	        
//	        JavascriptExecutor add = (JavascriptExecutor) driver;
//			WebElement customeraddbuttonelement =  driver.findElement(By.id("BtnCCCustomerID"));
//	        add.executeScript("arguments[0].click();", customeraddbuttonelement);
//	        
//	        
//		    driver.findElement(By.id("DrpCCSearchBy")).click();
//		    {
//		      WebElement dropdown = driver.findElement(By.id("DrpCCSearchBy"));
//		      dropdown.findElement(By.xpath("//option[. = 'Customer Name']")).click();
//		    }
//		    driver.findElement(By.id("TxtCCSearchValue")).click();
//		    driver.findElement(By.id("TxtCCSearchValue")).sendKeys("SAMITH");
//		    driver.findElement(By.id("BtnConCaseCustIDSearch")).click();
	
	    {
	      WebElement element = driver.findElement(By.id("BtnConCaseCustIDSearch"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	   
        WebElement table = driver.findElement(By.id("Tbl_CivilCustIDList"));
      
        List<WebElement> checkboxes = table.findElements(By.xpath(".//input[@type='checkbox']"));
        
        Assert.assertTrue(checkboxes.size() > 0, "No checkboxes found in the table.");
        
        
        Random rand = new Random();
        int randomIndex2 = rand.nextInt(checkboxes.size());  // Random index based on the number of checkboxes
        
        WebElement randomCheckbox = checkboxes.get(randomIndex2);
        
      
        if (!randomCheckbox.isSelected()) {
            randomCheckbox.click(); // Click to check the checkbox
        }
        
      
        Assert.assertTrue(randomCheckbox.isSelected(), "The randomly selected checkbox is not checked.");
    
    
    WebElement addadvbutton = driver.findElement(By.id("BtnCCCustIDSave"));
    
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("arguments[0].scrollIntoView(true);", addadvbutton);
    addadvbutton.click();
    
    WebElement clickokElement = driver.findElement(By.id("BtnCCCustIDOK"));
    clickokElement.click();

    WebElement state = driver.findElement(By.id("DrpCCState"));
    Select stateSelect = new Select(state);
    stateSelect.selectByVisibleText("Kerala");
    
    WebElement district = driver.findElement(By.id("DrpCCDistrict"));
    Select districtSelect = new Select(district);
    districtSelect.selectByVisibleText("Palakkad");  
    
    //name of the court
    
    WebElement courtforum = driver.findElement(By.id("DrpCCCourtName"));
    Select courtforumSelect2 = new Select(courtforum);
    List<WebElement> forumoptions1 = courtforumSelect2.getOptions();

    // Define the allowed options
    List<String> allowedOptions = List.of("CIVIL COURT", "CIVIL COURT SENIOR DIVISION");

    // Filter matching options and store their indices
    List<Integer> matchingIndices = new ArrayList<>();
    for (int i = 0; i < forumoptions1.size(); i++) {
        String optionText = forumoptions1.get(i).getText().trim();
        if (allowedOptions.contains(optionText)) {
            matchingIndices.add(i);
        }
    }

    // Select randomly from the filtered options
    if (!matchingIndices.isEmpty()) {
        Random random = new Random();
        int randomIndex = matchingIndices.get(random.nextInt(matchingIndices.size()));
        courtforumSelect2.selectByIndex(randomIndex);
        System.out.println("Selected courtforum option: " + forumoptions1.get(randomIndex).getText());
    } else {
        System.out.println("No matching courtforum options found. Skipping selection.");
    }
    
    
    WebElement bench = driver.findElement(By.id("DrpCCBench"));
    Select benchselect = new Select(bench);
    List<WebElement> benchoptions = benchselect.getOptions();
    
 // Filter out the default "Select" option if present
    if (benchoptions.size() > 1) { // Ensuring there are more than one option
        int startIndex = 1; // Skipping index 0, assuming it's the default "Select" option
        Random randomcasetype = new Random();
        int randomIndex = startIndex + randomcasetype.nextInt(benchoptions.size() - startIndex);
        
        benchselect.selectByIndex(randomIndex);
        System.out.println("Selected option: " + benchoptions.get(randomIndex).getText());
    } else {
        System.out.println("No valid options available in the bench dropdown. Skipping selection.");
    }
    
    WebElement casetype = driver.findElement(By.id("DrpCCCaseTyp"));
    Select casetypeselect = new Select(casetype);
    List<WebElement> casetypeoptions = casetypeselect.getOptions();

    // Filter out the default "Select" option if present
    if (casetypeoptions.size() > 1) { // Ensuring there are more than one option
        int startIndex = 1; // Skipping index 0, assuming it's the default "Select" option
        Random randomcasetype = new Random();
        int randomIndex = startIndex + randomcasetype.nextInt(casetypeoptions.size() - startIndex);
        
        casetypeselect.selectByIndex(randomIndex);
        System.out.println("Selected casetype option: " + casetypeoptions.get(randomIndex).getText());
    } else {
        System.out.println("No valid options available in the dropdown. Skipping selection.");
    }
	    
    
    WebElement casestage = driver.findElement(By.id("DrpCCCaseStage"));
    Select casestageselect = new Select(casestage);
    List<WebElement> casestageoptions = casestageselect.getOptions();
 // Filter out the default "Select" option if present
    if (casestageoptions.size() > 1) { // Ensuring there are more than one option
        int startIndex = 1; // Skipping index 0, assuming it's the default "Select" option
        Random randomcasetype = new Random();
        int randomIndex = startIndex + randomcasetype.nextInt(casestageoptions.size() - startIndex);
        
        casestageselect.selectByIndex(randomIndex);
        System.out.println("Selected casestage option: " + casestageoptions.get(randomIndex).getText());
    } else {
        System.out.println("No valid options available in the dropdown. Skipping selection.");
    }
    
    
	    WebElement filingdateElement = driver.findElement(By.id("TxtCCFilingDate"));
	    filingdateElement.sendKeys(filingdateElement1);
	    
	    WebElement petitionerres = driver.findElement(By.id("DrpCCCanaraRole"));
	    Select petitionerresSelect = new Select(petitionerres);
	    petitionerresSelect.selectByVisibleText("Petitioner(s)"); 
	   
	   
	    WebElement suitamtElement = driver.findElement(By.id("TxtCCSuitAmount"));
	    suitamtElement.sendKeys(suitamtElement1);
	    
	    WebElement intrestclaimed =driver.findElement(By.id("TxtCCInterestClaimed"));
	    intrestclaimed.sendKeys(intrestclaimed1);
	    
	    WebElement intresttype = driver.findElement(By.id("DrpCCInterestTyp"));
	    Select intresttypeselect = new Select(intresttype);
	    List<WebElement> intresttypeselectoptions = intresttypeselect.getOptions();

	    // Filter out the default "Select" option if present
	    if (intresttypeselectoptions.size() > 1) { // Ensuring there are more than one option
	        int startIndex = 1; // Skipping index 0, assuming it's the default "Select" option
	        Random randomcasetype = new Random();
	        int randomIndex = startIndex + randomcasetype.nextInt(intresttypeselectoptions.size() - startIndex);
	        
	        intresttypeselect.selectByIndex(randomIndex);
	        System.out.println("Selected casetype option: " + intresttypeselectoptions.get(randomIndex).getText());
	    } else {
	        System.out.println("No valid options available in the dropdown. Skipping selection.");
	    }
	    
	    
	    
        //Bank’s Advocate (new method to locate the table and fetch the checkboxes inside the table)
	    
	    
        
//        WebElement clickaddbutton2 = driver.findElement(By.id("BtnCCAdvctName"));
//        clickaddbutton2.click();
//        
//        WebElement StateofAdvocate = driver.findElement(By.id("DrpAdvCCState"));
//        Select StateofAdvocateSelect = new Select(StateofAdvocate);
//        StateofAdvocateSelect.selectByVisibleText("Kerala");
//        WebElement DistrictofAdvocate = driver.findElement(By.id("DrpAdvCCDistrict"));
//        Select DistrictofAdvocateSelect = new Select(DistrictofAdvocate);
//        DistrictofAdvocateSelect.selectByVisibleText("Palakkad");
//        WebElement clicksearchbutton= driver.findElement(By.id("BtnAdvIDSearch"));
//        clicksearchbutton.click();
//        
//        Thread.sleep(1000);
//        
//        //////
//        
//     // Step 1: Locate the table inside the modal
//        WebElement modalTable = driver.findElement(By.id("Tbl_CCAdvctNameList"));
//
//        // Step 2: Find all checkboxes inside the table
//        List<WebElement> checkboxes1 = modalTable.findElements(By.cssSelector("input[type='checkbox'][id^='CheckCAdvt_']"));
//
//        if (checkboxes1.isEmpty()) {
//            System.out.println("No checkboxes found inside the table.");
//        } else {
//            // Step 3: Randomly pick one checkbox
//            Random rand3 = new Random();
//            WebElement randomCheckbox4 = checkboxes1.get(rand3.nextInt(checkboxes1.size()));
//
//            // Step 4: Scroll the table to bring the checkbox into view
//            WebElement tbody = modalTable.findElement(By.tagName("tbody")); // Assuming the checkboxes are within tbody
//            ((JavascriptExecutor) driver).executeScript(
//                "arguments[0].scrollTop = arguments[1].offsetTop - arguments[0].offsetTop;",
//                tbody, randomCheckbox4
//            );
//
//            // Step 5: Click the checkbox
//            randomCheckbox4.click();
//
//            // Step 6: Click the save button (still assumed to be outside the table)
//            WebElement saveButton = driver.findElement(By.id("BtnCCAdvctSave"));
//            saveButton.click();
//
//            System.out.println("Random checkbox clicked inside modal table and save button pressed.");
//        }
	    
	    WebElement clickaddbutton2 = driver.findElement(By.id("BtnCCAdvctName"));
	    clickaddbutton2.click();

	    WebElement StateofAdvocate = driver.findElement(By.id("DrpAdvCCState"));
	    Select StateofAdvocateSelect = new Select(StateofAdvocate);
	    StateofAdvocateSelect.selectByVisibleText("Kerala");

	    WebElement DistrictofAdvocate = driver.findElement(By.id("DrpAdvCCDistrict"));
	    Select DistrictofAdvocateSelect = new Select(DistrictofAdvocate);
	    DistrictofAdvocateSelect.selectByVisibleText("Palakkad");

	    WebElement clicksearchbutton = driver.findElement(By.id("BtnAdvIDSearch"));
	    clicksearchbutton.click();

	    Thread.sleep(1000);

	    // Step 1: Locate the table inside the modal
	    WebElement modalTable = driver.findElement(By.id("Tbl_CCAdvctNameList"));

	    // Step 2: Find all checkboxes inside the table
	    List<WebElement> checkboxes1 = modalTable.findElements(By.cssSelector("input[type='checkbox'][id^='CheckCAdvt_']"));

	    if (checkboxes1.isEmpty()) {
	        System.out.println("No checkboxes found inside the table.");
	    } else {
	        List<WebElement> uncheckedList = new ArrayList<>(checkboxes1);
	        Random rand3 = new Random();
	        boolean successfullyAdded = false;

	        while (!uncheckedList.isEmpty() && !successfullyAdded) {
	            int randomIndex = rand3.nextInt(uncheckedList.size());
	            WebElement randomCheckbox4 = uncheckedList.get(randomIndex);

	            // Scroll into view
	            WebElement tbody = modalTable.findElement(By.tagName("tbody"));
	            ((JavascriptExecutor) driver).executeScript(
	                "arguments[0].scrollTop = arguments[1].offsetTop - arguments[0].offsetTop;",
	                tbody, randomCheckbox4
	            );

	            // Click the checkbox
	            randomCheckbox4.click();

	            // Click Save button
	            WebElement saveButton = driver.findElement(By.id("BtnCCAdvctSave"));
	            saveButton.click();

	            // Wait briefly for alert to appear (you can replace with explicit wait for better practice)
	            Thread.sleep(1000);

	            try {
	                // Check if the Swal alert appears
	                WebElement swalConfirmButton = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	                if (swalConfirmButton.isDisplayed()) {
	                    System.out.println("Selected advocate already added. Confirming alert and trying again...");

	                    // Click the confirmation button
	                    swalConfirmButton.click();

	                    // Remove this checkbox from list so it won't be tried again
	                    uncheckedList.remove(randomIndex);
	                    Thread.sleep(1000); // Allow modal to reset
	                }
	            } catch (NoSuchElementException e) {
	                // If no alert appeared, assume success
	                successfullyAdded = true;
	                System.out.println("Random checkbox clicked and advocate successfully added.");
	            }
	        }

	        if (!successfullyAdded) {
	            System.out.println("No available advocates could be added after checking all.");
	        }}




        	  
	    
	    WebElement filingnoElement = driver.findElement(By.id("TxtCCFilingNo"));
	    filingnoElement.sendKeys(filingnoElement1);
	    System.out.println("Generated filing Number: " + filingnoElement1);

	    
	    WebElement FILINGYEAR = driver.findElement(By.id("DrpCCFilingYear"));
        Select FILINGYEARSelect = new Select(FILINGYEAR);
        FILINGYEARSelect.selectByVisibleText("2025");
	    
	   WebElement cnrnoElement =  driver.findElement(By.id("TxtCCCNRNo"));
	   cnrnoElement.sendKeys(generateRandomCNRNumber());
	   System.out.println("Generated cnr Number: " + generateRandomCNRNumber());
	  
	   WebElement casenumberElement = driver.findElement(By.id("TxtCCCaseNo"));
	   casenumberElement.sendKeys(casenumberElement1);
	   System.out.println("Generated case Number: " + casenumberElement1);
	   
	   
	   WebElement caseyear = driver.findElement(By.id("DrpCCCaseYear"));
	   Select caseyearSelect = new Select(caseyear);
	   caseyearSelect.selectByVisibleText("2025");
	    
	    Thread.sleep(2000);
	    
	    WebElement SAVEBUTTON = driver.findElement(By.id("BtnCCSave"));
	    SAVEBUTTON.click();
	    Thread.sleep(2000);
	    WebElement okswal = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	    okswal.click();
	    
	    WebElement successwal = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']"));
	    successwal.click();
	    
	  }
	  
		private String RandomString(int length) {
			
			return RandomStringUtils.randomNumeric(length);
		}
		
//		 private String generateRandomDate() {
//		        // Define the date range: start and end dates
//		        LocalDate startDate = LocalDate.of(2024, 10, 01); // Start date (e.g., January 1, 2000)
//		        LocalDate endDate = LocalDate.of(2024, 12, 31); // End date (current date)
//
//		        // Generate a random date within the range
//		        long randomEpochDay = ThreadLocalRandom.current().nextLong(startDate.toEpochDay(), endDate.toEpochDay());
//		        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
//
//		        // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
//		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		        return randomDate.format(formatter);
//		    }
		 
		 private String generateTodayDate() {
			    // Get today's date
			    LocalDate todayDate = LocalDate.now();

			    // Format the date as a string in the desired format (e.g., "dd-MM-yyyy")
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			    
			    // Return the formatted date
			    return todayDate.format(formatter);
			}
		
		  private String generateRandomInterest() {
		        // Define the range for the interest rate
		        double minInterest = 1.0; // Minimum interest rate (e.g., 1%)
		        double maxInterest = 15.0; // Maximum interest rate (e.g., 15%)

		        // Generate a random interest rate within the range
		        double randomInterest = minInterest + (maxInterest - minInterest) * ThreadLocalRandom.current().nextDouble();

		        // Format the interest rate to 2 decimal places
		        return String.format("%.2f", randomInterest);
		    }
			    }
	