package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@class='gLFyf']")
    public WebElement googleAramaKutusu;

    @FindBy (xpath = "//span[@class='DFlfde SwHCTb']")
    public WebElement karsilastirmaDegeri;
}
