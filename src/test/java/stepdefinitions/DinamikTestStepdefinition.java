package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DinamikTestStepdefinition {

    GooglePage googlePage = new GooglePage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @Then("Kullanici arama yapmak istedigi {string} birimlerini girer")
    public void kullanici_arama_yapmak_istedigi_birimlerini_girer(String aranacakParaBirimi) {
        googlePage.googleAramaKutusu.sendKeys(ConfigReader.getProperty(aranacakParaBirimi)+ Keys.ENTER);
    }

}
