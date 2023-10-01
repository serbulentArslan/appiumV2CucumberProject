package screens.apiDemosScreens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utils.Driver.getDriver;

public class ApiDemosPreferenceDependenciesScreen {
    public ApiDemosPreferenceDependenciesScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBoxButton;
    @AndroidFindBy(xpath = "//*[@text='WiFi settings']")
    public WebElement wifiSettingsButton;
    @AndroidFindBy(id = "android:id/edit")
    public WebElement textBox;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;
    @AndroidFindBy(id = "android:id/button2")
    public WebElement cancelButton;


}
