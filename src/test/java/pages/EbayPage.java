package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EbayPage {

    public EbayPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@class='gh-sb ']")
    public WebElement dropdownAllCategories;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement buttonSearch;

    @FindBy(xpath = "//a[text()='Digital Cameras']")
    public WebElement categoryDigital;

    @FindBy(xpath = "//section[@class='brm b-refine-menu brm--fixed']")
    public WebElement listFilters;

}
