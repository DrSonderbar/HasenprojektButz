/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finnischeshasenprojekt;

import static finnischeshasenprojekt.FinnischesHasenprojekt.Speicher;
import static finnischeshasenprojekt.FinnischesHasenprojekt.feld;

/**
 *
 * @author leon.methner
 */
public class HasenMoven { private static void moveHasen() {

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                Speicher[i][j] = feld[i][j];
            }
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("H")) {
                    feld[i][j] = ".";
                    feld[i][j + 1] = "H";
                }
            }
        }
    }
    
}
