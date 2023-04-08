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

Mobile.verifyElementVisible(findTestObject('checkoutOverview/Button - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/Button - FINISH'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - CHECKOUT OVERVIEW'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - DescProduct'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - DESCRIPTION'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - Payment Information'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - Price'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - productName'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - QTY'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - QtyProducts'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - Shipping Information'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - Tax'), 0)

Mobile.verifyElementVisible(findTestObject('checkoutOverview/TextView - TotalPrice'), 0)

