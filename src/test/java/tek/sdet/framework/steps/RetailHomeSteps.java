package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	// create object Retailapage
	// creat

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}

	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
	}

	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("the Product is displayed on home page");

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("user clicked on All section");

	}

	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.homePage().sideBarElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
		}
//		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
//		logger.info("actual is equal to expected");

	}

	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {
				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}

		}

	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String categoryValue) throws InterruptedException {
		//List<WebElement>allDepartments = factory.homePage().smartHomeOption;
		//Assert.assertTrue(isElementDisplayed(factory.homePage().allDepartmentDropDown));
		//selectByValue(factory.homePage().smartHomeOption,allDepartments.get(0).get("smartHome"));
		//click(factory.homePage().smartHomeOption);
		Thread.sleep(3000);
		sendText(factory.homePage().allDepartmentDropDown, categoryValue);
		//click(factory.homePage().smartHomeOption);logger.info("User change the category");
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String itemValue) {
		sendText(factory.homePage().searchBar, itemValue);
		logger.info("User search for an item " + itemValue);
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.homePage().searchButton);
		logger.info("User click on Search icon");
	}
	@When("User click on item")
	public void userClickOnItem() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(isElementDisplayed(factory.homePage().kasaOutdoorSmartPlugImage));
		click(factory.homePage().kasaOutdoorSmartPlugImage);logger.info("User click on item");
	}
	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer QTYValue) throws InterruptedException {
		Thread.sleep(3000);
		selectByIndex(factory.homePage().itemQTYDropDown,QTYValue);
		logger.info("User select quantity");
	}
	@When("User click add to Cart button")
	public void userclickAddToCartButton() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.homePage().addToCartButton);
		logger.info("user clicked on add to cart button");
	}
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer QTYValue) {
		logger.info("the cart icon quantity should change");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.homePage().cartOption);logger.info("User click on Cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.homePage().proceedToCheckoutButton);
		logger.info("User click on Proceed to Checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addANewAddressButton);
		Assert.assertTrue(isElementDisplayed(factory.homePage().addANewAddressButton));
		logger.info("User click Add a new address link for shipping address");
	}
  @Then("User fill new address form with below information")
	 public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
	 List<Map<String, String>> newAddressInformation = dataTable.asMaps(String.class, String.class);
	 selectByValue(factory.accountPage().country,newAddressInformation.get(0).get("country"));
	 Thread.sleep(2000);
	 clearTextUsingSendKeys(factory.accountPage().fullNameField);
	 sendText(factory.accountPage().fullNameField,newAddressInformation.get(0).get("fullName"));
	 Thread.sleep(2000);
	 clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
	 sendText(factory.accountPage().phoneNumberField,newAddressInformation.get(0).get("phoneNumber"));
	 Thread.sleep(2000);
	 clearTextUsingSendKeys(factory.accountPage().streetAddressField);
	 sendText(factory.accountPage().streetAddressField,newAddressInformation.get(0).get("streetAddress"));
	 Thread.sleep(2000);
    // sendText(factory.accountPage().apartmentNumber,newAddressInformation.get(0).get("aptValue"));
	 sendText(factory.accountPage().cityField,newAddressInformation.get(0).get("city"));
	 Thread.sleep(2000);
	 selectByValue(factory.accountPage().stateDropDown,newAddressInformation.get(0).get("state").trim());
	 //sendText(factory.accountPage().stateDropDown,addYourAddressOption.get(0).get("stateField"));
	 Thread.sleep(2000);
	 sendText(factory.accountPage().zipCodeField,newAddressInformation.get(0).get("zipCode"));
	 logger.info("user fill new address form with below information");
 }
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() throws InterruptedException {
		click(factory.homePage().addACreditOrDebitCard);
		logger.info("User click Add a credit card or Debit Card for Payment method");
		Thread.sleep(2000);
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderButton);
		logger.info("User click on Place Your Order");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() throws InterruptedException {
		waitTillPresence(factory.homePage().orderPlacedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfullyMessage));
		logger.info("a message should be displayed ‘Order Placed, Thanks’");
		Thread.sleep(2000);
	}
	@When("User change the category to 'Electronics")
	public void userChangeTheCategory(String categoryValue) throws InterruptedException {
		Thread.sleep(3000);
		sendText(factory.homePage().allDepartmentDropDown,categoryValue);
		click(factory.homePage().ElectronicsOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().ElectronicsOption));
		logger.info("User change the category to 'Electronics");
	}
	

}
