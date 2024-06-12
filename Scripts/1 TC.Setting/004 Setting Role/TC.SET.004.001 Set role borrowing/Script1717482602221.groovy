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

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.004 Create New Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.005 Set Name New Group'), 'Testing Role')

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.007 Disposable Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.008 Submit Create Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), 'Testing Role')

WebUI.sendKeys(findTestObject('02 Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.002 Select Group for Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.003 Disable Managed by Parent Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.004 Add Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/004 Setting - Role/OBJ.004.005 Search Manager'), 'Laurent abigails')

WebUI.sendKeys(findTestObject('02 Setting/004 Setting - Role/OBJ.004.005 Search Manager'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.024 Pick Data Manager - Transfer'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02 Setting/004 Setting - Role/OBJ.004.006 Pick Data by Search'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.007 Monitoring and Report'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.008 Select All user in monitoring and report'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02 Setting/004 Setting - Role/OBJ.004.009 Search Monitoring and Reporting'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.010 Add Approval by Or'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02 Setting/004 Setting - Role/OBJ.004.012 Search Approvers'), 'Laurent abigails')

WebUI.sendKeys(findTestObject('02 Setting/004 Setting - Role/OBJ.004.012 Search Approvers'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.015 Pick Data Approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02 Setting/004 Setting - Role/OBJ.004.012 Search Approvers'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.013 Add Approval Level'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.014 Add Approval by AND'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.016 Add Approvers Level 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.017 Select all Level 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02 Setting/004 Setting - Role/OBJ.004.018 Field Level 2'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.019 Delete Level Approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.020 Confirm Delete Approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.010 Action Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Scre/TC.SET.004.001 Set Role Borrowing.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.021 Select Delete Group by Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/004 Setting - Role/OBJ.004.022 Confirm Delete Group by Role'), FailureHandling.STOP_ON_FAILURE)

