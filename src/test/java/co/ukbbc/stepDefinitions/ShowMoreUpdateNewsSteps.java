package co.ukbbc.stepDefinitions;

import co.ukbbc.pages.BasePage;
import co.ukbbc.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ShowMoreUpdateNewsSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);



    @Given("i navegiate to bbcnews homepage")
    public void i_navegiate_to_bbcnews_homepage() {
        launchUrl();
    }

    @When("i click on show more update button")
    public void i_click_on_show_more_update_button() {

        homePage.clickOnMoreUpdateButton();
    }

    @When("i click on the news link of my interest")
    public void i_click_on_the_news_link_of_my_interest() {
        homePage.clickOnNewsLinks();
    }

    @Then("the news details are displayed")
    public void the_news_details_are_displayed() {

    }
}
