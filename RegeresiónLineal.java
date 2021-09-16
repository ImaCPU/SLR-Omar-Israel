package slr;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class RegeresiónLineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SLR tabla = new SLR();        
        int n, x = 0, y = 0, b=1;
        boolean p;
        
        
        System.out.print("Cuantos registros va a introducir?\n");
        n= entrada.nextInt();
        tabla.tamaño(n);
        
        for(int i=0;i<=n-1;i++){
            System.out.print("Cual es el valor de X en el registro "+(i+1)+"\n");
            x=entrada.nextInt();
            System.out.print("Cual es el valor de Y en el registro "+(i+1)+"\n");
            y=entrada.nextInt();
            tabla.setVal(x, y);
        }
        tabla.formula();
        
        
        //tabla.formula();
        System.out.print(tabla.getFormula()+"\n");
        while (b==1){
         System.out.print("Que numero quieres predecir? \n");
         n=entrada.nextInt();
         System.out.print(tabla.predicción(n));
         System.out.print("\nquieres seguir prediciendo 1/0 \n");
         b=entrada.nextInt();
        }
    }
    
}
