package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MangoPage {

    @FindBy(xpath = "//li[@class='RwseE r9mmy'][1]")
    public WebElement kadinButonu;

    @FindBy(xpath = "(//span[@class='B7VNr'])[4]")
    public WebElement ikinciIndirimButonu;

    @FindBy(xpath = "//span[text()='Palto']")
    public WebElement paltoButonu;

    @FindBy(xpath = "(//button[@class='text-body-l vuVlL'])[3]")
    public WebElement ilkPaltoS;


    @FindBy(xpath = "//div[@class='banner-actions-container']")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//div[@id='provinceLang']")
    public WebElement buttonEnter;





    @FindBy (xpath = "(//a[text()='Login'])[1]")
    public WebElement buttonLogin;

    @FindBy (xpath = "//*[text()='/ Register']")
    public WebElement buttonRegister;

    @FindBy (id = "first_name")
    public WebElement textBoxFirstName;

    @FindBy (xpath = "//*[text()='Sign In']")
    public WebElement linkRegisterPageSignIn; // 'Already have an Account' yazisinin yanindaki

    @FindBy (id = "policyCheck")
    public WebElement checkBoxPolicy;

    @FindBy (id = "sign_in_btn")
    public WebElement buttonSignUp;

    @FindBy (xpath = "(//span[@class='text-danger'])[1]")
    public WebElement firstNameTextDanger;

    @FindBy (xpath = "(//span[@class='text-danger'])[5]")
    public WebElement  passwordTextDanger;


    






















}
