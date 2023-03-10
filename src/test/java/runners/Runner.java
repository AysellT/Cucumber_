package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features = "src/test/resources/features" , //recources'a ekledigimiz file'i buraya da ekleyebiliriz
        glue = "stepdefinitions",
        tags = "@wip" ,
        dryRun = false
)

public class Runner {

        /*
          Cucumber'da runner class'i bos bir class'tir.
          Runner class'ini diger class'lardan farkli kilan
          ve testNG'deki xml dosyalari gibi calismasini saglayan
          iki adet notasyon mevcuttur

          @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebidir
          Bu sayede runner class'larimiz cucumber ile calisir

          @CucumberOptions notasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
          Raporlama gibi ekstra optionlari da ileride ekleyecegiz
          Ancak
          oncelikli gorevi features dosyalari ile stepdefinitions'da bulunan
          java methodlarini ilisiklendirmektir

          tags : features klasoru icerisinde yazilan tag'lari aratip
          buldugu tum feature veya scenario'lari calistirir

          dryRun : iki deger alabilir
                   --true secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
                   eksik stepdefinition'lari bulup ilgili methodlari olusturur
                   hicbir sekilde testimizi calistirmaz
                   eksik adim yoksa test passed olarak isaretler

                   --false secilirse, verilen tag ile isaretli olan Feature veya Scenario'lari calistirir
         */


}
