/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author alfonso
 */
public class Lista {

  private Nodo inicio;
  private int tam; // Numero de nodos enlazados en la lista

  public Lista() {
  }

  public boolean esVacia() {
    return (this.inicio == null);
  }

  public int getTam() {
    return tam;
  }

  public void agregarAlFinal(String nombreArchivo) {

    // Creación de un nuevo Nodo -> nueva referencia en heap
    Nodo nuevo = new Nodo();

    nuevo.setNombreArchivo(nombreArchivo);

    if (esVacia()) {
      inicio = nuevo;
    } else {

      Nodo aux = inicio;

      while (aux.getSiguiente() != null) {

        aux = aux.getSiguiente();

      }

      aux.setSiguiente(nuevo);

    }

    tam++;

  }

  public String getValor(int posicion) throws Exception {

    // Busca que el nodo esté en los límites de la lista
    if (posicion >= 0 && posicion < tam) {

      if (posicion == 0) {
        // Devolver el dato
        return inicio.getNombreArchivo();
      } else {

        Nodo aux = inicio;

        for (int i = 0; i < posicion; i++) {
          aux = aux.getSiguiente();
        }
        return aux.getNombreArchivo();
      }
    } else {

      throw new Exception("No jaló");

    }

  }
  
  // Método para devolver un objeto nodo
  public Nodo getNodo(){
    return inicio;
  }

}
