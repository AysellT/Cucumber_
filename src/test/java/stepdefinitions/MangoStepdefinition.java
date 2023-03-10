package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.MangoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MangoStepdefinition {

    Actions actions = new Actions(Driver.getDriver());
    MangoPage mangoP = new MangoPage();

    @Then("kadin butona gelir ve acilan kismin gorunur oldugunu test eder.")
    public void kadinButonaGelirVeAcilanKisminGorunurOldugunuTestEder() {
        mangoP.buttonEnter.click();
        ReusableMethods.bekle(5);


    }

    @Then("urun secip yan kisimda pop up olarak sepete eklendigini dogrular")
    public void urun_secip_yan_kisimda_pop_up_olarak_sepete_eklendigini_dogrular() {

    }
    @Then("sepeti goruntule butonuna tiklar")
    public void sepeti_goruntule_butonuna_tiklar() {

    }
    @Then("sepetteki tutar ile sectigi tutarın esit oldugunu dogrular")
    public void sepetteki_tutar_ile_sectigi_tutarın_esit_oldugunu_dogrular() {

    }
    @Then("fiyat bilgisinin text ini yazdirir.")
    public void fiyat_bilgisinin_text_ini_yazdirir() {

    }



}
