package Page;

import Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage {

    WebDriver driver;

    public CheckOutPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[@class='a-color-price hlb-price a-inline-block a-text-bold'])[1]")
    public WebElement priceCheckout;

    @FindBy(xpath = "//*[@id='hlb-ptc-btn-native']")
    public WebElement checkout;

    public void itemCheckOut(String price) {
        Assert.assertEquals(price, priceCheckout.getText());
        checkout.click();
    }

}