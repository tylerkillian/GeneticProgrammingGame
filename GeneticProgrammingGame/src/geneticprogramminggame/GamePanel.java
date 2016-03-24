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
public class GamePanel {
    GameController controller;
    
    public GamePanel() {
        
    }
    
    public void AddListener(GameController controller) {
        this.controller = controller;
    }
    
}
