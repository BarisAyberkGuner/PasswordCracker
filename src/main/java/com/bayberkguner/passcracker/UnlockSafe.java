package com.bayberkguner.passcracker;

import java.util.ArrayList;

public class UnlockSafe {
    //Kasa şifresi tek bir tane sayı olabileceği için bu sayıyı final olarak tanımladım.
    private final String safePassword = "6210001000";
    private Integer lockTime = 0;



    public Boolean unlockSafe(ArrayList<String> passwordList) {

        for(String password : passwordList) {
            //PasswordList içindeki tüm şifreleri, kasa şifresiyle eşit olup olmadığını kontrol ediyoruz.
            if(safePassword.equals(password)) {
                return Boolean.TRUE;
            } else {
                //Şifre denemesi yanlış ise kasa kendini 30 saniye koruma moduna alıyor.
                lockTime += 30;
                System.out.println("Şifre eşleştirilemedi. Kasa 30 saniye korumadadır.");
            }
        }
        //Eğer şifrelerin hepsi yanlış ise kasa açılmadığına dair bilgi dönmesi için false döndürüyoruz.
        return Boolean.FALSE;
    }
    public Integer getLockTime() {
        return lockTime;
    }
}
