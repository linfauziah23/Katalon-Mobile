Feature: My Order

  Background: User want to login using correct credential
    Given User open Second Hand apps
    When User go to menu Akun

  @positive_case @MO1001
  Scenario: Buyer want to see my order after login
    And User click button of Masuk
    And User input value of email with 'qurates2@yopmail.com'
    And User input value of password with 'qwertyuiop'
    And User click button of Masuk on Login page
    And User will redirect to Akun page
    And Buyer tap on menu Pesanan Saya
    Then Buyer will redirect to Pesanan Saya page

  @positive_case @MO1002
  Scenario: Buyer want to see the order status when the negotiation is not completed yet
    And Buyer tap on menu Pesanan Saya
    Then Buyer will see the order status Menunggu

  @positive_case @MO1003
  Scenario: Buyer want to see status order after the negotiation rejected by seller
    And Buyer tap on menu Pesanan Saya
    Then Buyer will will see the order status Dibatalkan