package com.bayberkguner.passcracker;

public class Switch {
    private String password;


    public Switch(Integer i) {
        //Number classına i değerini yolluyoruz o class da bize ilk harfi i olan sayı oluşturuyor.
        Number number = new Number(i);
        ValueChecker value;
        Integer digitSwitch = i;
        //Bu döngü şu şekilde çalışıyor ilk sayımız 6 ise 6 sayısının kaç tane kullanıldığını belirten sayıyı 1 arttırıyor. Sonra switchi en son arttırılan sayıya eşitliyor.
        while (number.getTotal() < 10) {
            number.getDigits()[digitSwitch]++;
            digitSwitch = number.getDigits()[digitSwitch];
        }
        //Eğerki basamakların toplamı 10 olmuşsa oluşturmak istediğimiz sayıyı kontrol etmek için ValueChecker'a gönderiyoruz.
        if (number.getTotal() == 10) {
            value = new ValueChecker(number);

            //getCouldBePassword bize true dönerse numarayı stringe dönüştürüp password değişkenine atıyoruz.
            if (value.getCouldBePassword()) {
                password = number.toString();
            }
        }

    }

    public String getPassword() {
        return password;
    }

}


