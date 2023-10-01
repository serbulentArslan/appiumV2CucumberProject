package screens;


import screens.apiDemosScreens.ApiDemosHomeScreen;
import screens.apiDemosScreens.ApiDemosPreferenceDependenciesScreen;
import screens.apiDemosScreens.ApiDemosPreferenceScreen;

public class Screens {
    public Screens() {
    }

    private ApiDemosHomeScreen apiDemosHomeScreen;
    private ApiDemosPreferenceScreen apiDemosPreferenceScreen;
    private ApiDemosPreferenceDependenciesScreen apiDemosPreferenceDependenciesScreen;

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
}
