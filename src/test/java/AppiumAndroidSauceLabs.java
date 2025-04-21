
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidSauceLabs {


    @BeforeTest
    public void setUp() throws MalformedURLException {

    }

    @Test
    public void Sum() throws InterruptedException, MalformedURLException {


        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("ANDROID")
                .setDeviceName("adb-RZ8N824Z0XR-OPadXP._adb-tls-connect._tcp")
                .setAppPackage("com.saucelabs.mydemoapp.android")  // change based on your device
                //.setAppWaitActivity("com.swaglabsmobileapp.MainActivity")
                .setAppWaitActivity("com.saucelabs.mydemoapp.android.view.activities.MainActivity")
                .setAppWaitForLaunch(true)
                .autoGrantPermissions()
                .setNoReset(true);// change as needed
                   // Don't reset camera state

        AndroidDriver driver = new AndroidDriver(new URL("http://192.168.1.6:4723/wd/hub"), options);

        /*Thread.sleep(10000); // Wait for camera to load

        // Attempt to click the shutter button
        try {

            Thread.sleep(15000);
            WebElement shutterButton = driver.findElement(By.id("com.android.camera2:id/shutter_button"));
            shutterButton.click();
            System.out.println("Shutter button clicked!");
        } catch (Exception e) {
            System.out.println("Shutter button not found: " + e.getMessage());
        }*/

        Thread.sleep(3000); // wait for image capture

        driver.quit();

    }




    @AfterTest
    public void End() {

    }
}
