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

    final int numXPixels = 40;
    final int numYPixels = 30;
    int[] pixelValues = new int[numXPixels * numYPixels];
    int startIdx = -1, finishIdx = -1;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        this.view.AddListener(this);

        for (int xIdx = 0; xIdx < numXPixels; xIdx++) {
            for (int yIdx = 0; yIdx < numYPixels; yIdx++) {
                pixelValues[yIdx * numXPixels + xIdx] = 0; //(xIdx + (yIdx % 2)) % 2;
            }
        }
        pixelValues[(numYPixels - 1) * numXPixels] = 2;
        startIdx = (numYPixels - 1) * numXPixels;
        pixelValues[(numYPixels - 1) * numXPixels + 1] = 3;
        finishIdx = (numYPixels - 1) * numXPixels + 1;
    }

    public void paintView(Dimension screenSize, Graphics g) {
        double xSize = screenSize.getWidth() / (double) numXPixels;
        double ySize = screenSize.getHeight() / (double) numYPixels;
        for (int xIdx = 0; xIdx < numXPixels; xIdx++) {
            for (int yIdx = 0; yIdx < numYPixels; yIdx++) {
                int onOrOff = pixelValues[yIdx * numXPixels + xIdx];

                int x1 = (int) ((double) xIdx * xSize);
                int y1 = (int) ((double) yIdx * ySize);

                int x2 = (int) ((double) (xIdx + 1) * xSize);
                int y2 = (int) ((double) (yIdx + 1) * ySize);

                if (onOrOff == 0) { // Blank pixel
                    g.setColor(Color.BLACK);
                } else if (onOrOff == 1) { // Filled-in pixel
                    g.setColor(Color.GRAY);
                } else if (onOrOff == 2) { // Starting point
                    g.setColor(Color.BLUE);
                } else { // Ending point
                    g.setColor(Color.RED);
                }
                g.fillRect(x1, y1, x2 - x1, y2 - y1);
            }
        }

    }

    public void gamePanelClicked(int clickX, int clickY, int panelWidth, int panelHeight) {
        int pixelWidth = panelWidth / numXPixels;
        int pixelHeight = panelHeight / numYPixels;
        int xIdx = clickX / pixelWidth;
        int yIdx = clickY / pixelHeight;

        if (view.editDraw.isSelected()) {
            if (((yIdx * numXPixels + xIdx) != startIdx) && ((yIdx * numXPixels + xIdx) != finishIdx)) {
                pixelValues[yIdx * numXPixels + xIdx] = 1;
            }
        } else if (view.editErase.isSelected()) {// Erase
            if (((yIdx * numXPixels + xIdx) != startIdx) && ((yIdx * numXPixels + xIdx) != finishIdx)) {
                pixelValues[yIdx * numXPixels + xIdx] = 0; //(pixelValues[yIdx * numXPixels + xIdx] + 1) % 2;
            }
        } else if (view.editStart.isSelected()) {// Place start
            if ((pixelValues[yIdx * numXPixels + xIdx] != 1) && (pixelValues[yIdx * numXPixels + xIdx] != 3)) {
                pixelValues[startIdx] = 0;
                pixelValues[yIdx * numXPixels + xIdx] = 2;
                startIdx = yIdx * numXPixels + xIdx;
            }
        } else if ((pixelValues[yIdx * numXPixels + xIdx] != 1) && (pixelValues[yIdx * numXPixels + xIdx] != 2)) { // Place finish
            pixelValues[finishIdx] = 0;
            pixelValues[yIdx * numXPixels + xIdx] = 3;
            finishIdx = yIdx * numXPixels + xIdx;
        }
        view.repaint();
    }

}
