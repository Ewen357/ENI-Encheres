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
	
	public static final int INSERT_RETRAIT_NULL=10003;
	
	public static final int INSERT_RETRAIT_ECHEC=10004;

	public static final int LECTURE_RETRAIT_ECHEC = 0;

	public static final int LECTURE_RETRAIT_NULL = 0;
}
