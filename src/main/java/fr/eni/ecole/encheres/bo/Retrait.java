package fr.eni.ecole.encheres.bo;

import java.io.Serializable;

/**
 * Classe en charge de
 * @author lregeard2022
 * @date 10 janv. 2023 11:41:13
 * @version ENI-Encheres - v0.1
 */

public class Retrait implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String rue;
	private String ville;
	private String codePostal;
	private int noArticle; 

	public Retrait() {
		super();
	}

	
	/**
	 * constructeur
	 * @param rue
	 * @param ville
	 * @param codePostal
	 */
	public Retrait(String rue, String ville, String codePostal, int noArticle) {
		super();
		this.setRue(rue);
		this.setVille(ville);
		this.setCodePostal(codePostal);
		this.setNoArticle(noArticle);
	}

	public String getRue() {
		return rue;
	}

	public String getVille() {
		return ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public int getNoArticle() {
		return noArticle;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetraitBo [rue=");
		builder.append(rue);
		builder.append(", ville=");
		builder.append(ville);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append(", noArticle=");
		builder.append(noArticle);
		builder.append("]");
		return builder.toString();
	}



	
	
}
