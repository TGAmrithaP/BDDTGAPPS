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
public class MyDSR {
	WebDriver driver;

	public MyDSR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//font[@class='user_format']")
	private WebElement Home;

	@FindBy(xpath = "//*[@title='Open menu application']")
	private WebElement Menuapplication;

	@FindBy(xpath = "//span[text()='My Activity']")
	private WebElement MyActivityLink;

	@FindBy(xpath = "(//i[@class='jstree-icon jstree-themeicon jstree-themeicon-custom'])[7]")
	private WebElement DSRLink;

	@FindBy(xpath = "//iframe[@id='iframe_item_65']")
	private WebElement TsIdFrame1;

	@FindBy(xpath = "//a[@id='id_sc_field_internal_ts_id_2']")
	private WebElement TsId;

	@FindBy(name = "main_menu_internal_ts_iframe")
	private WebElement PullBioMetricFrame;

	@FindBy(id = "sc_pull_biometric_data_top")
	private WebElement PullBioMetric;

	@FindBy(xpath = "//input[@name='nmgp_bok']")
	private WebElement ClickOkButton;

	@FindBy(name = "main_menu_internal_ts_iframe")
	private WebElement TsDetailsFrame1;

	@FindBy(name = "nmsc_iframe_liga_internal_ts_new_details")
	private WebElement TsDetailsFrame2;

	@FindBy(xpath = "//a[@class='sc-unique-btn-7 scButton_ok ']")
	private WebElement TsDetails;

	@FindBy(xpath = "(//span[@role='presentation'])[2]")
	private WebElement LocationLink;

	@FindBy(xpath = "//li[text()='Office']")
	private WebElement OfficeLink;

	@FindBy(xpath = "(//span[@role='presentation'])[3]")
	private WebElement TaskLink;

	@FindBy(xpath = "//li[text()='100317 - Break']")
	private WebElement BreakLink;

	@FindBy(xpath = "//input[@id='id_sc_field_time_spent_in_hrs_1']")
	private WebElement HoursLink;

	@FindBy(name = "main_menu_internal_ts_iframe")
	private WebElement SubmitFrame;

	@FindBy(id = "sc_submitapproval_top")
	private WebElement SubmitButton;

	@FindBy(name = "main_menu_internal_ts_iframe")
	private WebElement OkButtonFrame;

	@FindBy(xpath = "//button[text()=' OK']")
	private WebElement OKButton2;

	@FindBy(name = "nmgp_bok")
	private WebElement OKButton3;

	public WebElement getOKButton3() {
		return OKButton3;
	}

	public WebElement getOKButton2() {
		return OKButton2;
	}

	public WebElement getOkButtonFrame() {
		return OkButtonFrame;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getSubmitFrame() {
		return SubmitFrame;
	}

	public WebElement getHoursLink() {
		return HoursLink;
	}

	public WebElement getBreakLink() {
		return BreakLink;
	}

	public WebElement getTaskLink() {
		return TaskLink;
	}

	public WebElement getOfficeLink() {
		return OfficeLink;
	}

	public WebElement getLocationLink() {
		return LocationLink;
	}

	public WebElement getTsDetails() {
		return TsDetails;
	}

	public WebElement getTsDetailsFrame2() {
		return TsDetailsFrame2;
	}

	public WebElement getTsDetailsFrame1() {
		return TsDetailsFrame1;
	}

	public WebElement getClickOkButton() {
		return ClickOkButton;
	}

	public WebElement getPullBioMetric() {
		return PullBioMetric;
	}

	public WebElement getPullBioMetricFrame() {
		return PullBioMetricFrame;
	}

	public WebElement getTsId() {
		return TsId;
	}

	public WebElement getTsIdFrame1() {
		return TsIdFrame1;
	}

	public WebElement getDSRLink() {
		return DSRLink;
	}

	public WebElement getMyActivityLink() {
		return MyActivityLink;
	}

	public WebElement getMenuapplication() {
		return Menuapplication;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHome() {
		return Home;
	}

}