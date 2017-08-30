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
    public ConjuntoLibros (int cantidad) {
        this.libro = new Libros[10];
    }
    
    public boolean anadir (String Titulo, String autor, int numPags, int calificacion){
        Libros libro = new Libros (Titulo, autor, numPags, calificacion);
        if(this.cantidad < 10){
         this.libro[this.cantidad] = libro;
         this.cantidad++;
         return true;
      }else 
          return false;
    }
        
    
    
    public boolean eliminar (String Titulo, String autor){
      
        for (int i=0; i<10;i++){
            if (this.libro[i].getTitulo().equals(Titulo) || this.libro[i].getAutor().equals(autor)){
                this.libro= null;
               this.cantidad--;
               return true;
            }  else{
                System.out.println("No se pudo eliminar el libro");
                
                }

}
       return false;
    }
    
    public Libros mostrarMM(String Titulo, int calificacion){
        for (int y=0; y<10; y++){
            if (this.libro[y].getCalificacion()==calificacion){
                int AUX=0;
                 AUX = calificacion;
              if (calificacion >= AUX){
                  AUX = calificacion;
                  
              } else {
                  
              }
                System.out.println("El libro con la calificacion mas alta es:" + this.libro[y]);
                return libro[y];
            }
        }
        for (int y=0; y<10; y++){
            if (this.libro[y].getCalificacion()==calificacion){
                int AUX=0;
                 AUX = calificacion;
              if (calificacion <= AUX){
                  AUX = calificacion;
              } else {
                  
              }
                System.out.println("El libro con la calificacion mas baja es:" + this.libro[y]);
                return libro[y];
            }
        }
    }
    
    public Libros darInformacionLibros(String Titulo){
         Libros libro = null;
         for (int i = 0; i < this.cantidad; i++) {
           if(this.libro[i].getTitulo().equals(Titulo)){
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
