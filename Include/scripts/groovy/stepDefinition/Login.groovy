package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Then
import internal.GlobalVariable

public class Login {

	@Then("User click on LOGIN button")
	public void user_click_on_LOGIN_button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input registered username only {string}")
	public void user_input_registered_username_only(String username) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Username'), [('username') : 'standard_user'], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Password'), [('password') : ''], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input registered password only {string}")
	public void user_input_registered_password_only(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Username'), [('username') : ''], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Password'), [('password') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input incorrect username {string}")
	public void user_input_incorrect_username(String username) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Username'), [('username') : 'xxxxxxxx'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input incorrect password {string}")
	public void user_input_incorrect_password(String username) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Password'), [('password') : 'xxxxxxxx'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input registered username {string}")
	public void user_input_registered_username(String username) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Username'), [('username') : 'standard_user'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input registered password {string}")
	public void user_input_registered_password(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input Password'), [('password') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)
	}
}