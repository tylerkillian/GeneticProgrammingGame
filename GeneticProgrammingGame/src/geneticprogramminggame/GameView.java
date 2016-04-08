/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author tylerkillian
 */
public class GameView extends JFrame {

    ButtonGroup editChoices;
    JRadioButton editDraw, editErase;
    GameController controller;
    GamePanel gamePanel;
    
    public GameView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        gamePanel = new GamePanel();
        panel.add(gamePanel);

        editChoices = new ButtonGroup();
        editDraw = new JRadioButton("Draw", true);
        editChoices.add(editDraw);
        panel.add(editDraw);
        editErase = new JRadioButton("Erase", false);
        editChoices.add(editErase);
        add(editErase);
        
        pack();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
    
    public void AddListener(GameController controller) {
        this.controller = controller;
        this.gamePanel.AddListener(controller);
    }
}
