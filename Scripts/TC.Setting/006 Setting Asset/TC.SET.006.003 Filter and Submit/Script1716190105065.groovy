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
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.024 Closed Text Field Serach Data Table'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.025 Filter Data Table Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.026 Select Field Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.027 Search Field Filter Asset Name'), 'Test QA')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.027 Search Field Filter Asset Name'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.028 Select Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.029 Select Field Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.030 Search Field Measurement'), 'Tahun Cahaya')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.030 Search Field Measurement'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.031 Select Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.032 Select Field Alias Code'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.033 Search Field Alias Code'), 'TQA')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.033 Search Field Alias Code'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.034 Select Alias Code'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.035 Select Field Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.036 Search Brand'), 'Tes')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.036 Search Brand'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.037 Select Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.038 Select Field Model or Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.039 Search Field Model or Type'), 'Brand New 3001')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.039 Search Field Model or Type'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.040 Select Model or Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.041 Select FIeld Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.042 Search Field Depreciation Group'), 'Group 1')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.042 Search Field Depreciation Group'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.043 Select Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.044 Select Field Account Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.045 Search Field Account Name'), 'Nomor Polisi')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.045 Search Field Account Name'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.046 Select Account Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.047 Select Field Account Code'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.048 Search Field Account Code'), '911-110')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/014 Setting Asset Name/OBJ.013.048 Search Field Account Code'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.049 Select Account Code'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.050 Select Last Modified'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/014 Setting Asset Name/OBJ.013.050 Select Last Modified'), '17/05/2024 - 20/05/2024')

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/014 Setting Asset Name/OBJ.013.052 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

