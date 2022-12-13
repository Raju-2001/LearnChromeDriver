package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		
		//to open chrome browser
		ChromeDriver driver=new ChromeDriver();
		// load the application
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the screen size
		driver.manage().window().maximize();
		//enter the username as DemoCsr
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		//enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login buttone
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raju");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raju");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Daaggupati");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technical Lead");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234567");
		driver.findElement(By.name("numberEmployees")).sendKeys("10");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a  Software Tester.");
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("I am good at Automation testing");
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("5/137");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7993569455");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("455");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("daggupatiraju2001@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tester");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https.leaftaps.com");
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vijaya");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Lakshmi");
        driver.findElement(By.name("generalAddress1")).sendKeys("Chennai");
        driver.findElement(By.name("generalAddress2")).sendKeys("Tirupati");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("517501");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("+91");
        driver.findElement(By.name("submitButton")).click();
		
	}

}
