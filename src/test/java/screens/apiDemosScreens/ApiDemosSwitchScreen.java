package screens.apiDemosScreens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utils.Driver.getDriver;

public class ApiDemosSwitchScreen {
    public ApiDemosSwitchScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;
    @AndroidFindBy(xpath = "(//*[@resource-id='android:id/switch_widget'])[1]")
    public WebElement firstSwitchButton;
    @AndroidFindBy(xpath = "(//*[@resource-id='android:id/switch_widget'])[2]")
    public WebElement secondSwitchButton;

}
