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

        //Burada stringde bir karakterin kaç kere tekrarladığını map içine aldık.
        Map<String, Long> counts = number.toString().chars().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        for(char c : checker.toCharArray()) {
            if(counts.get(String.valueOf(c)) == null)
                continue;
            //Burada map içindeki sayının kaç kere tekrarlandığını o sayının indisteki değeriyle kıyaslıyoruz.
            // Eşit ise digitControlü arttırıyoruz. Hata oluşursa false döndürüyoruz.
            if(counts.get(String.valueOf(c)) == number.getDigits()[Character.getNumericValue(c)].longValue())
                digitControl += number.getDigits()[Character.getNumericValue(c)];
            else
                return false;
        }

        return digitControl == 10;
    }

}