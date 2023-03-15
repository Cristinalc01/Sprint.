package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy (xpath = "(//ul[contains(@class,'unav-nav')])[3]//li")
    public List<WebElement> mobiletable;

    @FindBy(xpath = "//button[normalize-space()='x']")
    public WebElement close;

}
