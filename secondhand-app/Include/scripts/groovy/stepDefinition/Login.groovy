package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User open Second Hand apps")
	public void user_open_Second_Hand_apps() {
		Mobile.startApplication('APK File\\app-release.apk', false)
	}

	@When("User go to menu Akun")
	public void user_go_to_menu_Akun() {
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
	}

	@When("User click button of Masuk")
	public void user_click_button_of_Masuk() {
		Mobile.tap(findTestObject('Page_Akun/Before Login/button_masuk'), 0)
	}

	@When("User input value of email with {string}")
	public void user_input_value_of_email_with(String email) {
		Mobile.setText(findTestObject('Page_Login/input_email'), email , 0)
	}

	@When("User input value of password with {string}")
	public void user_input_value_of_password_with(String password) {
		Mobile.setText(findTestObject('Page_Login/input_password'), password, 0)
	}

	@When("User click button of Masuk on Login page")
	public void user_click_button_of_Masuk_on_Login_page() {
		Mobile.tap(findTestObject('Page_Login/button_masuk'), 0)
	}

	@When("User will redirect to Akun page")
	public void User_will_redirect_to_Akun_page() {
		Mobile.checkElement(findTestObject('Page_Akun/After Login/account_username'), 0)
		Mobile.checkElement(findTestObject('Page_Akun/After Login/account_email'), 0)
	}

	@Then("User will see that application close")
	public void User_will_see_that_application_close() {
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@Then("User stay in Login Page")
	public void user_stay_in_login_page() {
		Mobile.checkElement(findTestObject('Page_Login/title_masuk'), 0)
		Mobile.checkElement(findTestObject('Page_Login/title_email'), 0)
		Mobile.checkElement(findTestObject('Page_Login/title_password'), 0)
	}
	@Then("User will see warning text to fill column")
	public void user_will_see_warning_text_to_fill_column() {
		Mobile.checkElement(findTestObject('Page_Login/warningtext_email tidak boleh kosong'), 0)
	}
}
