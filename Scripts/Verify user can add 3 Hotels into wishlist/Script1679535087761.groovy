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

WebUI.callTestCase(findTestCase('Verify user can login'), [('link') : 'https://api.email-tester.project.skyshi.io/wiken3@inbound.skyshi.io/code'
        , ('email') : 'wiken3@inbound.skyshi.io', ('password') : 'wiken123%'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/HotelsMenu'))

WebUI.waitForElementPresent(findTestObject('HotelSection/RecentlyViewedHotelsButton'), 2)

WebUI.verifyElementText(findTestObject('HotelSection/RecentlyViewedHotelsButton'), 'Recently Viewed Hotels')

WebUI.setText(findTestObject('HotelSection/InputDestination'), 'Jakarta')

WebUI.waitForElementPresent(findTestObject('SearchResultHotels/ResultJakartaCity'), 2)

WebUI.click(findTestObject('SearchResultHotels/ResultJakartaCity'))

WebUI.verifyElementAttributeValue(findTestObject('HotelSection/InputCityHotel'), 'value', 'Jakarta, Indonesia', 2)

WebUI.click(findTestObject('HotelSection/SearchHotelsButton'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementText(findTestObject('LoginSuccessfulPopUp/TitleLoginSuccessfulPopUp'), 'Login Successful!')

WebUI.click(findTestObject('LoginSuccessfulPopUp/OKButton'))

WebUI.verifyElementText(findTestObject('SearchResultHotels/TitleCitySearchResult'), 'Your search results in Jakarta, Indonesia')

WebUI.verifyElementPresent(findTestObject('SearchResultHotels/HotelCardMuliaSenayanJakarta'), 2)

WebUI.click(findTestObject('SearchResultHotels/HotelCardMuliaSenayanJakarta'))

WebUI.waitForPageLoad(5)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleHotelJakartaDetailPage'), 'Hotel Mulia Senayan, Jakarta')

WebUI.click(findTestObject('HotelDetailPage/SelectRoomButton'))

WebUI.waitForElementVisible(findTestObject('HotelDetailPage/BookmarkBotton'), 2)

WebUI.click(findTestObject('HotelDetailPage/BookmarkBotton'))

WebUI.waitForElementPresent(findTestObject('HotelDetailPage/TitleItemSuccessfullySavedPopUp'), 2)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleItemSuccessfullySavedPopUp'), 'Item successfully saved!')

WebUI.click(findTestObject('HotelDetailPage/CloseItemSuccessfullySavedPopUp'))

WebUI.switchToWindowIndex(0)

WebUI.verifyElementText(findTestObject('SearchResultHotels/TitleCitySearchResult'), 'Your search results in Jakarta, Indonesia')

WebUI.getViewportTopPosition()

WebUI.click(findTestObject('SearchResultHotels/ChangeCityButton'))

WebUI.setText(findTestObject('HotelSection/InputDestination'), 'Bandung')

WebUI.waitForElementPresent(findTestObject('SearchResultHotels/ResultBandungCity'), 2)

WebUI.click(findTestObject('SearchResultHotels/ResultBandungCity'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementText(findTestObject('LoginSuccessfulPopUp/TitleLoginSuccessfulPopUp'), 'Login Successful!')

WebUI.click(findTestObject('LoginSuccessfulPopUp/OKButton'))

WebUI.verifyElementText(findTestObject('SearchResultHotels/TitleCitySearchResult'), 'Your search results in Bandung, Indonesia')

WebUI.verifyElementPresent(findTestObject('SearchResultHotels/HotelCardTheGaiaHotelBandung'), 2)

WebUI.click(findTestObject('SearchResultHotels/HotelCardTheGaiaHotelBandung'))

WebUI.waitForPageLoad(5)

WebUI.switchToWindowIndex(2)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleHotelBandungDetailPage'), 'The Gaia Hotel Bandung')

WebUI.click(findTestObject('HotelDetailPage/SelectRoomButton'))

WebUI.waitForElementVisible(findTestObject('HotelDetailPage/BookmarkBotton'), 2)

WebUI.click(findTestObject('HotelDetailPage/BookmarkBotton'))

WebUI.waitForElementPresent(findTestObject('HotelDetailPage/TitleItemSuccessfullySavedPopUp'), 2)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleItemSuccessfullySavedPopUp'), 'Item successfully saved!')

WebUI.click(findTestObject('HotelDetailPage/CloseItemSuccessfullySavedPopUp'))

WebUI.switchToWindowIndex(0)

WebUI.verifyElementText(findTestObject('SearchResultHotels/TitleCitySearchResult'), 'Your search results in Bandung, Indonesia')

WebUI.getViewportTopPosition()

WebUI.click(findTestObject('SearchResultHotels/ChangeCityButton'))

WebUI.setText(findTestObject('HotelSection/InputDestination'), 'Yogyakarta')

WebUI.waitForElementPresent(findTestObject('SearchResultHotels/ResultYogyakartaCity'), 2)

WebUI.click(findTestObject('SearchResultHotels/ResultYogyakartaCity'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementText(findTestObject('LoginSuccessfulPopUp/TitleLoginSuccessfulPopUp'), 'Login Successful!')

WebUI.click(findTestObject('LoginSuccessfulPopUp/OKButton'))

WebUI.verifyElementText(findTestObject('SearchResultHotels/TitleCitySearchResult'), 'Your search results in Yogyakarta, Indonesia')

WebUI.verifyElementPresent(findTestObject('SearchResultHotels/HotelCardMeliaPurosaniYogyakarta'), 2)

WebUI.click(findTestObject('SearchResultHotels/HotelCardMeliaPurosaniYogyakarta'))

WebUI.waitForPageLoad(5)

WebUI.switchToWindowIndex(3)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleHotelYogyakartaDetailPage'), 'Melia Purosani Yogyakarta')

WebUI.click(findTestObject('HotelDetailPage/SelectRoomButton'))

WebUI.waitForElementVisible(findTestObject('HotelDetailPage/BookmarkBotton'), 2)

WebUI.click(findTestObject('HotelDetailPage/BookmarkBotton'))

WebUI.waitForElementPresent(findTestObject('HotelDetailPage/TitleItemSuccessfullySavedPopUp'), 2)

WebUI.verifyElementText(findTestObject('HotelDetailPage/TitleItemSuccessfullySavedPopUp'), 'Item successfully saved!')

WebUI.click(findTestObject('HotelDetailPage/CloseItemSuccessfullySavedPopUp'))

WebUI.click(findTestObject('HomePage/SavedMenu'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementText(findTestObject('CollectionPage/TitleCollectionsPage'), 'Collections')

WebUI.closeBrowser()

