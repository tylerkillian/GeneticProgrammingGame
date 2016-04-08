/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author tylerkillian
 */
public class GamePanel extends JPanel {

    GameController controller;
    boolean editable = true;

    public GamePanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controller.gamePanelClicked(e.getX(), e.getY(), getWidth(), getHeight());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                controller.gamePanelClicked(e.getX(), e.getY(), getWidth(), getHeight());
            }
        });
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
