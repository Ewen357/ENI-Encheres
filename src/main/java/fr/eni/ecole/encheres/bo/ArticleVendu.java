package fr.eni.ecole.encheres.bo;

import java.io.Serializable;
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
	private int noCategorie; 
	


	
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
		this.setNoCategorie(noCategorie);
		
		
	}

	// ******GETTERS******//

	public int getNoArticle() {
		return noArticle;
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
	
	public int getNoCategorie() {
		return noCategorie;
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
	
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
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
		builder.append(noCategorie);
		builder.append("]");
		return builder.toString();
	}

	
	
}
