
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class FirstClass {
    AppiumDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(  "platformName", "Android");
        cap.setCapability(  "deviceName", "onePlus6T");
        cap.setCapability("platformVersion", "9");
        cap.setCapability( "appPackage", "com.trello");
        cap.setCapability( "appActivity", ".home.HomeActivity");
        cap.setCapability( "app", "/Users/leostacy/IdeaProjects/trello-mob-android/src/test/resources/Trello_new.apk");
driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);





    }
    @Test
    public void openApp(){
        System.out.println("App is opened");
    }
    @AfterMethod
    public void tearDown(){

    }
}
