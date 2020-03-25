/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


public class Atributos {
    
    
   static protected int[] contador;
    static protected char[] letras;
    static protected int palabras;
    static protected int numC = 0;
   static protected int numCaracteresSinBlancos = 0;

    
    public Atributos(){
        contador = new int[65536];
        letras = new char[65536];
        palabras = 1;
    }
    /**
     * getContador
     * @return contador
     */
    public int[] getContador() {
        return contador;
    }
    
    /**
     * setContador
     * @param contador , modifica el contador
     */
    
    public void setContador(int[] contador) {
        this.contador = contador;
    }

    /**
     * getLetras
     * @return letras
     */
    public char[] getLetras() {
        return letras;
    }

    /**
     * setLetras
     * @param letras , modifica letras
     */
    public void setLetras(char[] letras) {
        this.letras = letras;
    }

   /**
    * getPalabras
    * @return palabras
    */
    public int getPalabras() {
        return palabras;
    }

    /**
     * setPalabras
     * @param palabras , modifica palabras
     */
    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    /**
     * getNumC
     * @return numC
     */
    public int getNumC() {
        return numC;
    }

    /**
     * setNumC
     * @param numC , modifica numC
     */
    public void setNumC(int numC) {
        this.numC = numC;
    }

   /**
    * getNumCaracteresSinBlancos
    * @return numCaracteresSinBlancos
    */
    public int getNumCaracteresSinBlancos() {
        return numCaracteresSinBlancos;
    }

    /**
     * setNumCaracteresSinBlancos
     * @param numCaracteresSinBlancos , modifica numCaracteresSinBlancos
     */
    public void setNumCaracteresSinBlancos(int numCaracteresSinBlancos) {
        this.numCaracteresSinBlancos = numCaracteresSinBlancos;
    }
    
}
