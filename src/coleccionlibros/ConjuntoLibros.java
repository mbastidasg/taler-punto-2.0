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
public class ConjuntoLibros {

    Libros[] libro;
    private int cantidad;

    public ConjuntoLibros(int cantidad) {
        this.cantidad = 0;
        this.libro = new Libros[cantidad];
    }

    public boolean anadir(String Titulo, String autor, int numPags, int calificacion) {
        Libros libro = new Libros(Titulo, autor, numPags, calificacion);
        if (this.cantidad < 10) {
            this.libro[this.cantidad] = libro;
            this.cantidad++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(String Titulo, String autor) {
        int indice = cantidad;
        boolean borro = false;
        for (int i = 0; i < cantidad; i++) {
            if (this.libro[i].getTitulo().equals(Titulo) || this.libro[i].getAutor().equals(autor)) {
                this.libro = null;
                indice = i;
                borro = true;
                break;
            }
        }
        for (int i = indice; i < cantidad-1; i++) {
            this.libro[i] = this.libro[i + 1];
        }
        cantidad--;
        return borro;
    }

    public void mostrarMM() {
        int calificacion = 0, indice = 0;
        for (int y = 0; y < cantidad; y++) {
            if (this.libro[y].getCalificacion() > calificacion) {
                calificacion = this.libro[y].getCalificacion();
                indice = y;
            }
        }
        System.out.println("El libro con la calificacion mas alta es:" + this.libro[indice].getTitulo());

        for (int y = 0; y < cantidad; y++) {
            if (this.libro[y].getCalificacion() < calificacion) {
                calificacion = this.libro[y].getCalificacion();
                indice = y;
            }
        }
        System.out.println("El libro con la calificacion mas baja es:" + this.libro[indice].getTitulo());
    }

    public Libros darInformacionLibros(String Titulo) {
        Libros libro = null;
        for (int i = 0; i < this.cantidad; i++) {
            if (this.libro[i].getTitulo().equals(Titulo)) {
                libro = this.libro[i];
                break;
            }
        }
        return libro;
    }

    public Libros[] getLibro() {
        return libro;
    }

    public void setLibro(Libros[] libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
