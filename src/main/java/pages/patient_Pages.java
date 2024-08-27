package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patient_Pages extends StartupPage {

	//Locators of L1 Scenarios
	//login locators
	By usernameTextfield = By.id("username_id");
	By usernameTextbox = By.xpath("//input[@id='username_id']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//button[@id='login']");

	By patientModuleByElement = By.xpath("//a[@href='#/Patient']");

	By patientModuleToggleIconByElement = By.xpath("//a[@href='#/Patient']//span[@data-target='#Patient']");
	By searchPatientSubModuleByElement = By.xpath("//a[@href='#/Patient/SearchPatient']//span[contains(text(), 'Search Patient')]");
	By registerPatientSubModuleByElement = By.xpath("//a[@href='#/Patient/RegisterPatient']//span[contains(text(), 'Register Patient')]");

	By searchPatientTextboxByElement = By.xpath("//input[@id='quickFilterInput']");

	By cameraIconByElement = By.xpath("//a[@title='Profile Picture']");
	By newPhotoButtonByElement = By.xpath("//button[@class='btn blue btn-sm']");
	By takeASnapShotButtonByElement = By.xpath("//button[@class='btn blue btn-sm']");
	By cancelButtonByElement = By.xpath("//button[contains(text(), 'Cancel')]");

	By basicInformationLinkByElement = By.xpath("//a[contains(text(), 'Basic Information')]");
	By regPatientSubmitButtonByElement = By.xpath("//input[@id='regPatientSubmitBtn']");
	By errorMessageOfPhoneNumberTextboxByElement = By.xpath("//span[contains(text(), 'Primary Phone is required')]");

	By firstNameTextboxByElement = By.xpath("//input[@id='regPatFirstName']");
	By middleNameTextboxByElement = By.xpath("//input[@placeholder='Middle Name']");
	By lastNameTextboxByElement = By.xpath("//input[@id='LastName']");
	By ageTextboxByElement = By.xpath("//input[@id='Age']");
	By phoneTextboxByElement = By.xpath("//input[@id='PhoneNumber']");

	// By bloodGroupDropdownByElement = By.xpath("//label[contains(text(), 'Blood group')]/..//select[@class='form-control ng-untouched ng-pristine ng-valid']");
	//	By bloodGroupDropdownByElement = By.xpath("//div[@class='col-md-8']//select[@class='form-control ng-valid ng-dirty ng-touched']");
	By bloodGroupDropdownByElement = By.xpath("//label[contains(text(), 'Blood group')]/..//select");

	By guarantorLinkByElement = By.xpath("//a[@href='#/Patient/RegisterPatient/Guarantor']");
	By maleRadioButtonByElement = By.xpath("//input[@value='Male']/..//span");
	By feMaleRadioButtonByElement = By.xpath("//input[@value='Female']/..//span");

	By selfCheckboxByElement = By.xpath("//input[@value='Self']/..//span");
	By notificationPopupMessageElement = By.xpath("//div[@class='msg-text padding-8-all']");
	By statusNotificationMessageByElement = By.xpath("//p[@class='msg-status']");
	By mainNotificationMessageByElement = By.xpath("//p[@class='main-message']");

	By kinEmergencyContactLinkByElement = By.xpath("//a[@href='#/Patient/RegisterPatient/KinEmergencyContact']");
	By commentsTextboxByElement = By.xpath("//input[@placeholder='comments']");

	By alexAlexaTextNameByElement = By.xpath("//div[contains(text(), '2311000001')]/..//div[contains(text(), 'Alexa Alexa')]");
	By printButtonByElement = By.xpath("//button[contains(text(), 'Print')]");
	By lastButtonByElement = By.xpath("//button[contains(text(), 'Last')]");

	By vaccinationModuleByElement = By.xpath("//a[@href='#/Vaccination']");
	By vaccinationModulesToggleIconByElement = By.xpath("//span[@data-target='#Vaccination']");
	By patientListSubModuleByElement = By.xpath("//a[@href='#/Vaccination/PatientList']//span[contains(text(), 'Patient List')]");
	By titleNameOfVaccinationPatientRegisterFormByElement = By.xpath("//span[contains(text(), 'Vaccination Patient Register')]");


	// L2 Scenario's locators
	By chooseFileButtonByElement = By.xpath("//label[@for='fileFromLocalDisk']//i[contains(text(), 'Choose from Files')]");
	By emergencyContactRadioButtonByElement = By.xpath("//input[@value='EmergencyContact']/..//span");
	By insuranceLinkByElement = By.xpath("//a[contains(text(), 'Insurance')]");
	By addInsuranceButtonByElement = By.xpath("//input[@value='Add Insurance']");

	By appointmentModuleByElement = By.xpath("//a[@href='#/Appointment']");
	By appointmentModuleToggleByElement = By.xpath("//span[@data-target='#Appointment']");
	By selectCounterNewOneLinkByElement = By.xpath("//div[@class='counter-item']//h5[contains(text(), 'New-1')]");
	By keyboardButtonElement = By.xpath("//div[@title='Shortcut Keys']");
	By altPlusNtooltipMessageElement = By.xpath("//li[contains(text(),'+')]");
	By newOneCounterLinkByElement = By.xpath("//h5[contains(text(), 'New-1')]//span");
	
	By procurementModuleByElement = By.xpath("//span[@data-target='#Procurement']");
	By reportsSubButton = By.xpath("//a[.=' Reports ']");
	By currentStockLevelButton = By.xpath("//i[.='Current Stock Level']");
	By selectedItemDropdown = By.xpath("//div[@class='selected-list']");
	By selectItemSearchBar = By.xpath("//input[@placeholder='Search']");
	By accountsItemCheckBox = By.xpath("//label[.='Accounts']");
	By generalInventoryOption = By.xpath("//span[@class='fa fa-remove']");
	By accountOption = By.xpath("//span[.='Accounts']");
	
	//i frame elements
	By procurementModuleToggleIconByElement = By.xpath("//a[@href='#/ProcurementMain']//span[@data-target='#Procurement']");
	By purchaseOrderSubmoduleByElement = By.xpath("//span[contains(text(), 'Purchase Order')]");
	By createPurchaseOrderButtonByElement = By.xpath("//input[@value='Create Purchase Order']");
	By addPurchaseOrderTitleByElement = By.xpath("//span[contains(text(), 'Add Purchase Order')]");
	By iFrameTextEditorByElement = By.xpath("//body[@contenteditable='true']");






	String pageName = this.getClass().getSimpleName();
	public patient_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
		
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
			
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
			
		return null;
	}

	/**@Test2
	 * about this method verifyAllPresenceOfFieldIfPatientModuleIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyAllPresenceOfFieldIfPatientModuleIsPresent() throws Exception {
				return false;
	}

	/**@Test3
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : verify the placeholder name of text box 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
				return null;
	}

	/**@Test4
	 * about this method verifyButtonIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyButtonIsPresent() throws Exception {
		return false;
	}

	/**@Test5
	 * about this method verifyErrorMessage() 
	 * @param : null
	 * @description : verify the error message
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
		return null;
	}


	/**@Test6
	 * about this method verifyTexboxIsPresentAndValidateEnteredValue() 
	 * @param : null
	 * @description : verify text box , then send value to that text box and validate the entered value
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTexboxIsPresentAndValidateEnteredValue(Map<String, String> expectedData) throws Exception {

				return null;
	}

	/**@Test7
	 * about this method scrollToBottomAndVerifyFieldIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public Boolean scrollToBottomAndVerifyFieldIsPresent() throws Exception {
		return false;
	}

	/**@Test8
	 * about this method scrollToBottomVerifyFieldAndHighlight() 
	 * @param : null
	 * @description : 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean highlightTheElement() throws Exception {
		return false;
		}

	/**@Test9
	 * about this method verifyOptionIsSelectedFromDropdown() 
	 * @param : get the data from JSON file as type Map<String, String> expectedData
	 * @description : it will select the option as per JSON expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		return null;

	}

	/**@Test10
	 * about this method verifyRadioButton() 
	 * @param : null
	 * @description :
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyRadioButton() throws Exception {
		return false;
	}

	/**@Test11
	 * about this method verifyNotificationPopupMessageIfCheckboxIsSelected() 
	 * @param : null
	 * @description : verify the error message using hard assert
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyNotificationPopupMessageIfCheckboxIsSelected() throws Exception {
		return null;
		}

	/**@Test12
	 * about this method performJavaScriptOperation() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performJavaScriptOperation(Map<String, String> expectedData) throws Exception {

		return null;
		}

	/**@Test13
	 * about this method verifyTextIsPresentUsingHardAssert() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTextIsPresentUsingHardAssert(Map<String, String> expectedData) throws Exception {

		return null;
		}

	/**@Test14
	 * about this method getDataFromTable() 
	 * @param : null
	 * @description : it will fetch the data from the table
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public String getDataFromTable() throws Exception {
		
		return null;
	}

	/**@Test15
	 * about this method performKeyboardOperation() 
	 * @param : 
	 * @description : perform the keyboard operation
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performKeyboardOperation() throws Exception {
		return null;
	}

	/**@Test16
	 * about this method fileUploadOperation() 
	 * @param : String
	 * @description : Upload a image 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean fileUploadOperation(String pathOfTheFile) throws Exception {
		return false;
	}

	/**@Test17
	 * about this method takingScreenshotOfTheCurrentPage() 
	 * @param : null
	 * @description : Taking screenshot of the current page.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		return false;	
		}

	/**@Test18
	 * about this method handleAlertPopup()
	 * @param : null
	 * @description : 
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public Boolean handleAlertPopup() throws Exception {

		return false;	
		}
	
	/**@Test19
	 * about this method verifyToolTipOfAnElement()
	 * @param : null
	 * @description :go to appointmentTab and verify the TOOLTIP value/text
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyToolTipOfAnElement() throws Exception {
		return null;
	}
	
	/**@Test20
	 * about this method handleAutoSuggesstion() 
	 * @param : Map<String, String>
	 * @description : Search for a Select Item as Accounts and select Accounts  and validate Accounts is selected.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean handleAutoSuggesstion(Map<String, String> expectedData) throws Exception {
		
		return false;
		}
	
	/**@Test21
	 * about this method handleIframe()
	 * @param : null
	 * @description : 
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public String handleIframe(Map<String, String> expectedData) throws Exception {
		return null;
	}	
	
	

	
}
