package stepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import screens.Screens;

import java.time.Duration;
import java.util.Collections;

import static org.junit.Assert.*;
import static utils.Driver.getDriver;
import static utils.ReusableMethods.longPress;
import static utils.ReusableMethods.scroll;

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
                .getAttribute("checked").equals("false")) {
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


    @Then("kullanici Switch butonuna tiklar")
    public void kullaniciSwitchButonunaTiklar() {
        screens.apiDemosPreferenceScreen().switchButton.click();
    }

    @And("kullanici switch ekraninda checkbox secili oldugunu dogrular")
    public void kullaniciSwitchEkranindaCheckboxSeciliOldugunuDogrular() {
        if (screens.apiDemosSwitchScreen().checkBox.getAttribute("checked").equals("false")) {
            screens.apiDemosSwitchScreen().checkBox.click();
        }

        assertEquals("true", screens.apiDemosSwitchScreen().checkBox.getAttribute("checked"));
    }

    @And("kullanici birinci Switch preference butonuna tiklar")
    public void kullaniciBirinciSwitchPreferenceButonunaTiklar() {
        screens.apiDemosSwitchScreen().firstSwitchButton.click();
    }

    @Given("switch ekranindaki checkbox secili olmali")
    public void switchEkranindakiCheckboxSeciliOlmali() {
        assertEquals("true", screens.apiDemosSwitchScreen().checkBox.getAttribute("checked"));
    }

    @And("birinci switch butonu kapali olmali")
    public void birinciSwitchButonuKapaliOlmali() {
        if (screens.apiDemosSwitchScreen().firstSwitchButton.getText().equals("ON")) {
            screens.apiDemosSwitchScreen().firstSwitchButton.click();
        }
        assertEquals("OFF", screens.apiDemosSwitchScreen().firstSwitchButton.getText());
    }

    @And("ikinci switch butonu acik olmali")
    public void ikinciSwitchButonuAcikOlmali() {
        if (screens.apiDemosSwitchScreen().secondSwitchButton.getText().equals("OFF")) {
            screens.apiDemosSwitchScreen().secondSwitchButton.click();
        }
        assertEquals("ON", screens.apiDemosSwitchScreen().secondSwitchButton.getText());
    }

    @When("kullanici Views butonuna tiklar")
    public void kullaniciViewsButonunaTiklar() {
        screens.apiDemosHomeScreen().viewsButton.click();
    }

    @And("Kullanici Drag and Drop butonuna tiklar")
    public void kullaniciDragAndDropButonunaTiklar() {
        screens.apiDemosViewsScreen().dragAndDropButton.click();
    }

    @Then("kullanici birinci topu ikinci topun ustune birakti")
    public void kullaniciBirinciTopuIkinciTopunUstuneBirakti() {
        WebElement sourceElement = screens.apiDemosDragAndDropScreen().firstDot;
        WebElement targetElement = screens.apiDemosDragAndDropScreen().secondDot;

        Point sourceElementLocation = sourceElement.getLocation();
        Dimension sourceElementSize = sourceElement.getSize();
        Point targetElementLocation = targetElement.getLocation();
        Dimension targetElementSize = targetElement.getSize();

        Point sourceElementCenter = new Point(sourceElementLocation.getX() + sourceElementSize.getWidth() / 2,
                sourceElementLocation.getY() + sourceElementSize.getHeight() / 2);

        Point targetElementCenter = new Point(targetElementLocation.getX() + targetElementSize.getWidth() / 2,
                targetElementLocation.getY() + targetElementSize.getHeight() / 2);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), sourceElementCenter))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(1000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), targetElementCenter))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(sequence));
    }


    @And("kullanici Date Widgets butonuna tiklar")
    public void kullaniciDateWidgetsButonunaTiklar() {
        screens.apiDemosViewsScreen().dateWidgetsButton.click();
    }

    @And("kullanici Inline butonuna tiklar")
    public void kullaniciInlineButonunaTiklar() {
        screens.apiDemosViewsScreen().inlineButton.click();
    }

    @Then("kullanici {int} sayisina tiklar")
    public void kullaniciSayisinaTiklar(int arg0) {
        screens.apiDemosViewsScreen().number9.click();
    }

    @And("kullanici {int} ten {int} e saat cubugunu kaydirir")
    public void kullaniciTenESaatCubugunuKaydirir(int arg0, int arg1) {
        WebElement sourceElement = screens.apiDemosViewsScreen().number15;
        WebElement targetElement = screens.apiDemosViewsScreen().number45;

        Point sourceElementLocation = sourceElement.getLocation();
        Dimension sourceElementSize = sourceElement.getSize();
        Point targetElementLocation = targetElement.getLocation();
        Dimension targetElementSize = targetElement.getSize();

        Point sourceElementCenter = new Point(sourceElementLocation.getX() + sourceElementSize.getWidth() / 2,
                sourceElementLocation.getY() + sourceElementSize.getHeight() / 2);

        Point targetElementCenter = new Point(targetElementLocation.getX() + targetElementSize.getWidth() / 2,
                targetElementLocation.getY() + targetElementSize.getHeight() / 2);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), sourceElementCenter))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(500)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), targetElementCenter))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(sequence));

    }

    @And("kullanici Expandable List butonuna tiklar")
    public void kullaniciExpandableListButonunaTiklar() {
        screens.apiDemosViewsScreen().expandableListButton.click();
    }

    @And("kullanici Custom Adapter butonuna 5 saniye tiklar")
    public void kullaniciCustomAdapterButonuna5SaniyeTiklar() {
        WebElement element = screens.apiDemosViewsScreen().customAdapterButton;

        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = new Point(location.getX() + size.getWidth() /2,
                location.getY() + size.getHeight() /2);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 0)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofSeconds(5)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(sequence));
    }

    @And("kullanici Popup Menu butonuna tiklar")
    public void kullaniciPopupMenuButonunaTiklar() {
        scroll(getDriver(),10);
    }

    @Then("kullanici make a popup butonuna tiklar")
    public void kullaniciMakeAPopupButonunaTiklar() {
        screens.apiDemosViewsScreen().makeAPopupButton.click();
    }

    @And("kullanici search butonuna tiklar")
    public void kullaniciSearchButonunaTiklar() {
        screens.apiDemosViewsScreen().searchButton.click();
    }

    @And("kullanici cikan popup mesajini dogrular")
    public void kullaniciCikanPopupMesajiniDogrular() {
        assertTrue(screens.apiDemosViewsScreen().popupMessage.isDisplayed());
    }
}
