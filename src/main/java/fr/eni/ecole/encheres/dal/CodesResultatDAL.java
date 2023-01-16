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
<<<<<<< HEAD

	public static int SELECT_UTILISATEUR_BY_PSEUDO_ECHEC=10003;

	public static int SELECT_UTILISATEUR_BY_ID_ECHEC=10004;

	public static int UPDATE_UTILISATEUR_ECHEC=10005;

	public static int DELETE_UTILISATEUR_BY_ID_ECHEC=10006;

	public static int INSERT_ARTICLE_VENDU_NULL;

	public static int INSERT_ARTICLE_VENDU_ECHEC;

	public static int SELECT_ARTICLE_BY_ID_ECHEC;

	

	
=======
	
	public static final int INSERT_RETRAIT_NULL=10003;
	
	public static final int INSERT_RETRAIT_ECHEC=10004;

	public static final int LECTURE_RETRAIT_ECHEC = 0;

	public static final int LECTURE_RETRAIT_NULL = 0;
>>>>>>> branch 'master' of https://github.com/Ewen357/ENI-Encheres.git
}
