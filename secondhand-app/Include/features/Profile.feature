Feature: Profile

	Background: User want to login using correct credential
	  Given User open Second Hand apps
	  When User go to menu Akun
	  And User click button of Masuk
	  And User input value of email with 'linfauziah23@gmail.com'
	  And User input value of password with 'Bandung3210'
	  And User click button of Masuk on Login page
	  And User will redirect to Akun page

  @Positive_case @PRF4001
  Scenario: User can edit profile
    And User tap pen button
    And User tap nama
    And User input nama "Lin F"
    And User tap simpan
    And User tap nomor hp
    And User input nomor Hp "0812345678910"
    And User tap simpan
    And User tap kota
    And User input kota "Bekasi"
    And User tap simpan
    Then User success edit profile