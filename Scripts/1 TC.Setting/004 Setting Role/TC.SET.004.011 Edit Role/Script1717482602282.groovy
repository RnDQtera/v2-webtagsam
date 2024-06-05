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

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.001 Select Role Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/009 Set Role/OBJ.009.001 Select Tab System Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.001 Create Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/010 Create Role/OBJ.010.002 Create Role Name'), 'Testing Role')

'\r\n'
WebUI.setText(findTestObject('Setting/010 Create Role/OBJ.010.003 Create Description Role'), 'Role Percobaan')

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.004 Active Create Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.005 Active Edit Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.006 Active Delete Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.007 Active Create Manage asset names, brands, categories and custom fields'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.008 Active Edit Manage asset names, brands, categories and custom fields'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.009 Active Delete Manage asset names, brands, categories and custom fields'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.010 Active Create Manage asset policy'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.011 Active Edit Manage asset policy'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.012 Active Delete Manage asset policy'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.013 Active Cerate Manage Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.014 Active Edit Manage Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.015 Active Delete Manage Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.016 Active Cerate Manage Depreciation Method'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.017 Active Edit Manage Depreciation Method'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.018 Active Delete Manage Depreciation Method'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.049 Submit Create Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/009 Set Role/OBJ.009.002 Search data table role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/009 Set Role/OBJ.009.003 Field Search Data Table'), 'Testing Role')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/009 Set Role/OBJ.009.003 Field Search Data Table'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.050 Single Action Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.055 Action Edit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.004 Active Create Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.005 Active Edit Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.002 Create Role Name'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.sendKeys(findTestObject('Setting/010 Create Role/OBJ.010.002 Create Role Name'), Keys.chord(Keys.CONTROL, 'a'))

'\r\n'
WebUI.setText(findTestObject('Setting/010 Create Role/OBJ.010.002 Create Role Name'), 'Role Edited')

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.056 Save Edit'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/009 Set Role/OBJ.009.002 Search data table role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('Setting/009 Set Role/OBJ.009.003 Field Search Data Table'), 'Role Edited')

'\r\n'
WebUI.sendKeys(findTestObject('Setting/009 Set Role/OBJ.009.003 Field Search Data Table'), Keys.chord(Keys.ENTER))

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.050 Single Action Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.057 Detail Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.058 Closed View Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.050 Single Action Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.051 Single Action Delete in Menu Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('Setting/010 Create Role/OBJ.010.052 Confirmation Delete Role'), FailureHandling.STOP_ON_FAILURE)

