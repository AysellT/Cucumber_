package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()=' Signup / Login']")
    public WebElement linkSignUp;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement boxName;

    @FindBy (xpath = "(//input[@name='email'])[2]")
    public WebElement boxEmail;

    @FindBy (xpath = "//button[text()='Signup']")
    public WebElement buttonSignUp;

    @FindBy (id="id_gender2")
    public WebElement radioButtonMrs;

    @FindBy (xpath = "//*[text()='Create Account']")
    public WebElement buttonCreateAccount;

    @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement textAccountCreated;

}
