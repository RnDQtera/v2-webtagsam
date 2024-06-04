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
WebUI.click(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.001 Tab Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.002 Add Measurement'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.003 Input Field Measurement'), 'automate test')

'\r\n'
WebUI.click(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.004 Clear Field'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.003 Input Field Measurement'), 'Automate test by QA')

'\r\n'
WebUI.click(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.005 Stay on this form after submit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('016 Setting Asset Name - Measurement/OBJ.016.006 Submit Measuement'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:\\Users\\aplikasi internal\\Documents\\Clone TS V2\\v2-webtagsam\\Screenshot\\TC.SET.008.001', FailureHandling.STOP_ON_FAILURE)

