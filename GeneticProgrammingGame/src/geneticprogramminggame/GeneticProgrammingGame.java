/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author tylerkillian
 */
public class GeneticProgrammingGame {
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("MAIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.add(new GameScreen());

        frame.pack();
        //frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
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

class GameScreen extends JPanel {

    public GameScreen() {

        setBorder(BorderFactory.createLineBorder(Color.red));
        
    }
    
    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }
}