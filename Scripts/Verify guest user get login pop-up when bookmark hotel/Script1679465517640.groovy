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

WebUI.openBrowser('https://traveloka.com')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('HomePage/HotelsMenu'))

WebUI.waitForElementPresent(findTestObject('HotelSection/RecentlyViewedHotelsButton'), 2)

WebUI.verifyElementText(findTestObject('HotelSection/RecentlyViewedHotelsButton'), 'Recently Viewed Hotels')

WebUI.setText(findTestObject('HotelSection/InputDestination'), 'Palembang')

WebUI.waitForElementPresent(findTestObject('HotelSection/ResultPalembangCity'), 2)

WebUI.click(findTestObject('HotelSection/ResultPalembangCity'))

WebUI.verifyElementAttributeValue(findTestObject('HotelSection/InputCityHotel'), 'value', 'Palembang, South Sumatra, Indonesia',
	2)

WebUI.click(findTestObject('HotelSection/SearchHotelsButton'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('SearchResultHotels/TitleCitySearchResult'), 'Your search results in Palembang, Indonesia')

WebUI.click(findTestObject('SearchResultHotels/LowestPriceRadioButton'))

WebUI.delay(3)

WebUI.setText(findTestObject('SearchResultHotels/InputMinPrice'), '500000')

WebUI.delay(3)

WebUI.setText(findTestObject('SearchResultHotels/InputMaxPrice'), '800000')

WebUI.delay(3)

WebUI.click(findTestObject('SearchResultHotels/WifiRadioButton'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('SearchResultHotels/HotelCardBestonHotelPalembang'), 2)

WebUI.click(findTestObject('SearchResultHotels/HotelCardBestonHotelPalembang'))

WebUI.waitForPageLoad(3)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleHotelPalembangDetailPage'), 'Beston Hotel Palembang (FKA Horison Ultima Palembang)')

WebUI.click(findTestObject('HotelDetailPage/SelectRoomButton'))

WebUI.waitForElementVisible(findTestObject('HotelDetailPage/BookmarkBotton'), 2)

WebUI.click(findTestObject('HotelDetailPage/BookmarkBotton'))

WebUI.waitForElementVisible(findTestObject('HotelDetailPage/TitleLoginRequiredPopUp'), 2)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleLoginRequiredPopUp'), 'Login Required')

WebUI.closeBrowser()