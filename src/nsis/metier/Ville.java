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

package nsis.metier;

public class Ville {
	 // les attributs de la ville
	 private int nbHabitants;
	 private String nomVille;

	 // constructeurs de la classe Ville
	 public Ville(String v){
	     nomVille = v;
	     nbHabitants = 0;
	 }

	 
	 public Ville(String v, int k) throws NbHabException {
	     nomVille = v;
	     setNbHabitants(k);
	 }


	 public final void setNbHabitants(int unEntier) throws NbHabException {

	  if (unEntier <= 0) {
	     throw new NbHabException(unEntier);
	  }

	  nbHabitants = unEntier;

	 }
	 
	 @Override
	public String toString() {
		return "Ville = "+ nomVille +" possède "+nbHabitants+" habitants";
	}
}
