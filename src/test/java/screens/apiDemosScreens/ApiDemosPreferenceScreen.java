package screens.apiDemosScreens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utils.Driver.getDriver;

public class ApiDemosPreferenceScreen {
    public ApiDemosPreferenceScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement preferenceDemendenciesButton;
    @AndroidFindBy(accessibility = "9. Switch")
    public WebElement switchButton;


}
