/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import javax.swing.*;

/**
 *
 * @author tylerkillian
 */
public class GeneticProgrammingGame {
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("MAIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel label = new JLabel("Genetic Programming");
        frame.getContentPane().add(label);
 
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
    
}
