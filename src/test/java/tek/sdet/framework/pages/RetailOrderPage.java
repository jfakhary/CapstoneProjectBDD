package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderLink;
	
	@FindBy(xpath = "//div[@class='order__item']")
	public WebElement orderDetail;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelTheOrderBtn;
	
	//@FindBy(id = "reasonInput")
	//public WebElement selectReason;
	
	@FindBy(xpath = "//option[@value='wrong']")
	public WebElement cancelationReason;
	
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeencanceledMessage;
	
	@FindBy(xpath = "(//button[@class='order__content-btn'])[2]")
	public WebElement returnItemButton;
	
	@FindBy(id = "reasonInput")
	public WebElement returnReason;
	
	//    @FindBy(xpath = "//option[text()='Item damaged']")
	//    public WebElement ItemDamage;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffLocation;
	
	//    @FindBy(xpath = "//option[text()='FedEx']")
	//    public WebElement currier;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement orderReturnButton;
	
	@FindBy(xpath = "//div[@class='return__confirm-message']")
	public WebElement returnConfirmMessage;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInputField;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInputField;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addReviewBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfullyMessage;

}
