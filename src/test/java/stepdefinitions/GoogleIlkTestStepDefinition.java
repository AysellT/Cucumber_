package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleIlkTestStepDefinition{

    GooglePage googlePage = new GooglePage();
    String karsilastirmaDegeriStr;
    String karsilastirmaDegeri;

    @Given("Kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }
    @Then("Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer")
    public void arama_kutusuna_karsilastirma_yapmak_istedigi_para_birimlerini_girer() {
        googlePage.googleAramaKutusu.sendKeys("Euro ve Dollar"+ Keys.ENTER);
    }
    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
        karsilastirmaDegeriStr =  googlePage.karsilastirmaDegeri.getText();
        karsilastirmaDegeri = karsilastirmaDegeriStr.replaceAll(",",".");
    }

    @Then("Verilen degerlerin iki'den kucuk oldugunu dogrular dogrular")
    public void verilenDegerlerinIkiDenKucukOldugunuDogrularDogrular() {
        Assert.assertTrue(Double.parseDouble(karsilastirmaDegeri)<5);
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Arama Kutusuna Dollar to Euro karsilastirma yapmak istedigi para birimlerini girer")
    public void aramaKutusunaDollarToEuroKarsilastirmaYapmakIstedigiParaBirimleriniGirer() {
        googlePage.googleAramaKutusu.sendKeys("Dollar to Euro"+ Keys.ENTER);

    }
}
