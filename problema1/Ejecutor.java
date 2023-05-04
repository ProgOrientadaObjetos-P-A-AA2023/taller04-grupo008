/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.PromedioEstudiante;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PromedioEstudiante promedio = new PromedioEstudiante();
        
        promedio.calcularPromedio();
        
        System.out.printf("%s\n", promedio);
        
        PromedioEstudiante promedio2 = new PromedioEstudiante("Carlos", 8, 10, 6.5);
        
        promedio2.calcularPromedio();
        
        System.out.printf("%s\n", promedio2);
       
    }
    
}
