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
public class Nodo {
 
  private String nombreArchivo;
  private Nodo siguiente;

  public Nodo() {
  }

  public Nodo(String nombreArchivo, Nodo siguiente) {
    this.nombreArchivo = nombreArchivo;
    this.siguiente = siguiente;
  }

  public String getNombreArchivo() {
    return nombreArchivo;
  }

  public void setNombreArchivo(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo;
  }

  public Nodo getSiguiente() {
    return siguiente;
  }

  public void setSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
  }
  
}
