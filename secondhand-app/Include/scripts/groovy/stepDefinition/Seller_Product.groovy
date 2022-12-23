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

public class Seller_Product {


	@Given("Seller on secondhand homepage")
	public void seller_on_secondhand_homepage() {
		Mobile.tap(findTestObject('Navbar/button_beranda'), 0)
		Mobile.verifyElementVisible(findTestObject('Page_Beranda/text_telusuri kategori'), 0)
	}

	@When("Seller click the button +")
	public void seller_click_the_button() {
		Mobile.tap(findTestObject('Navbar/button_jual'), 0)
	}

	@When("Seller fill the value in Nama Produk column with {string}")
	public void seller_fill_the_value_in_Nama_Produk_column_with(String baju) {
		Mobile.clearText(findTestObject('Page_Seller Product/input_nama produk'), 0)
		Mobile.setText(findTestObject('Page_Seller Product/input_nama produk'), baju, 0)
	}

	@When("Seller fill the value in Harga Produk column with {string}")
	public void seller_fill_the_value_in_Harga_Produk_column_with(String harga_produk) {
		Mobile.clearText(findTestObject('Page_Seller Product/input_harga produk'), 0)
		Mobile.setText(findTestObject('Page_Seller Product/input_harga produk'), harga_produk, 0)
	}

	@When("Seller select the value in Kategori column with {string}")
	public void seller_select_the_value_in_Kategori_column_with(String string) {
		Mobile.tap(findTestObject('Page_Seller Product/button_dropdown kategori'), 0)
		Mobile.tap(findTestObject('Page_Seller Product/button_upload image'), 0)
	}

	@When("Seller fill the value in Lokasi column with {string}")
	public void seller_fill_the_value_in_Lokasi_column_with(String lokasi) {
		Mobile.clearText(findTestObject('Page_Seller Product/input_lokasi'), 0)
		Mobile.setText(findTestObject('Page_Seller Product/input_lokasi'), lokasi, 0)
	}

	@When("Seller fill the value in Deskripsi column with {string}")
	public void seller_fill_the_value_in_Deskripsi_column_with(String deskripsi) {
		Mobile.clearText(findTestObject('Page_Seller Product/input_deskripsi'), 0)
		Mobile.setText(findTestObject('Page_Seller Product/input_deskripsi'), deskripsi, 0)
	}

	@When("Seller upload Photo Product")
	public void seller_upload_Photo_Product() {
		Mobile.tap(findTestObject('Page_Seller Product/button_upload image'), 0)
		Mobile.tap(findTestObject('Page_Seller Product/button_galeri'), 0)
		Mobile.tap(findTestObject('Page_Seller Product/image_product'), 0)
	}

	@When("Seller click the button Terbitkan")
	public void seller_click_the_button_Terbitkan() {
		Mobile.tap(findTestObject('Page_Seller Product/button_terbitkan'), 0)
	}

	@Then("New product successfully added")
	public void new_product_successfully_added() {
		Mobile.verifyElementVisible(findTestObject('Page_Daftar Jual/text_produk berhasil diterbitkan'), 0)
	}

	@Given("Seller click the icon Akun")
	public void seller_click_the_icon_Akun() {
		Mobile.tap(findTestObject('Navbar/button_akun'), 0)
	}

	@When("Seller click Daftar Jual Saya")
	public void seller_click_Daftar_Jual_Saya() {
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_daftar_jual_saya'), 0)
	}

	@Then("Seller products displayed")
	public void seller_products_displayed() {
		Mobile.verifyElementVisible(findTestObject('Page_Daftar Jual/text_daftar jual saya'), 0)
		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click the icon Trash")
	public void seller_click_the_icon_Trash() {
		Mobile.tap(findTestObject('Page_Daftar Jual/icon_hapus'), 0)
	}

	@When("Seller click the button Hapus")
	public void seller_click_the_button_Hapus() {
		Mobile.tap(findTestObject('Page_Daftar Jual/button_hapus'), 0)
	}

	@Then("Product deleted successfully")
	public void product_deleted_successfully() {
		Mobile.verifyElementVisible(findTestObject('Page_Daftar Jual/text_produk berhasil dihapus'), 0)
	}

	@When("Seller select product")
	public void seller_select_product() {
		Mobile.tap(findTestObject('Page_Daftar Jual/card_product'), 0)
	}

	@When("Seller click the button Perbarui Produk")
	public void seller_click_the_button_Perbarui_Produk() {
		Mobile.tap(findTestObject('Page_Seller Product/button_perbarui produk'), 0)
	}

	@Then("Saved changes successfully")
	public void saved_changes_successfully() {
		Mobile.verifyElementVisible(findTestObject('Page_Daftar Jual/text_produk berhasil diperbarui'), 0)
	}
	@Then("New product unsuccessfully added")
	public void new_product_unsuccessfully_added() {
		Mobile.verifyElementVisible(findTestObject('Page_Seller Product/text_tambah produk'), 0)
	}

	@When("Seller click back button")
	public void seller_click_back_button() {
		Mobile.tap(findTestObject('Page_Daftar Jual/button_back 2'), 0)
	}

	@When("Seller click button Keluar")
	public void user_click_button_Keluar() {
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
	@Then("Seller successfully logout")
	public void user_successfully_logout() {
		Mobile.checkElement(findTestObject('Page_Beranda/text_telusuri kategori'), 0)
	}
}
