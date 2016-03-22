package finnischeshasenprojekt;

import frameapi.*;

import javax.swing.JButton;

public class FinnischesHasenprojekt {

    public static String[][] feld = new String[14][14];
    public static String[][] hasen = new String[14][14];
    public static String[][] Speicher = new String[14][14];

    public static JButton btn = new JButton("hallo");
    private static int x;
    private static int y;

    public static void main(String[] args) {

        setFelder();

        FrameAPI.initFrame();
        FrameAPI.initString(feld.length, feld);
        FrameAPI.setPlayground();

        do {
            if (FrameAPI.newRound) {

                
                moveFüchse();
                FrameAPI.initString(feld.length, feld);
                FrameAPI.setPlayground();
            }

        } while (!FrameAPI.allDead);

        // TODO code application logic here
    }

    private static void setFelder() {
        for (String[] feld1 : feld) {
            for (int j = 0; j < feld.length; j++) {
                feld1[j] = ".";

            }

        }
        feld[12][5] = "H";
        feld[6][4] = "H";
        feld[5][7] = "F";
        feld[11][1] = "H";
        feld[12][8] = "F";
        feld[2][7] = "H";
        feld[6][8] = "H";
        feld[11][3] = "H";
        feld[8][7] = "H";
        feld[3][12] = "F";
        feld[1][4] = "H";
        feld[3][5] = "J";
        feld[7][9] = "u";
        feld[2][2] = "R";
        feld[5][1] = "H";
        feld[3][6] = "H";

    }

    private static void moveFüchse() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                Speicher[i][j] = feld[i][j];
            }
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("H")) {
                    if (Speicher[j].equals(13)) { 
                    feld[i][j] = ".";
                    feld[i][j - 1] = "H";    
                    }else{
                    int Index = j+1;
                    if(Index>13)
                    {
                        Index = 0;
                    }
                    feld[i][j] = ".";
                    feld[i][Index] = "H";
                     
                    
                       
               
              
                 
                }
                }
                    
                            
            }
            
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("u")) {
                    if (Speicher[j].equals(13)) { 
                    feld[i][j] = ".";
                    feld[i][j + 1] = "u";    
                    }else{
                    int Index = j-1;
                    if(Index>13)
                    {
                        Index = 0;
                    }
                    feld[i][j] = ".";
                    feld[i][Index] = "u";
                }
                }
            }

        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("F")) {
                     if (Speicher[j].equals(13)) { 
                    feld[i][j] = ".";
                    feld[i - 1][j + 1] = "F";    
                    }else{
                    int Index = i+1;
                    if(Index>13)
                    {
                        Index = 0;
                    }
                    feld[i][j] = ".";
                    feld[Index][j] = "F";
                }
                }
            }
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("J")) {
                    if (Speicher[j].equals(13)) { 
                    feld[i][j] = ".";
                    feld[i - 1][j] = "J";    
                    }else{
                    int Index = i+1;
                    if(Index>13)
                    {
                        Index = 0;
                    }
                    feld[i][j] = ".";
                    feld[Index][j] = "J";
                }
                }

               
            }
        }
    }
}
