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

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.001 Email'), GlobalVariable.id2)

WebUI.setText(findTestObject('02 Setting/001 Login and OTP/OBJ.001.002 Password'), GlobalVariable.Pw2)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/001 Login and OTP/OBJ.001.003 Submit Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01 Asset/001 Register Asset/OBJ.001.001 Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01 Asset/001 Register Asset/OBJ.001.002 Menu All Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01 Asset/003 Change Log/OBJ.003.020 Tab Available'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.047 Select Button FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.048 Select Filter Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.049 Choose Non Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.050 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.001 Single Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.002 Add to Borrowing Pre-List'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.003 Search User Dialog'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('03 Transaction/001 Borrowing/OBJ.001.004 Text Field Search Dialog'), 'Will Smith')

WebUI.sendKeys(findTestObject('03 Transaction/001 Borrowing/OBJ.001.004 Text Field Search Dialog'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.005 Select User'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.006 Submit Select User'), FailureHandling.STOP_ON_FAILURE)

