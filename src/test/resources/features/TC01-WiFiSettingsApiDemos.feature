Feature: WiFi CheckBox and WiFi Settings
  Scenario: WiFi checkbox ve settings islemleri
    Given kullanici uygulamayi acar
    And kullanici ana ekranda oldugunu dogrular
    Then kullanici Preference butonuna tiklar
    And kullanici Preference dependencies butonuna tiklar
    Then kullanici WiFi checkbox secili oldugunu dogrular
    Then kullanici WiFi settings butonuna tiklar
    And kullanici text alanina yazi yazar
    And kullanici OK butonuna tiklar
