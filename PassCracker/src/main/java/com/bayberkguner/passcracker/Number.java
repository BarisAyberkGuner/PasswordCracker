package com.bayberkguner.passcracker;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Number {
    private Integer[] digits;

    public Number(Integer i) {
        this.digits = new Integer[10];
        Arrays.fill(digits,0,10, 0);
        this.digits[0] = i;
    }

    public Integer getTotal() {
        Integer total = 0;
        for(Integer i : digits) {
            total += i;
        }
        return total;
    }

    public Integer[] getDigits() {
        return digits;
    }

    @Override
    public String toString() {
        return Arrays.stream(digits).map(String::valueOf).collect(Collectors.joining());
    }
}
