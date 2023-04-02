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

WebUI.navigateToUrl('http://54.205.253.70:3000/login?q=session-expired')

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Fup Login/input_LOGIN_userEmail'), Email)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Fup Login/input_LOGIN_userPassword'), Password)

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_Fup Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/button_Buy'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/span_Logout_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/i_Logout_cart-icon'))

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/input_Beer_order-quantity'), Qty)

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/button_Delete'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/button_Order Menu_btn-close'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/button_Buy'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/i_Logout_cart-icon'))

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/input_Beer_order-quantity'), Qty)

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_FUP Restaurant/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Address/input_First name_form9Example1'), FirstName)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Address/input_Last name_form9Example2'), LastName)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Address/input_City_form9Example3'), City)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Address/input_Zip_form9Example4'), Zip)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Address/input_Address_form9Example6'), Address)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Address/input_Email_typeEmail'), Email)

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_Address/button_Next'))

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Payment/input_Payment Name_form9Example1'), FirstName)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Payment/input_Enter Name_form9Example2'), FirstName)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Payment/input_Card Number_number'), CardNumber)

WebUI.setText(findTestObject('Object Repository/Add item to cart/Page_Payment/input_CVC_form9Example6'), CVC)

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_Payment/button_Next'))

WebUI.click(findTestObject('Object Repository/Add item to cart/Page_Progress Tracker Example/header_Tracking Orders'))

