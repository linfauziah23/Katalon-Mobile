Feature: Notification

  Background: User want to login using correct credential
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'studentqa2@binar.id'
    And User input value of password with 'studentQA2'
    And User click button of Masuk on Login page
    And User will redirect to Akun page

  @positive_case @NTB6001
  Scenario: Buyer Click button notification
    When Buyer tap button notification in navbar
    Then The system displays a notification page

  @positive_case @NTB6002
  Scenario: User get notification after buyer add product
    When Buyer tap button notification in navbar
    Then Buyer gets notification Berhasil Diterbitkan

  @positive_case @NTB6003
  Scenario: Buyer get notification after buyer send negotiation product to seller
    When Buyer tap button notification in navbar
    Then Buyer gets notification Ditawar

  @positive_case @NTB6004
  Scenario: Buyer get notification after seller rejected negotiation
    When Buyer tap button notification in navbar
    Then Buyer gets notification Ditolak

  @positive_case @NTB6005
  Scenario: Buyer get notification after the seller confirms the transaction has been completed
    When Buyer tap button notification in navbar
    Then Buyer gets notification Berhasil ditawar
