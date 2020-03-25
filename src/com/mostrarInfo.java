
package com;


public class mostrarInfo extends Atributos{
    
    contarCaracteresTotal cc1 = new contarCaracteresTotal();
    
    static public void textoCaracteresTotal(int total) {
        System.out.println("Se han introducido un total de " + numC + " caracteres(contando los espacion en blancos).");
        System.out.println("Se han introducido un total de " + numCaracteresSinBlancos + " caracteres(sin contar los espacion en blancos).");

        

    }
    
    static public void textoNumeroPalabras(int total) {
        System.out.println("Se han ingresado " + palabras + " palabras.");
        
    }
    
       static  public void textoTodosCaracteres(int[] total) {
        System.out.println("Las letras que se repiten son:");
        for (int i = 0; i < letras.length; i++) { //Recorro el array y muestro todo.
            if (contador[i] > 0 && letras[i] != ' ') {
                if (contador[i] == 1) {
                    System.out.println("" + letras[i] + "-->" + contador[i] + " vez.");
                } else {
                    System.out.println("" + letras[i] + "-->" + contador[i] + " veces.");
                }
            }
        }

      
    }
}
