package homePageSearch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class AmazonSignInPage extends CommonAPI {
    public void ClickOnSearchBar() {
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        TestLogger.log("Click on search bar of Amazon");

    }

    public void TypeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", value);
    }

    ////TestLogger.log(value+" Type down on seach bar");
//    }
    public void ClickOnSearchButton() {
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        //TestLogger.log("Click on Search button of amazon");
    }

    public List<WebElement> getAllElementFromList(String locator) {
       // List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
       // System.out.println(elementList.size());
       //return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        return driver.findElements(By.xpath(locator));

    }

//   // public void  ISSGbatsDisplayed(){
//       // Assert.assertEquals(isElementDisplayed("//span[@class='celwidget slot=FKMR_SEARCH_RESULTS template=SEARCH_RESULTS widgetId=fkmr-search-results-3 index=0']//img[@class='s-image']"),true);
//   //clickOnElementByXpath("//span[@class='celwidget slot=FKMR_SEARCH_RESULTS template=SEARCH_RESULTS widgetId=fkmr-search-results-3 index=0']//img[@class='s-image']");
//   // clickOnElementByXpath("//span[contains(text(),'SG Players Edition Cricket BAT')]");
////TestLogger.log("Making sure if SG bats of shane watson is displayed");
//    //}

}
