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

    int numXPixels = 80;
    int numYPixels = 60;

    public GameScreen() {
        setBorder(BorderFactory.createLineBorder(Color.red));
    }

    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        Dimension screenSize = getSize();
        int xSize = (int)screenSize.getWidth();
        int ySize = (int)screenSize.getHeight();
        for (int xIdx = 0; xIdx < numXPixels; xIdx++) {
            for (int yIdx = 0; yIdx < numYPixels; yIdx++) {
                int x = xIdx * xSize;
                int y = yIdx * ySize;
                g.fillRect(x, y, xSize, ySize);
            }
        }
    }
}
