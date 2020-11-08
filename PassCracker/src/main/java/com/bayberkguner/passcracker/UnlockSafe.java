package com.bayberkguner.passcracker;

import java.util.ArrayList;

public class UnlockSafe {
    private final String safePassword = "6210001000";
    private Integer lockTime = 0;



    public Boolean unlockSafe(ArrayList<String> passwordList) {

        for(String password : passwordList) {
            if(safePassword.equals(password)) {
                return Boolean.TRUE;
            } else {
                lockTime += 30;
                System.out.println("Şifre eşleştirilemedi. Kasa 30 saniye korumadadır.");
            }
        }
        return Boolean.FALSE;
    }
    public Integer getLockTime() {
        return lockTime;
    }
}
