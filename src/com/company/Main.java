package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Со сканером
        System.out.println("Напишите\n1: Четное число (Nomer)\n2: Слово (Word)\n3: Число в массиве (Massiv)");
        Class bir = new Class(sc.nextInt(), sc.next(), new int[]{sc.nextInt()});
        bir.butun();
        bir.all();
        // Без сканнера снизу
        // Class eki = new Class(6,"Well Done", new int[]{99});
        // eki.butun();
        // eki.all();
    }
}

