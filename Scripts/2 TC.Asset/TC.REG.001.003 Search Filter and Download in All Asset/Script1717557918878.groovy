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

WebUI.click(findTestObject('Asset/001 Register Asset/OBJ.001.001 Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/001 Register Asset/OBJ.001.002 Menu All Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.001 Search Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.002 Search Text Field'), 'Laptop Designer')

WebUI.sendKeys(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.002 Search Text Field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.003 Clear Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.004 Closed Field Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.005 Button Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.006 Select Filter Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.007 Search Filter Name'), 'Laptop Designer')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.008 Choose Filter Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.009 Select Filter Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.010 Choose Filter Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.011 Submit Select Filter Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.012 Select Filter Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.013 Search Filter Brand'), 'Kaos Kutang')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.014 Choose Filter Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.015 Select Filter Model Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.016 Search Filter Model Type'), 'air jordan')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.017 Choose Filter Model Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.018 Select Filter Tag type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.019 Choose Filter Tag Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.020 Select Filter Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.021 Search Filter Group'), 'Testing Area')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.022 Choose Filter Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.023 Submit Select Filter Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.024 Select Filter Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.025 Search Filter Status'), 'Available')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.026 Choose Filter Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.027 Select Filter Maintenance'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.028 Search Filter maintenance'), 'None')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.029 Choose In Maintenance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.030 Select Filter Transactional Policy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.031 Search Filter Transactional Policy'), 
    'Transactionable')

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.032 Choose Filter Transaction Policy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.033 Select Filter Audit Addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.034 Choose Filter Audit Addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.035 Select Filter Maintenance Addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.036 Choose Filter Maintenance Addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.037 Select Filter Tracking Addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.038 Choose Filter Tracking Addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.039 Select FIlter Repair Ticketing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.040 Choose Filter Repair Ticketing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.041 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.042 Reset Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.005 Button Filter'), FailureHandling.STOP_ON_FAILURE)

'Bugs Download Available Asset All\r\n'
WebUI.click(findTestObject('Asset/002 Search Asset, Filter and Download/OBJ.002.043 Download Data Table Available All'), 
    FailureHandling.STOP_ON_FAILURE)

