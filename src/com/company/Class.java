package com.company;

public class Class {
    private int nomer;
    private String soz;
    private int[] massiv;

    public Class(int nomer, String soz, int[] massiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.massiv = massiv;
    }


    public void butun() {
        if (nomer % 2 == 0) {
            System.out.println("Nomer: " + nomer);
        } else {
            System.out.println("Nomer: Бутун сан бериниз");
        }
    }

    public void all() {
        for (int i = 0; i < massiv.length; i++) {
            System.out.println("Word: " + soz + "\nMassiv: " + massiv[i]);
        }
    }
}
