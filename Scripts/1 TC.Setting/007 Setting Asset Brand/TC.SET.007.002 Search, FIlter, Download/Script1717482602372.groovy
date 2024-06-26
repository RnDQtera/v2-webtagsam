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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.id)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.001 Tab Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.001 Tab Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.013 Button Search'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.014 Text Field Search'), 'QA Brand New')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.014 Text Field Search'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.015 Clear Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.016 Closed Search Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.017 Filter Data Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.018 Select Filter Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.019 Search Field Filter Brand'), 'QA Brand New')

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.020 Choose Option Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.021 Select Model Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.022 Search Field Model Type'), 'Model Testing')

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.023 Choose Options Model Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.024 Select Last Modified'), '01/05/2024 - 30/05/2024')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.024 Select Last Modified'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.026 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.027 Button Download'), FailureHandling.STOP_ON_FAILURE)

