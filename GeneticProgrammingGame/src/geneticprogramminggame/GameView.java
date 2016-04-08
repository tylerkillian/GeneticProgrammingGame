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
    JButton editDraw, editErase;
    GameController controller;
    GamePanel gamePanel;
    
    public GameView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel = new GamePanel();
        add(gamePanel);

        editChoices = new ButtonGroup();
        editDraw = new JButton();
        editChoices.add(editDraw);
        editErase = new JButton();
        editChoices.add(editErase);
        add(editChoices);
        
        pack();
        //frame.setSize(800, 600);
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
