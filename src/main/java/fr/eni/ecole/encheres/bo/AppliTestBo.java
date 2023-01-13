package fr.eni.ecole.encheres.bo;

import java.time.LocalDate;


public class AppliTestBo {

	private static Utilisateur user = new Utilisateur(1, "Nom", "Prenom", "Pseudo","email", "0612151819", "rue", "35000", "mot de passe", null, 100, true);
	private static Categorie categorie = new Categorie(2, "libelle");
	private static Enchere enchere = new Enchere(5, LocalDate.of(1996,06,12), 1500, 5, 2);
	private static ArticleVendu article = new ArticleVendu(8, "pantoufle", "doux et resistant", LocalDate.of(1547, 04, 9), LocalDate.of(1547, 04, 9),5000, 10000, true,8 );
	private static Retrait retrait = new Retrait("rue", "paris", "35000", article);
	public static void main(String[] args) {
		
		VerifUtilisateur(); 
		VerifCategorie(); 
		VerifEnchere(); 
		VerifRetrait(); 
		VerifArticle(); 

	}

	private static void VerifUtilisateur() {
		System.out.println(user);

	}
	
	private static void VerifCategorie() {
		System.out.println(categorie);
	}
	
	private static void VerifEnchere() {
		System.out.println(enchere);
	}
	
	private static void VerifRetrait() {
		System.out.println(retrait);
	}
	private static void VerifArticle() {
		System.out.println(article);
	
	}
}
