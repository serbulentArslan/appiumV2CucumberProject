package screens.apiDemosScreens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utils.Driver.getDriver;

public class ApiDemosDragAndDropScreen {
    public ApiDemosDragAndDropScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement firstDot;
    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
    public WebElement secondDot;
    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_3")
    public WebElement thirdDot;


}
