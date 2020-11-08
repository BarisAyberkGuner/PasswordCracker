package com.bayberkguner.passcracker;

import java.util.ArrayList;

public class AddToPasswordList {
    private ArrayList<String> passwordList = new ArrayList<String>(); //

    public AddToPasswordList() {
        for (int i = 9; i > 0; i--) {
            Switch aSwitch = new Switch(i);
            if (aSwitch.getPassword() != null) {
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
