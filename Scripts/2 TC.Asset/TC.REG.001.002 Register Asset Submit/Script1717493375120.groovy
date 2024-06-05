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

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.001 Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.002 Menu All Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.003 Menu Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.004 Select Group Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.005 Search Group in Register Asset'), 'Testing Area')

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.006 Select Group in Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.007 Submit Select Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.008 Select Category Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.009 Select Category Option'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.010 Submit Selected Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.011 Select Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.011 Select Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Asset/01 Register Asset/OBJ.001.011 Select Asset Name'), Keys.chord(Keys.DOWN, Keys.DOWN, 
        Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, 
        Keys.DOWN, Keys.DOWN))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Asset/01 Register Asset/OBJ.001.011 Select Asset Name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.012 Add Alias Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.013 Input Alias Name'), 'Input Alias')

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.014 Select Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.015 Choose Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.016 Select Model'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.017 Choose Model'), FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Asset/01 Register Asset/OBJ.001.018 Upload Photo'), 'C:\\Users\\user\\Downloads\\images.jpeg')

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.019 Apply Foto'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.020 Select Custom Field Warna'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.021 Choose Custom Field Warna'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.022 Input Qty'), '3')

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.023 Select Custom Field 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.024 Choose Custom Field 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.025 Input Custom FIeld 3'), '90')

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.026 Input Custom FIeld 4'), '90')

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.027 Input Custom FIeld 5'), '90')

WebUI.setText(findTestObject('Asset/01 Register Asset/OBJ.001.028 Input Custom FIeld 6'), '90')

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.030 Stay on This Page'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset/01 Register Asset/OBJ.001.031 Submit Register Asset'), FailureHandling.STOP_ON_FAILURE)

