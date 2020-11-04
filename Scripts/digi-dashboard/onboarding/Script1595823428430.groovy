import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-dashboard.digiresto.co.id/user/login')

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Login_form-control'), '08911722100')

WebUI.setEncryptedText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Username or Phone Number_form-control'), 
    'SFTQUhjBfIY=')

WebUI.delay(3)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\1.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_LOGIN'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\2.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Start Trial'))

WebUI.delay(10)

WebUI.click(findTestObject('dashboardDigi/Page_Self Order Dashboard/button_PAYMENT'))

WebUI.delay(10)

WebUI.click(findTestObject('dashboardDigi/Page_Self Order Dashboard/button_Okpayment'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\3.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_MULAI TOUR SEKARANG'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_ Kembali'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\4.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Done'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\5.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_ULANGI'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Skip'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\6.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_SELESAI'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/span_Active_simple-icon-pencil'))

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input____BVID__240'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/textarea____BVID__243'), 'Jaksel')

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input____BVID__236'), 'jakarta')

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\7.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Next'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Order Method___BVID__273'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Dine In___BVID__273'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Take Away___BVID__273'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Delivery___BVID__273'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Delivery___BVID__273'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Delivery Provider___BVID__279'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/select_Regional Radius'), 
    'radius', true)

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Delivery Radius___BVID__291'), 
    '500')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Km___BVID__279'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\8.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Submit'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/span_x'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\9.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_NEXT (1)'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\10.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Add New'))

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input____BVID__367'), 'Festive')

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Description___BVID__370'), 
    'urban vibes')

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\11.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Submit'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_OK (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/select_Category Product'), 
    'Product', true)

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/span_x'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/select_Festive'), '977', 
    true)

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input____BVID__397'), 'Chicken Run')

WebUI.setText(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input____BVID__406'), '105')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/input_Note Pilih outlet yang menyediakan produk ini___BVID__411'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_Submit'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\12.png')

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_NEXT (1)'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_LANJUT (1)'))

WebUI.click(findTestObject('Object Repository/dashboardDigi/Page_Self Order Dashboard/button_LANJUT (1)'))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Mika Silaen\\Documents\\katalon\\images\\13.png')

