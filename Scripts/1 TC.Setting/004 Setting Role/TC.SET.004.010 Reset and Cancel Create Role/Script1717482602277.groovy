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

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.001 Select Role Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/009 Set Role/OBJ.009.001 Select Tab System Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.001 Create Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/010 Create Role/OBJ.010.002 Create Role Name'), 'Testing Role')

'\r\n'
WebUI.setText(findTestObject('02 Setting/010 Create Role/OBJ.010.003 Create Description Role'), 'Role Percobaan')

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.004 Active Create Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.005 Active Edit Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.006 Active Delete Import Data'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.007 Active Create Manage asset names, brands, categories and custom fields'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.008 Active Edit Manage asset names, brands, categories and custom fields'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.009 Active Delete Manage asset names, brands, categories and custom fields'), 
    FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.010 Active Create Manage asset policy'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.011 Active Edit Manage asset policy'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.012 Active Delete Manage asset policy'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.013 Active Cerate Manage Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.014 Active Edit Manage Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.015 Active Delete Manage Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.016 Active Cerate Manage Depreciation Method'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.017 Active Edit Manage Depreciation Method'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.018 Active Delete Manage Depreciation Method'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.019 Active Cerate Manage document deletion'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.020 Active Edit Manage document deletion'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.021 Active Delete Manage document deletion'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.022 Active Cerate manage Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.023 Active Edit manage Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.024 Active Delete manage Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.025 Active Cerate Manage User'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.026 Active Edit Manage User'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.027 Active Delete Manage User'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.028 Active Cerate Manage IoT and Reader'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.029 Active Edit Manage IoT and Reader'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.030 Active Delete Manage IoT and Reader'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.031 Active Cerate Manage License'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.032 Active Edit Manage License'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.033 Active Delete Manage License'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.034 Active Cerate Manage Purchase Document'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.035 Active Edit Manage Purcahse Document'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.036 Active Delete Manage Purcahse Document'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.037 Active Cerate Manage Purchase Information'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.038 Active Edit Manage Purcahse Information'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.039 Active Delete Manage Purcahse Information'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.040 Active Cerate Manage Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.041 Active Edit Manage Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.042 Active Delete Manage Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.043 Active Cerate Manage Tag'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.044 Active Edit Manage Tag'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.045 Active Delete Manage Tag'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.046 Active Cerate Register Asset'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.047 Active Edit Register Asset'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.048 Active Delete Register Asset'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.053 Reset Role'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/010 Create Role/OBJ.010.054 Cancel Create Role'), FailureHandling.STOP_ON_FAILURE)

