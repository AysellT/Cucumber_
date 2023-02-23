package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GetirPage {

    public GetirPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[text()='Tümünü Kabul Et']")
    public WebElement cerezKabul;

    @FindBy (xpath = "//*[@aria-label='facebook']")
    public WebElement iconFacebook;

    @FindBy (xpath = "//a[@aria-label='twitter']")
    public WebElement iconTwitter;

    @FindBy (xpath = "//*[@aria-label='instagram']")
    public WebElement iconInstagram;

    @FindBy (xpath = "(//button[@data-testid='change-language-button'])[2]")
    public WebElement buttonLanguage;

    @FindBy (xpath = "//input[@id='language-1']")
    public WebElement englishLanguage;

    @FindBy (xpath = "(//div[@kind='primary'])[2]")
    public WebElement buttonGuncelle;

    @FindBy (xpath = "//h5[@data-testid='title']")
    public WebElement baslikEnglish;


}
