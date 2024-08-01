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

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.057 Tab activities'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.058 Button search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.059 Input search'), 'Promotion pawn')

WebUI.sendKeys(findTestObject('04 Addon/002 Service center/OBJ.002.059 Input search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.060 Button filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.061 Dropdown name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.062 Search name'), 'Promotion pawn')

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.063 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.064 Dropdown brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.065 Search brand'), 'Kasparov')

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.066 Cb1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.067 Dropdown modeltype'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.068 Cb all'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.069 Dropdown group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.070 CB 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.071 Dropdown maintenance type'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.072 cb 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.073 Dropdown status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.074 Cb repair'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.075 date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.078 Tgl 23'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.079 Input min'), '0')

WebUI.setText(findTestObject('04 Addon/002 Service center/OBJ.002.080 Input max'), '100')

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.081 Apply filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.082 Button download'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.083 Single action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('04 Addon/002 Service center/OBJ.002.084 Action detail'), FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.takeScreenshot('C:/Users/DELL/Documents/Clone Git/clone otomasti v2/v2-webtagsam/Screenshot/TC.SER.001.007.png', FailureHandling.STOP_ON_FAILURE)

'\r\n'
WebUI.closeBrowser()

