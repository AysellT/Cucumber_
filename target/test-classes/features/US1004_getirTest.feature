Feature:Kullanici anasayfaya gittiginde cesitli basliklari gorebilmeli

  Scenario:TC01 kullanici anasayfadaki sosyal medya ikonlarini gorebilmeli ve fonksiyonlarini kontrol edebilmeliyim

  Given user "getirUrl" anasayfasina gider
  Then anasayfaya basariyla gidildigini dogrular
  And sayfanin en altindaki sosyalmedya ikonlarinin gorunur oldugunu dogrular
  And ikonlarin dogru sayfalara yonlendirdigini dogrular
  And sayfanin en altindan dilseceneginin degistirilebilir oldugunu dogrular
