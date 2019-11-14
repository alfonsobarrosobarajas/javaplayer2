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
public class Iterador {
  
  // Todos son de la clase Nodo
  private Nodo inicio;
  private Nodo nvoNodo;
  private Nodo aux;

  public Iterador(Lista lista) {
    
    inicio = lista.getNodo();
    agregarAlInicio();
    
  }
  
  private void agregarAlInicio(){
    
    nvoNodo = new Nodo();
    aux = inicio;
    inicio = nvoNodo;
    
    nvoNodo.setSiguiente(aux);
    
  }
  
  // Método para revisar si existen más nodos
  public boolean haySiguiente(){

    return (inicio = inicio.getSiguiente()) != null;
    
  }
  
  public Nodo nodo(){
    return inicio;
  }
  
}














