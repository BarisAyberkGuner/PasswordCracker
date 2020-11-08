package com.bayberkguner.passcracker;

import java.util.ArrayList;

public class AddToPasswordList {
    private ArrayList<String> passwordList = new ArrayList<String>(); //
    //Şifre oluşturmaya başladığımız class
    public AddToPasswordList() {
        for (int i = 9; i > 0; i--) {
            //İlk basamağı belirleyip switch constructerına parametre olarak yolluyoruz.
            Switch aSwitch = new Switch(i);
            if (aSwitch.getPassword() != null) {
            //Dönen sonuç null değer değilse listeye ekliyoruz.
                System.out.println("Password added = " + aSwitch.getPassword());
                passwordList.add(aSwitch.getPassword());
            }
        }
    }

    public ArrayList<String> getPasswordList() {
        return passwordList;
    }

    @Override
    public String toString() {
        return "{" +
                "Password List = " + passwordList +
                '}';
    }
}
