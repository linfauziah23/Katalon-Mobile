Feature: Add Product

  Background: User want to login using correct credential
    Given User open Second Hand apps
    When User go to menu Akun
    And User click button of Masuk
    And User input value of email with 'almas.testing@gmail.com'
    And User input value of password with '12345678'
    And User click button of Masuk on Login page
    And User will redirect to Akun page

  @positive_case @add_product @SLP8001
  Scenario: Seller want to add new item
    Given Seller on secondhand homepage
    When Seller click the button +
    And Seller fill the value in Nama Produk column with "Baju Anak"
    And Seller fill the value in Harga Produk column with "50000"
    And Seller select the value in Kategori column with "Aksesoris Fashion"
    And Seller fill the value in Lokasi column with "Bandung"
    And Seller fill the value in Deskripsi column with "Tersedia ukuran S, M, L"
    And Seller upload Photo Product
    And Seller click the button Terbitkan
    And New product successfully added
    And Seller click back button
    And Seller click the icon Akun
    And User click button Keluar
    Then User successfully logout

  @negative_case @add_product @SLP8002
  Scenario: Seller want to add new item
    Given Seller on secondhand homepage
    When Seller click the button +
    And Seller click the button Terbitkan
    Then New product unsuccessfully added
    And Seller click back button
    And Seller click the icon Akun
    And Seller click button Keluar
    Then Seller successfully logout

  @positive_case @view_product @SLP8003
  Scenario: Seller want to view item
    Given Seller click the icon Akun
    When Seller click Daftar Jual Saya
    Then Seller products displayed
    And Seller click back button
    And Seller click the icon Akun
    And Seller click button Keluar
    Then Seller successfully logout

  @positive_case @edit_product @SLP8004
  Scenario: Seller want to edit item
    Given Seller click the icon Akun
    When Seller click Daftar Jual Saya
    And Seller select product
    And Seller fill the value in Nama Produk column with "Baju Dewasa"
    And Seller fill the value in Harga Produk column with "150000"
    And Seller fill the value in Lokasi column with "Yogyakarta"
    And Seller fill the value in Deskripsi column with "Tersedia ukuran S, M, L, XL"
    And Seller click the button Perbarui Produk
    Then Saved changes successfully
    And Seller click back button
    And Seller click the icon Akun
    And Seller click button Keluar
    Then Seller successfully logout

  @positive_case @delete_product @SLP8005
  Scenario: Seller want to delete item
    Given Seller click the icon Akun
    When Seller click Daftar Jual Saya
    And Seller click the icon Trash
    And Seller click the button Hapus
    Then Product deleted successfully
    And Seller click back button
    And Seller click the icon Akun
    And Seller click button Keluar
    Then Seller successfully logout
