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

    @FindBy (xpath = "(//span[@class='m-productCard__title'])[1]")
    public WebElement firstProductBeymen;

    //@FindBy (xpath = "(//*[@class='m-productCard__photo'])[2]")




}
