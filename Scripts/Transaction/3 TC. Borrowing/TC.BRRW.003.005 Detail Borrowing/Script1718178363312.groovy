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

WebUI.click(findTestObject('01 Asset/001 Register Asset/OBJ.001.001 Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 Setting/003 Setting - Group/OBJ.003.001 Select Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01 Asset/001 Register Asset/OBJ.001.002 Menu All Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.014 Menu Borrowing Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.019 Sub Tab Transaction on Borrowing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.015 Filter Borrowing Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.016 Select Status Filter on Borrowing Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('03 Transaction/001 Borrowing/OBJ.001.017 Search Status Filter on Borrowing Transaction'), 
    'Waiting for Approval')

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.018 Choose Status Filter on Borrowing Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.020 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.021 Single Action Borrowing Transation'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.027 Detail Data Transaction Borrowing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.028 Select More Approver'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.030 Closed Detail Approver'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 Transaction/001 Borrowing/OBJ.001.029 Closed Detail Transaction'), FailureHandling.STOP_ON_FAILURE)

