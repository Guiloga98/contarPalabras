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
    
    public int[] getContador() {
        return contador;
    }

    
    public void setContador(int[] contador) {
        this.contador = contador;
    }

    
    public char[] getLetras() {
        return letras;
    }

    
    public void setLetras(char[] letras) {
        this.letras = letras;
    }

   
    public int getPalabras() {
        return palabras;
    }

    
    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    
    public int getNumC() {
        return numC;
    }

    
    public void setNumC(int numC) {
        this.numC = numC;
    }

   
    public int getNumCaracteresSinBlancos() {
        return numCaracteresSinBlancos;
    }

    
    public void setNumCaracteresSinBlancos(int numCaracteresSinBlancos) {
        this.numCaracteresSinBlancos = numCaracteresSinBlancos;
    }
    
}
