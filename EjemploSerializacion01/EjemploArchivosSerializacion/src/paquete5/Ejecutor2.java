/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor2 {

    public static void main(String[] args) {

 // nombre del archivo
        String nombreArchivo = "data/hospitales.data";
        String nombreBus = "IESS";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerBusNombre(nombreBus);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.establecerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(profesor_buscar);
        }else{
            System.out.println("Profesor no encontrado");
        }
        
    }
}
