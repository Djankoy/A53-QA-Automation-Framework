import pages.LoginPage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends BaseTest{

    @Test
    public void addSongToPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);

        loginPage.provideEmail("dmitry.lobachev@testpro.io");
        loginPage.providePassword("Chebyreki5!");
        loginPage.clickSubmit();

        searchPage.findSearchBar("Dark Days");
        searchPage.clickViewAllButton();
        searchPage.clickFirstSong();
        searchPage.clickableToButton();
        searchPage.clickAddToPlaylist();

        Assert.assertTrue(searchPage.findSuccessAlertMsg().isDisplayed());

    }
}