package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.Screens;

import static org.junit.Assert.*;
import static utils.Driver.getDriver;

public class ApiDemosStepDefs {
    Screens screens = new Screens();


    @Given("kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        getDriver();
    }

    @Given("kullanici ana ekranda oldugunu dogrular")
    public void kullanici_ana_ekranda_oldugunu_dogrular() {
        assertTrue(screens.apiDemosHomeScreen().apiDemosTitle.isDisplayed());
    }

    @Then("kullanici Preference butonuna tiklar")
    public void kullanici_preference_butonuna_tiklar() {
        screens.apiDemosHomeScreen().preferenceButton.click();
    }
    @Then("kullanici Preference dependencies butonuna tiklar")
    public void kullanici_preference_dependencies_butonuna_tiklar() {
        screens.apiDemosPreferenceScreen().preferenceDemendenciesButton.click();
    }
    @Then("kullanici WiFi checkbox secili oldugunu dogrular")
    public void kullanici_wi_fi_checkbox_secili_oldugunu_dogrular() {
        if (screens.apiDemosPreferenceDependenciesScreen().checkBoxButton
                .getAttribute("checked").equals("false")){
            screens.apiDemosPreferenceDependenciesScreen().checkBoxButton.click();
        }
        assertTrue(screens.apiDemosPreferenceDependenciesScreen().checkBoxButton
                .getAttribute("checked").equals("true"));
    }
    @Then("kullanici WiFi settings butonuna tiklar")
    public void kullanici_wi_fi_settings_butonuna_tiklar() {
        screens.apiDemosPreferenceDependenciesScreen().wifiSettingsButton.click();

        assertTrue(screens.apiDemosPreferenceDependenciesScreen().cancelButton.isDisplayed());
    }
    @Then("kullanici text alanina yazi yazar")
    public void kullanici_text_alanina_yazi_yazar() {
        screens.apiDemosPreferenceDependenciesScreen().textBox.sendKeys("appiumTest");
    }
    @Then("kullanici OK butonuna tiklar")
    public void kullanici_ok_butonuna_tiklar() {
        screens.apiDemosPreferenceDependenciesScreen().okButton.click();
    }

}
