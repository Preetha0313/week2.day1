package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/login");
      driver.manage().window().maximize();
      WebElement eleUserName = driver.findElement(By.id("username"));
      eleUserName.sendKeys("DemoSalesManager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();   
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preetha");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local Name");
      driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("core department");
      driver.findElement(By.id("createLeadForm_description")).sendKeys("Grow With Test Leaf");
      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preethamahadevan1997@gmail.com");
      WebElement eleSource = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
      Select obj = new Select(eleSource);
      Thread.sleep(2000);
      obj.selectByVisibleText("New York");
      driver.findElement(By.name("submitButton")).click();
      System.out.println("The title is :"+ driver.getTitle());
      driver.close();
      }

}
