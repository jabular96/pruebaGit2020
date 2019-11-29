/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos.java;

/**
 * @author Javier
 */
public class EjerciciosBasicosJava {

    public int multa(int velocidad, boolean birthday) {
        if (birthday) {
            velocidad -= 5;
        }
        if (velocidad <= 60) {
            return 0;
        }
        if (velocidad > 60 && velocidad <= 80) {
            return 1;
        }
        return 2; //resto de casos
    }
        
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana) {
        if (finDeSemana) {
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60) {
            return true;
        }
        return false;
    }
    public boolean muyVanidoso(int numero){
        if(numero % 11 == 0 || numero % 11 == 1){
            return true;
        }
        return false;
    }
    //4
    public boolean contesta(boolean matinal, boolean madre,boolean dormido){
        if(dormido){
           return false; 
        }
        if(matinal && madre){
            return true;
        }
        if(matinal){
            return false;
        }
        return true;
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        
        
        
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, true));
        System.out.println(ejercicios.fiestaArdillas(70, true));

        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));
        //testeo ej 3
        System.out.println("muyVanidoso (22)"+ ejercicios.muyVanidoso(22));
        System.out.println("muyVanidoso (23)"+ ejercicios.muyVanidoso(23));
        System.out.println("muyVanidoso (24)"+ ejercicios.muyVanidoso(24));
        //ej 4
        System.out.println(ejercicios.contesta(false));
        
    }

}
