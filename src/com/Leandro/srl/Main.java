package com.Leandro.srl;

public class Main {
    public static void main(String[] args) {

        FooCorp empleadoUno = new FooCorp(40, 160, "Leandro");
        FooCorp empleadoDos = new FooCorp();

        empleadoDos.setHoraBase(40);
        empleadoDos.setBasePorHora(160);
        empleadoDos.setNombre("Melisa");

        System.out.println(empleadoDos.toString());

        System.out.println("El sueldo del empleado es " + FooCorp.pago(40, 160));

    }
}
