/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasevsfüchse;

import java.util.Scanner;

/**
 *
 * @author danny.radecke
 */
public class HasevsFüchse {
    public static void Ausgabe(int Spielfeld[][]){
    for(int i=0; i<40; i++) 
    {        
        for(int t=0; t<Spielfeld.length; t++) 
          {
            
            System.out.print(Spielfeld[i][t] + " ");
          }       
    System.out.println();
    }
    
    
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        {
    int[][] Spielfeld = new int[40][40];
        for(int i=0; i<40; i++) 
    {
            for(int t=0; t<Spielfeld.length; t++) 
    {
            Spielfeld[i][t]=0;
            //System.out.print(Spielfeld[i][t] + " ");
    }
    System.out.println();
}
    Spielfeld[3][5]=1;
    Spielfeld[5][5]=1;
    Spielfeld[36][21]=1;
    Spielfeld[6][16]=1;
    Spielfeld[17][12]=1;
    Spielfeld[38][29]=1;
    Spielfeld[12][8]=1;
    Spielfeld[25][8]=1;
    Spielfeld[14][28]=1;
    Spielfeld[18][35]=1;
    Spielfeld[34][13]=1;
    Spielfeld[9][3]=1;
    Spielfeld[17][39]=1;
    Spielfeld[36][7]=1;
    Spielfeld[27][9]=1;
    Spielfeld[7][9]=1;
    Spielfeld[2][2]=1;
    Spielfeld[28][16]=1;
    Spielfeld[13][13]=2;
    Spielfeld[1][29]=2;
    Spielfeld[9][38]=2;
    Spielfeld[21][21]=2;
    Spielfeld[14][39]=2;
    Spielfeld[39][36]=2;
    System.out.println();
    System.out.println();
    
    Ausgabe (Spielfeld);
   
    boolean finished=false;
    System.out.println("Drücke Enter");
    Scanner sc = new Scanner(System.in);
    String Eingabe = sc.nextLine();
    if(Eingabe.equals(""))
        finished = true;
    while (finished==false)
    {
}
    }
    }
}
    


    

