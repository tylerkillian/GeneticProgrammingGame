/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author tylerkillian
 */
public class GeneticProgrammingGame {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("MAIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new GameView());

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
                GameModel model = new GameModel();
                GameView view = new GameView();
                GameController controller = new GameController(model, view);
                //controller.updateView();
            }
        });

    }

}



