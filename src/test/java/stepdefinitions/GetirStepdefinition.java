package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GetirPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class GetirStepdefinition {

    Actions actions = new Actions(Driver.getDriver());
    GetirPage getirPage = new GetirPage();
    String getirWHD;

    @Then("anasayfaya basariyla gidildigini dogrular")
    public void anasayfaya_basariyla_gidildigini_dogrular() {
        String expectedTitle = "getir";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedTitle));
        getirWHD = Driver.getDriver().getWindowHandle();
    }
    @Then("sayfanin en altindaki sosyalmedya ikonlarinin gorunur oldugunu dogrular")
    public void sayfanin_en_altindaki_sosyalmedya_ikonlarinin_gorunur_oldugunu_dogrular() {
        actions.sendKeys(Keys.END).perform();
        actions.click(getirPage.cerezKabul).perform();
        Assert.assertTrue(getirPage.iconFacebook.isDisplayed());
        Assert.assertTrue(getirPage.iconTwitter.isDisplayed());
        Assert.assertTrue(getirPage.iconInstagram.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("ikonlarin dogru sayfalara yonlendirdigini dogrular")
    public void ikonlarin_dogru_sayfalara_yonlendirdigini_dogrular() {

        actions.click(getirPage.iconFacebook).perform();
        Set<String> wHDegerleri1 = Driver.getDriver().getWindowHandles();
        for (String eachWHD : wHDegerleri1){
            if (!eachWHD.equals(getirWHD)){
                Driver.getDriver().switchTo().window(eachWHD);
            }
        }
        ReusableMethods.bekle(2);
        String expTitle = "facebook";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expTitle));
        Driver.getDriver().close();

        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().window(getirWHD);
        getirPage.iconTwitter.click();
        Set<String> wHDegerleri2 = Driver.getDriver().getWindowHandles();
        for (String eachWHD : wHDegerleri2){
            if (!eachWHD.equals(getirWHD)){
                Driver.getDriver().switchTo().window(eachWHD);
            }
        }
        ReusableMethods.bekle(2);
        String expURl = "twitter";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expURl));
        Driver.getDriver().close();

        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().window(getirWHD);
        getirPage.iconInstagram.click();
        Set<String> wHDegerleri3 = Driver.getDriver().getWindowHandles();
        for (String eachWHD : wHDegerleri3){
            if (!eachWHD.equals(getirWHD)){
                Driver.getDriver().switchTo().window(eachWHD);
            }
        }
        ReusableMethods.bekle(2);
        String exp = "instagram";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(exp));
        Driver.getDriver().close();

    }
    @Then("sayfanin en altindan dilseceneginin degistirilebilir oldugunu dogrular")
    public void sayfanin_en_altindan_dilseceneginin_degistirilebilir_oldugunu_dogrular() {

        Driver.getDriver().switchTo().window(getirWHD);
        getirPage.buttonLanguage.click();
        getirPage.englishLanguage.click();
        getirPage.buttonGuncelle.click();
        String expLanguage = "register";
        //Assert.assertTrue(getirPage.baslikEnglish.getText().contains(expLanguage));
    }

}
