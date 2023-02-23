package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    String userName;
    String userEmail;
    String userPassword;
    Faker faker = new Faker();
    Actions actions;


    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationExercisePage.linkSignUp.click();

    }
    @Given("user Create an account bolumune email adresi girer")
    public void user_create_an_account_bolumune_email_adresi_girer() {
        userName = faker.name().firstName();
        userEmail = faker.internet().emailAddress();
        automationExercisePage.boxName.sendKeys(userName);
        automationExercisePage.boxEmail.sendKeys(userEmail);
    }
    @And("sign up butonuna basar")
    public void signupButonunaBasar() {
        automationExercisePage.buttonSignUp.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        userPassword = faker.internet().password();
        actions = new Actions(Driver.getDriver());
        actions.click(automationExercisePage.radioButtonMrs)
                .sendKeys(Keys.TAB)
                .sendKeys(userName)
                .sendKeys(Keys.TAB)
                .sendKeys(userPassword)
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("Jaunary")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(userName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("657439")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).perform();

    }

    @Given("user Create Account butonuna basar")
    public void user_Create_Account_butonuna_basar() {
        automationExercisePage.buttonCreateAccount.click();

    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationExercisePage.textAccountCreated.isDisplayed());

    }

    @Given("user {string} anasayfasina gider")
    public void userAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
}
