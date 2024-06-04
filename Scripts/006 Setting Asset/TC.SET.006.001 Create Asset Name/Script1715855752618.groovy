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

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.001 Tab Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.002 Create Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('014 Setting Asset Name/OBJ.013.003 Input Asset Name'), 'Test QA1')

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.004 Input Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.005 Select Measurement Value'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.006 Input Tag Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.007 Select Tag Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.008 Input Addon Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.009 Select Addon Type Audit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.010 Select Addon Type Maintenance Routine'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.011 Select Addon Type Repair Ticketing'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.012 Select Addon Type Tracking'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.013 Closed Choose Option'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('014 Setting Asset Name/OBJ.013.014 Input Alias Code'), 'TQA')

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.015 Input Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('014 Setting Asset Name/OBJ.013.016 Search Category Name'), 'Test New')

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.017 Choose Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.018 Submit Choose Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.019 Clear Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('014 Setting Asset Name/OBJ.013.003 Input Asset Name'), 'Test QA1')

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.004 Input Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.005 Select Measurement Value'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.006 Input Tag Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.007 Select Tag Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.008 Input Addon Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.009 Select Addon Type Audit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.010 Select Addon Type Maintenance Routine'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.011 Select Addon Type Repair Ticketing'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.012 Select Addon Type Tracking'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.013 Closed Choose Option'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('014 Setting Asset Name/OBJ.013.014 Input Alias Code'), 'TQA')

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.015 Input Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('014 Setting Asset Name/OBJ.013.016 Search Category Name'), 'Test New')

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.017 Choose Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.018 Submit Choose Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.020 Stay Page After Submit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('014 Setting Asset Name/OBJ.013.021 Submit form Create Asset Name'), FailureHandling.STOP_ON_FAILURE)

