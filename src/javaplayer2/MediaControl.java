/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplayer2;

import estructuras.Iterador;
import estructuras.Lista;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author alfonso
 */
public class MediaControl extends Thread {

  private Player player;
  private Lista lista;

  public MediaControl(Lista lista) {
    this.lista = lista;
  }

  public void ejecutar() throws FileNotFoundException, JavaLayerException {

    Iterador it = new Iterador(lista);

    while (it.haySiguiente()) {

      FileInputStream fis
              = new FileInputStream(it.nodo().getNombreArchivo());

      BufferedInputStream bis
              = new BufferedInputStream(fis);

      player = new Player(bis);
      player.play();
    }

  }

  @Override
  public void run() {

    try {
      ejecutar();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MediaControl.class.getName()).log(Level.SEVERE, null, ex);
    } catch (JavaLayerException ex) {
      Logger.getLogger(MediaControl.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

}
