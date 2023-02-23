package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BeymenPage {

    public BeymenPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cerezBeymen;

    @FindBy(id = "genderManButton")
    public WebElement generMan;

    @FindBy(xpath = "//input[@aria-controls='3-suggestions']")
    public WebElement searchBoxBeymen;

    @FindBy (xpath = "(//div[@class='m-productImageList'])[1]")
    public WebElement firstProductBeymen;

    @FindBy (xpath = "//*[@class='o-productDetail__title']")
    public WebElement productDetails;

    @FindBy (xpath = "//*[@id='priceNew']")
    public WebElement price;

    @FindBy(xpath = "//span[text()='L']")
    public WebElement productSize;

    @FindBy(xpath = "//button[@id='addBasket']")
    public WebElement buttonSepeteEkle;

    @FindBy(xpath = "//a[@title='Sepetim']")
    public WebElement linkSepetim;

    @FindBy(xpath = "//span[@class='m-productPrice__salePrice']")
    public WebElement sepettekiUrunFiyati;

    @FindBy(xpath = "//*[@id='quantitySelect0-key-0']")
    public WebElement sepettekiAdediArtirButonu;

    @FindBy(xpath = "//button[@id='removeCartItemBtn0-key-0']")
    public WebElement buttonSepetUrunSil;

    @FindBy(xpath = "(//*[@class='m-empty__messageTitle'])[1]")
    public WebElement emptyMessage;


}
