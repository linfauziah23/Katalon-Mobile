Feature: Transaction_History

  Background: User want to login using correct credential
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'studentqa2@binar.id'
    And User input value of password with 'studentQA2'
    And User click button of Masuk on Login page
    And User will redirect to Akun page

  @positive_case @TH1001
  Scenario: Buyer Click button Transaksi
    When Buyer tap button Transaksi in navbar
    Then The system displays a Transaksi page

  @positive_case @TH1002
  Scenario: Buyers can see the history of successful transactions
    When Buyer tap button Transaksi in navbar
    Then The system displays the history of transactions that have been completed
    
  @positive_case @TH1003
  Scenario: Buyers can view the history of canceled transactions
    When Buyer tap button Transaksi in navbar
    Then The system displays transaction history that was rejected by the seller