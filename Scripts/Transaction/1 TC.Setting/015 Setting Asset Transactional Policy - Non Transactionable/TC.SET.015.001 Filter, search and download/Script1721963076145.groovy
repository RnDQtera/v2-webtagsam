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

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.001 Menu asset transactional policy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/023 Setting Asset Transactional Policy - Non transactionable/OBJ.023.001 Tab non transactionable'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.002 Button search'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.003 Input Search'), 
    'Pawn')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.003 Input Search'), 
    Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.004 Button filter'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.005 Dropdown asset name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.006 Search asset name'), 
    'Pawn')

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.007 Option 1 asset name'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.008 Dropdown brand'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.009 Search brand'), 
    'Kasparov')

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.010 Option 1 brand'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.011 Dropdown model type'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.012 Option 2 model'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.015 Select cat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.043 Search filter'), 
    'chess')

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.016 Cat 1'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.017 Button select cat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.015 Select cat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.017 Button select cat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/023 Setting Asset Transactional Policy - Non transactionable/OBJ.023.002 Apply filter'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/022 Setting Asset Transactional Policy - Transactionable/OBJ.022.021 Download button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.SET.015.001.png', FailureHandling.STOP_ON_FAILURE)

