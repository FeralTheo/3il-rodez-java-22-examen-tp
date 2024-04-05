package src;

import java.util.Date;

public class Tache {
	String titre;
	String description;
	Date dateEcheance;
	Priorite priorite;
	
	public Tache(String titre, String description, Date dateEcheance) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateEcheance = dateEcheance;
	}
	public String getTitre() {
		return titre;
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