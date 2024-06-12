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

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.id)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/014 Setting Asset Name/OBJ.013.001 Tab Asset Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.001 Tab Brand'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.046 Single Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.047 Action Edit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.048 Input Brand Name (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.048 Input Brand Name (Edited)'), Keys.chord(Keys.CONTROL, 
        'a'))

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.048 Input Brand Name (Edited)'), 'QA Brand New (Edited)')

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.049 Select Category (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.050 Search Category (Edited)'), 'CPU')

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.050 Search Category (Edited)'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.051 Choose Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.052 Submit Category'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.053 Single Action Delete list Model Type'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.054 Submit Delete Single Action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.055 Choose Model for delete1'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.056 Choose Model for delete2'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.057 Select for bulk action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.058 Choose Delete bulk action'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.059 Input model type (Edited)'), 'Setting')

'\r\n'
WebUI.sendKeys(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.059 Input model type (Edited)'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('02 Setting/015 Setting Asset Name - Brand/OBJ.015.060 Save Edit Brand'), FailureHandling.STOP_ON_FAILURE)

