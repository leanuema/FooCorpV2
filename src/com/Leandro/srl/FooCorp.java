package com.Leandro.srl;

public class FooCorp {

    Integer horaBase;
    double horaExtra;
    Integer basePorHora;
    String nombre;

    public FooCorp() {

    }

    public FooCorp(int horaBase, int basePorHora, String nombre) {
        this.basePorHora = basePorHora;
        this.horaBase = horaBase;
        this.nombre = nombre;
    }

    public int getHoraBase() {
        return horaBase;
    }

    public void setHoraBase(int horaBase) {
        if (horaBase <= 40) {
            this.horaBase = horaBase;
        } else {
            horaExtra = (horaBase * 1.5) + basePorHora;
            System.out.println(horaExtra);
        }
    }

    public int getBasePorHora() {
        return basePorHora;
    }

    public void setBasePorHora(int basePorHora) {
        this.basePorHora = basePorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FooCorp{" +
                "horaBase=" + this.horaBase +
                ", basePorHora=" + this.basePorHora +
                ", nombre='" + this.nombre + '\'' +
                '}';
    }
}
