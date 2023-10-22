Feature: Login Page Aplikasi Saucedemo

  @Regression @Positive
  Scenario: Success Login
    Given Halaman login saucedemo
    When Input username
    And Input password
    And click login button
    And User click add to cart
    And User view card page
    And User checkout
#    Then user in dashboard page

#  @Regression @Negative
#  Scenario: Failed Login
#    Given Halaman login saucedemo
#    When Input username
#    And Input Invalid password
#    And click login button
#    Then User get error message