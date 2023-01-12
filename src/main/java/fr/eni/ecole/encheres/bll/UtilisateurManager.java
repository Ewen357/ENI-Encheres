package fr.eni.ecole.encheres.bll;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.dal.DALException;
import fr.eni.ecole.encheres.dal.DAOFactory;
import fr.eni.ecole.encheres.dal.DAOUtilisateur;
import fr.eni.ecole.encheres.dal.UtilisateurDAOJdbcImpl;
import fr.eni.ecole.encheres.exception.BusinessException;


/**
 * Classe en charge de gérer un Repas.
 * @author dsanchez
 * @date 22 déc. 2022 - 16:36:48
 * @version TpSuiviRepas - v0.1
 */
public class UtilisateurManager {
	private DAOUtilisateur daoUtilisateur;

	
	public UtilisateurManager(Utilisateur utilisateur) {
		
		this.daoUtilisateur=DAOFactory.getDAOUtilisateur();
	}

	
	
}
