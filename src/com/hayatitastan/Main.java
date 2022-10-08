package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on $DATE
 **/
public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        double a = 10;
        double b = 5;
        double toplamaSonucu = dortIslem.Topla(a,b);
        double cikarmaSonucu = dortIslem.Cikar(a,b);
        double carpmaSonucu = dortIslem.Cikar(a,b);
        double bolmeSonucu = dortIslem.Bol(a,b);

        System.out.println(a + " + " + b + " = " + toplamaSonucu);
        System.out.println(a + " - " + b + " = " + cikarmaSonucu);
        System.out.println(a + " x " + b + " = " + carpmaSonucu);
        System.out.println(a + " / " + b + " = " + bolmeSonucu);

    }
}
