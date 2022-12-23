Feature: Homepage

  Background: User want to login using correct credential
  Given User open Second Hand apps
  When User go to menu Akun
  And User click button of Masuk
  And User input value of email with 'studentqa2@binar.id'
  And User input value of password with 'studentQA2'
  And User click button of Masuk on Login page
  And User will redirect to Akun page
  
  @positive_case @HMP3001
  Scenario: User can search product
    Given User launch the app
    When User tap beranda
    When User tap on search bar
    And User Input produk name with "mobil"
    Then User can view list of product named mobil

  @positive_case @HMP3002
  Scenario: User want redirect to beranda after tap back button on search bar
    Given User launch the app
    When User tap beranda
    And User tap on search bar
    And User tap back button
    Then User redirect to beranda

  @positive_case @HMP3003
  Scenario: User want to clear text on search bar
    Given User launch the app
    When User tap beranda
    And User tap on search bar
    And User input text with "Sony"
    And User tap X button
    Then input text on search bar will be empty

  @positive_case @HMP3004
  Scenario: User want to check element list of category
    Given User launch the app
    When User tap beranda
    And User tap category elektronik
    And User tap category komputer dan aksesoris
    And User tap category semua

  @positive_case @HMP3005
  Scenario: User want to check element button tambah produk
    Given User launch the app
    When User tap beranda
    And User tap tambah produk button
    Then User will directed to tambah produk page
