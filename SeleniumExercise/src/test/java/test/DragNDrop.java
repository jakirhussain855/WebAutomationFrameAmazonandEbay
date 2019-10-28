package test;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNDrop extends CommonAPI {
    @Test(enabled = true)
    public void testDragNdrop() {
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
sleepFor(3);
        Actions actions = new Actions(driver);
        // WebElement from = getElement("//*[@id='credit2']/a");
        //  WebElement to = getElement("//*[@id='bank']/li");
        WebElement from = getElement("//section[@id='g-container-main']//li[4]//a[1]");
        WebElement to = getElement("//ol[@id='amt7']//li[@class='placeholder']");
        actions.dragAndDrop(from, to).build().perform();

        sleepFor(2);
    }

    @Test(enabled = false)
    public void dragNdropTest() {
        dragNdropByXpaths("//*[@id='credit2']/a", "//*[@id='bank']/li");
        sleepFor(2);
    }


}