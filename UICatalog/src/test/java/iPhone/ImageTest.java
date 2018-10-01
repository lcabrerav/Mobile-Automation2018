package iPhone;

import ImgesPage.Images;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ImageTest extends Base {
    public Images images(){
        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
        uiCatalog.getImages();
        return PageFactory.initElements(ad,Images.class);
    }
    @Test
    public void imageDurationFuctionTest(){
        images().imageDurationFunction();
    }
}
