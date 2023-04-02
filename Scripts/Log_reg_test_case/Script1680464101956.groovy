import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.205.253.70:3000/')

WebUI.click(findTestObject('Object Repository/Login and Register/Page_/span_Login_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Login and Register/Page_/button_Login'))

WebUI.click(findTestObject('Object Repository/Login and Register/Page_Fup Login/a_Register'))

WebUI.setText(findTestObject('Object Repository/Login and Register/Page_Fup Register/input_REGISTER_userEmail'), Email)

WebUI.setText(findTestObject('Object Repository/Login and Register/Page_Fup Register/input_REGISTER_userName'), Username)

WebUI.setText(findTestObject('Object Repository/Login and Register/Page_Fup Register/input_REGISTER_userPassword'), Password)

WebUI.setText(findTestObject('Object Repository/Login and Register/Page_Fup Register/input'), RepeatPassword)

WebUI.click(findTestObject('Object Repository/Login and Register/Page_Fup Register/button_Register'))

WebUI.setText(findTestObject('Object Repository/Login and Register/Page_Fup Login/input_LOGIN_userEmail'), Email)

WebUI.setText(findTestObject('Object Repository/Login and Register/Page_Fup Login/input_LOGIN_userPassword'), Password)

WebUI.click(findTestObject('Object Repository/Login and Register/Page_Fup Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/Login and Register/Page_FUP Restaurant/span_Logout_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Login and Register/Page_FUP Restaurant/p_Test1'))

