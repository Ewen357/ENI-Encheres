package fr.eni.ecole.encheres.dal;

import fr.eni.ecole.encheres.bo.Retrait;
import fr.eni.ecole.encheres.exception.BusinessException;

public interface DAORetrait  {

	
public void insertRetrait (Retrait retrait) throws BusinessException;

public Retrait selectBynoArticle(int noArticle) throws BusinessException;


//public Utilisateur selectByPseudo (String pseudo)throws DALException;

//public Retrait selectById (int noArticle)throws BusinessException;
	
//public Utilisateur updateById (Utilisateur utilisateur )throws DALException;

//public void deleteById (int noUtilisateur )throws DALException;


}
