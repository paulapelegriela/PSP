/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaUsandoUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author paula
 */
public class Servidor {
    public static void main(String[] args) {
        final int PUERTO = 5003;
        byte[] buffer = new byte[1024];
        
        try {
            System.out.println("Servidor UDP iniciado");
            //Creacion del socket
            DatagramSocket socketUDP = new DatagramSocket(PUERTO);
            
            while (true){
                //Preparamos la respuesta
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                
                //Recibimos el datagrama
                socketUDP.receive(peticion);
                System.out.println("Recibido la info del cliente");
                
                //Convertimos lo recibido y mostramos el mensaje
                String mensaje = new String(peticion.getData());
                System.out.println(mensaje);
                
                //Obtenemos el puerto y la dirección de origen (si no quiere responder no es necesario)
                int puertoCliente = peticion.getPort();
                InetAddress direccion = peticion.getAddress();
                
                mensaje = "Hola mundo! Desde el servidor jeje";
                buffer = mensaje.getBytes(); //transformamos el string en bytes
                
                //creamos el datagrama
                DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, PUERTO);
                
                //enviamos la informacion
                System.out.println("Envio la info al cliente!");
                socketUDP.send(respuesta);
                
            }
        } catch (Exception e) {
            
        }
    }
}
