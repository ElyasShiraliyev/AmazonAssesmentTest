package Page;

import Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfItemsPage {

    WebDriver driver;

    public ListOfItemsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    public WebElement selectItem;

    public void itemList() {
        selectItem.click();
    }
}