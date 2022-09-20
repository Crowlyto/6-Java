/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia_java_intro;


public class Ejercicio_20 {

   
    public static void main(String[] args) {
        int [][]matriz={{2,7,6},{9,5,1},{4,3,8}};
        int[] vector={0,0,0,0,0,0,0,0};
        boolean log=true;
        int c=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0;i<3;i++){
            c++;
            for (int j=0;j<3;j++){
                vector[c]=vector[c]+matriz[i][j];
                vector[c+3]=vector[c+3]+matriz[j][i];
            }
        }
        for (int i=0;i<3;i++){
            vector[6]=vector[6]+matriz[i][i];
            vector[7]=vector[7]+matriz[i][2-i];
        }
        int k=0;
        do {
            
            if (vector[k]!=vector[k+1]){
                log=false;
            }        
            k++;
            
        }while (k<7&&log==true);
        if (log=true){
            System.out.println("La matriz es Magica");
        }else
            System.out.println("La matriz no es Magica");
    
        }
    
}
