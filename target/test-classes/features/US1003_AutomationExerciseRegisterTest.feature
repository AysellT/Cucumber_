Feature: US Automation exercise sitesinde kullanici olusturma


  Scenario:  Kullanici automation exercise sayfasinda kullanici olusturabilmeli

    Given user "automationExerciseUrl" anasayfasina gider
    And user sign up linkine tiklar
    And user Create an account bolumune email adresi girer
    And sign up butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu dogrulayin