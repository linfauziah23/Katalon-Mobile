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

public class Home_Page {
	@Given("User launch the app")
	public void user_launch_the_app() {
		Mobile.startApplication('APK File\\app-release.apk', false)
	}

	@When("User tap beranda")
	public void user_tap_beranda() {
		Mobile.tap(findTestObject('Navbar/button_beranda'), 0)
	}

	@Then("User tap category elektronik")
	public void user_tap_category_elektronik() {
		Mobile.checkElement(findTestObject('Page_Beranda/Category/button_Elektronik'), 0)
	}

	@When("User tap on search bar")
	public void user_tap_on_search_bar() {
		Mobile.tap(findTestObject('Page_Detail Produk (Buyer)/Tes Search/input_Search (E1)'), 0)
	}

	@When("User Input produk name with {string}")
	public void user_Input_produk_name_with(String input_mobil) {
		Mobile.setText(findTestObject('Page_Detail Produk (Buyer)/Tes Search/input_Search (E2)'), input_mobil, 0)
	}

	@Then("User can view list of product named mobil")
	public void user_can_view_list_of_product_named_mobil() {
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/Tes Search/item_Sony a 6400 (textview attributes)'), 0)
		Mobile.tap(findTestObject('Page_Beranda/button_back'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@When("User tap X button")
	public void user_tap_X_button() {
		Mobile.checkElement(findTestObject('Page_Beranda/button_X'), 0)
	}

	@When("User input text with {string}")
	public void user_input_text_with(String input_mobil) {
		Mobile.setText(findTestObject('Page_Detail Produk (Buyer)/Tes Search/input_Search (E2)'), input_mobil, 0)
	}

	@Then("input text on search bar will be empty")
	public void input_text_on_search_bar_will_be_empty() {
		Mobile.verifyElementVisible(findTestObject('Page_Detail Produk (Buyer)/Tes Search/input_Search (E1)'), 0)
		Mobile.tap(findTestObject('Page_Beranda/button_back'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@When("User tap back button")
	public void user_tap_back_button() {
		Mobile.tap(findTestObject('Page_Beranda/button_back'), 0)
	}

	@Then("User redirect to beranda")
	public void user_redirect_to_beranda() {
		Mobile.verifyElementVisible(findTestObject('Page_Beranda/Category/button_semua'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Beranda/Category/button_Elektronik'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Beranda/Category/button_Komputer dan Aksesoris'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@When("User tap category komputer dan aksesoris")
	public void user_tap_category_komputer_dan_aksesoris() {
		Mobile.checkElement(findTestObject('Page_Beranda/Category/button_Komputer dan Aksesoris'), 0)
	}

	@When("User tap category semua")
	public void user_tap_category_semua() {
		Mobile.checkElement(findTestObject('Page_Beranda/Category/button_semua'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@When("User tap tambah produk button")
	public void user_tap_tambah_produk_button() {
		Mobile.tap(findTestObject('Navbar/button_jual'), 0)
	}

	@Then("User will directed to tambah produk page")
	public void user_will_directed_to_tambah_produk_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Tambah Produk/input_nama produk'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Tambah Produk/input_harga produk'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Tambah Produk/select_kategori'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Tambah Produk/input_deskripsi'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Tambah Produk/button_terbitkan'), 0)
		Mobile.closeApplication()
		Mobile.startApplication('APK File\\app-release.apk', false)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

}