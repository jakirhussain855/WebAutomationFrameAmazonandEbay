package homePageSearch;

import base.CommonAPI;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

public class SearchOnHomePage extends CommonAPI {

public void SearchFieldTypeAbility(){
    Assert.assertEquals(isElementDisplayed("//input[@id='twotabsearchtextbox']"),true);
clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
sleepFor(2);
typeOnElementByXpath("//input[@id='twotabsearchtextbox']","java books");
sleepFor(2);
}
public void clickOnSearchButton(){
    clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");

}
public void clickOnAmazonLogo(){
    Assert.assertEquals(isElementDisplayed("//span[@class='nav-sprite nav-logo-base']"),true);

    clickOnElementByXpath("//span[@class='nav-sprite nav-logo-base']");
}
public  void clickOnAmazonHomePageSideBar(){
    Assert.assertEquals(isElementDisplayed("//i[@class='hm-icon nav-sprite']"),true);
clickOnElementByXpath("//i[@class='hm-icon nav-sprite']");
clickOnElementByXpath("//div[@id='hmenu-customer-name']");
//Assert.assertEquals(isElementDisplayed("//ul[@class='hmenu hmenu-visible']"),true);
//clickOnElementByXpath("//ul[@class='hmenu hmenu-visible']");

}

}
