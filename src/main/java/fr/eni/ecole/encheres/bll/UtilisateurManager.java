package fr.eni.ecole.encheres.bll;

import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.dal.DALException;
import fr.eni.ecole.encheres.dal.DAOFactory;
import fr.eni.ecole.encheres.dal.DAOUtilisateur;

public class UtilisateurManager {
	
	private static DAOUtilisateur daoUtilisateur;

	
	
	public UtilisateurManager() { 
		daoUtilisateur=DAOFactory.getDAOUtilisateur();
	}



	public void insertUtilisateur(Utilisateur utilisateur) throws DALException {
		daoUtilisateur.insertUtilisateur(utilisateur);
	}



	public Utilisateur selectByPseudo(String pseudo) throws DALException {
		return daoUtilisateur.selectByPseudo(pseudo);
	}



	public Utilisateur selectById(int noUtilisateur) throws DALException {
		return daoUtilisateur.selectById(noUtilisateur);
	}



	public Utilisateur updateById(Utilisateur utilisateur) throws DALException {
		return daoUtilisateur.updateById(utilisateur);
	}



	public void deleteById(int noUtilisateur) throws DALException {
		daoUtilisateur.deleteById(noUtilisateur);
	}
	

	
	
}
