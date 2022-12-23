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

public class My_Order {
	@When("Buyer tap on menu Pesanan Saya")
	public void buyer_tap_on_menu_Pesanan_Saya() {
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_pesanan_saya'), 0)
	}

	@Then("Buyer will redirect to Pesanan Saya page")
	public void buyer_will_redirect_to_Pesanan_Saya_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Pesanan Saya/title_Pesanan Saya'), 0)
	}

	@Then("Buyer will see the order status Menunggu")
	public void buyer_will_see_the_order_status_Menunggu() {
		Mobile.verifyElementVisible(findTestObject('Page_Pesanan Saya/text_Menunggu'), 0)
	}

	@Then("Buyer will will see the order status Dibatalkan")
	public void buyer_will_will_see_the_order_status_Dibatalkan() {
		Mobile.verifyElementVisible(findTestObject('Page_Pesanan Saya/text_Dibatalkan'), 0)
		Mobile.closeApplication()
		Mobile.startApplication('APK File\\app-release.apk', false)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
}
