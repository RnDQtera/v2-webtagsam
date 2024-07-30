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

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.idqatester)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.001 Menu addon'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.002 Menu service center'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.001 Add service center'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.002 Input name'), 'hapus pt')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.003 Dropdown brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.005 CB 1 brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.006 Select cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.007 All cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.008 Apply cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.009 Dropdown country'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.011 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.012 Dropdown state'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.014 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.015 Dropdown city'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.017 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.018 Input zip code'), '8080')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.019 Input address'), 'Belok kanan terus belok kiri sampe')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.020 Input no hp'), '0856789123')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.021 Input pic name'), 'And')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.022 Input pin no hp'), '08923103321')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.024 Clear form'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.002 Input name'), 'pt patungan yuk')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.003 Dropdown brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.004 Search brand'), 'kasparov')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.005 CB 1 brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.006 Select cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.007 All cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.008 Apply cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.009 Dropdown country'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.010 Search country'), 'indonesia')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.011 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.012 Dropdown state'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.013 Search state'), 'sulawesi selatan')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.014 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.015 Dropdown city'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.016 Search city'), 'kota makassar')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.017 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.018 Input zip code'), '8080')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.019 Input address'), 'Belok kanan terus belok kiri sampe')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.020 Input no hp'), '0856789123')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.021 Input pic name'), 'And')

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.022 Input pin no hp'), '08923103321')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.025 Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.SER.001.002.png', FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.closeBrowser()

