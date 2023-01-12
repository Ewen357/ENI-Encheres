package fr.eni.ecole.encheres.bo;

import java.io.Serializable;


/**
 * Classe en charge de
 * @author lregeard2022
 * @date 10 janv. 2023 11:36:46
 * @version ENI-Encheres - v0.1
 */
public class Utilisateur implements Serializable { 

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private boolean administrateur;
	
	
	// ******CONSTRUCTEUR PAR DEFAUT******//

	public Utilisateur() {

	}

	// ******CONSTRUCTEUR******//
	
	/**
	 * constructeur
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param motDePasse
	 * @param credit
	 * @param administrateur
	 */
	
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		this.setNoUtilisateur(noUtilisateur); 
		this.setPseudo(pseudo);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEmail(email);
		this.setTelephone(telephone);
		this.setRue(rue);
		this.setCodePostal(codePostal);
		this.setVille(ville);
		this.setMotDePasse(motDePasse);
		this.setCredit(credit);
		this.setAdministrateur(administrateur);
	}

	// *****GETTERS*****//


	/**
	 * Constructeur 
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 */
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}

	/**
	 * Constructeur 
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Utilisateur( String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}

	public int getNoUtilisateur() {

		return noUtilisateur;
	}
	
	/**
	* Getter pour ville.
	 * @return the ville
	
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter pour ville.
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPseudo() {

		return pseudo;
	}

	public String getNom() {

		return nom;
	}

	public String getPrenom() {

		return prenom;
	}

	public String getEmail() {

		return email;
	}

	public String getTelephone() {

		return telephone;
	}

	public String getRue() {

		return rue;
	}

	public String getCodePostal() {

		return codePostal;
	}

	public String getMotDePasse() {

		return motDePasse;
	}

	public int getCredit() {

		return credit;
	}

	public boolean isAdministrateur() {

		return administrateur;
	}


	
	// *****SETTERS*****//

	public void setNoUtilisateur(int noUtilisateur) {

		this.noUtilisateur = noUtilisateur;
	}

	public void setPseudo(String pseudo) {

		this.pseudo = pseudo;
	}

	public void setNom(String nom) {

		this.nom = nom;
	}

	public void setPrenom(String prenom) {

		this.prenom = prenom;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public void setTelephone(String telephone) {

		this.telephone = telephone;
	}

	public void setRue(String rue) {

		this.rue = rue;
	}

	public void setCodePostal(String codePostal) {

		this.codePostal = codePostal;
	}

	public void setMotDePasse(String motDePasse) {

		this.motDePasse = motDePasse;
	}

	public void setCredit(int credit) {

		this.credit = credit;
	}

	public void setAdministrateur(boolean administrateur) {

		this.administrateur = administrateur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utilisateur [noUtilisateur=");
		builder.append(noUtilisateur);
		builder.append(", pseudo=");
		builder.append(pseudo);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", rue=");
		builder.append(rue);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append(", ville=");
		builder.append(ville);
		builder.append(", motDePasse=");
		builder.append(motDePasse);
		builder.append(", credit=");
		builder.append(credit);
		builder.append(", administrateur=");
		builder.append(administrateur);
		builder.append("]");
		return builder.toString();
	}



}
