package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.accountPage().updateButton);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateButton));
		logger.info("user clicked on Update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() throws InterruptedException {
		Thread.sleep(5000);
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}

	@When("User enter below information")
	public void UserEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>>UpdatePasswordInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().profilePreviousPasswordField,UpdatePasswordInformation.get(0).get("previousPassword"));
		sendText(factory.accountPage().profileNewPasswordField,UpdatePasswordInformation.get(0).get("newPassword"));
		sendText(factory.accountPage().profileConfirmPassField,UpdatePasswordInformation.get(0).get("confirmPassword"));
		logger.info("User enter below information");
	}
	
	@When("User click on Change Password button")
	public void UserClickOnChangePasswordButton() {
		click(factory.accountPage().profileChangePasswordButton);
		logger.info("User click on Change Password button");
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() throws InterruptedException {
		Thread.sleep(5000);
		waitTillPresence(factory.accountPage().passwordUpdateSuccessfullyMassage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdateSuccessfullyMassage));
		logger.info("a message should be displayed ‘Password Updated Successfully’");
	}
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addAPaymentMethod);
		logger.info("User click on Add a payment method link");
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>>debitAndCreditCardInformation = dataTable.asMaps(String.class, String.class);
		//clearTextUsingSendKeys(factory.accountPage().cardNumberField);
		sendText(factory.accountPage().cardNumberField,debitAndCreditCardInformation.get(0).get("cardNumber"));
		//clearTextUsingSendKeys(factory.accountPage().nameOnCardField);
		sendText(factory.accountPage().nameOnCardField,debitAndCreditCardInformation.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthField,debitAndCreditCardInformation.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationyearField,debitAndCreditCardInformation.get(0).get("expirationYear"));
		//clearTextUsingSendKeys(factory.accountPage().securityCodeField);
		sendText(factory.accountPage().securityCodeField,debitAndCreditCardInformation.get(0).get("securityCode"));
		logger.info("User fill Debit or credit card information");
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User click on Add your card button");
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfullyMassage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccessfullyMassage));
		logger.info("a message should be displayed ‘Payment Method added successfully'");
	}
	@When("User click on card information")
	public void UserClickOnCardInformation(){
		click(factory.accountPage().cardInformation);
		logger.info("User click on card information");
	
	}
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() throws InterruptedException{
		Thread.sleep(5000);
		click(factory.accountPage().removeOption);
		//Assert.assertTrue(isElementDisplayed(factory.accountPage().removeOption));
		logger.info("User click on remove option of card section");
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("payment details should be removed");
	}
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addAddressOption));
		logger.info("User click on Add address option");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>>addYourAddressOption = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountPage().country,addYourAddressOption.get(0).get("country"));
		Thread.sleep(2000);
		clearTextUsingSendKeys(factory.accountPage().fullNameField);
		sendText(factory.accountPage().fullNameField,addYourAddressOption.get(0).get("fullName"));
		Thread.sleep(2000);
		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
		sendText(factory.accountPage().phoneNumberField,addYourAddressOption.get(0).get("phoneNumber"));
		Thread.sleep(2000);
		clearTextUsingSendKeys(factory.accountPage().streetAddressField);
		sendText(factory.accountPage().streetAddressField,addYourAddressOption.get(0).get("streetAddress"));
		Thread.sleep(2000);
		sendText(factory.accountPage().aptInputField,"789");
		clearTextUsingSendKeys(factory.accountPage().cityField);
		sendText(factory.accountPage().cityField,addYourAddressOption.get(0).get("city"));
		Thread.sleep(2000);
		selectByValue(factory.accountPage().stateDropDown,addYourAddressOption.get(0).get("state").trim());
		//sendText(factory.accountPage().stateDropDown,addYourAddressOption.get(0).get("stateField"));
		Thread.sleep(2000);
		clearTextUsingSendKeys(factory.accountPage().zipCodeField);
		sendText(factory.accountPage().zipCodeField,addYourAddressOption.get(0).get("zipCode"));
		logger.info("user fill new address form with below information");
		Thread.sleep(2000);
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() throws InterruptedException {
		click(factory.accountPage().addYourAddressButton);
		//Assert.assertTrue(isElementDisplayed(factory.accountPage().addYourAddressButton));
		logger.info("User click Add Your Address button");
		Thread.sleep(5000);
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() throws InterruptedException {
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessfullyMessage));
		logger.info("a message should be displayed ‘Address Added Successfully’");
		Thread.sleep(5000);
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editButton);
		logger.info("User click on Edit option of card section");
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>>editCardInformation = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		Thread.sleep(2000);
		sendText(factory.accountPage().cardNumber,editCardInformation.get(0).get("cardNumber"));
		Thread.sleep(2000);
		clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		sendText(factory.accountPage().nameOnCard, editCardInformation.get(0).get("nameOnCard"));
		Thread.sleep(2000);
		selectByValue(factory.accountPage().expirationMonth,editCardInformation.get(0).get("expirationMonth"));
		Thread.sleep(2000);
		selectByValue(factory.accountPage().expirationYear,editCardInformation.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		Thread.sleep(2000);
		sendText(factory.accountPage().securityCode,editCardInformation.get(0).get("securityCode"));
		logger.info("user edit information with below data");
		Thread.sleep(2000);
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() throws InterruptedException {
		click(factory.accountPage().updateYourCardButton);
		logger.info("user click on Update Your Card button");
		Thread.sleep(2000);
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() throws InterruptedException {
		waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullyMassage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdatedSuccessfullyMassage));
		logger.info("a message should be displayed ‘Payment Method updated Successfully’");
		Thread.sleep(3000);
	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editBtn);
		logger.info("User click on edit address option");
	}
