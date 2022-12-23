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

public class Profile {
	@When("User tap pen button")
	public void user_tap_pen_button() {
		Mobile.tap(findTestObject('Page_Profile/button_pen'), 0)
	}

	@When("User tap nama")
	public void user_tap_nama() {
		Mobile.tap(findTestObject('Page_Profile/edit_nama'), 0)
	}

	@When("User input nama {string}")
	public void user_input_nama(String input_text) {
		Mobile.setText(findTestObject('Page_Profile/input_Name'), input_text, 0)
	}

	@When("User tap simpan")
	public void user_tap_simpan() {
		Mobile.tap(findTestObject('Page_Profile/button_Simpan'), 0)
	}

	@When("User tap nomor hp")
	public void user_tap_nomor_hp() {
		Mobile.tap(findTestObject('Page_Profile/edit_Hp'), 0)
	}

	@When("User input nomor Hp {string}")
	public void user_input_nomor_Hp(String input_text) {
		Mobile.setText(findTestObject('Page_Profile/input_Hp'), input_text, 0)
	}

	@When("User tap kota")
	public void user_tap_kota() {
		Mobile.tap(findTestObject('Page_Profile/edit_Kota'), 0)
	}

	@When("User input kota {string}")
	public void user_input_kota(String input_text) {
		Mobile.setText(findTestObject ('Page_Profile/input_Kota'), input_text, 0)
	}

	@Then("User success edit profile")
	public void user_success_edit_profile() {
		Mobile.verifyElementVisible(findTestObject('Page_Profile/button_x profil berhasil diperbarui'), 0)
		Mobile.tap(findTestObject('Page_Profile/button_back'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
}
