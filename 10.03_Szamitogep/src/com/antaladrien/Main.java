package com.antaladrien;

public class Main {

    public static void main(String[] args) {
        Szamitogep sz1 = new Szamitogep();
        Szamitogep sz2 = new Szamitogep(2048, false);

        sz1.kapcsol();

        if (sz1.programMasol(800)) {
            System.out.println("Program másolása sikeres.");
        } else {
            System.out.println("ERROR: Nem tudok programot másolni.");
        }

        if (sz1.programMasol(400)) {
            System.out.println("Program másolása sikeres.");
        } else {
            System.out.println("ERROR: Nem tudok programot másolni.");
        }

        if (sz2.programMasol(1)) {
            System.out.println("Program másolása sikeres.");
        } else {
            System.out.println("ERROR: Nem tudok programot másolni.");
        }

        System.out.println(sz1);
        System.out.println(sz2);
    }
}
