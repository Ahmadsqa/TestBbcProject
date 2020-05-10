package co.ukbbc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"u701459830155116\"]/div/div[2]/div/div/div[2]/button")
    private WebElement showMoreUpdateButton;

    @FindBy (xpath = "//*[@id=\"sty_51506729\"]/header/div/h3/a/span")
    private WebElement newsLinks;

    public void clickOnMoreUpdateButton(){

        ScrollByPixel();
        showMoreUpdateButton.click();
    }

//      public HomePage clickOnMoreUpdateButton(){
//        ScrollByPixel();
//          showMoreUpdateButton.click();
//        return new HomePage(driver);
//    }

    public NewsDetailsPage clickOnNewsLinks(){

        newsLinks.click();
        return new NewsDetailsPage(driver);
    }
}
