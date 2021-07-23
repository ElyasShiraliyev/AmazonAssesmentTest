package Page;

import Utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#twotabsearchtextbox")
    public WebElement inputBar;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchButton;

    public void searchItem() {
        inputBar.sendKeys("qa testing for beginners");
        searchButton.click();
    }
}