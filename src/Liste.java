package src;

import java.util.ArrayList;
import java.util.List;

import java.io.*;

/*
 * Permet de stocker un ensemble de tache pour 
 * en faire une liste
 * 
 */
public class Liste<T> {
	List<Tache> listDeTaches = new ArrayList<Tache>();	
	
	public Liste(List<Tache> listDeTaches) {
		super();
		this.listDeTaches = listDeTaches;
	}

	public void ajouterTache(Tache tache) {
		this.listDeTaches.add(tache);
	}
	
	public void supprimerTache(Tache tache) {
		this.listDeTaches.remove(tache);
	}
	
	/*
	 * Affiche les informations de toutes
	 * les taches contenues dans la liste
	 */
	public void afficherDetailListe() {
		for (int i = 0; i < listDeTaches.size();i++) {
			listDeTaches.get(i).afficherTache();
		}
	}
	/*	TO-DO 
	 * 	Modifier le code pour que les taches soit 
	 *  enregistées dans un fichier texte.
	 * 
	 * 
	 * 
	 */
}

