package iPhone;

import ControlsPage.Controls;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends Base {
    Controls controls;
    @BeforeMethod
    public void navigate() throws InterruptedException{
         UiCatalog ui = PageFactory.initElements(ad,UiCatalog.class);
         ui.getControls();
        controls = PageFactory.initElements(ad,Controls.class);
    }
    @Test
    public void standarSwithTet(){
       controls.setStandardSwitch();
    }
    @Test
    public void standarSliderTest(){
        controls.setStandarSlider();
    }
    @Test
    public void costumizedSliderTest(){
        controls.setCustomizedSlider();
    }
}
