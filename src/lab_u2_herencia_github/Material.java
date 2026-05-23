/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author damur
 */
public abstract class Material {
   protected final int id;
    private String titulo;
    private boolean disponible;

    protected static int contadorMateriales = 0;

    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
        contadorMateriales++;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Material prestado correctamente.");
        } else {
            System.out.println("El material ya está prestado.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("Material devuelto correctamente.");
        } else {
            System.out.println("El material ya está disponible.");
        }
    }

    public static int getContadorMateriales() {
        return contadorMateriales;
    }

    public abstract void mostrarInfo(); 
    
}
