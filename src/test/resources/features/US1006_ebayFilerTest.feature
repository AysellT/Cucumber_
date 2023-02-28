Feature:US1006_ebayFilerTest
@wip
  Scenario:Kullanici ebay sitesinde urunlerin filter menusune erisebilmeli

    Given Kullanici "ebayUrl" sayfasina gider
    Then Kullanici AllCatagories dropdwn'undan bir "Books&Magazine" kategorisini secer
    Then Kullanici Search butonuna tiklar
    Then Kullanici Shop by Category bolumunden "Books" secenegine tiklar
    And Kullanici sayfati asagiya kaydirin AllFilter menusunun gorunur oldugunu dogrular





