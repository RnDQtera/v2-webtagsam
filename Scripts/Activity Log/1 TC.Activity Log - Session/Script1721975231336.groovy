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

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.id2)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.Pw2)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.001 Menu Reports and Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.002 Menu Activity Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.003 Search data seasion'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/001 Session/OBJ.005.004 Set type search data seasion'), 'Quality Assurance')

WebUI.sendKeys(findTestObject('05 Activity Log/001 Session/OBJ.005.004 Set type search data seasion'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('05 Activity Log/001 Session/OBJ.005.004 Set type search data seasion'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.DELETE, Keys.ENTER))

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.005 Button filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.006 Pick Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.007 Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.006 Pick Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.008 End Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.009 Pick Data user'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.010 Search data user'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/001 Session/OBJ.005.010 Search data user'), 'Quality Assurance')

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.011 Select data user'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.012 Pick Data Position'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.013 Search Data Position'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/001 Session/OBJ.005.013 Search Data Position'), 'QA 1')

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.014 Select Data Position'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.015 Pick Data Activity'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.016 Search Data Activity'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/001 Session/OBJ.005.016 Search Data Activity'), 'Login')

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.017 Select Data Activity'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.015 Pick Data Activity'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.018 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

