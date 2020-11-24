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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', false)

WebUI.click(findTestObject('Object Repository/Registation Page/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/Registation Page/input_Medicaid_programs'))

String date = CustomKeywords.'com.ksat002.function.util.DateUtil.addMonth'()

WebUI.setText(findTestObject('Object Repository/Registation Page/input_Visit Date (Required)_visit_date'), date)

//WebUI.click(findTestObject('Object Repository/Registation Page/td_25'))

WebUI.setText(findTestObject('Object Repository/Registation Page/textarea_Comment_comment'), comment + ' is the name of the patient')

WebUI.click(findTestObject('Object Repository/Registation Page/button_Book Appointment'))

String facility = WebUI.getText(findTestObject('CURA - ConfirmationPage/Label_facility'))

WebUI.verifyMatch(facility, 'Hongkong.*', true)

WebUI.verifyElementText(findTestObject('CURA - ConfirmationPage/Label_hospital_readmission'), 'Yes')

WebUI.verifyElementText(findTestObject('CURA - ConfirmationPage/Label_program'), 'Medicaid')

WebUI.verifyElementText(findTestObject('CURA - ConfirmationPage/Label_visit_date'), date)

WebUI.verifyElementText(findTestObject('CURA - ConfirmationPage/Label_Comment'), comment + ' is the name of the patient' )

