Feature: AddNewAdmin

  Scenario:As a user i want to add new admin
    Given The user open the browser
    And The user enter the username "<username>"
    And The user enter the password "<password>"
    And The user clicks on login button to enter the home page
    And The user clicks on admin button
    And The user clicks on Add button
    And The user select employee role
    And The user select status
    And The user enter employee name
    And The user enter username value
    And The user enter the password value
    And The user renter the password
    And The user clicks on save  button
    And The system prints increased successfully after the new add
    And The user clicks on login button to enter the home page
    Then The user closes the browser

  Scenario: Search with created user and delete it
    Given The user open the browser
    And The user enter the username "<username>"
    And The user enter the password "<password>"
    And The user clicks on login button to enter the home page
    And The user clicks on admin button
    And The user search by username
    And The user clicks on delete button
    And The user confirm the delete action
    And The system should display decreased successfully
    Then The user closes the browser