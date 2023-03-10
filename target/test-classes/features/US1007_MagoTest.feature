Feature: mango shoping test
@wip
  Scenario:  testmango

  Given Kullanici "mangoUrl" sayfasina gider
  Then  kadin butona gelir ve acilan kismin gorunur oldugunu test eder.
  Then  urun secip yan kisimda pop up olarak sepete eklendigini dogrular
  Then  sepeti goruntule butonuna tiklar
  Then  sepetteki tutar ile sectigi tutarın esit oldugunu dogrular
  Then  fiyat bilgisinin text ini yazdirir.