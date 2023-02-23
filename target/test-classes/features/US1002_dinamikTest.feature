

  Feature: Google doviz testi

    Background:
      Given Kullanici "googleUrl" sayfasina gider

    Scenario: TestCase 01
      Then  Kullanici arama yapmak istedigi "Dollar to Euro" birimlerini girer
      Then  Para birimlerinin karsilastirmasini alir
      Then  Verilen degerlerin iki'den kucuk oldugunu dogrular dogrular
      And   Kullanici sayfayi kapatir

    Scenario: TestCase 02
      Then  Kullanici arama yapmak istedigi "Euro to Dollar" birimlerini girer
      Then  Para birimlerinin karsilastirmasini alir
      Then  Verilen degerlerin iki'den kucuk oldugunu dogrular dogrular
      And   Kullanici sayfayi kapatir


    Scenario Outline: TestCase 03
      Then  Kullanici arama yapmak istedigi "<aranacakPara>" birimlerini girer
      Then  Para birimlerinin karsilastirmasini alir
      Then  Verilen degerlerin iki'den kucuk oldugunu dogrular dogrular
      And   Kullanici sayfayi kapatir
      Examples:
      | aranacakPara |
      | aranacakPara2|
      | aranacakPara3|
      | aranacakPara4|