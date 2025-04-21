import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidAddContact {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("Android Emulator")
                .setAppPackage("com.google.android.contacts")
                .setAppActivity("com.android.contacts.activities.PeopleActivity")
                .setNoReset(true);

        AndroidDriver driver = new AndroidDriver(new URL("http://192.168.1.6:4723/wd/hub"), options);

        Thread.sleep(20000);

        try {
            // Click "Add Contact" button (FAB)
            WebElement addContactButton = driver.findElement(By.id("com.google.android.contacts:id/floating_action_button"));
            addContactButton.click();

            Thread.sleep(1000);

            // Input name
            WebElement nameField = driver.findElement(By.xpath("//android.widget.EditText[@text='First name']"));
            nameField.sendKeys("John Doe");

            // Input phone number
            WebElement phoneField = driver.findElement(By.xpath("//android.widget.EditText[@text='Phone']"));
            phoneField.sendKeys("1234567890");

            Thread.sleep(1000);

            // Click save
            WebElement saveButton = driver.findElement(By.id("com.google.android.contacts:id/toolbar_button"));
            saveButton.click();

            System.out.println("Contact added successfully!");

        } catch (Exception e) {
            System.out.println("Failed to add contact: " + e.getMessage());
        }

        Thread.sleep(3000);
        driver.quit();
    }
    }

