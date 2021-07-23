package Utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Base {

    @BeforeTest
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://www.amazon.com/");
    }

    @AfterMethod
    public void closeDriver() {
        Driver.getDriver().quit();
    }
}
