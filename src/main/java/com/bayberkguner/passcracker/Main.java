package com.bayberkguner.passcracker;

public class Main {
    public static void main(String[] args) {
        AddToPasswordList addToPasswordList = new AddToPasswordList();
        System.out.println(addToPasswordList.toString());

        UnlockSafe unlockSafe = new UnlockSafe();
        Boolean isSuccess = unlockSafe.unlockSafe(addToPasswordList.getPasswordList());
        if(isSuccess)
            System.out.println("Şifre eşleştirildi. Çözülene kadar geçen süre: " + unlockSafe.getLockTime()+" saniye");
        else
            System.out.println("Tüm oluşturulan şifreler başarısız.");

    }
}