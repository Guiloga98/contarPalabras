
package com;


public class contarCaracteresTotal extends Atributos{
    
    
    /**
     * Este metodo cuanta todos los caracteres introducidos y separa entre espacios blancos o no
     * @param cadena
     * @return ascii (numero de caracteres)
     */
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
