package fr.eni.ecole.encheres.bo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;



 
/**
 * Classe en charge de
 * @author lregeard2022
 * @date 10 janv. 2023 11:42:19
 * @version ENI-Encheres - v0.1
 */

public class ArticleVendu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEnchere;
	private LocalDate dateFinEnchere;
	private int miseAPrix;
	private int prixVente;
	private boolean etatVente;
	private Categorie categorie; 
	private Utilisateur utilisateur;
	


	
	// *****CONSTRUCTEUR PAR DEFAUT*****//

	public ArticleVendu() {
		super();
	}

	// *****CONSTRUCTEUR*****//
	
	

	/**
	 * constructeur
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEnchere
	 * @param dateFinEnchere
	 * @param miseAPrix
	 * @param prixVente
	 * @param etatVente
	 */
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEnchere,
			LocalDate dateFinEnchere, int miseAPrix, int prixVente, boolean etatVente, int noCategorie) {
		super();
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEnchere(dateDebutEnchere);
		this.setDateFinEnchere(dateFinEnchere);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
		this.setEtatVente(etatVente);
		this.setCategorie(categorie);
		
		
	}

	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEnchere,
			LocalDate dateFinEnchere, int miseAPrix, int prixVente, boolean etatVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchere = dateDebutEnchere;
		this.dateFinEnchere = dateFinEnchere;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEnchere,
			LocalDate dateFinEnchere, int miseAPrix, int prixVente, boolean etatVente, Categorie categorie,
			Utilisateur utilisateur) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchere = dateDebutEnchere;
		this.dateFinEnchere = dateFinEnchere;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.categorie = categorie;
		this.utilisateur = utilisateur;
	}

	// ******GETTERS******//

	

	public int getNoArticle() {
		return noArticle;
	}

	/**
	* Getter pour utilisateur.
	 * @return the utilisateur
	
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Setter pour utilisateur.
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDateDebutEnchere() {
		return dateDebutEnchere;
	}

	public LocalDate getDateFinEnchere() {
		return dateFinEnchere;
	}

	public int getMiseAPrix() {
		return miseAPrix;
	}

	public int getPrixVente() {
		return prixVente;
	}

	public boolean isEtatVente() {
		return etatVente;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}

	
	// ******SETTERS******//

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDateDebutEnchere(LocalDate dateDebutEnchere) {
		this.dateDebutEnchere = dateDebutEnchere;
	}

	public void setDateFinEnchere(LocalDate dateFinEnchere) {
		this.dateFinEnchere = dateFinEnchere;
	}

	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public void setEtatVente(boolean etatVente) {
		this.etatVente = etatVente;
	}
	
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVenduBo [noArticle=");
		builder.append(noArticle);
		builder.append(", nomArticle=");
		builder.append(nomArticle);
		builder.append(", description=");
		builder.append(description);
		builder.append(", dateDebutEnchere=");
		builder.append(dateDebutEnchere);
		builder.append(", dateFinEnchere=");
		builder.append(dateFinEnchere);
		builder.append(", miseAPrix=");
		builder.append(miseAPrix);
		builder.append(", prixVente=");
		builder.append(prixVente);
		builder.append(", etatVente=");
		builder.append(etatVente);
		builder.append(", noCategorie=");
		builder.append(categorie);
		builder.append("]");
		return builder.toString();
	}

	
	
}
