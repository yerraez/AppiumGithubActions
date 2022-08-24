package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

public class TasksListPage extends PageBase {
    public TasksListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidBy(xpath = "//android.widget.ImageView[contains@resource-id='fab']")
            //driver.findElement(By.xpath("//android.widget.AutoCompleteTextView[contains(@resource-id, 'search_src_text')]")).click();
    @iOSXCUITFindBy(accessibility = "plus.circle")
    MobileElement addTaskBtn;

    public void clickAddTaskBtn(){
        click(addTaskBtn);
    }
}
