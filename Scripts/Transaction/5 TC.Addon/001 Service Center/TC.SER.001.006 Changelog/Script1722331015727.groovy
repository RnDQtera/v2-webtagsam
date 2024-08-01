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

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.idqatester)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.001 Menu addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.002 Menu service center'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.040 Button changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'changelog tuh kadang bisa kadang ngga'
WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.041 Button search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.042 Input search'), 'Patungan')

WebUI.sendKeys(findTestObject('04 Addon/002 Service center/OBJ.002.042 Input search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.043 Button filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.044 Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.045 Tgl1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.046 Tgl 31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.047 Dropdown action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.048 Cb2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.049 Dropdown name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.050 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.051 Dropdown field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.052 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.053 Dropdown mod by'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.055 Apply filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.056 Button download'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.SER.001.006.png', FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.closeBrowser()

