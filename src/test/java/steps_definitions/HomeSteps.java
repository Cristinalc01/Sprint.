package steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;

public class HomeSteps implements CommonPage {

    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }


    WebDriverWait wait;


    @Given("I open url to homepage")
    public void i_open_url_to_homepage() {
        BrowserUtils.getDriver();
    }


    @When("I verify the table header is displayed")
    public void iVerifyTheTableHeaderIsDisplayed() {
        wait = new WebDriverWait(BrowserUtils.getDriver(), 30);
        for (WebElement each : page.mobiletable) {
            BrowserUtils.isDisplayed(each);
            System.out.println(each.getText());
        }

    }

    @When("I click in close")
    public void iClickInClose() {
        wait = new WebDriverWait(BrowserUtils.getDriver(), 15);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BrowserUtils.click(page.close);
    }


}