/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria;

/**
 *
 * @author paula
 */
public class EjemploProceso {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            Process proceso = pb.start();
            System.out.println("Proceso lanzado");
            //Espera hasta que el proceso termine
            
            //Opcion 1 --> waitFor:
            //int codigo = proceso.waitFor(); 
            //System.out.println("Codigo del proceso: " + codigo);
            
            //Opcion 2 --> handle (más actualizado y con más opciones):
            ProcessHandle handle = proceso.toHandle();
            Thread.sleep(5000);
            System.out.println("PID: " + handle.pid()); //*PID --> identificador del proceso para el SSOO
            System.out.println("¿Vivo?: " + handle.isAlive());
            proceso.destroy(); //terminar el proceso
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
