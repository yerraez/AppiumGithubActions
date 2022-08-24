Feature: Create new Task

  Scenario: The user can add new task
    Given Click Add new Task
    Given Enter TaskName
    Given Enter TaskNote
    Given Click Save
    Then Task added successfully