//	@When("user fill new address")
//	public void userFillNewAddress() throws InterruptedException {
//		Thread.sleep(3000);
//		//click(factory.accountPage().fullNameField);
//		clearTextUsingSendKeys(factory.accountPage().fullNameField);
//		sendText(factory.accountPage().fullNameField,"fullName");
//		Thread.sleep(3000);
//		//click(factory.accountPage().phoneNumberField);
//		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
//		sendText(factory.accountPage().phoneNumberField,"phoneNumber");
//		Thread.sleep(3000);
//		//click(factory.accountPage().streetAddressField);
//		clearTextUsingSendKeys(factory.accountPage().streetAddressField);
//		sendText(factory.accountPage().streetAddressField,"streetAddress");
//		//click(factory.accountPage().cityField);
//		clearTextUsingSendKeys(factory.accountPage().cityField);
//		sendText(factory.accountPage().cityField,"city");
//		//click(factory.accountPage().zipCodeField);
//		clearTextUsingSendKeys(factory.accountPage().zipCodeField);
//		sendText(factory.accountPage().zipCodeField,"zipCode");
//		logger.info("User fill new address");
//	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddressButton);
		logger.info("User click update Your Address button");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().addressUpdatedSuccessfullyMassage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfullyMassage));
		logger.info("a message should be displayed ‘Address Updated Successfully’");
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeBtn);
		logger.info("User click on remove option of Address section");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("Address details should be removed");
	}
	@When("User click on  Add address option")
	public void UserClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on Add address option");
	}
	// @When("User fill new address form with below information")
	// public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
	// List<List<String>> addressInfo = dataTable.asLists(String.class);
	// selectByVisibleText(factory.accountPage().country,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
	// sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
	// sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressInfo.get(0).get(2)));
	// sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
	// sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
	// sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
	// selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
	// sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(7)));
	// logger.info("user filled the new address form with information provided in data table");
 //}
// @When("User click Add Your Address button")
	// public void UserClickAddYourAddressButton() {
	// click(factory.accountPage().addYourAddressButton);
	// logger.info("user clicked on Add your Address button");
 //}
   @Then("a message should be displayed {string}")
   public void aMessageShouldBeDisplayed(String expectedMessage) {
	   waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
	   Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
	   }
	}
	

