package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import PageObjects.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.zh_cn.但是;

import java.net.MalformedURLException;

public class CreateNewTask extends TestBase {

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;
    @Given("Click Add new Task")
    public void clickAddNewTask() throws MalformedURLException {
        Android_setup();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();

    }

    @Given("Enter TaskName")
    public void enterTaskName() {
        createTaskPage.enterTaskName("Task 1");
    }

    @Given("Enter TaskNote")
    public void enterTaskNote() {
        createTaskPage.enterTaskNote("This is the task 1");
    }

    @Given("Click Save")
    public void clickSave() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }

}
