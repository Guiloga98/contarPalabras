
package com;


public class contarPalabras extends Atributos {
    /**
     * Este metodo cuenta el número de palabras que hay
     * @param cadena
     * @return car2 (palabras)
     */
    public int contarNumeroPalabras(String cadena) {
        char car2 = ' ';
        for (int x = 0; x < cadena.length(); x++) {
            char car = cadena.charAt(x);

            if (car == ' ' && car2 != ' ') {
                palabras++;

            }

            car2 = car;
        }
        return car2;
    }
}
