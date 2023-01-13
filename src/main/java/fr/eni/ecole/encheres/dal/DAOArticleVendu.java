package fr.eni.ecole.encheres.dal;

import fr.eni.ecole.encheres.bo.ArticleVendu;

public interface DAOArticleVendu {

	void insertArticleVendu ( ArticleVendu articleVendu) throws DALException;

	public ArticleVendu selectByPseudo (String pseudo)throws DALException;

	public ArticleVendu selectById (int noUtilisateur)throws DALException;
		
	public ArticleVendu updateById (ArticleVendu ArticleVendu )throws DALException;

	public void deleteById (int noUtilisateur )throws DALException;
	
}
