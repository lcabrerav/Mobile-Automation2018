package AlertsPage;

import common.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Alerts extends Base{
    public void showActionSheetSimple(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]");
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getText();
        String Expected ="UIActionSheet <title>";
        Assert.assertEquals(Expected, Actual);
    }
    public void showActionSheetOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]");
    }
    public void showActionSheetCustom(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]");
    }
    public void showAlertSimple(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]");
    }
    public void showAlertOkCancel(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[9]");
    }
    public void showAlertCustom(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[11]");
    }
    public void showSecureTextInput(){
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[13]");
    }
}
