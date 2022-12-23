Feature: Login

  @positive_case @LGN1001
  Scenario: User want to login using correct credential
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'studentqa2@binar.id'
    And User input value of password with 'studentQA2'
    And User click button of Masuk on Login page
    And User will redirect to Akun page
    Then User will see that application close

  @negative_case @LGN1002
  Scenario: User want to login using incorrect credential (e-mail is not registered)
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'studentqa9@binar.id'
    And User input value of password with 'studentQA9'
    And User click button of Masuk on Login page
    Then User stay in Login Page

  @negative_case @LGN1003
  Scenario: User want to login using incorrect credential (wrong password)
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'studentqa2@binar.id'
    And User input value of password with '123456'
    And User click button of Masuk on Login page
    Then User stay in Login Page

  @negative_case @LGN1004
  Scenario: User want to login but doesn't fill email and password
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User click button of Masuk on Login page
    Then User will see warning text to fill column
