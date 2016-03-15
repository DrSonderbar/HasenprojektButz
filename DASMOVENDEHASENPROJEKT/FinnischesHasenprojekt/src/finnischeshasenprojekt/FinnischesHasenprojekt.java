package finnischeshasenprojekt;

<<<<<<< HEAD
import java.awt.Frame;

=======
import frameapi.*;
>>>>>>> parent of dbe3299... Zufallszahlen
import javax.swing.JButton;

public class FinnischesHasenprojekt {

    public static String[][] feld = new String[14][14];
    public static String[][] hasen = new String[14][14];
    public static String[][] Speicher = new String[14][14];

    public static JButton btn = new JButton("hallo");
<<<<<<< HEAD
    private static int x;
    private static int y;
=======
>>>>>>> parent of dbe3299... Zufallszahlen

    public static void main(String[] args) {

        setFelder();

        Frame.initFrame();
        Frame.initString(feld.length, feld);
        Frame.setPlayground();

        do {
            if (Frame.newRound) {

                moveHasen();
                moveFüchse();
                Frame.initString(feld.length, feld);
                Frame.setPlayground();
            }

        } while (!Frame.allDead);

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
        feld[12][7] = "F";
        feld[2][7] = "H";
        feld[6][8] = "H";
        feld[11][3] = "H";
        feld[8][7] = "H";
        feld[3][12] = "F";
        feld[1][4] = "H";
        feld[3][2] = "J";
        feld[7][9] = "u";
        feld[2][2] = "R";
        feld[5][1] = "H";
        feld[3][1] = "H";
        
    }

    private static void moveHasen() {

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

    private static void moveFüchse() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                Speicher[i][j] = feld[i][j];
            }
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("F")) {
                    feld[i][j] = ".";
                    feld[i][j - 1] = "F";
                }
            }
        }
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("J")) {
                    feld[i][j] = ".";
                    feld[i][j - 1] = "J";
                }
            }
         
        }
          for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (Speicher[i][j].equals("u")) {
                    feld[i][j] = ".";
                    feld[i][j -1 ] = "u";
                }
            }
        }
    }
<<<<<<< HEAD

    private static void moveHasen() {

        for (x = 0; x < 14; x++) {

            for (y = 0; y < 14; y++) {

                feld[x][y] = Speicher[x][y];

            }
        }
        if (feld[x][y] == "H") {
                // double zufallszahl = Math.random();
            //  if(zufallszahl)>

        } else {
        }
        Speicher[x][y] = ".";
        Speicher[x][y] = "H";

=======
    
    private static void Steuerung()
    {
        
        
        
>>>>>>> parent of dbe3299... Zufallszahlen
    }
}
