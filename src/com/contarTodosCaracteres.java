
package com;


public class contarTodosCaracteres extends Atributos{
    
    
     public int[] contarTodosCaracteres(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char car = cadena.charAt(x);
            int ascii = car;
            contador[ascii]++;

        }
        return contador;
    }
}
