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

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.001 Tab fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/005 Damage reported/OBJ.005.001 Tab damaged'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.002 Tab history'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.003 Button search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('03 Transaction/004 Missing history/OBJ.004.004 Input search'), 'pawn')

WebUI.sendKeys(findTestObject('03 Transaction/004 Missing history/OBJ.004.004 Input search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.005 Button filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.006 Dropdown name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('03 Transaction/004 Missing history/OBJ.004.007 Input search dropdown name'), 'pawn')

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.008 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.009 Dropdown brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.010 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.011 Dropdown model type'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.012 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.013 Dropdown TAG'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.014 CB 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.015 Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.016 Tgl 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.017 Tgl 31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.018 Dropdown status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.019 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.020 Dropdown group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.021 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.022 Apply filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.023 Download'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.024 Single action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/004 Missing history/OBJ.004.025 Action missin log'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.DAM.001.009.png', FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.closeBrowser()

