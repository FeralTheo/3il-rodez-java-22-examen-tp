package src;

import java.util.ArrayList;
import java.util.List;

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
	
	public void afficherDetailListe() {
		for (int i = 0; i < listDeTaches.size();i++) {
			listDeTaches.get(i).afficherTache();
		}
	}
}
