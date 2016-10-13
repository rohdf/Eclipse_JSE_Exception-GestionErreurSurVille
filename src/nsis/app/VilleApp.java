/**
 * Auteur Rohdri FRIMAT
 * Date 08/09/2016
 * 
 *  Créer un projet Java et ajouter les classes Ville et 
 * NbHabException de l'exemple N°2
 * 	Compléter le code pour qu'il soit possible de saisir en 
 * ligne de commande le nom et le nombre d'habitants (positif ou 
 * négatif) d'une ville. Utiliser la classe Scanner pour lire des 
 * entrées clavier :
 * 
 * 		Scanner sc = new Scanner(System.in);
 */

package nsis.app;

import java.util.Scanner;

import nsis.metier.NbHabException;
import nsis.metier.Ville;

public class VilleApp {

	public static void main(String[] args) {
		 // instanciation à partir d’une saisie
		 String nomSaisi;
		 int nbSaisi;

		 // insérer le code permettant la saisie en ligne de commande du nom et du nombre d'habitants
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Entrez la nom de la ville");
		 nomSaisi = sc.nextLine();
		 System.out.println("Entrez le nombre d'habitant de cett ville");
		 nbSaisi = Integer.parseInt(sc.nextLine());
		 
		 Ville v2;
		 

		 try {
		  v2 = new Ville(nomSaisi, nbSaisi);
		 } catch (NbHabException nEx) {
			 nEx.printStackTrace();
		  v2 = new Ville(nomSaisi);
		 }
		 finally {
			 System.out.println("Fin !!");
			 sc.close();
		}
		 
		 System.out.println(v2);
		 
	}

}
