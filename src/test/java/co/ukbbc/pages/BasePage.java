package co.ukbbc.pages;

import co.ukbbc.common.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.Executor;

public class BasePage extends Driver {

    public String BASE_URL = "https://www.bbc.co.uk/news/uk";

    public Select select;
    public static Actions actions;



    public void launchUrl() {
        driver.navigate().to(BASE_URL);
    }

    public void selectByText(WebElement element, String text) {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByIndex(WebElement element, int index) {
        select = new Select(element);
        select.selectByIndex(index);
    }

    public void dragAndDrop(WebElement element, int startP, int endP) {
        actions = new Actions(driver);
        actions.dragAndDropBy(element, startP, endP).build().perform();

    }

    /*#########################################################
	Uses - This method helps to scroll an Element to view
	###########################################################*/
    public static void ScrollByPixel() {

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("window.scrollBy(0,7000)", "");
    }
}
