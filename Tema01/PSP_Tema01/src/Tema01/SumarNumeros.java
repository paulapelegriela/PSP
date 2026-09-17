/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema01;

/**
 *
 * @author paula
 */
public class SumarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int res;
        res = sumar_numeros(3,5);
        System.out.println(res);
    }
    
    //Funcion para sumar dos numeros
    static int sumar_numeros (int a, int b){
        int c = a+b;
        return c;
    }
}
