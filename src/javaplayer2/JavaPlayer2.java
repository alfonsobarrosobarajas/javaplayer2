/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplayer2;

import java.awt.EventQueue;

/**
 *
 * @author alfonso
 */
public class JavaPlayer2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        
        Player p = new Player();
        
        p.setLocationRelativeTo(null);
        
        p.setVisible(true);
        
      }
    });

  }
  
}
