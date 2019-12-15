package com.Leandro.srl;

public class FooCorp {

    private Integer horaBase;
    private double horaExtra;
    private Integer basePorHora;
    private String nombre;

    public FooCorp() {

    }

    public FooCorp(int horaBase, int basePorHora, String nombre) {
        this.basePorHora = basePorHora;
        this.horaBase = horaBase;
        this.nombre = nombre;
    }

    public int getHoraBase() {
        this.horaBase = horaBase;
        return horaBase;
    }

    public void setHoraBase(int horaBase) {
        this.horaBase = horaBase;
    }

    public int getBasePorHora() {
        this.basePorHora = basePorHora;
        return basePorHora;
    }

    public void setBasePorHora(int basePorHora) {
        this.basePorHora = basePorHora;
    }

    public String getNombre() {
        this.nombre = nombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int pago(int horaBase, int basePorHora) {
        int sueldo;
        sueldo = horaBase * basePorHora;
        return sueldo;
    }

    public String toString() {
        return "FooCorp{" +
                "horaBase=" + this.horaBase +
                ", basePorHora=" + this.basePorHora +
                ", nombre='" + this.nombre + '\'' +
                '}';
    }
}
