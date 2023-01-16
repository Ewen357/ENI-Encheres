package fr.eni.ecole.encheres.dal;

public abstract class CodesResultatDAL {
	/**
	 * Echec général quand tentative d'ajouter un objet null
	 */
	public static final int INSERT_UTILISATEUR_NULL=10000;
	
	/**
	 * Echec général quand erreur non gérée à l'insertion 
	 */
	public static final int INSERT_UTILISATEUR_ECHEC=10001;
	
	public static final int SELECT_ALL_UTILISATEUR_ECHEC=10002;

	public static int SELECT_UTILISATEUR_BY_PSEUDO_ECHEC=10003;

	public static int SELECT_UTILISATEUR_BY_ID_ECHEC=10004;

	public static int UPDATE_UTILISATEUR_ECHEC=10005;

	public static int DELETE_UTILISATEUR_BY_ID_ECHEC=10006;
	

	public static int INSERT_ARTICLE_VENDU_NULL= 10010;

	public static int INSERT_ARTICLE_VENDU_ECHEC= 10011;

	public static int SELECT_ARTICLE_BY_ID_ECHEC= 10012;
	
	public static final int INSERT_RETRAIT_NULL=10020;

	public static final int INSERT_RETRAIT_ECHEC=10021;

	public static final int LECTURE_RETRAIT_ECHEC = 10022;

	public static final int LECTURE_RETRAIT_NULL = 10023;
	
	public static final int INSERT_CATEGORIE_NULL = 10030;

	public static final int INSERT_CATEGORIE_ECHEC = 10031;

	public static final int LECTURE_CATEGORIE_ECHEC = 10032;

	public static final int LECTURE_CATEGORIE_NULL = 10033;

	public static final int SELECT_ALL_CATEGORIE_ECHEC = 10034;

	public static final int UPDATE_CATEGORIE_ECHEC = 10035;

	public static final int DELETE_CATEGORIE_BY_NO_CATEGORIE = 10036;
}
	
