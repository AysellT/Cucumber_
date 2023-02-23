Feature: US1005 Beymen Test
  @wip
  Scenario: Kullanici beymen'de urunlerle ilgili ekleme silme gibi islemleri yapabilmeli

    Given Kullanici "beymenUrl" sayfasina gider
    And Beymen anasayfasinin acildigini kontrol eder
    And Kullanici Beymen cerezleri kabul eder
    And Arama kutucuguna "gomlek" kelimesini girer ve aratir
    Then Sonuca gore sergilenen urunlerden rastgele bir urun secer
    And Secilen urunun urun bilgisi ve tutar bilgisini txt dosyasina yazdirir
    And Secilen urunu sepete ekler
    And Urun sayfasindaki fiyat ile sepette yer alan urunun fiyatinin dogrulugunu karsilastirir
    And Adet sayisini arttirarak urun adedinin 2 oldugunu dogrular
    Then Urunu sepetten silerek sepetin bos oldugunu kontrol eder



