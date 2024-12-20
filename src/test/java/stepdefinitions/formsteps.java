package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formsteps {
	WebDriver driver;
@Before
public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Given("User navigate to the page {string}")
public void user_navigate_to_the_page(String string) {
    driver.get(string);
}

@When("User enter first name {string} in the firstname field")
public void user_enter_first_name_in_the_firstname_field(String string) {
    driver.findElement(By.id("firstName")).sendKeys(string);
}

@When("User enter last name {string} in the lastname field")
public void user_enter_last_name_in_the_lastname_field(String string) {
	driver.findElement(By.id("lastName")).sendKeys(string);
}

@When("User enter email {string} in the email field")
public void user_enter_email_in_the_email_field(String string) {
	driver.findElement(By.id("email")).sendKeys(string);
}

@When("User enter contact number {string} in the contact number field")
public void user_enter_contact_number_in_the_contact_number_field(String string) {
	driver.findElement(By.id("number")).sendKeys(string);
}

@When("User enter message {string} in the message field")
public void user_enter_message_in_the_message_field(String string) {
	driver.findElement(By.xpath("//div[@class=\"field\"]//textarea")).sendKeys(string);
}

@When("User click on the submit button")
public void user_click_on_the_submit_button() {
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
}

@Then("User should receive {string} alert message")
public void user_should_receive_alert_message(String string) {
    String alertText = driver.switchTo().alert().getText();
    Assert.assertTrue(alertText.contains(string));
}

@After
public void tearDown() {
	driver.quit();
}
}
