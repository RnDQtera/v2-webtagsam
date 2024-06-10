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

WebUI.setText(findTestObject('Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.id)

WebUI.setText(findTestObject('Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/001 Register Asset/OBJ.001.001 Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/001 Register Asset/OBJ.001.002 Menu All Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.001 Button Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.002 Search Data Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/003 Change Log/OBJ.003.003 Text Field Search'), 'Maspion')

WebUI.sendKeys(findTestObject('Asset/003 Change Log/OBJ.003.003 Text Field Search'), Keys.chord(Keys.ENTER))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.004 Clear Field Search Data Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.005 Closed Text Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.006 Button FIilter Change Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/003 Change Log/OBJ.003.007 Field Date'), '01/05/2024 - 30/05/2024')

WebUI.sendKeys(findTestObject('Asset/003 Change Log/OBJ.003.007 Field Date'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.008 Select Filter Action Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.009 Search Filter Action Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.010 Choose Filter Action Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.011 Select Filter Name Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.012 Search Filter Name Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.013 Choose Filter Name Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.014 Select Filter Field Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.015 Search Filter Field Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.016 Choose Filter Field Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.017 Select Filter Field Modified by Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.018 Search Filter Field Modified by Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/003 Change Log/OBJ.003.019 Choose Filter Field Modified by Changelog'), FailureHandling.STOP_ON_FAILURE)

