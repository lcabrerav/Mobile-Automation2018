package iPhone;

import SearchBarPage.SearchBar;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarTest extends Base {
    SearchBar searchBar;
    @BeforeMethod
    public void search() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getSearchBar();
        searchBar = PageFactory.initElements(ad, SearchBar.class);
    }
    @Test
    public void searchBarMehtod() { searchBar.clickSearch();}
}



