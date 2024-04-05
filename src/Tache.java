package src;

import java.util.Date;

public class Tache {
	String titre;
	String description;
	Date dateEcheance;
	Priorite priorite;
	
	/* Information d'une tache
	 * titre (chaine de caractère)
	 * description (chaine de caractère)
	 * priorité (3 états possible)
	 * date d'échéance (date)
	 */

	public String getTitre() {
		return titre;
	}
	public Tache(String titre, String description, Date dateEcheance, Priorite priorite) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
		this.priorite = priorite;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	public void setPriorite(Priorite priorite) {
		this.priorite = priorite;
	}
	
	/*
	 * affichage des informations de la tache
	 */
	public void afficherTache() {
		System.out.println("Nom de la tache : " + this.titre);
		System.out.println("Description : " + this.description);
		System.out.println("La date d'échéance : " + this.dateEcheance);
		switch(priorite) {
		  case BASSE:
			  System.out.println("La priorite est faible");
		    break;
		  case HAUTE:
			  System.out.println("La priorite est elevee");
		    break;
		  case MOYENNE:
			  System.out.println("La priorite est moyenne");
			    break;
		  default:
			  System.out.println("Aucune priorite n'a été donnee");
		}
	}
}