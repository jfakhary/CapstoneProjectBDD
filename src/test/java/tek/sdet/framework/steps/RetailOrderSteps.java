package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.orderPage().orderLink);
		logger.info("User click on Orders section");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() throws InterruptedException {
		Thread.sleep(5000);
		click(factory.orderPage().orderDetail);
		logger.info("User click on first order in list");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.orderPage().cancelTheOrderBtn);
		logger.info("User click on Cancel The Order button");
	}
	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() throws InterruptedException {
		click(factory.orderPage().cancelationReason);
		Thread.sleep(3000);
		//selectByValue(factory.orderPage().cancelationReason,"Bought wrong item");
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelationReason));
		logger.info("User select the cancelation Reason ‘Bought wrong item");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() throws InterruptedException {
		//Thread.sleep(3000);
		click(factory.orderPage().cancelOrderBtn);
		//Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelOrderBtn));
		logger.info("User click on Cancel Order button");
		Thread.sleep(3000);
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		waitTillPresence(factory.orderPage().yourOrderHasBeencanceledMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderHasBeencanceledMessage));
		logger.info("a cancelation message should be displayed ‘Your Order Has Been Cancelled’");
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.orderPage().returnItemButton);
		logger.info("User click on Return Items button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String String) throws InterruptedException {
		Thread.sleep(3000);
		selectByVisibleText(factory.orderPage().returnReason,"Item damaged");
		//       click(factory.orderPage().ItemDamage);
		logger.info("User select the Return Reason");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String String) throws InterruptedException {
		Thread.sleep(3000);
		selectByVisibleText(factory.orderPage().dropOffLocation,"FedEx");
		//        click(factory.orderPage().currier);logger.info("User select the drop off service");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() throws InterruptedException {
		Thread.sleep(3000);click(factory.orderPage().orderReturnButton);
		logger.info("User click on Return Order button");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnConfirmMessage));
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() throws InterruptedException {
		Thread.sleep(2000);
		click(factory.orderPage().reviewButton);
		logger.info("User click on Review button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headlineValue, String reviewText) throws InterruptedException {
		Thread.sleep(2000);
		sendText(factory.orderPage().headlineInputField,"Nice Game");
		Thread.sleep(2000);
		sendText(factory.orderPage().descriptionInputField,"Apex coins are needed to purchase some cool skins.");
		logger.info("User write Review headline");
		}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() throws InterruptedException {
		Thread.sleep(2000);click(factory.orderPage().addReviewBtn);
		logger.info("User click Add your Review button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		waitTillPresence(factory.orderPage().yourReviewWasAddedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().yourReviewWasAddedSuccessfullyMessage));
		logger.info("a review message should be displayed ‘Your review was added successfully");
	}

	
	

}
