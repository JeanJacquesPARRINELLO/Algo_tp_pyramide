/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;
import java.util.Scanner;

public class Algo_tp_pyramide {
    
    public static void main(String[] args) {
    // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int saisieHauteurTab = sc.nextInt();
        
        //  construction de la sortie console en fonction du nombre de lignes saisies
        for(int ligne=1 ; ligne <= saisieHauteurTab ; ligne++){
            
            // boucle pour remplir la ligne avec le nombre d'espace désiré
            for(int espace = 1; espace <= saisieHauteurTab - ligne ; espace++){
                //   on affiche les espaces
                System.out.print(" ");              
            }
            
            //BOUCLE POUR REMPLIR AVEC LE NOMBRE D'ÉTOILE DESIRÉE
            for(int etoile = 1; etoile <= ligne*2 - 1 ; etoile++){
                //   on affiche les étoiles
                System.out.print("*"); 
            }
            // on passe à la ligne
            System.out.print("\n"); 
        }
        
    }
    
    
    
}
