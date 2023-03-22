package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	@FindBy(xpath = "(//select[@id='search'])//following::option[@value='3']")
	public WebElement smartHomeOption;
	
	@FindBy(xpath = "//img[@class='image']")
	public WebElement kasaOutdoorSmartPlugImage;
	
	@FindBy(xpath = "//pre[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlug;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement itemQTYDropDown;
	
	@FindBy(xpath = "//button[@id='addToCartBtn']")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cartOption;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutButton;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addANewAddressButton;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddressField;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;
	
	@FindBy(id = "cityInput")
	public WebElement cityField;
	
	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//button[@class='checkout__payment-btn']")
	public WebElement addACreditOrDebitCard;
	
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
	
	@FindBy(xpath = "//button[@class='checkout__payment-btn']")
	public WebElement addYourCardButton;
	
	@FindBy(css = "#placeOrderBtn")
	public WebElement placeOrderButton;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedSuccessfullyMessage;
	
	@FindBy(xpath = "(//select[@class='search__select'])//option[text()='Electronics']")
	public WebElement ElectronicsOption;
	
	@FindBy(xpath = "//pre[text()='Apex Legends']")
	public WebElement ApexLegends;
	
	@FindBy(xpath = "//img[@class='image']")
	public WebElement ApexLegendsImage;
	
	@FindBy(xpath = "(//select[@class='product__select'])//option[@value='5']")
	public WebElement QTYValue;
	
	
	
	

}
