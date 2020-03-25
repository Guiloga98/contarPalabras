package com;

import java.util.Scanner;

public class InicioApp {

   

    public static void main(String[] args) {
        contarCaracteresTotal cc = new contarCaracteresTotal();
        contarPalabras cp = new contarPalabras();
        contarTodosCaracteres ct = new contarTodosCaracteres();
        mostrarInfo mi = new mostrarInfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un conjunto de caracteres:");
        String cadena = scan.nextLine();

        
        mi.textoCaracteresTotal(cc.contarCaracteresTotal(cadena));
        mi.textoNumeroPalabras(cp.contarNumeroPalabras(cadena));
        mi.textoTodosCaracteres(ct.contarTodosCaracteres(cadena));

    }

}
