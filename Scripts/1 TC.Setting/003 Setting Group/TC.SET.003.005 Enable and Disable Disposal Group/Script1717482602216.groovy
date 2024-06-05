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

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.003 Select Group Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.026 Select all group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.027 Select Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.029 Bulk Action Disable Dispose'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.026 Select all group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.027 Select Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.028 Bulk Action Enable Dispose'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Scre/TC.SET.003.005 Bulk Action Disposal.png', FailureHandling.STOP_ON_FAILURE)

