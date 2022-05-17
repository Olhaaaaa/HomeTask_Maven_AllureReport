package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import java.time.Duration;

@RunWith(DataDrivenTestRunner.class)
public class AddToCartTest extends BaseTest {

    @Test
    @DataLoader(filePaths = "testCSVData.csv", loaderType = LoaderType.CSV)
    public void checkTotalPriceInCart(@Param(name = "searchKeyword") String searchKeyword,
                                      @Param(name = "brandKeyword") String brandKeyword,
                                      @Param(name = "totalPrice") String totalPrice) throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.waitVisibilityOfElement(Duration.ofSeconds(30), homePage.getSearchByKeyword());
        homePage.searchByKeyword(searchKeyword);
        homePage.clickSearchButton();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.searchByBrand(brandKeyword);
        searchResultsPage.clickOnBrandButton();
        searchResultsPage.clickOnFilterButton();
        searchResultsPage.clickOnExpensiveFilterButton();
        searchResultsPage.clickOnProductButton();
        ProductPage productPage = new ProductPage();
        productPage.clickOnAddToCartButton();
        productPage.checkPopUp();
        productPage.waitForPageLoadComplete(Duration.ofSeconds(30));
        Assert.assertFalse(totalPrice, productPage.getTotalPriceText());
    }
}