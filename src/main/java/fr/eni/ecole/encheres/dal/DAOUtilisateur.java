package fr.eni.ecole.encheres.dal;

import fr.eni.ecole.encheres.bo.Utilisateur;

public interface DAOUtilisateur  {

	
void insertUtilisateur ( Utilisateur utilisateur) throws DALException;

public Utilisateur selectByPseudo (String pseudo)throws DALException;

public Utilisateur selectById (int noUtilisateur)throws DALException;
	
public Utilisateur updateById (Utilisateur utilisateur )throws DALException;

public void deleteById (int noUtilisateur )throws DALException;


}
