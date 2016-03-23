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
                GameModel model = new GameModel();
                GameView view = new GameView();
                GameController controller = new GameController(model, view);
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
        Dimension screenSize = getSize();
        double xSize = screenSize.getWidth() / (double)numXPixels;
        double ySize = screenSize.getHeight() / (double)numYPixels;
        for (int xIdx = 0; xIdx < numXPixels; xIdx++) {
            for (int yIdx = 0; yIdx < numYPixels; yIdx++) {
                int onOrOff = (xIdx + (yIdx % 2)) % 2;
                
                int x1 = (int)((double)xIdx * xSize);
                int y1 = (int)((double)yIdx * ySize);

                int x2 = (int)((double)(xIdx+1) * xSize);
                int y2 = (int)((double)(yIdx+1) * ySize);
                
                if (onOrOff == 0) {
                    g.setColor(Color.red);
                }
                else {
                    g.setColor(Color.blue);
                }
                g.fillRect(x1, y1, x2-x1, y2-y1);
            }
        }
    }
}
