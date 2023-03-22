package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id ="nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath ="//button[@id='personalUpdateBtn']")
	public WebElement updateButton;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	
	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement profilePreviousPasswordField;
	
	@FindBy(id = "newPasswordInput")
	public WebElement profileNewPasswordField;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement profileConfirmPassField;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement profileChangePasswordButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement passwordUpdateSuccessfullyMassage;
	
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement addAPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthField;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationyearField;
	
	@FindBy(css = "#securityCodeInput")
	public WebElement securityCodeField;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addYourCardButton;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessfullyMassage;
	
	@FindBy(xpath = "//p[contains(text(),'Debit Card Ending in .... ')]")
	public WebElement cardInformation;
	
	@FindBy(xpath = "(//button[@class='text-blue-800 cursor-pointer hover:underline'])[2]")
	public WebElement removeOption;
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddressField;
	
	@FindBy(xpath = "//input[@placeholder='Apt , suit , unit , building , floor , etc']")
	public WebElement aptInputField;
	
	@FindBy(id = "apartmentInput")
	public WebElement streetAddress2;
	
	@FindBy(id = "cityInput")
	public WebElement cityField;
	
	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;
	
	@FindBy(css = "#addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//div[@class='account__payment-selected account__payment-item']")
	public WebElement card;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement editButton;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement updateYourCardButton;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfullyMassage;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editBtn;
	
	@FindBy(id = "addressBtn")
	public WebElement updateYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMassage;
	
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeBtn;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;
	
	

}
