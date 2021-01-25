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

WebUI.navigateToUrl('https://www.vietnamcupid.com/vi')

WebUI.click(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_VietnamCupid.com/input_Email_email'), 'nhu.bug26@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_VietnamCupid.com/input_Mt khu_password'), 'gb2J2/tZQXyYPdq4GHSffA==')

WebUI.click(findTestObject('Object Repository/Page_VietnamCupid.com/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_VietnamCupid.com/a_Hu'))

WebUI.click(findTestObject('Object Repository/Page_VietnamCupid.com/a_V chng ti'))

WebUI.click(findTestObject('Object Repository/Page_V chng ti  VietnamCupid.com/a_Lin h VietnamCupid.com'))

WebUI.click(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/a_Dch V Khch Hng'))

WebUI.click(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/button_ li li nhn'))

WebUI.setText(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/input_Tiu _subject'), 'yyhunj')

WebUI.setText(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/textarea_j'), 'j')

WebUI.setText(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/textarea_jg'), 'jg')

WebUI.setText(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/textarea_jgh'), 'jgh')

WebUI.setText(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/textarea_jghj'), 'jghj')

WebUI.click(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/svg_-_sc-cJSrbW VlMnx'))

WebUI.click(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/li_Quan Ly Hinh Anh'))

WebUI.click(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/li_Khc'))

WebUI.click(findTestObject('Object Repository/Page_Lin h  VietnamCupid.com/button_Gi'))

