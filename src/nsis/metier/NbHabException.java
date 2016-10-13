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

public class NbHabException extends Exception {
	  private int errNb;

	  public NbHabException(int errNb) {

	    this.errNb = errNb;

	  }

	  @Override
	  public String toString() {

	    return new String(" nombre erroné d’habitants : " + errNb);

	  }
}
