@profil
  Feature: Profil
@foto<=1MB
Scenario: Update logo using image < = 1MB
  Given user sucessesfully login with email "tezdna@gmail.com" password "Password123!"
  And  user on Beranda page
  And user clik Pengaturan menu
  And user click Pengaturan management text
  And user click Ubah button
  And user click Pilih Berkas button
  And user upload file with path "C:\Users\SDI\Downloads\QR Employee - Abrecio (2).png"
  When user click Simpan button
  Then user see confirmation pop up


