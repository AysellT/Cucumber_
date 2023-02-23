package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BeymenPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class BeymenStepdefinitions {

    BeymenPage beymenPage = new BeymenPage();

    @Given("Beymen anasayfasinin acildigini kontrol eder")
    public void beymen_anasayfasinin_acildigini_kontrol_eder() {
        String expStr = "Beymen";
        assertTrue(Driver.getDriver().getTitle().contains(expStr));

    }
    @Given("Kullanici Beymen cerezleri kabul eder")
    public void kullanici_beymen_cerezleri_kabul_eder() {
        beymenPage.cerezBeymen.click();
        beymenPage.generMan.click();
    }
    @Given("Arama kutucuguna {string} kelimesini girer ve aratir")
    public void arama_kutucuguna_kelimesini_girer_ve_aratir(String aranacakUrun) {
        aranacakUrun = ConfigReader.getProperty("aranacakBeymen");
        beymenPage.searchBoxBeymen.sendKeys(aranacakUrun+ Keys.ENTER);
    }
    @Then("Sonuca gore sergilenen urunlerden rastgele bir urun secer")
    public void sonuca_gore_sergilenen_urunlerden_rastgele_bir_urun_secer() {
        beymenPage.firstProductBeymen.click();
    }
    @Then("Secilen urunun urun bilgisi ve tutar bilgisini txt dosyasina yazdirir")
    public void secilen_urunun_urun_bilgisi_ve_tutar_bilgisini_txt_dosyasina_yazdirir() {

    }
    @Then("Secilen urunu sepete ekler")
    public void secilen_urunu_sepete_ekler() {

    }
    @Then("Urun sayfasindaki fiyat ile sepette yer alan urunun fiyatinin dogrulugunu karsilastirir")
    public void urun_sayfasindaki_fiyat_ile_sepette_yer_alan_urunun_fiyatinin_dogrulugunu_karsilastirir() {

    }
    @Then("Adet sayisini arttirarak urun adedinin {int} oldugunu dogrular")
    public void adet_sayisini_arttirarak_urun_adedinin_oldugunu_dogrular(Integer int1) {

    }
    @Then("Urunu sepetten silerek sepetin bos oldugunu kontrol eder")
    public void urunu_sepetten_silerek_sepetin_bos_oldugunu_kontrol_eder() {

    }

}
