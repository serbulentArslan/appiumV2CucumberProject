package screens.apiDemosScreens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

import static utils.Driver.getDriver;

public class ApiDemosHomeScreen {
    public ApiDemosHomeScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='API Demos']")
    public WebElement apiDemosTitle;
    @AndroidFindBy(accessibility = "Preference")
    public WebElement preferenceButton;

}
