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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.vietnamcupid.com/vi')

WebUI.click(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_VietnamCupid.com/input_Email_email'), 'nhu.bug@com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_VietnamCupid.com/input_Mt khu_password'), 'VkKpaFHTni/ddwZVlL4p7Q==')

WebUI.click(findTestObject('Object Repository/Page_VietnamCupid.com/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_VietnamCupid.com/a_Hu'))

WebUI.click(findTestObject('Object Repository/Page_VietnamCupid.com/div_hm qua_profile-bg'))

