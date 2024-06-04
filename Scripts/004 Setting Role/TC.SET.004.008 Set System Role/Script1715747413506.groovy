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

WebUI.setText(findTestObject('001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.id)

WebUI.setText(findTestObject('001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('004 Setting - Role/OBJ.004.001 Select Role Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.001 Select Tab System Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.002 Search data table role'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.setText(findTestObject('009 Set Role/OBJ.009.003 Field Search Data Table'), 'Total Control')

'\r\n\r\n'
WebUI.sendKeys(findTestObject('009 Set Role/OBJ.009.003 Field Search Data Table'), Keys.chord(Keys.ENTER))

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.004 Clear Field Search Value'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.sendKeys(findTestObject('009 Set Role/OBJ.009.003 Field Search Data Table'), Keys.chord(Keys.ENTER))

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.005 Filter Data Table'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.006 Select Data Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.007 Pick Active Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.009 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.006 Select Data Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.007 Pick Active Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.008 Pick Inactive Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.009 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.010 Clear Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.009 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.011 Download Data Table'), FailureHandling.STOP_ON_FAILURE)

'Wait for Download\r\n\r\n\r\n'
WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.012 View Data Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.013 Search Data Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.setText(findTestObject('009 Set Role/OBJ.009.014 Field Search Data Changelog'), 'Active Status')

'\r\n\r\n'
WebUI.sendKeys(findTestObject('009 Set Role/OBJ.009.014 Field Search Data Changelog'), Keys.chord(Keys.ENTER))

'\r\n\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.sendKeys(findTestObject('009 Set Role/OBJ.009.014 Field Search Data Changelog'), Keys.chord(Keys.CONTROL, 'a'))

'\r\n\r\n'
WebUI.setText(findTestObject('009 Set Role/OBJ.009.014 Field Search Data Changelog'), 'Role Status')

'\r\n\r\n'
WebUI.sendKeys(findTestObject('009 Set Role/OBJ.009.014 Field Search Data Changelog'), Keys.chord(Keys.ENTER))

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.015 Arrow Back'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.016 Filter Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.017 Select Field Date'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.018 Select Start date from'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.019 Select End Date'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.020 Select Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.021 Select Data Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.022 Select Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.023 Select Field Role Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.024 Select Modified by'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.025 Select data Modified by'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.026 Closed Dialog Box'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.027 Apply Filter Change Log'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.028 Clear FIeld Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.029 Download Data Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n\r\n'
WebUI.click(findTestObject('009 Set Role/OBJ.009.030 Closed Dialog Box'), FailureHandling.STOP_ON_FAILURE)

