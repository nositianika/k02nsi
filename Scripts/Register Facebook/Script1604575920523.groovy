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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/button_register'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_firsName'), 'Oci')

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_lastName'), 'Tianika')

String email = CustomKeywords.'com.ksat002.function.util.StringUtil.getRandomEmail'(15)

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_confirmEmail'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_password'), 'eFd1zJSqnwBja9x1Ey+Vng==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/select_date'), '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/select_month'), '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/select_year'), '1997', true)

WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_gender'))

WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/button_confirmregister'))

