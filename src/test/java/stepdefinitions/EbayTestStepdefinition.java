package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.EbayPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class EbayTestStepdefinition {

    EbayPage ebayP = new EbayPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici AllCatagories dropdwn'undan bir {string} kategorisini secer")
    public void kullaniciAllCatagoriesDropdwnUndanBirKategorisiniSecer(String Category) {
        String expUrl = "ebay";
        assertTrue(Driver.getDriver().getCurrentUrl().contains(expUrl));
        ebayP.dropdownAllCategories.click();
        ReusableMethods.bekle(2);
        Select  select = new Select(ebayP.dropdownAllCategories);
        select.selectByValue("625");
        ReusableMethods.bekle(2);
    }
    @Then("Kullanici Search butonuna tiklar")
    public void kullanici_search_butonuna_tiklar() {
        ebayP.buttonSearch.click();

    }
    @Then("Kullanici Shop by Category bolumunden {string} secenegine tiklar")
    public void kullaniciShopByCategoryBolumundenSecenegineTiklar(String Category2) {
        ReusableMethods.bekle(2);
        ebayP.categoryDigital.click();

    }
    @Then("Kullanici sayfati asagiya kaydirin AllFilter menusunun gorunur oldugunu dogrular")
    public void kullanici_sayfati_asagiya_kaydirin_all_filter_menusunun_gorunur_oldugunu_dogrular() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(ebayP.listFilters.isEnabled());
    }

}
