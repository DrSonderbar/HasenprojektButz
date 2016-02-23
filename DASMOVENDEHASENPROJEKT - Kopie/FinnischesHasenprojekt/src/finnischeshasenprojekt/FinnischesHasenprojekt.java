
package finnischeshasenprojekt;
import frameapi.*;
import javax.swing.JButton;

public class FinnischesHasenprojekt {
    
    public static String[][] feld = new String[14][14];
    public static String[][] hasen = new String[14][14];
    public static String[][] Speicher = new String[14][14];

    
    public static JButton btn = new JButton("hallo");
    
    public static void main(String[] args) {
        
       
        
        setFelder();
        
        FrameAPI.initFrame();
        FrameAPI.initString(feld.length, feld);
        FrameAPI.setPlayground();
        
        do {
            if(FrameAPI.newRound){
                
                moveHasen();
                moveFüchse();
                FrameAPI.initString(feld.length, feld);
                FrameAPI.setPlayground();
            }
            
        } while(!FrameAPI.allDead);
        
        
        // TODO code application logic here
    }

    private static void setFelder() {
        for (String[] feld1 : feld) {
            for (int j = 0; j<feld.length; j++) {
                feld1[j] = ".";
                
            }
            
        }   feld[12][5]="H";
            feld[6][4]="H";
            feld[5][7]="F";
            feld[11][1]="H";
            feld[12][7]="F";
            feld[2][7]="H";
            feld[6][8]="H";
            feld[11][3]="H";
            feld[8][7]="H";
            feld[3][12]="F";
            feld[1][4]="H";
            feld[3][2]="H";
    }

        private static void moveHasen() {
        for (int i=0; i<feld.length; i++)
        {
        for (int j=0; j<feld.length; j++)
        {
            Speicher [i][j] = feld [i][j];
        }
        }
        for (int i=0; i<feld.length; i++)
        {   
        for (int j=0; j<feld.length; j++)
        {
            if(Speicher[i][j].equals("H"))
            {
            feld[i][j]= ".";
            feld[i][j+1]="H";                    
            }
        }
        }
    }

        private static void moveFüchse() {
         for (int i=0; i<feld.length; i++)
        {
        for (int j=0; j<feld.length; j++)
        {
            Speicher [i][j] = feld [i][j];
        }
        }
        for (int i=0; i<feld.length; i++)
        {   
        for (int j=0; j<feld.length; j++)
        {
            if(Speicher[i][j].equals("F"))
            {
            feld[i][j]= ".";
            feld[i][j-1]="F";                    
            }
        }
        }
        
    }
}

            
    
            
    
         
        
        