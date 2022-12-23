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

public class Transaction_History {
	@When("Buyer tap button Transaksi in navbar")
	public void buyer_tap_button_Transaksi_in_navbar() {
		Mobile.tap(findTestObject('Navbar/button_transaksi'), 0)
	}

	@Then("The system displays a Transaksi page")
	public void the_system_displays_a_Transaksi_page() {
		Mobile.checkElement(findTestObject('Page_History Transaksi/Tittle_Transaksi'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@Then("The system displays the history of transactions that have been completed")
	public void the_system_displays_the_history_of_transactions_that_have_been_completed() {
		Mobile.checkElement(findTestObject('Page_History Transaksi/History_Selesai'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@Then("The system displays transaction history that was rejected by the seller")
	public void the_system_displays_transaction_history_that_was_rejected_by_the_seller() {
		Mobile.checkElement(findTestObject('Page_History Transaksi/History_Dibatalkan'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
}
