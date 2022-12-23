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


public class Notification_Buyer {
	@When("Buyer tap button notification in navbar")
	public void buyer_tap_button_notification_in_navbar() {
		Mobile.tap(findTestObject('Navbar/button_notifikasi'), 0)
	}

	@Then("The system displays a notification page")
	public void the_system_displays_a_notification_page() {
		Mobile.checkElement(findTestObject('Page_Notifikasi/Tittle_Notifikasi2'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}

	@Then("Buyer gets notification Berhasil Diterbitkan")
	public void buyer_gets_notification_Berhasil_Diterbitkan() {
		Mobile.checkElement(findTestObject('Page_Notifikasi/Notif_Berhasil diterbitkan'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
	@Then("Buyer gets notification Ditawar")
	public void Buyer_gets_notification_Ditawar() {
		//		Mobile.scrollToElement(findTestObject('Notification/Notif_Ditawar'), 0)
		Mobile.scrollToText('Ditawar')
		Mobile.checkElement(findTestObject('Page_Notifikasi/Notif_Ditawar2'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
	@Then("Buyer gets notification Ditawar Tercoret")
	public void Buyer_gets_notification_Ditawar_Tercoret() {
		Mobile.checkElement(findTestObject('Page_Notifikasi/Notif_Ditawar Dicoret'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
	@Then("Buyer gets notification Ditolak")
	public void Buyer_gets_notification_Ditolak() {
		Mobile.checkElement(findTestObject('Page_Notifikasi/Notif_Ditolak2'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
	@Then("Buyer gets notification Berhasil ditawar")
	public void Buyer_gets_notification_Berhasil_ditawar() {
		Mobile.checkElement(findTestObject('Page_Notifikasi/Notif_Berhasil Ditawar'), 0)
		Mobile.tap(findTestObject('Page_Akun/menu_akun'), 0)
		Mobile.tap(findTestObject('Page_Akun/After Login/menu_keluar'), 0)
	}
}

