/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciosbasicos.java;



/**
  @author Javier 
 */

public class EjerciosBasicosJava {
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        if(finDeSemana){
        return true;
        }
        if(numBellotas >=40 && numBellotas <=60){
            return true;
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.print(ejercicios.fiestaArdillas(30, false));
        System.out.print(ejercicios.fiestaArdillas(50, true));
        System.out.print(ejercicios.fiestaArdillas(70, true));
        
    }
    
}
