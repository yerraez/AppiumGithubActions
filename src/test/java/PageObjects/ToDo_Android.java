package PageObjects;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{

    CreateTaskPage createTaskPage;
    TasksListPage taskListPage;

    @DataProvider(name = "task data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONData(System.getProperty("user.dir")+"/data/TasksData.json", "Task Data", 2);
    }

    @Test(dataProvider = "task data")
    public void test_add_task(String taskName, String taskNote) throws MalformedURLException {
        Android_setup();
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
