package test;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframe extends CommonAPI {
    @Test(enabled = true)
    public void iframeTest() {
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
        driver.switchTo().frame(1);

        //driver.get(driver.getCurrentUrl());
        //frame id....frame name,,,,frame index//
sleepFor(5);

        WebElement element = getElementByLinkText("Sortable");
        Assert.assertEquals(element.getText(),"Sortable","not print");
        //element.click();
        sleepFor(3);
        System.out.println(element.getText());
    }

}
