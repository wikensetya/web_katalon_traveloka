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

//Go to https://www.traveloka.com/
WebUI.openBrowser('https://www.traveloka.com/')

//Waiting until page load
WebUI.waitForPageLoad(2)

//Click Log In button
WebUI.click(findTestObject('HomePage/LogInButton'))

//Wait until Log In pop-up appears
WebUI.waitForElementPresent(findTestObject('LogInPopUp/LogInToYourAccountPopUp'), 2)

//Verify that Log In pop-up appears 
WebUI.verifyElementText(findTestObject('LogInPopUp/LogInToYourAccountPopUp'), 'Log in to your account')

//Input email
WebUI.setText(findTestObject('LogInPopUp/InputEmail'), email)

//Input password
WebUI.setText(findTestObject('LogInPopUp/InputPassword'), password)

//Click Log In button
WebUI.click(findTestObject('LogInPopUp/LogInButton'))

//Wait Confirmation Needed pop-up appears
WebUI.waitForElementPresent(findTestObject('ConfirmationNeededPopUp/TitleConfirmationNeededPopUp'), 2)

//Verify Confirmation Needed pop-up appears
WebUI.verifyElementText(findTestObject('ConfirmationNeededPopUp/TitleConfirmationNeededPopUp'), 'Confirmation Needed')

//Click Email verification
WebUI.click(findTestObject('ConfirmationNeededPopUp/EmailConfirmation'))

//Waiting 20s to get email verification code
WebUI.delay(20)

//Send request api to get verfication code
def responseBody = WS.sendRequest(findTestObject('ApiPage/VerificationCode'))

//Store verification code into variable "dataCode"
dataCode = responseBody.getResponseText()

//Input verification code
WebUI.setText(findTestObject('VerificationCodePopUp/InputVerificationCode'), dataCode)

//Waiting until page load
WebUI.waitForPageLoad(2)

WebUI.delay(5)

//Check username is displayed to verify user successfull login
WebUI.verifyElementText(findTestObject('HomePage/UserName'), username)

