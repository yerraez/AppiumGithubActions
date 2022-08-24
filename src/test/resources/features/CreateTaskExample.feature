Feature: Create new Task
  Scenario Outline: The user can add new task
    Given Click Add a new Task
    Given Enter "<TaskName>" and "<TaskNote>"
    Then Task add successfully

  Examples:

    | TaskName  | TaskNote         |
    | Example 1 | Example 1 Detail |
    |Example 2  | Example 2 Detail |