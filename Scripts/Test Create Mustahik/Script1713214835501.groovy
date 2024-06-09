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

WebUI.navigateToUrl('https://mustahikdev.petikjombang.com/backend/web/index.php?r=site%2Flogin')

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (5)'), 'testerjatim@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (5)'), 
    '4qXQM5zcwHRG/g2yfqFsXA==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (5)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Mustahik (5)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Data Mustahik (5)'))

WebUI.click(findTestObject('Object Repository/Page_Mustahik/a_Tambah Mustahik (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Mustahik_Mustahiknama'), 'Abil Sayuri')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_NIK_Mustahiknik'), '717207170905XXXX')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tempat Lahir_Mustahiktempat_lahir'), 'Boltim')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tanggal Lahir_Mustahiktanggal_lahir'), '17-09-2005')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_NO KK_Mustahikno_kk'), '7172071418XXXX')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Telepon_Mustahiktelepon'), '0083845804927')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Jenis Kelamin --Laki-lakiPerempuan'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Jenis Pelanggan --PLNNONPELANGGAN'), 
    'NONPELANGGAN', true)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tanggal Daftar_Mustahiktanggal_daftar'), '17-04-2024')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Provinsi --ACEHSUMATERA UTA_b8d456'), 
    '71', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih KabupatenKota --KABUPATEN B_9843df'), 
    '7172', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Kecamatan --AERTEMBAGAGIRIA_85c710'), 
    '7172031', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih KelurahanDesa --BITUNG BARA_f5eb98'), 
    '7172031002', true)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/textarea_Alamat Rumah_Mustahikalamat'), 'Lingkungan Satu')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Mustahik/input_Alamat sesuai KK (apabila alamat sesu_f87f6b'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Tambah Mustahik/button_Simpan'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

