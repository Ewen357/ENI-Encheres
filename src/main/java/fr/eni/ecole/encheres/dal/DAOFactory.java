package fr.eni.ecole.encheres.dal;

public class DAOFactory {

	public static DAOUtilisateur getDAOUtilisateur () {
		return new UtilisateurDAOJdbcImpl ();
	}
}
