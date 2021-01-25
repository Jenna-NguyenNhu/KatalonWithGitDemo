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

WebUI.click(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/h3_Xem ngi c thn Ngay'))

WebUI.setText(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/input_Tn_firstName'), 
    '***2212***...?')

WebUI.click(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/div_N'))

WebUI.click(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/div_Nam'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/select_18                                  _64b701'), 
    '****', true)

WebUI.setText(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/input_Email_email'), 
    '000@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/input_Mt khu_password'), 
    'VkKpaFHTni/ddwZVlL4p7Q==')

WebUI.click(findTestObject('Object Repository/Page_Ngi Vit Nam c thn  Hn h vi ngi Vit Nam_9f52b1/p_Xem ngi c thn Ngay'))

