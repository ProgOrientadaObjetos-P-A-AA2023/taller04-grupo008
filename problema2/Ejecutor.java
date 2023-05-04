/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Profesores;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Profesores prof = new Profesores();
        
        prof.calcularSumaSueldo();
        prof.calcularSueldoTotal();
        
        System.out.printf("%s\n", prof);
        
        Profesores prof2 = new Profesores("Alejandra", "Pinzon", "1135864220", 450.06);
        
        prof2.calcularSumaSueldo();
        prof2.calcularSueldoTotal();
        
        System.out.printf("%s\n", prof2);
    }
    
}
