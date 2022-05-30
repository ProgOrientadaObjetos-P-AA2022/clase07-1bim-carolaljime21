    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete5.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Hospital registroHospitales;
    private ArrayList<Hospital> listaHospitales;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaHospitales(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaHospitales().size() > 0) {
                for (int i = 0; i < obtenerListaHospitales().size(); i++) {
                    establecerRegistroHospitales(obtenerListaHospitales().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void establecerRegistroHospitales(Hospital p) {
        registroHospitales = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroHospitales); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaHospitales() {
        LecturaArchivoSecuencial l = 
                new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.obtenerHospitales();
        listaHospitales = l.obtenerHospitales();
    }


    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerListaHospitales() {
        return listaHospitales;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 

}
