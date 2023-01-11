package fr.eni.ecole.encheres.dal;

public interface DAOUtilisateur  {

	
void insertUtilisateur ( Utilisateur utilisateur) throws DALException;

public Utilisateur selectByPseudo (String pseudo)throws DALException;

public Utilisateur selectById (int noUtilisateur)throws DALException;
	
public Utilisateur updateById (Utilisateur utilisateur )throws DALException;

public Utilisateur deleteById (int noUtilisateur )throws DALException;


}
