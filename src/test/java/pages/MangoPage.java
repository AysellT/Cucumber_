package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MangoPage {

    @FindBy(xpath = "//li[@class='RwseE r9mmy'][1]")
    public WebElement kadinButonu;

    @FindBy(xpath = "(//span[@class='B7VNr'])[4]")
    public WebElement ikinciIndirimButonu;
// (xpath = "//li[@id='rebajas_she']")


    @FindBy(xpath = "//span[text()='Palto']")
    public WebElement paltoButonu;

    @FindBy(xpath = "(//button[@class='text-body-l vuVlL'])[3]")
    public WebElement ilkPaltoS;
//button[@tabindex='0'])[6]

    @FindBy(xpath = "//div[@class='banner-actions-container']")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//div[@id='provinceLang']")
    public WebElement buttonEnter;

}
