/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author tylerkillian
 */
public class GamePanel extends JPanel {
    GameController controller;
    boolean editable = true;
    
    public GamePanel() {
        
    }
    
    public void AddListener(GameController controller) {
        this.controller = controller;
    }
    
    public void paint(Graphics g)
    {
                Dimension screenSize = getSize();
        controller.paintView(screenSize, g);

    }
    
}
