/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author tylerkillian
 */
public class GameController {

    GameModel model;
    GameView view;

    int numXPixels = 40;
    int numYPixels = 30;
    pixelValues

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        this.view.AddListener(this);
    }

    public void paintView(Dimension screenSize, Graphics g) {
        double xSize = screenSize.getWidth() / (double) numXPixels;
        double ySize = screenSize.getHeight() / (double) numYPixels;
        for (int xIdx = 0; xIdx < numXPixels; xIdx++) {
            for (int yIdx = 0; yIdx < numYPixels; yIdx++) {
                int onOrOff = (xIdx + (yIdx % 2)) % 2;

                int x1 = (int) ((double) xIdx * xSize);
                int y1 = (int) ((double) yIdx * ySize);

                int x2 = (int) ((double) (xIdx + 1) * xSize);
                int y2 = (int) ((double) (yIdx + 1) * ySize);

                if (onOrOff == 0) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.GRAY);
                }
                g.fillRect(x1, y1, x2 - x1, y2 - y1);
            }
        }

    }

    public void gamePanelClicked(int clickX, int clickY, int panelWidth, int panelHeight) {
        int pixelWidth = panelWidth / numXPixels;
        int pixelHeight = panelHeight / numYPixels;
        int xPixel = clickX / pixelWidth;
        int yPixel = clickY / pixelHeight;
        System.out.println("Click pixel " + xPixel + " " + yPixel);
    }

}
