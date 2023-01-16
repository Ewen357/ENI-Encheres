package fr.eni.ecole.encheres.bll;

import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.dal.DAOArticleVendu;
import fr.eni.ecole.encheres.dal.DAOFactory;
import fr.eni.ecole.encheres.exception.BusinessException;


public class ArticleVenduManager {

	private static DAOArticleVendu daoArticleVendu;
	
	public ArticleVenduManager() { 
		daoArticleVendu=DAOFactory.getDAOArticleVendu();
	}

	public void insertArticleVendu(ArticleVendu articleVendu) throws BusinessException {
		daoArticleVendu.insertArticleVendu(articleVendu);
	}

	public ArticleVendu selectById(int noArticle) throws BusinessException {
		return daoArticleVendu.selectById(noArticle);
	}

	public List<ArticleVendu> selectAll() throws BusinessException {
		return daoArticleVendu.selectAll();
	}

	public List<ArticleVendu> selectByVendeur(int noUtilisateur) throws BusinessException {
		return daoArticleVendu.selectByVendeur(noUtilisateur);
	}

	public ArticleVendu update(ArticleVendu ArticleVendu) throws BusinessException {
		return daoArticleVendu.update(ArticleVendu);
	}

	public void delete(int noUtilisateur) throws BusinessException {
		daoArticleVendu.delete(noUtilisateur);
	}
	
	
	
	
	
}
