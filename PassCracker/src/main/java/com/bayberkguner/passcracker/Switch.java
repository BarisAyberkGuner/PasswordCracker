package com.bayberkguner.passcracker;

public class Switch {
    private String password;


    public Switch(int i) {
        Number number = new Number(i);
        ValueChecker value;
        Integer digitSwitch = i;

        while (number.getTotal() < 10) {
            number.getDigits()[digitSwitch]++;
            digitSwitch = number.getDigits()[digitSwitch];
        }

        if (number.getTotal() == 10) {
            value = new ValueChecker(number);

            if (value.getCouldBePassword()) {
                password = number.toString();
            }
        }

    }

    public String getPassword() {
        return password;
    }

}


