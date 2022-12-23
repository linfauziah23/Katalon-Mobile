Feature: Buyer Order

  Background: User want to login using correct credential
  Given User open Second Hand apps
  
  @positive_case @using_search @BYO5001
  Scenario: Buyer want to see product details
    Given Buyer on secondhand homepage
    When Buyer tap on search bar
    And Buyer enter name of product with "Sony a 6400"
    And Buyer tap item of product
    Then Buyer will redirected to product page
    
  @negative_case @BYO5002
  Scenario: Buyer make an order without login
    Given Buyer on secondhand homepage
    When Buyer tap on search bar
    And Buyer enter name of product with "Sony a 6400"
    And Buyer tap item of product
    And Buyer tap Saya tertarik dan ingin nego button
    Then Buyer redirected to login page
  
  @positive_case @BYO5003
  Scenario: Buyer make an order after login
	  Given User go to menu Akun
	  When User click button of Masuk
	  And User input value of email with 'qurates1@yopmail.com'
	  And User input value of password with 'qwertyuiop'
	  And User click button of Masuk on Login page
	  And User will redirect to Akun page
	  And Buyer on secondhand homepage
    And Buyer tap on search bar
    And Buyer enter name of product with "mie ayam ceker"
    And Buyer tap item of product
    And Buyer tap Saya tertarik dan ingin nego button
    And Buyer set value '20000' in Harga tawar column
    And Buyer tap Kirim button
    Then Showing notification Harga tawarmu berhasil dikirim ke penjual
    
  @negative_case @BYO5004
  Scenario: Buyer make an order without input price
		Given Buyer on secondhand homepage
    And Buyer tap on search bar
    And Buyer enter name of product with "nasgor telur ceplok"
    And Buyer tap item of product
    And Buyer tap Saya tertarik dan ingin nego button
    And Buyer tap Kirim button
    Then Showing notification Harga tawar tidak boleh kosong
