package screens;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import screens.apiDemosScreens.*;
import utils.Driver;

import java.time.Duration;
import java.util.Collections;

public class Screens {
    public Screens() {
    }

    private ApiDemosHomeScreen apiDemosHomeScreen;
    private ApiDemosPreferenceScreen apiDemosPreferenceScreen;
    private ApiDemosPreferenceDependenciesScreen apiDemosPreferenceDependenciesScreen;
    private ApiDemosSwitchScreen apiDemosSwitchScreen;
    private ApiDemosViewsScreen apiDemosViewsScreen;
    private ApiDemosDragAndDropScreen apiDemosDragAndDropScreen;

    public ApiDemosDragAndDropScreen apiDemosDragAndDropScreen(){
        if (apiDemosDragAndDropScreen == null){
            apiDemosDragAndDropScreen = new ApiDemosDragAndDropScreen();
        }
        return apiDemosDragAndDropScreen;
    }


    public ApiDemosHomeScreen apiDemosHomeScreen(){
        if (apiDemosHomeScreen == null){
            apiDemosHomeScreen = new ApiDemosHomeScreen();
        }
        return apiDemosHomeScreen;
    }

    public ApiDemosPreferenceScreen apiDemosPreferenceScreen(){
        if (apiDemosPreferenceScreen == null){
            apiDemosPreferenceScreen = new ApiDemosPreferenceScreen();
        }
        return apiDemosPreferenceScreen;
    }

    public ApiDemosPreferenceDependenciesScreen apiDemosPreferenceDependenciesScreen(){
        if (apiDemosPreferenceDependenciesScreen == null){
            apiDemosPreferenceDependenciesScreen = new ApiDemosPreferenceDependenciesScreen();
        }
        return apiDemosPreferenceDependenciesScreen;
    }

    public ApiDemosSwitchScreen apiDemosSwitchScreen(){
        if (apiDemosSwitchScreen == null){
            apiDemosSwitchScreen = new ApiDemosSwitchScreen();
        }
        return apiDemosSwitchScreen;
    }

    public ApiDemosViewsScreen apiDemosViewsScreen(){
        if (apiDemosViewsScreen == null){
            apiDemosViewsScreen = new ApiDemosViewsScreen();
        }
        return apiDemosViewsScreen;
    }
}
