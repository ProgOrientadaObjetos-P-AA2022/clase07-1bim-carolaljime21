/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String n, int numCam, double p){
        nombre = n;
        numeroCamas = numCam;
        presupuesto = p;     
    }
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerNumeroCamas(int numCam){
        numeroCamas = numCam;
    }
    
    public void establecerPresupuesto(double p){
        presupuesto = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}