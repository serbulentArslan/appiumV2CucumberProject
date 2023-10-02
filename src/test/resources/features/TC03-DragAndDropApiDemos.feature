Feature: API Demos Touch Action
  Scenario: Drag and Drop
    Given kullanici uygulamayi acar
    When kullanici Views butonuna tiklar
    And Kullanici Drag and Drop butonuna tiklar
    Then kullanici birinci topu ikinci topun ustune birakti
    And screenshot al