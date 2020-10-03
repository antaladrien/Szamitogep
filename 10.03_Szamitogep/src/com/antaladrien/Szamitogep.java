package com.antaladrien;

public class Szamitogep {

    double memoria;
    boolean bekapcsolva;

    public Szamitogep(double memoria, boolean bekapcsolva) {
        this.memoria = memoria;
        this.bekapcsolva = bekapcsolva;
    }

    public Szamitogep (){
        this(1024, false);
    }

    public void kapcsol(){
        bekapcsolva = !bekapcsolva;
    }

    public boolean programMasol(double meret){
        if (bekapcsolva && meret <= memoria){
            memoria -=meret;
            return true;
        }
        return false;
    }

    public String toString () {
        return (bekapcsolva?"bekapcsolt ":"kikapcsolt ") + "szamitogep " + memoria + " MB szabad memoriaval";
    }
}
