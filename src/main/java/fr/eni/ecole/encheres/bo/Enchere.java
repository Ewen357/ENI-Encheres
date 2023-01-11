package fr.eni.ecole.encheres.bo;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * Classe en charge de
 * @author lregeard2022
 * @date 10 janv. 2023 11:39:06
 * @version ENI-Encheres - v0.1
 */

public class Enchere implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int noEnchere;
	private LocalDate dateEnchere;
	private int montantEnchere;
	private int noArticle;
	private int noUtilisateur; 
	
	
	public Enchere() {
		super();
	}

	/**
	 * constructeur
	 * @param noEnchere
	 * @param dateEnchere
	 * @param montantEnchere
	 */
	
	public Enchere(int noEnchere, LocalDate dateEnchere, int montantEnchere, int noArticle, int noUtilisateur ) {
		super();
		this.setNoEnchere(noEnchere); 
		this.setDateEnchere(dateEnchere);
		this.setMontantEnchere(montantEnchere);
		this.setNoArticle(noArticle);
		this.setNoUtilisateur(noUtilisateur);
	}

	public int getNoEnchere() {
		return noEnchere;
	}

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}


	public int getNoArticle() {
		return noArticle;
	}
	
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	
	public void setNoEnchere(int noEnchere) {
		this.noEnchere = noEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}



	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnchereBo [noEnchere=");
		builder.append(noEnchere);
		builder.append(", dateEnchere=");
		builder.append(dateEnchere);
		builder.append(", montantEnchere=");
		builder.append(montantEnchere);
		builder.append(", noArticle=");
		builder.append(noArticle);
		builder.append(", noUtilisateur=");
		builder.append(noUtilisateur);
		builder.append("]");
		return builder.toString();
	}



	
}
