package test;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMouseHoverTest extends CommonAPI {

    @Test(enabled = false)
    public void TestDropDown() {
        WebElement element = getElement("//select[@id='gh-cat']");
        Select select = new Select(element);
        select.selectByIndex(4);
        sleepFor(5);
    }

    @Test(enabled = true)
    public void TestMouseHover() {
        WebElement element = getElementByLinkText("Fashion");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        sleepFor(3);
        clickOnElementByLinkText("Jewelry");
        sleepFor(5);

    }


    //    @Test
//    public void eee(){
//    WebElement element=getElementByLinkText("Fashion");
//    Actions actions=new Actions(driver);
//    actions.moveToElement(element).build().perform();
//    clickOnElementByLinkText("Jewelry");
//    sleepFor(5);
//}
//    @Test
//    public void DPDNMO(){
//        WebElement element =getElement("//select[@id='gh-cat']");
//        Select select=new Select(element);
//        //sleepFor(3);
//        select.deselectByIndex(5);
//        sleepFor(3);
//    }
//}
    @Test(enabled = false)
    public void selectbydropdown() {
        scroll();
        WebElement element = getElement("//select[@id='gh-cat']");
        Select select = new Select(element);
        select.selectByIndex(4);
        clickOnElementByXpath("//input[@id='gh-btn']");
        driver.findElement(By.xpath("//i[@id='gh-shop-ei']")).click();
        WebElement element1 = getElementByLinkText("Fashion");
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
        sleepFor(3);
        driver.findElement(By.linkText("Fashion")).click();

        sleepFor(3);
    }

    @Test(enabled = false)
    public void scrollToView() {
        //Charity Shop//eBay for Charity
        WebElement element = getElementByLinkText("eBay for Charity");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(5);
    }

@Test(enabled = false)
public void e() {
    WebElement element = getElementByLinkText("Policies");
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
    javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    sleepFor(6);
}
@Test(enabled = false)
public void scroll(){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        sleepFor(5);
}
}
