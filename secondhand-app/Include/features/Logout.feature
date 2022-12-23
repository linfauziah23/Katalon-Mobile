Feature: Logout

  Background: User want to login using correct credential
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'studentqa2@binar.id'
    And User input value of password with 'studentQA2'
    And User click button of Masuk on Login page
    And User will redirect to Akun page

  @positive_case @LGT2001
  Scenario: User want to log out
    And User click button Keluar
    Then User successfully logout
