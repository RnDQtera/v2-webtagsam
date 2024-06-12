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
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.054 Changelog Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.055 Search Change Log Data Table'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.056 Set Text Search Filter Changelog Asset Name'), 'ThinkPad')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.056 Set Text Search Filter Changelog Asset Name'), Keys.chord(
        Keys.ENTER))

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.056 Set Text Search Filter Changelog Asset Name'), Keys.chord(
        Keys.ENTER))

'\r\n'
WebUI.setText(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.056 Set Text Search Filter Changelog Asset Name'), 'Tembok')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.056 Set Text Search Filter Changelog Asset Name'), Keys.chord(
        Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.072 Back Search'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.058 Filter Changelog Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.059 Select Date'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.059 Select Date'), '01/05/2024 - 25/05/2024')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.059 Select Date'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.060 Select Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.061 Search Action'), 'Create')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.061 Search Action'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.062 Select Action Change log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.063 Select Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.064 Search Asset Name'), 'Laptop Kantor')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.064 Search Asset Name'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.065 Select Asset Name Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.066 Select Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.067 Search Field'), 'Asset Name')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.067 Search Field'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.068 Select Field Change Log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.069 Select Modified by'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.071 Select Modified by Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.074 Apply Filter Change Log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.075 Download Data Table'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.076 Clear Field'), FailureHandling.STOP_ON_FAILURE)

