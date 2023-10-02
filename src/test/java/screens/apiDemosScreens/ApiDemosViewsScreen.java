package screens.apiDemosScreens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utils.Driver.getDriver;

public class ApiDemosViewsScreen {
    public ApiDemosViewsScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(accessibility = "Drag and Drop")
    public WebElement dragAndDropButton;
    @AndroidFindBy(accessibility = "Date Widgets")
    public WebElement dateWidgetsButton;
    @AndroidFindBy(accessibility = "2. Inline")
    public WebElement inlineButton;
    @AndroidFindBy(id = "android:id/hours")
    public WebElement hourField;
    @AndroidFindBy(accessibility = "9")
    public WebElement number9;
    @AndroidFindBy(accessibility = "15")
    public WebElement number15;
    @AndroidFindBy(accessibility = "45")
    public WebElement number45;
    @AndroidFindBy(accessibility = "Expandable Lists")
    public WebElement expandableListButton;
    @AndroidFindBy(accessibility = "1. Custom Adapter")
    public WebElement customAdapterButton;
    @AndroidFindBy(xpath = "//*[@text='Dog Names']")
    public WebElement dogNamesButton;
    @AndroidFindBy(accessibility = "Popup Menu")
    public WebElement popupMenuButton;
    @AndroidFindBy(accessibility = "Make a Popup!")
    public WebElement makeAPopupButton;
    @AndroidFindBy(className = "android.widget.Toast")
    public WebElement popupMessage;
    @AndroidFindBy(xpath = "//*[@text='Search']")
    public WebElement searchButton;
}
