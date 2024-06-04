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
WebUI.click(findTestObject('Setting/011 Create and Delete User/OBJ.011.001 Tab User'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.001 Select Data Change Log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.002 Search Data Change log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/013 Data Change Log/OBJ.013.003 Field Search Data Change Log'), 'User Name')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/013 Data Change Log/OBJ.013.003 Field Search Data Change Log'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.sendKeys(findTestObject('Setting/013 Data Change Log/OBJ.013.003 Field Search Data Change Log'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.004 Filter Data Table'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/013 Data Change Log/OBJ.013.005 Select Date Changelog'), '16/05/2024 - 31/05/2024')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/013 Data Change Log/OBJ.013.005 Select Date Changelog'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.006 Select Action Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.007 Select Action Create'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.008 Select Field Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.009 Select Field User Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.010 Select Modified by Changelog'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.011 Select Field Modified By'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.003 Field Search Data Change Log'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.012 Apply FIlter'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/013 Data Change Log/OBJ.013.013 Clear Field'), FailureHandling.STOP_ON_FAILURE)

