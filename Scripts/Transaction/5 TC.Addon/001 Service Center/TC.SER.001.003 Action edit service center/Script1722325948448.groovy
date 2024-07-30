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

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.003 Button search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.004 Input search'), 'patungan')

WebUI.sendKeys(findTestObject('04 Addon/002 Service center/OBJ.002.004 Input search'), Keys.chord(Keys.ENTER))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.026 Single action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.028 Action edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/003 Add service center/OBJ.003.002 Input name'), 'hapus pt')

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.003 Dropdown brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.006 Select cat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/003 Add service center/OBJ.003.026 CB CAT 3'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.032 Save edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.SER.001.003.png', FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.closeBrowser()

