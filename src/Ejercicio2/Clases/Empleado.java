/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Clases;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raulpenate
 */
public class Empleado {

    public String nombre;
    public String apellido;
    public String cargo;
    public String area;
    public String nivelJerarjico;

    public Empleado() {
    }

    public void mostrarDatosEmpleado(int contador) {
        ArrayList<Object> lnombre = new ArrayList<>();
        lnombre.add("Ana");
        lnombre.add("Mirna");
        lnombre.add("María");
        lnombre.add("Joseph");
        lnombre.add("Anthony");
        lnombre.add("Roberto");
        lnombre.add("Mike");
        lnombre.add("Bety");
        lnombre.add("Josh");
        lnombre.add("Steven");
        lnombre.add("Mario");
        lnombre.add("Rose");
        lnombre.add("Sun");
        lnombre.add("Rodolfa");
        lnombre.add("Estela");
        lnombre.add("Ramona");
        lnombre.add("Marta");
        lnombre.add("Guadalupe");
        ArrayList<Object> lapellido = new ArrayList<>();
        lapellido.add("Ramírez");
        lapellido.add("Lemuz");
        lapellido.add("Ortíz");
        lapellido.add("Quintana");
        lapellido.add("Funes");
        lapellido.add("Jordan");
        lapellido.add("Ikerson");
        lapellido.add("Nurgagomedov");
        lapellido.add("Romero");
        lapellido.add("Asegonye");
        lapellido.add("Salah");
        lapellido.add("McGregor");
        lapellido.add("Bisping");
        lapellido.add("Rogan");
        lapellido.add("Obama");
        lapellido.add("Dos Anjos");
        lapellido.add("Silva");
        lapellido.add("Peterson");
        //Generador Random
        Random rnd = new Random();
        this.nombre = lnombre.get(rnd.nextInt(lnombre.size())).toString() + " ";
        this.apellido = lapellido.get(rnd.nextInt(lapellido.size())).toString();
        this.cargo = "empleado";
        //Ternary operator POGCHAMP
        this.area = contador == 0 ? "Programación" : "Ventas";
        this.nivelJerarjico = "Operaciones";
        System.out.println("Nombre: " + this.nombre
                + "\nApellido: " + this.apellido
                + "\nCargo: " + this.cargo
                + "\nArea: " + this.area
                + "\nNivel Jerarjico: " + this.nivelJerarjico
                + "\n--------------------------------------------");
    }
}
