/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class AutoMotor {
    private String cedulaPropietario;
    private String marcaVehiculo;
    private int anioFabricacion;
    private int anioAntiguedad;
    private int anioActual;
    private double valorVehiculo;
    private double valorMatricula;
    
    public AutoMotor() {
        cedulaPropietario = "1126596352";
        marcaVehiculo = "Chevrolet";
        anioFabricacion = 2004;
        anioActual = 2023;
        valorVehiculo = 45.000;
        valorMatricula = 1000.00;
    }
    
    public AutoMotor(String cp, String mv, int f, int a, double val, double mat){
        cedulaPropietario = cp;
        marcaVehiculo = mv;
        anioFabricacion = f;
        anioActual = a;
        valorVehiculo = val;
        valorMatricula = mat;
    }
    
    public void establecerCedulaPropietario(String c) {
        cedulaPropietario = c;
    }
    
    public void establecerMarcaVehiculo(String c) {
        marcaVehiculo = c;
    }
    
    public void establecerAnioFabricacion(int c) {
        anioFabricacion = c;
    }
    
    public void establecerAnioActual(int c){
        anioActual = c;
    }
    
    //public void establecerAntiguedad(double c){
    public void calcularAntiguedad(){
        anioAntiguedad = anioActual-anioFabricacion;
    }
    
    //public void establecerValorMatricula(double c){
    public void calcularValorMatricula(){
        valorMatricula = valorVehiculo * 0.002;
        valorMatricula = (valorMatricula* anioAntiguedad);
    }
    
    public void establecerVehiculo(double c){
        valorVehiculo = c;
    }
    
    public String obtenerCedulaPropietario() {
        return cedulaPropietario;
    }
    
    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }
    
    public int obtenerAnioFabricaciono() {
        return anioFabricacion;
    }
    
    public int obtenerAnioActual() {
        return anioActual;
    }
    
    public int obtenerAntiguedad() {
        return  anioAntiguedad;
    }
    
    public double obtenervalorVehiculo() {
        return  valorVehiculo;
    }
    
    public double obtenervalorMatricula() {
        return  valorMatricula;
    }
  @Override
    public String toString() {
        String cadena = String.format("Automotor\n"+
                + "Nombre del Estudiante: %s\n"
                + "Nota1: %.2f\n"
                + "Nota2: %.2f\n"
                + "Nota3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerCedulaPropietario(),
                obtenerMarcaVehiculo(),
                obtenerAnioFabricaciono(),
                obtenerAntiguedad(),
                obtenervalorVehiculo(),
                obtenervalorMatricula());
        return cadena;
    }
}
