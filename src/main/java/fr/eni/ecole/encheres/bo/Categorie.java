package fr.eni.ecole.encheres.bo;

import java.io.Serializable;


/**
 * Classe en charge de
 * @author lregeard2022
 * @date 10 janv. 2023 11:38:13
 * @version ENI-Encheres - v0.1
 */
public class Categorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int noCategorie;
	private String libelle;

	
	// *****CONSTRUCTEUR PAR DEFAUT*****//

	public Categorie() {
		super();
	}

	// *****CONSTRUCTEUR*****//

	
	
	/**
	 * constructeur
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie(int noCategorie, String libelle) {
		super();
		this.setNoCategorie(noCategorie);
		this.setLibelle(libelle);
	}

	// ******GETTERS******//

	public int getNoCategorie() {
		return noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}


	// *******SETTERS******//

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategorieBo [noCategorie=");
		builder.append(noCategorie);
		builder.append(", libelle=");
		builder.append(libelle);
		builder.append("]");
		return builder.toString();
	}
	
}
