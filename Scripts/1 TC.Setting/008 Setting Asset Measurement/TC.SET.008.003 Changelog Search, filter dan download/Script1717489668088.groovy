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

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.usernamev2)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.passv2)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.001 Tab Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.001 Tab Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.010 Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.013 Filter changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.014 Dropdown action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.015 Option 2'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.016 Dropdown mod by'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.017 All cb mod by'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.019 Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.020 Tgl 1'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.021 Tgl 30'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.018 Apply filter CL'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.011 Search changelog'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.012 Input search changelog'), 'Nevermore')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.012 Input search changelog'), Keys.chord(
		Keys.ENTER))

WebUI.click(findTestObject('02 Setting/016 Setting Asset Name - Measurement/OBJ.016.022 Download CL'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.takeScreenshot('C:\\Users\\aplikasi internal\\Documents\\Clone TS V2\\Screenshot/TC.SET.008.003.png', FailureHandling.STOP_ON_FAILURE)

