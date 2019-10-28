package pageObjectModel;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePagePOM extends CommonAPI {
    WebElement BestSeller=getElement("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Best Sellers')]");
    WebElement BestSellerIsClickable=getElement("//a[contains(text(),'Best Sellers')]");
    public void BestSellerCheck(){
        BestSeller.isDisplayed();
        Assert.assertEquals(BestSeller.isDisplayed(),true,"it is not displayed");
    }
    public  void BestSellerIsClickable(){
BestSellerIsClickable.click();
Assert.assertEquals(BestSellerIsClickable.isDisplayed(),true,"no it is not");
    }
}
