@Login
  Feature: Login
    @valid-login
    Scenario: Login using valid email and password
      Given user in login page
      And user input email with "tezdna@gmail.com"
      And user input password with "Password123!"
      When user click Masuk button
      Then user on Beranda page

      @invalid-login
      Scenario: Login using invalid email and password
        Given user in login page
        And user input email with "tezdna@gmail.com"
        And user input password with "invalidpasss"
        When user click Masuk button
        Then error message appear

