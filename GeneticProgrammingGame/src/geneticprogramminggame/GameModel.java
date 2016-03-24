/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogramminggame;

/**
 *
 * @author tylerkillian
 */
public class GameModel {

    int numXPixels = 80;
    int numYPixels = 60;
    int[] pixelValues;

    public GameModel() {
        pixelValues = new int[numXPixels*numYPixels];
        for (int xIdx = 0; xIdx < numXPixels; xIdx++) {
            for (int yIdx = 0; yIdx < numYPixels; yIdx++) {
                pixelValues[xIdx*numYPixels + yIdx] = 0;
            }
        }
    }
}
