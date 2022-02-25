
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.pom.LoginPage;
import com.bdd.pom.MyDSR;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage lp;
	public MyDSR md;
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "../BDDTG/Drivers/chromedriver.exe");
	}

	@Given("The brower is launched")
	public void the_brower_is_launched() {
		driver = new ChromeDriver();
	}

	@Given("The Apllication is loaded")
	public void the_apllication_is_loaded() {
		driver.get("https://10.60.20.18/tgaprdv9/adm_login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		md = new MyDSR(driver);
	}

	@When("The user Enters the valid user name")
	public void the_user_enters_the_valid_user_name() throws Throwable {
		lp.getUserNameTextLink().sendKeys("QA_TEST_USER");
		Thread.sleep(4000);
	}

	@When("The user Enter the valid password")
	public void the_user_enter_the_valid_password() throws Throwable {
		lp.getUserPasswordTextLink().sendKeys("qtU63432");
		Thread.sleep(2000);
	}

	@When("The user Click on Login button")
	public void the_user_click_on_login_button() {
		lp.getLoginButtonLink().click();
	}

	@Then("Dashbord will Display")
	public void dashbord_will_display() {

		String HomePage = md.getHome().getText();
		System.out.println(" Welcome QA_TEST_USER PM :" + HomePage);
	}

	@When("user Click on Open menu application")
	public void user_click_on_open_menu_application() {
		md.getMenuapplication().click();

	}

	@When("User Click on My activity Link")
	public void user_click_on_my_activity_link() {
		md.getMyActivityLink().click();

	}

	@When("User Click on My DSR Link")
	public void user_click_on_my_dsr_link() throws Throwable {
		md.getDSRLink().click();
		Thread.sleep(2000);
	}

	@When("User Click on TS ID")
	public void user_click_on_ts_id() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(md.getTsIdFrame1());
		md.getTsId().click();
		Thread.sleep(2000);
	}

	@When("User Click on PullBiometric")
	public void user_click_on_pull_biometric() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(md.getPullBioMetricFrame());
		md.getPullBioMetric().click();
		Thread.sleep(2000);
	}

	@When("User Click on OKButton")
	public void user_click_on_ok_button() {
		md.getClickOkButton().click();
	}

	@When("User Click on TsDetails")
	public void user_click_on_ts_details() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(md.getTsDetailsFrame1());
		driver.switchTo().frame(md.getTsDetailsFrame2());
		md.getTsDetails().click();
		Thread.sleep(2000);

	}

	@When("User Click on Location")
	public void user_click_on_location() {
		md.getLocationLink().click();

	}

	@When("User Click on Select Office")
	public void user_click_on_select_office() {
		md.getOfficeLink().click();
	}

	@When("User Click on Task")
	public void user_click_on_task() {
		md.getTaskLink().click();
		md.getBreakLink().click();
		md.getHoursLink().sendKeys("8:00");
	}

	@When("User Click on SubmitButton")
	public void user_click_on_submit_button() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(md.getSubmitFrame());
		md.getSubmitButton().click();
	}

	@When("User Click on OK1")
	public void user_click_on_ok1() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(md.getOkButtonFrame());
		md.getOKButton2().click();
	}

	@When("User Click on OK2")
	public void user_click_on_ok2() throws Throwable {
		Thread.sleep(2000);
		md.getOKButton3().click();
	}
}
