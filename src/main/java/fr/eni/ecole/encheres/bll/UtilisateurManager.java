package fr.eni.ecole.encheres.bll;

import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.dal.DAOFactory;
import fr.eni.ecole.encheres.dal.DAOUtilisateur;
import fr.eni.ecole.encheres.exception.BusinessException;

public class UtilisateurManager {
	
	private static DAOUtilisateur daoUtilisateur;

	
	
	public UtilisateurManager() { 
		daoUtilisateur=DAOFactory.getDAOUtilisateur();
	}



	public void insertUtilisateur(Utilisateur utilisateur) throws BusinessException {
		daoUtilisateur.insertUtilisateur(utilisateur);
	}



	public Utilisateur selectByPseudo(String pseudo) throws BusinessException {
		return daoUtilisateur.selectByPseudo(pseudo);
	}



	public Utilisateur selectById(int noUtilisateur) throws BusinessException {
		return daoUtilisateur.selectById(noUtilisateur);
	}



	public Utilisateur updateById(Utilisateur utilisateur) throws BusinessException {
		return daoUtilisateur.updateById(utilisateur);
	}



	public void deleteById(int noUtilisateur) throws BusinessException {
		daoUtilisateur.deleteById(noUtilisateur);
	}
	

	
	
}
