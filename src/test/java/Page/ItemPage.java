package Page;

import Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ItemPage {

    WebDriver driver;

    public ItemPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@id='newBuyBoxPrice']")
    public WebElement priceAddToCart;

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    public WebElement addToCart;

    public void itemCard(String price) {
        Assert.assertEquals(priceAddToCart.getText(), price);
        addToCart.click();
    }
}