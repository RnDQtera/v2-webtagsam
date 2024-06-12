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
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.001 Tab User'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.002 Create User'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.003 Field First Name'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.004 Field Last Name'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.005 Field Position'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.006 Field Division'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.007 Field Employee ID'), '12345678')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.008 Field Phone Number'), '12345678')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.009 Field Email'), 'testqa@mailnesia.com')

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.011 Set as Temporary user'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.012 Select Active Period Until'), '16/05/2024')

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.010 Select Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.014 Serach Group'), 'Create New')

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.013 Select Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.015 Submit Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.uploadFile(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.016 Upload Photo'), 'C:\\Users\\user\\Downloads\\Professional-Portrait-DC-001.webp')

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.017 Apply Image'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.018 Select System Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.019 Serach System Role'), 'Total Control')

'\r\nCancel Image Masih bugs\r\n'
WebUI.sendKeys(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.019 Serach System Role'), Keys.chord(Keys.ENTER))

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.020 Select Total Contorol'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.021 Select Transaction Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.022 Select one Transaction Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.023 Clear Field'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.003 Field First Name'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.004 Field Last Name'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.005 Field Position'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.006 Field Division'), 'Test By QA')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.007 Field Employee ID'), '12345678')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.008 Field Phone Number'), '12345678')

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.009 Field Email'), 'testqa@mailnesia.com')

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.011 Set as Temporary user'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.012 Select Active Period Until'), '16/05/2024')

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.010 Select Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.014 Serach Group'), 'Create New')

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.013 Select Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.015 Submit Group'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.uploadFile(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.016 Upload Photo'), 'C:\\Users\\user\\Downloads\\Professional-Portrait-DC-001.webp')

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.017 Apply Image'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.018 Select System Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.019 Serach System Role'), 'Total Control')

'\r\nCancel Image Masih bugs\r\n'
WebUI.sendKeys(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.019 Serach System Role'), Keys.chord(Keys.ENTER))

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.020 Select Total Contorol'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.021 Select Transaction Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.022 Select one Transaction Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.025 Submit form'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.026 Confirm Submit Form'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.027 Search Data Table'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.setText(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.028 Field Search Data Table'), 'Test By QA')

'\r\nCancel Image Masih bugs\r\n'
WebUI.sendKeys(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.028 Field Search Data Table'), Keys.chord(Keys.ENTER))

'\r\nCancel Image Masih bugs\r\n'
WebUI.sendKeys(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.029 Action List User'), Keys.chord(Keys.ENTER))

'\r\nCancel Image Masih bugs\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.030 Detail Data User'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.031 bulk remove system role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.032 Select bulk action system role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.033 Select Remove Bulk Action'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.034 Confirm Delete bulk action'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.035 Tab Transaction Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.036 Bulk Remove Transaction Role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.037 Select bulk action transaction role'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.038 Select Remove Bulk Action'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.039 Confirm Delete Bulk Action'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.040 Closed detail user'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.029 Action List User'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.041 Delete List User'), FailureHandling.STOP_ON_FAILURE)

'\r\nCancel Image Masih bugs\r\n'
WebUI.click(findTestObject('02 Setting/011 Create and Delete User/OBJ.011.042 Confirm Delete User'), FailureHandling.STOP_ON_FAILURE)

