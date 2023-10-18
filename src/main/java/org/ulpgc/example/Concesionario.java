package org.ulpgc.example;

import java.io.Serializable;

public class Concesionario implements Serializable {
    public String location;
    public Coche coche;
    public String casa;

    public Concesionario(String location, Coche coche, String casa) {
        this.location = location;
        this.coche = coche;
        this.casa = casa;
    }
}
