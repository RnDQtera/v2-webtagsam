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

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.001 Tab missing'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.002 Button search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('03 Transaction/003 Missing reported/OBJ.003.003 Input search'), 'pawn')

WebUI.sendKeys(findTestObject('03 Transaction/003 Missing reported/OBJ.003.003 Input search'), Keys.chord(Keys.ENTER))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.004 Button filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.005 Dropdown name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('03 Transaction/003 Missing reported/OBJ.003.006 Search dropdown'), 'pawn')

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.007 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.008 Dropdown brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.009 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.010 Dropdown model type'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.011 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.012 Dropdown TAG'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.013 CB non tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.017 Dropdown status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.018 DB all'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.014 Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.015 Tgl 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.016 Tgl 31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.019 Dropdown reported by'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.020 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.021 CB 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.022 Select group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.023 CB ALL'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.024 Select groups'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.025 Apply filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/003 Missing reported/OBJ.003.026 Download'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.MIS.001.001.png', FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.closeBrowser()

