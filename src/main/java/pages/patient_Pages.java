package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patient_Pages extends StartupPage {

	String pageName = this.getClass().getSimpleName();
	public patient_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
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
	 * @description : "On the "Patient" Module's "Search Patient" page,"
			+ "verify & clicking on the "Search (Minimum 3 Character)" textbox"
			+ "and get the Placeholder name of "Search (Minimum 3 Character)" textbox."
			+ "Then verify the Placeholder name is "Search (Minimum 3 Character)."
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
	 * @description : "On the "Patient" Module's,"
			+ "clicking on "Register Patient" sub module"
			+ "and verify that the "+ New Photo" button is present or not ?"
			+ "After validation of "+ New Photo" button,"
			+ "then click on it."
			+ "Then verify "Take A Snapshot" button is present or not?"
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
	 * @description : "On the "Basic Information" form of "Register Patient" sub module,"
			+ "scroll to the buttom of the "Basic Information" form."
			+ "Then verify the "Blood Group" Dropdown is present or not?"
	 * @return : String
	 * @author : YAKSHA
	 */
	public Boolean scrollToBottomAndVerifyFieldIsPresent() throws Exception {
		return false;
	}

	/**@Test8
	 * about this method scrollToBottomVerifyFieldAndHighlight() 
	 * @param : null
	 * @description : "On the buttom of the "Basic Information" form "
			+ "of "Register Patient" sub module,"
			+ "If "Blood Group" Dropdown is present"
			+ "then highlight the "Blood Group" Dropdown"
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean highlightTheElement() throws Exception {
		return false;
		}

	/**@Test9
	 * about this method verifyOptionIsSelectedFromDropdown() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : "On the New Visit" page's "Patient Information" form,"
			+ "scroll to the  "Relation With Patient" dropdown"
			+ "and then select "Son" from the "Relation With Patient" dropdown."
			+ "validate "Son" is  properly selected or not."
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		return null;

	}

	/**@Test10
	 * about this method verifyRadioButton() 
	 * @param : null
	 * @description :"Go to "Guarantor" form of "Register Patient" sub module,"
			+ "select the "Male" Radio button form the Gender section"
			+ "Then verify the "Male" radio button is selected or not."
			+ "After validation, then deselect the "Male" radio button")
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyRadioButton() throws Exception {
		return false;
	}

	/**@Test11
	 * about this method verifyNotificationPopupMessageIfCheckboxIsSelected() 
	 * @param : null
	 * @description : "On the "Guarantor" form of "Register Patient" sub module,"
			+ "select the "Self" check box "
			+ "and verify that, the "Self" check box is selected or not."
			+ "After selected the "Self" check box"
			+ "a "Notification" popup message will display on the button of the page"
			+ "and then validate that Notification Popup Message "
			+ "(Notice-Message"
			+ "To fill the data by self checkbox, first you have to fill your address.)"
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyNotificationPopupMessageIfCheckboxIsSelected() throws Exception {
		return null;
		}

	/**@Test12
	 * about this method performJavaScriptOperation() 
	 * @param : null
	 * @description : "On the "Guarantor" form of "Register Patient" sub module,
			+ "Click on "Kin/Emergency Contact" link
			+ "by using javascript
			+ "and it will navigate to the "Kin/Emergency Contact" form.
			+ "Then send the value by using javascript to the "Commnets" textbox
			+ "of "Kin/Emergency Contact" form."
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performJavaScriptOperation(Map<String, String> expectedData) throws Exception {

		return null;
		}

	/**@Test13
	 * about this method verifyTextIsPresentUsingHardAssert() 
	 * @param : null
	 * @description : "On the "Kin/Emergency Contact" form of "Register Patient" sub module,
			+ clicking and verify the "Kin/Emergency Contact" link
			+ text is present or not using Hard Assert?
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTextIsPresentUsingHardAssert(Map<String, String> expectedData) throws Exception {

		return null;
		}

	/**@Test14
	 * about this method performKeyboardOperation() 
	 * @param : 
	 * @description : "Scroll to the Vaccination Module's and Expand it.
			+ Click on "Patient List" page and
			+ perform the keyboard operation ("Alt + N") to open the "Vaccination Patient Register" form.
			+ Then Validate the "Vaccination Patient Register" page Name."
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performKeyboardOperation() throws Exception {
		return null;
	}

	/**@Test15
	 * about this method fileUploadOperation() 
	 * @param : String
	 * @description : "On the "Patient" module's "Register Patient" Sub module,
			+ Upload the Profile Picture in "Camera/Profile Picture" form.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean fileUploadOperation(String pathOfTheFile) throws Exception {
		return false;
	}

	
}
