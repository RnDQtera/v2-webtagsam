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
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.001 Tab Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.028 Button Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.029 Search Changelog Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.030 Text Field Search Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('015 Setting Asset Name - Brand/OBJ.015.030 Text Field Search Changelog'), 'Brand Kaca')

'\r\n'
WebUI.sendKeys(findTestObject('015 Setting Asset Name - Brand/OBJ.015.030 Text Field Search Changelog'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.sendKeys(findTestObject('015 Setting Asset Name - Brand/OBJ.015.030 Text Field Search Changelog'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

'\r\n'
WebUI.setText(findTestObject('015 Setting Asset Name - Brand/OBJ.015.030 Text Field Search Changelog'), 'QA Brand New')

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.031 Closed Search'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.032 Back Search'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.033 FIlter Change Log Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('015 Setting Asset Name - Brand/OBJ.015.034 Field Date'), '01/05/2024 - 31/05/2024')

'\r\n'
WebUI.sendKeys(findTestObject('015 Setting Asset Name - Brand/OBJ.015.034 Field Date'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.035 Select Filter Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('015 Setting Asset Name - Brand/OBJ.015.036 Search Filter Action'), 'Create')

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.037 Choose Options Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.038 Select Filter Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('015 Setting Asset Name - Brand/OBJ.015.039 Search Filter Field'), 'Brand Name')

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.040 Choose Option Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.041 Select Modified by'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.042 Chose Modified by'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.041 Select Modified by'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.043 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.044 Download Change Log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.045 Clear Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('015 Setting Asset Name - Brand/OBJ.015.043 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

