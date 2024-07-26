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

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.001 Menu Reports and Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/001 Session/OBJ.005.002 Menu Activity Log'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.001 Tab User Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.002 Search Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.003 Field Search Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/002 User Action/OBJ.005.003 Field Search Data'), 'Transfer')

WebUI.sendKeys(findTestObject('05 Activity Log/002 User Action/OBJ.005.003 Field Search Data'), Keys.chord(Keys.ENTER))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('05 Activity Log/002 User Action/OBJ.005.003 Field Search Data'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE, Keys.ENTER))

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.004 Filter User Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.005 Pick Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.006 Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.005 Pick Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.007 End Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.008 Pick Modified by'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.009 Search Data Modified By'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/002 User Action/OBJ.005.009 Search Data Modified By'), 'Quality Assurance')

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.010 Select Data Modified by'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.011 Pick Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.012 Search Data Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/002 User Action/OBJ.005.012 Search Data Action'), 'Add')

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.013 Select data action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.014 Pick data Object'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.015 Search Data Object'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/002 User Action/OBJ.005.015 Search Data Object'), 'Disposal Role')

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.016 Select Data Object'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.017 Pick Data Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.018 Search Data Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('05 Activity Log/002 User Action/OBJ.005.018 Search Data Field'), 'Approver Level 2')

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.019 Select Data Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('05 Activity Log/002 User Action/OBJ.005.020 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

