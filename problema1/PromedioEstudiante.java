/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class PromedioEstudiante {

    private String nombreEstudiante;
    private double calificacionNota1;
    private double calificacionNota2;
    private double calificacionNota3;
    private double promedio;

    public PromedioEstudiante() {
        nombreEstudiante = "Andres";
        calificacionNota1 = 7.5;
        calificacionNota2 = 8.7;
        calificacionNota3 = 5;
    }

    public PromedioEstudiante(String nom, double n1, double n2, double n3) {
        nombreEstudiante = nom;
        calificacionNota1 = n1;
        calificacionNota2 = n2;
        calificacionNota3 = n3;
    }

    public void establecerNombreEstudiante(String e) {
        nombreEstudiante = e;
    }

    public void establecerCalificacionNota1(double e) {
        calificacionNota1 = e;
    }

    public void establecerCalificacionNota2(double e) {
        calificacionNota2 = e;
    }

    public void establecerCalificacionNota3(double e) {
        calificacionNota3 = e;
    }

    // public void establecerPromedio(){
    public void calcularPromedio() {
        promedio = (calificacionNota1 + calificacionNota2 + calificacionNota3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionNota1() {
        return calificacionNota1;
    }

    public double obtenerCalificacionNota2() {
        return calificacionNota2;
    }

    public double obtenerCalificacionNota3() {
        return calificacionNota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Promedio de tres notas de un estudiante\n"
                + "Nombre del Estudiante: %s\n"
                + "Nota1: %.2f\n"
                + "Nota2: %.2f\n"
                + "Nota3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionNota1(),
                obtenerCalificacionNota2(),
                obtenerCalificacionNota3(),
                obtenerPromedio());
        return cadena;
    }

}
