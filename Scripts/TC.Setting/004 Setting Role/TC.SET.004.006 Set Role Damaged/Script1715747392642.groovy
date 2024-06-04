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

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.002 Select Modul Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.001 Select Role Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

'Switch Sub Tab\r\n'
WebUI.click(findTestObject('Setting/007 Damaged/OBJ.007.001 Select Tab Damaged'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.004 Create New Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Setting/003 Setting - Group/OBJ.003.005 Set Name New Group'), 'Testing Role')

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.007 Disposable Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.008 Submit Create Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), 'Testing Role')

WebUI.sendKeys(findTestObject('Setting/003 Setting - Group/OBJ.003.009 Search Group Name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.002 Select Group for Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/006 Setting Maintenance Routine/OBJ.006.002 Disable manage by parernt group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.004 Add Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Setting/004 Setting - Role/OBJ.004.005 Search Manager'), 'John Born')

WebUI.sendKeys(findTestObject('Setting/004 Setting - Role/OBJ.004.005 Search Manager'), Keys.chord(Keys.ENTER))

'Komponene Berbeda Disetiap Tab Check box\r\n'
WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.024 Pick Data Manager - Transfer'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Setting/004 Setting - Role/OBJ.004.005 Search Manager'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.007 Monitoring and Report'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.008 Select All user in monitoring and report'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Setting/004 Setting - Role/OBJ.004.009 Search Monitoring and Reporting'), Keys.chord(Keys.ESCAPE))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/003 Setting - Group/OBJ.003.010 Action Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Scre/TC.SET.004.001 Set Role Disposal.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.021 Select Delete Group by Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/004 Setting - Role/OBJ.004.022 Confirm Delete Group by Role'), FailureHandling.STOP_ON_FAILURE)
