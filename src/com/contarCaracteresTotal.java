
package com;


public class contarCaracteresTotal extends Atributos{
    
    
    
    public int contarCaracteresTotal(String cadena) {
        int ascii = 0;
        for (int x = 0; x < cadena.length(); x++) {
            char car = cadena.charAt(x);

            ascii = car;
            letras[ascii] = car;

            numC++;

            if (car != ' ') {
                numCaracteresSinBlancos++;
            }
        }
        return ascii;

    }
}
