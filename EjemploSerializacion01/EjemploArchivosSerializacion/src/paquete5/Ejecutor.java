/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/hospitales.data";
        
        Hospital hos1 = new Hospital("Isidro Ayora", 
                150, 7000);
        
        Hospital hos2 = new Hospital("IESS", 
                210, 2900);
        
        Hospital hos3 = new Hospital("San Agustin", 
                120, 3000);
        
        Hospital[] listaHospitales = {hos1,hos2,hos3};
        
        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospitales(hos1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospitales(hos2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospitales(hos3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
}
