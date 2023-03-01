/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.convertidortemperatura;

/**
 *
 * @author Luis Fernando
 */
public class ConvertidorTemperatura {

    int PUNTO_CONGELACION;
    int FACTOR_CONVERSION;
    int fahrenhei;
    int celsius;

    public void convertidor() {
        final double PUNTO_CONGELACION = 32.0;
        final double FACTOR_CONVERSION = 5.0 / 9.0;
        double fahrenhei = 50;
        double celsius;
        celsius = FACTOR_CONVERSION * (fahrenhei - PUNTO_CONGELACION);
        System.out.println(fahrenhei + " grados fahrenhei= "
                + celsius + " grados celsius.");
    }

    public static void main(String[] args) {
        ConvertidorTemperatura Temperatura = new ConvertidorTemperatura();
        Temperatura.convertidor();
    }
}
