package PageObjects;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDo_iOS extends TestBase{

    CreateTaskPage createTaskPage;
    TasksListPage taskListPage;

    @DataProvider(name = "task data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONData(System.getProperty("user.dir")+"/data/TasksData.json", "Task Data", 2);
    }


    @Test(dataProvider =  "task data")
    public void test_add_task(String taskName, String taskNote) throws MalformedURLException {
        iOS_setUp("1001", "iPhone 12 mini","15.5","874A00E6-047D-4AF7-A778-0941CC877BD7","8200");
        taskListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskNote(taskNote);
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
    @Test(dataProvider =  "task data")
    public void test_add_task2(String taskName, String taskNote) throws MalformedURLException {
        iOS_setUp("1000", "iPhone 12","15.5","59017C6F-D964-4C96-9F15-CB0BD9C559A7","8100");
        taskListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskNote(taskNote);
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
}
