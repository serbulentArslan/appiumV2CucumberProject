package stepDefinitions;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static utils.Driver.getDriver;
import static utils.Driver.quitDriver;


public class Hooks {
    private AppiumDriverLocalService server;

    @Before
    public void setUp() {

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                .withArgument(GeneralServerFlag.USE_PLUGINS,"element-wait");


        if (server != null){
            server.stop();
            server = null;
        }

        server = AppiumDriverLocalService.buildService(builder);
        server.start();
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        quitDriver();
        server.stop();
    }
}
