package org.ulpgc.example;

import java.io.Serializable;
import java.util.Date;

public class Coche implements Serializable {
    public int ruedas;
    public String marca;

    public int fabricacion;

    public Coche(int ruedas, String marca, int fabricacion) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.fabricacion = fabricacion;
    }
}
