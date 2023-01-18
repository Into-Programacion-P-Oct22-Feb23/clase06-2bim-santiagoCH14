/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    public static String obtenerEmpresa() {
        // método que permita preguntar al usuario el nombre de la empresa

        // método que permita preguntar al usuario la dirección de la empresa
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de la empresa");
        String nombreTrabajo = entrada.nextLine();
        return nombreTrabajo;

    }

    public static String obtenerDireccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese direccion de la empresa");
        String direccionTrabajo = entrada.nextLine();

        return direccionTrabajo;
    }
}
