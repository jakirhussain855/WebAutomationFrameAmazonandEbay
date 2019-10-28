package HomePageTest;

import homePageSearch.AmazonSignInPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import searchResult.ValidateSearchBar;

import javax.naming.directory.SearchResult;
import java.util.List;

public class AmazonSignInPageTest extends AmazonSignInPage {

    ValidateSearchBar validateSearchBar=new ValidateSearchBar();
    @Test(enabled = false)
    public void TestSearchBarValidity() {
        ClickOnSearchBar();
        TypeOnSearchBar("Java books");
        sleepFor(1);
        ClickOnSearchButton();
        sleepFor(2);
       validateSearchBar.validateSearchBarIsDisPLayed();

        sleepFor(3);
       // ISSGbatsDisplayed();
        //sleepFor(3);
        //validateSearchBar.validateSearchBarIsDisPLayed();
    }
    @Test(enabled = true)
    public void TestDropDOWN(){
       // List<WebElement>elementList=getAllElement();
       // System.out.println("driver.findElements(By.xpath(\"//*[contains(@value,'search-alias')]\"));");
       List <WebElement> elementList=getAllElementFromList("//*[contains(@value,'search-alias')]");
       System.out.println(elementList.size());
       for (int i=0;i<elementList.size();i++){
           System.out.println(elementList.get(i).getText()) ;
           sleepFor(5);
       }
    }

//
//    @Test(enabled = false)
//    public void TestSearch() {
//TestSearchBarValidity();
//    }
}