/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ps_roundrobin;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author paula
 */

class Proceso {
    String nombre;
    int tiempoCreacion, tiempoCPU, tiempoRestante, tiempoFinalizacion;

    public Proceso(String nombre, int tiempoCreacion, int tiempoCPU) {
        this.nombre = nombre;
        this.tiempoCreacion = tiempoCreacion;
        this.tiempoCPU = tiempoCPU;
        this.tiempoRestante = tiempoCPU;
    }
}
public class PS_RoundRobin {

    public static void main(String[] args) {
        
        int quantum = 2;
        Proceso A = new Proceso ("A", 2, 2);
        Proceso B = new Proceso ("B", 0, 8);
        Proceso C = new Proceso ("C", 3, 6);
        Proceso D = new Proceso ("D", 4, 4);
        
        //Lista de procesos
        Proceso[] procesos = {A, B, C, D};
        
        Queue<Proceso> cola = new LinkedList<>();
        
        int tiempoActual = 0;
        int procesosTerminados = 0;
        
        System.out.println("EMPIEZA ROUND ROBIN");
        System.out.println();
        
        while(procesosTerminados < procesos.length){
            //Añadir a la cola los procesos que han sido creados 
            for (Proceso p : procesos){ //esto significa --> por cada proceso que hay en la lista de procesos
                if (p.tiempoCreacion <= tiempoActual && p.tiempoRestante > 0 && !cola.contains(p)){
                    cola.add(p);
                }
            }
            //Si no hay procesos disponibles, avanzamos en el tiempo
            if (cola.isEmpty()){
                tiempoActual++;
                continue;
            }
            //Sacamos el primer proceso de la cola
            Proceso proceso = cola.poll();
            //Calcular el tiempo de ejecucion (maximo tiempo quantum, minimo tiempo 1)
            int tiempoEjecutado = Math.min(quantum, proceso.tiempoRestante);
            int inicio = tiempoActual;
            //-= es una forma de acortar el tiempo restante - el ejecutado.
            
            
            //Ejecucion
            proceso.tiempoRestante -= tiempoEjecutado;
            tiempoActual += tiempoEjecutado; //Avanzar hacia la derecha
            
            //Mostrar intervalo
            System.out.println("t = " + inicio + " -> " + " t = " + (tiempoActual - 1)+ " : " + proceso.nombre );
            //Comprobar si ha terminado
            if (proceso.tiempoRestante == 0){
                proceso.tiempoFinalizacion = (tiempoActual-1);
                procesosTerminados++;
                System.out.println("El proceso " + proceso.nombre + " ha finalizado en el t = " + proceso.tiempoFinalizacion);
            }else if (proceso.tiempoRestante > 0){
                cola.add(proceso);
            }
            System.out.println("RESULTADO FINAL:");
            //Mostramos información por cada resultado + mostrar E, F y P
            
        }
    }
}
