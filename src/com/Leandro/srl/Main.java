package com.Leandro.srl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FooCorp leandro = new FooCorp(40, 160, "Leandro");
        FooCorp melisa = new FooCorp();

        melisa.setHoraBase(60);
        melisa.setBasePorHora(140);
        melisa.setNombre("Melisa");

        System.out.println(melisa.toString());

    }
}
