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
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.001 Select custom field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.025 Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.026 Input search'), 'Textarea')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.026 Input search'), Keys.chord(
        Keys.ENTER))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.043 Option action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.045 Action edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.050 Input name edit'), 'Test edited')

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.004 Dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.046 Option dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.047 Input value'), 'Value 1')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.047 Input value'), Keys.chord(
        Keys.ENTER))

'\r\n'
WebUI.setText(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.047 Input value'), 'Value 2')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.047 Input value'), Keys.chord(
        Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.048 No req'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/017 Setting Custom Field - General Information/OBJ.017.049 Save edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.takeScreenshot('C:/Users/aplikasi internal/Documents/Clone TS V2/v2-webtagsam/Screenshot/TC.SET.009.004.png', FailureHandling.STOP_ON_FAILURE)

