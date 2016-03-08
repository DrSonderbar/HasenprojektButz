  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasevsfüchse;
import frameapi .*;

/**
 *
 * @author lukas.mandelkow
 */
public class HASENSPIEL {
    
    public static String[][] feld = new String[14][14];
    public static String[][] hasen = new String[14][14];
    public static String[][] Speicher = new String[14][14];
    
    public static void main(String[] args) {
        
        setFelder();
        
        FrameAPI.initFrame();
        FrameAPI.initString(feld.length, feld);
        FrameAPI.setPlayground();
        
        do{
            if (FrameAPI.newRound) {
                
                moveHasen();
                moveFüchse();
                FrameAPI.initString(feld.length, feld);
                FrameAPI.setPlayground();
            }
        
        }while (!FrameAPI.allDead);
    
        
    }
    
    private static void setFelder() {
        for (String[] feld1 : feld) {
            for (int j = 0; j < feld.length; j++) {
                feld1 [j] = ".";
                
                
            }
            
        }
        feld[2][3] = "H";
        feld[2][5] = "H";
        feld[2][7] = "H";
        feld[3][4] = "H";
        feld[3][6] = "H";
        feld[3][2] = "H";
        feld[4][3] = "H";
        feld[4][5] = "H";
        feld[4][7] = "H";
        feld[5][2] = "H";
        feld[5][4] = "H";
        feld[5][6] = "H";
        feld[10][3] = "F";
        feld[10][5] = "F";
        feld[10][7] = "F";
        feld[11][4] = "F";
        feld[11][6] = "F";
    }
    
    private static void moveHasen() {
        
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++)
            Speicher[i][j] = feld[i][j];
            }
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++ ) {
                if (Speicher[i][j].equals("H")) {
                    feld[i][j] = ".";
                    feld[i][j + 1] = "H";
                }
            }
        }
    }

    private static void moveFüchse() {
    
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("F")) {
                    feld[i][j] = ".";
                    feld[i][j - 1] = "F";
                }
            }
        }
}