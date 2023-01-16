package fr.eni.ecole.encheres.dal;

import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Retrait;
import fr.eni.ecole.encheres.exception.BusinessException;

public interface DAOArticleVendu {

	public void insertArticleVendu( ArticleVendu articleVendu) throws BusinessException;

	public ArticleVendu selectById (int noArticle)throws BusinessException;

	public List<ArticleVendu> selectAll ()throws BusinessException;
	
	public List<ArticleVendu> selectByVendeur (int noUtilisateur)throws BusinessException;

	public ArticleVendu update (ArticleVendu ArticleVendu )throws BusinessException;

	public void delete (int noUtilisateur )throws BusinessException;
	
	
	
}
