package HomePageTest;

import homePageSearch.SearchOnHomePage;
import org.testng.annotations.Test;

public class SearchTest extends SearchOnHomePage {
    @Test (enabled =false)
    public void typeAbilityTest(){
        SearchFieldTypeAbility();
    }
@Test(enabled = false)
    public void validateSearchButtonWorks(){
        SearchFieldTypeAbility();
        clickOnSearchButton();

}
@Test(enabled = false)
    public void AmazonLogoClickTest(){
        sleepFor(2);
        clickOnAmazonLogo();
        sleepFor(3);
}
@Test(enabled = true)
public void AmazonSideBarClickOnValidity(){
    sleepFor(2);
        clickOnAmazonHomePageSideBar();
        sleepFor(3);
}
}
