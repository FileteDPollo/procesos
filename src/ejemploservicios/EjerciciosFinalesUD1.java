/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploservicios;

/**
 *
 * @author dam2
 */

public class EjerciciosFinalesUD1{
    public static void lanzaProgramaEXE(String[] ruta){
            ProcessBuilder pb = new ProcessBuilder(ruta);
            try{
                Process p = pb.start();
            }catch(Exception e){
                System.out.println("Fallo");
            }
    
    
    }
    
    public static void main(String[] args){
        int numLanzoPrograma = (int) Math.floor(Math.random()*10);
         for (int i = 0; i <=numLanzoPrograma; i++){
             int n1 = (int) Math.floor(Math.random()*5+1);
             int n2 = (int) Math.floor(Math.random()*5+1);
             int n3 = (int) Math.floor(Math.random()*5+1);

            String num1 = String.valueOf(n1);
        }
    }
}
