
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Frame {
     public static JFrame frame;
    private static final int zustand = 0;
    public static JButton z = new JButton("Neue Runde"); 
    public static JButton btn = new JButton("Rechts");
   
    private static final JLabel runde = new JLabel("Aktuelle Runde: " + zustand);
    private static int hasenalive;
    public static boolean allDead = false;
    private static String[][] play;
    
    
    
}
