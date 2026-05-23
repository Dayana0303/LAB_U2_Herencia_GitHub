/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author damur
 // Clase que representa una tesis universitaria*/
public class Tesis extends Material {
   private String autor;
    private String universidad;
    private int añoPublicacion;

    public Tesis(int id, String titulo, String autor,
                 String universidad, int añoPublicacion) {

        super(id, titulo);

        this.autor = autor;
        this.universidad = universidad;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("----- TESIS -----");
        System.out.println("ID: " + id);
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponible: " + isDisponible());
    }
    
}
