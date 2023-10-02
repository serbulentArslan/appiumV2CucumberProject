Feature: API Demos Switches

  Background: Switch Screen test
    Given kullanici uygulamayi acar
    When kullanici ana ekranda oldugunu dogrular
    And kullanici Preference butonuna tiklar
    Then kullanici Switch butonuna tiklar

  Scenario: Switch test
    And kullanici switch ekraninda checkbox secili oldugunu dogrular
    And kullanici birinci Switch preference butonuna tiklar
    And screenshot al

  Scenario: Switch button check
    Given switch ekranindaki checkbox secili olmali
    And birinci switch butonu kapali olmali
    And ikinci switch butonu acik olmali