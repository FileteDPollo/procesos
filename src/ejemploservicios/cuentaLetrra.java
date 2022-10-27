/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploservicios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dam2
 */
public class cuentaLetrra {
    
    public static int nLetras (String nomF, char letra){
        ArrayList<String> arrayF = leerFichero(nomF);
        Iterator<String> frase = arrayF.iterator();
        String linea = "hola mundo";
        int total = 0;
        while(frase.hasNext()){
            linea = frase.next();
            for (int i = 0; i<linea.length();i++){
                if(letra == linea.charAt(i)){
                    total++;
                }
            }
        }
        
        return total;
    }
    public static ArrayList<String> leerFichero(String nomF){
        ArrayList<String> arrayF = new ArrayList<>();
        try{
            FileInputStream  f = new FileInputStream(nomF);
            InputStreamReader r = new InputStreamReader(f);
            BufferedReader bf = new BufferedReader(r);
            String linea = "";
            
            while ((linea = bf.readLine ()) != null){
                arrayF.add(linea);
            }            
        }catch(FileNotFoundException e){
            System.out.print("El fichero introducido "+nomF+ " no existe.");
        }catch(IOException e2){
            System.out.println("El fichero "+nomF+" está vacío.");
        }
        return arrayF;
    }
    
    
    public static void main (String[] args){
        String nF = args[0];
        char letra = args[1].charAt(0);
        System.out.println(nLetras(nF,letra));
    }
}
