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

WebUI.navigateToUrl('http://10.7.1.169/')

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8_1'), 
    'RAIVpflpDOg=')

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Kontrak Tunggal'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Baru'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_-- Pilih --_p-dropdown-trigger ng-tns-c70-25'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/li_Jenis 001'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_-- Pilih --_p-dropdown-trigger ng-tns-c70-26'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/li_BMUM'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Cari Rekanan_p-inputtext p-component _4141d4'), 
    'juanda')

WebUI.doubleClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/tr_V01290                                  _a0f9eb'))

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Judul Kontrak_judulKontrak'), 
    'test kontrak')

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No PJB_text-sm text-color surface-ove_e4b060'), 
    '123')

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/span_31'))

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No PJB_text-sm text-color surface-ove_e4b060'), 
    '123')

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/span_31'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Nilai Kontrak (Rp)_nilai'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_-- Pilih --_p-dropdown-trigger ng-tns-c70-29'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/li_USD - Nama United States Dollar'))

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Keterangan_keterangan'), 
    'keterangan')

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Retensi_retensi'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Nilai Kontrak (Rp)_nilai'), 
    '')

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Nilai Kontrak (Rp)_nilai'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/span_31'))

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Garansi_garansi'), 
    '1')

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_-- Pilih --_p-dropdown-trigger ng-tns-c70-32'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/li_pelaksana 1'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_-- Pilih --_p-dropdown-trigger ng-tns-c70-34'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/li_Tim Pemeriksa Penyelesaian Pekerjaan'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/div_-- Pilih --_p-dropdown-trigger ng-tns-c70-33'))

WebUI.enhancedClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/li_TIM TEST 2'))

WebUI.click(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Baru_1'))

WebUI.setText(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Filter_text-sm text-color surface-ove_43b5b6'), 
    'AADPO1')

WebUI.doubleClick(findTestObject('Object Repository/Test tambah CP/Page_FinUP (Financial Integrated Applicatio_e626e9/tr_PJB2        AADPO1        20240302      _8a4011'))

WebUI.closeBrowser()

