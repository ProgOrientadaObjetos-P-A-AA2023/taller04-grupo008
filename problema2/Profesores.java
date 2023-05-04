/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Profesores {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double suma;
    private double sueldoTotal;
    
    public Profesores() {
        nombre = "Maria";
        apellido = "Lozano";
        cedula = "5563482962";
        sueldoBasico = 300.50;
    }
    
    public Profesores(String nom, String ape, String ced, double basico) {
        nombre = nom;
        apellido = ape;
        cedula = ced;
        sueldoBasico = basico;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerApellido(String n) {
        apellido = n;
    }
    
    public void establecerCedula(String n) {
        cedula = n;
    }
    
    public void establecerSueloBasico(double n) {
        sueldoBasico = n;
    }
    
    // public void establecerSueldoTotal(){
    public void calcularSumaSueldo() {
        suma = sueldoBasico * 0.20;
    }
    // public void establecerSumaSueldo(){
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + suma;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSumaSueldo() {
        return suma;
    }
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Sueldo total de un profesor\n"
                + "Nombre del Profesor: %s\n"
                + "Apellido: %s\n"
                + "CI: %s\n"
                + "Sueldo basico: %.2f\n"
                + "El sueldo basico y el 20 porciento es de: %.2f\n"
                + "Sueldo total incluido el 20 porciento: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSumaSueldo(),
                obtenerSueldoTotal());
        return cadena;
    }
}
  
