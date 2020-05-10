package co.ukbbc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewsDetailsPage extends BasePage{

    public NewsDetailsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, NewsDetailsPage.class);
    }

}
