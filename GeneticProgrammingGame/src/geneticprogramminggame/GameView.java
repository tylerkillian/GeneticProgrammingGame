/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tylerkillian
 */
public class GameView extends JFrame {

    GameController controller;

    public GameView() {
        JFrame frame = new JFrame("MAIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new GameView());

        frame.pack();
        //frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
    
    public void AddListener(GameController controller) {
        this.controller = controller;
    }

    public void paint(Graphics g) {
        Dimension screenSize = getSize();
        controller.paintView(screenSize, g);
     }
}
