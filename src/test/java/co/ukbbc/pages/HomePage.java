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

    @FindBy(css = "#u5077640793820864 > div > div.gel-layout.gel-layout--center.gs-u-pt\\+\\+.lx-stream-wrapper-heading > div > div > div.lx-stream__show-more.lx-stream-show-more > button")
    private WebElement showMoreUpdatebutton;

    @FindBy (css = "#sty_51506729 > header > div > h3 > a > span")
    private WebElement newsLinks;

    public void clickOnMoreUpdateButton(){
    showMoreUpdatebutton.click();
}
    //    public HomePage clickOnMoreUpdateButton(){
//        showMoreUpdatebutton.click();
//        return new HomePage(driver);
//    }

    public NewsDetailsPage clickOnNewsLinks(){
        newsLinks.click();
        return new NewsDetailsPage(driver);
    }
}
