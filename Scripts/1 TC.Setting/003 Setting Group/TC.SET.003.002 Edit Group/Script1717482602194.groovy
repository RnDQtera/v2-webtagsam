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

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.003 Select Group Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.004 Create New Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.005 Set Name New Group'), 'Group Testing QA')

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.008 Submit Create Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), 'Group Testing QA')

WebUI.sendKeys(findTestObject('02 Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), Keys.chord(Keys.ENTER))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.010 Action Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.013 Select Edit Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02 Setting/003 Setting - Group/OBJ.003.014 Field Edit Group'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.014 Field Edit Group'), 'Group QA')

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.015 Clear Field Edit Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02 Setting/003 Setting - Group/OBJ.003.014 Field Edit Group'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.014 Field Edit Group'), 'Group QA')

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.016 Disposable Edit Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.017 Save Edit Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Scre/TC.SET.003.002 Edit Group.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), 'Group QA')

WebUI.sendKeys(findTestObject('02 Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), Keys.chord(Keys.ENTER))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.010 Action Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.011 Select Delete Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.012 Confirm Delete Group'), FailureHandling.STOP_ON_FAILURE)

