package Stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	WebDriver driver;
	  
	@Given("user is on loginPage")
	public void user_is_on_login_page() {
	   System.out.println("Step1: User is on LoginPage");
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname,String pswd) throws InterruptedException {
		System.out.println("Step2: User enters username and pswd");
		 driver.findElement(By.id("email")).sendKeys(uname);
		 driver.findElement(By.id("pass")).sendKeys(pswd);
		 Thread.sleep(2000);
	}
	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
	   System.out.println("Step3: user is clicking on Login Button");
	   driver.findElement(By.id("loginbutton")).click();
	   Thread.sleep(5000);
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	    System.out.println("User lands on Home Page");
	    driver.close();
	}
	
//	@When("user enters credentails using DataTable")
	//public void user_enters_credentails_using_DataTable(DataTable dataTable) {
	//	System.out.println("Step2: User enters username and pswd");
		//List<List<String>> data=dataTable.cells();
	    //driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    //driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	//}

}
