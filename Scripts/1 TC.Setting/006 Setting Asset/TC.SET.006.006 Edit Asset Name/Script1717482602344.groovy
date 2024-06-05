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

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.001 Tab Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.022 Serach Data Table Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.023 Field Search Data Table'), 'Test QA')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.023 Field Search Data Table'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.077 Single Action asset name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.078 Single Action Edit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.079 Asset Name (Edited)'), 'Test QA Edited')

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.080 Measurement (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.081 Measurement Search Field (Edited)'), 'Lusin')

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.082 Select Measurement (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.083 Select Addon (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.084 Uncheck Addon (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.083 Select Addon (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.085 Select Alias Code (Edited)'), 'TQA Edited')

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.086 Edited Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.087 Search category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.087 Search category'), 'Laptop')

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.088 Cancel Select Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.086 Edited Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.087 Search category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.087 Search category'), 'Laptop')

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.089 Select Catgeory Asset'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.090 Save Select Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.091 Submit Edit asset'), FailureHandling.STOP_ON_FAILURE)

