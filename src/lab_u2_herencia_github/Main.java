/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author damur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Tesis tesis1 = new Tesis(
             1,
             "Inteligencia Artificial y Seguridad",
             "María Rojas",
             "Universidad Internacional San Isidro Labrador",
             2024
        );

        Audiolibro audio1 = new Audiolibro(
             2,
             "Java para Principiantes",
             "Carlos¨Trejos",
             120
        );

        tesis1.mostrarInfo();

        System.out.println();

        audio1.mostrarInfo();

        System.out.println();

        tesis1.prestar();

        tesis1.prestar();

        System.out.println();

        tesis1.devolver();
        // TODO code application logic here
    }
    
}
