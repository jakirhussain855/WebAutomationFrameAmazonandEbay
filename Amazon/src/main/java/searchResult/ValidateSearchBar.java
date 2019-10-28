package searchResult;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ValidateSearchBar extends CommonAPI {
    public  void validateSearchBarIsDisPLayed(){
        WebElement element= getElement("//div[@id='search']");
        Assert.assertEquals(element.isDisplayed(),true,"Element is not displayed" );
       //return Assert.assertEquals(isElementDisplayed());
        //TestLogger.log("search result is displayed"+ " element");
    }
//    public void getAllElement() {
//        List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
//        System.out.println(elementList.size());
//        //return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
//    }
}
