/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exotab3_1;

/**
 *
 * @author ZACK
 */
public class ExoTab3_1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
int[][] ventes = new int[4][5];
for (int i=0; i<4; i++)
{
    
    for (int j=0; j<5; j++)
    {
System.out.println("Entrez les ventes du modèle numero ");
System.out.println(i);
System.out.println(" par le vendeur numero ");
System.out.println(j);
System.out.println(": ");
System.out.println(ventes[i][j]);
    }
}

// question 2
for (int i=0; i<4; i++)
{
    int total = 0;
    for (int j=0; j<5; j++){
    total=total+ventes[i][j];
    }
System.out.println("Ventes du modèle " + i + ": ");
System.out.println(total);
}
// question 3
int[] prix = {10000,20000,30000,40000};
for (int ligne=0; ligne<5; ligne++)
{
    int total=0;
    for (int col=0; col<4; col++){
    total=total+(ventes[col][ligne]*prix[col]);
}
System.out.println("Ventes du vendeur " + ligne + ": ");
System.out.println(total + " euros");
}
}
}
    

