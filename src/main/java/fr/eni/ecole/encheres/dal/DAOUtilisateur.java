package fr.eni.ecole.encheres.dal;

import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.exception.BusinessException;

public interface DAOUtilisateur  {

	
void insertUtilisateur ( Utilisateur utilisateur) throws BusinessException;

public Utilisateur selectByPseudo (String pseudo)throws BusinessException;

public Utilisateur selectById (int noUtilisateur)throws BusinessException;
	
public Utilisateur updateById (Utilisateur utilisateur )throws BusinessException;

public void deleteById (int noUtilisateur )throws BusinessException;


}
