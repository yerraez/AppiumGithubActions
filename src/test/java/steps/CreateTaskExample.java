package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import PageObjects.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class CreateTaskExample extends TestBase {

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;



    @Given("Click Add a new Task")
    public void clickAddANewTask() throws MalformedURLException {
        Android_setup();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
    }

    @Given("Enter {string} and {string}")
    public void enterAnd(String taskName, String taskNote) {
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskNote(taskNote);
    }

    @Then("Task add successfully")
    public void taskAddSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}
