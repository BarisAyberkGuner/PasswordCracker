package com.bayberkguner.passcracker;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValueChecker {
    private Number number;

    public ValueChecker(Number number) {
        this.number = number;
    }

    public Boolean getCouldBePassword() {
        Integer digitControl = 0;
        String checker = "0123456789";

        Map<String, Long> counts = number.toString().chars().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(char c : checker.toCharArray()) {
            if(counts.get(String.valueOf(c)) == null)
                continue;
            if(counts.get(String.valueOf(c)) == number.getDigits()[Character.getNumericValue(c)].longValue())
                digitControl += number.getDigits()[Character.getNumericValue(c)];
            else
                return false;
        }

        return digitControl == 10;
    }

}