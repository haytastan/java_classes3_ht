package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 3.10.2022
 **/

public class DortIslem {

  public double Topla(double sayi1, double sayi2){
    return sayi1 + sayi2;
  }
  public double Cikar(double sayi1, double sayi2){
    return sayi1 - sayi2;
  }
  public double Carp(double sayi1, double sayi2){
    return sayi1 * sayi2;
  }
  public double Bol(double sayi1, double sayi2){
    if (sayi2 != 0) {
      return sayi1 / sayi2;
    } else {
      System.out.println("Sıfıra Bölme Yapılamaz");
      return 0;
    }
  }

}
