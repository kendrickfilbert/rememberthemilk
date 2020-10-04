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
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.openBrowser(GlobalVariable.sampleAUTClickPage)

def clickButton = findTestObject('Object Repository/Page_Demo AUT/button_Click me_click page')

WebUI.verifyElementClickable(clickButton)

'Get the corresponding Selenium WebElement of clickButton'
WebElement buttonElement = WebUiCommonHelper.findWebElement(clickButton, GlobalVariable.defaultTimeout)

'Disable the button so that it is not clickable'
WebUI.executeJavaScript("arguments[0].disabled = true", Arrays.asList(buttonElement))

WebUI.verifyElementNotClickable(clickButton)