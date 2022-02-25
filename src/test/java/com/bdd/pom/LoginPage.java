package com.bdd.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author TG1690
 *
 */
public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='id_sc_field_login']")
	private WebElement UserNameTextLink;
	
	@FindBy(id="id_sc_field_password")
	private WebElement UserPasswordTextLink;
	
	@FindBy(id="sub_form_b")
	private WebElement LoginButtonLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserNameTextLink() {
		return UserNameTextLink;
	}

	public WebElement getUserPasswordTextLink() {
		return UserPasswordTextLink;
	}

	public WebElement getLoginButtonLink() {
		return LoginButtonLink;
	}
	
	

}
	

