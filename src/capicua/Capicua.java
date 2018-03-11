/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author David Antonio Quijano Ramos
 */
public class Capicua {

    static Set<Integer> posicion = new HashSet();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ingreso = "";

        System.out.println("Escribe los caracteres : ");
        Scanner entrada = new Scanner(System.in);
        ingreso = entrada.nextLine();
        
        ingreso = afinarpalabra(ingreso);

        if (comparadorCapicua(ingreso)) {
            System.out.println("Es un capicua");

        } else {
            System.out.println("No es capicua");
        }

        
    }

    public static boolean comparadorCapicua(String ingreso) {
   
        for (int i = 0, j = ingreso.length() - 1; i < ingreso.length(); i++, j--) {
            int fin = ingreso.charAt(j);
            int inicio = ingreso.charAt(i);
            if (inicio != fin) {
                return false;
            }
        }
        return true;
    }

    public static String afinarpalabra(String ingreso) {
        return ingreso.replaceAll("\\s+", "").toLowerCase();
    }

}
