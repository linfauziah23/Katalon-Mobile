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

public class Buyer_Order {
	@Given("Buyer on secondhand homepage")
	public void buyer_on_secondhand_homepage() {
		Mobile.tap(findTestObject('Navbar/button_beranda'), 0)
	}

	@When("Buyer tap on search bar")
	public void buyer_tap_on_search_bar() {
		Mobile.tap(findTestObject('Page_Detail Produk (Buyer)/Tes Search/input_Search (E1)'), 0)
	}

	@When("Buyer enter name of product with {string}")
	public void buyer_enter_name_of_product_with(String input_text) {
		Mobile.setText(findTestObject('Page_Detail Produk (Buyer)/Tes Search/input_Search (E2)'), input_text, 0)
	}

	@When("Buyer tap item of product")
	public void buyer_tap_item_of_product() {
		Mobile.tap(findTestObject('Page_Detail Produk (Buyer)/Tes Search/item_Sony a 6400 (textview attributes)'), 0)
	}

	@Then("Buyer will redirected to product page")
	public void buyer_will_redirected_to_product_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/text_Alamat'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/text_Kategori'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/text_Nama Seller'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/text_Product Detail'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/button_Saya Tertarik dan Ingin Nego'), 0)
	}

	@When("Buyer tap Saya tertarik dan ingin nego button")
	public void buyer_tap_Saya_tertarik_dan_ingin_nego_button() {
		Mobile.tap(findTestObject('Page_Detail Produk (Buyer)/button_Saya Tertarik dan Ingin Nego'), 0)
	}

	@Then("Buyer redirected to login page")
	public void buyer_redirected_to_login_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Login/title_masuk'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Login/title_email'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Login/title_password'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Login/input_email'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Login/button_masuk'), 0)
	}

	@When("Buyer set value {string} in Harga tawar column")
	public void buyer_set_value_in_Harga_tawar_column(String input_harga) {
		Mobile.setText(findTestObject('Page_Detail Produk (Buyer)/input_Harga Tawar'), input_harga, 0)
	}

	@When("Buyer tap Kirim button")
	public void buyer_tap_Kirim_button() {
		Mobile.tap(findTestObject('Page_Detail Produk (Buyer)/button_Kirim'), 0)
	}

	@Then("Showing notification Harga tawarmu berhasil dikirim ke penjual")
	public void showing_notification_Harga_tawarmu_berhasil_dikirim_ke_penjual() {
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/popup_Harga tawarmu berhasil dikirim ke penjual'), 0)
	}

	@Then("Showing notification Harga tawar tidak boleh kosong")
	public void showing_notification_Harga_tawar_tidak_boleh_kosong() {
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/popup_Harga tawar tidak boleh kosong'), 0)
		Mobile.closeApplication()
		Mobile.startApplication('APK File\\app-release.apk', false)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
}
