package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.BeymenPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class BeymenStepdefinitions {

    BeymenPage beymenPage = new BeymenPage();
    String productsPriceStr;

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
    public void secilen_urunun_urun_bilgisi_ve_tutar_bilgisini_txt_dosyasina_yazdirir() throws IOException {
        String productsDetailsStr = beymenPage.productDetails.getText();
        productsPriceStr = beymenPage.price.getText();

        FileWriter file = new FileWriter("/Users/gamlibaykus/Desktop/beymen.txt");
        file.write("urun bilgisi : "+productsDetailsStr);
        file.write("\n");
        file.write("urun fiyati : "+productsPriceStr);
        file.close();
    }
    @Then("Secilen urunu sepete ekler")
    public void secilen_urunu_sepete_ekler() {
        beymenPage.productSize.click();
        beymenPage.buttonSepeteEkle.click();
        ReusableMethods.bekle(7);
        beymenPage.linkSepetim.click();
    }
    @Then("Urun sayfasindaki fiyat ile sepette yer alan urunun fiyatinin dogrulugunu karsilastirir")
    public void urun_sayfasindaki_fiyat_ile_sepette_yer_alan_urunun_fiyatinin_dogrulugunu_karsilastirir() {
        assertEquals(productsPriceStr,beymenPage.sepettekiUrunFiyati.getText());
    }
    @Then("Adet sayisini arttirarak urun adedinin {int} oldugunu dogrular")
    public void adet_sayisini_arttirarak_urun_adedinin_oldugunu_dogrular(Integer sayi) {

        String birimFiyatStr = beymenPage.sepettekiUrunFiyati.getText();
        String sepettekiUrunStr = birimFiyatStr.replaceAll("\\D","");
        int birimFiyat = Integer.parseInt(sepettekiUrunStr);
        //System.out.println(birimFiyat);
        ReusableMethods.bekle(2);

        String secim = sayi + " adet";
        Select select = new Select(beymenPage.sepettekiAdediArtirButonu);
        select.selectByVisibleText(secim);
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().refresh();

        String toplamFiyatStr = beymenPage.sepettekiUrunFiyati.getText();
        String sepettekiUrunStrs = toplamFiyatStr.replaceAll("\\D","");
        int toplamFiyat = Integer.parseInt(sepettekiUrunStrs);
        //System.out.println(toplamFiyat);

        assertEquals((toplamFiyat / birimFiyat), (int) sayi);

    }
    @Then("Urunu sepetten silerek sepetin bos oldugunu kontrol eder")
    public void urunu_sepetten_silerek_sepetin_bos_oldugunu_kontrol_eder() {
        beymenPage.buttonSepetUrunSil.click();
        assertTrue(beymenPage.emptyMessage.isDisplayed());
    }

}
