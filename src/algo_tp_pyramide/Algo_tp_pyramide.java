/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;
import java.util.Scanner;

/**
 *
 * @author padbrain
 */
public class Algo_tp_pyramide {

    // Contient la longueur de la ligne la plus grande
    public static int longueurMax;
    // Contient un tableau de construction de la pyramide
    public static String tabDeConstruction[];
    //  contient la position de l'etoile de la premiere ligne
    public static int posFirstStar;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int saisieHauteurTab = sc.nextInt();
        
     //   Calcul de la llongueur de la plus grande ligne
     longueurMax = saisieHauteurTab*2-1;
        
        // La premiere ligne
        // nombre d'espace de la première ligne
        int nbSpc = (int)longueurMax/2;
        // nombre d'étoile de la première ligne
        int nbStar = 1;
        
        //  construction de la sortie console en fonction du nombre de lignes saisies
        for(int i=1;i <= saisieHauteurTab;i++){
            // boucle pour remplir la ligne avec le nombre d'espace désiré
            for(int j = 1; j <= nbSpc ; j++){
                System.out.print(" ");              
            }
            
            //BOUCLE POUR REMPLIR AVEC LE NOMBRE D'ÉTOILE DESIRÉE
            for(int k = 1; k <= nbStar ; k++){
                //   on affiche les espaces
                System.out.print("*"); 
            }
            // on passe à la ligne
            System.out.print("\n"); 
            //  on enlève un espace en début de ligne
            --nbSpc;
            //  on ajoute deux étoiles sur la ligne
            nbStar = nbStar + 2;

        }
        
    }
    
}
