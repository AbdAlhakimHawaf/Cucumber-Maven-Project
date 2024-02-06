Feature: User Registration

  Scenario: Verify that user can register using valid data
    Given User is in home page
    When he click on signup login button
    And enters his name
    And enters his email
    And clicks on signup button
    Then user is redirected to signup page

  @FullRegister
  Scenario: Verify that user can  full register using valid data
    Given User is in home page
    When he click on signup login button
    And enters his name
    And enters his email
    And clicks on signup button
    When user is redirected to signup page
      And choose gender male
      And enters his password
      And choose date month year of birth
      And enters his first name
      And enters his last name
      And enters his address
      And choose his country
      And enters his state
      And enters his city
      And enters his zipcode
      And enters his mobile number
      And click on create account
      Then user is redirected to Automation Exercise - Account Created page



