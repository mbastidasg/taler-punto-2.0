/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionlibros;

/**
 *
 * @author ESTUDIANTE
 */
public class Libros {
    private String Titulo;
    private String autor;
    private int numPags;
    private int calificacion;

    public Libros(String Titulo, String autor, int numPags, int calificacion) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.numPags = numPags;
        if (calificacion < 10){
        this.calificacion = calificacion;
        }
        }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
}
