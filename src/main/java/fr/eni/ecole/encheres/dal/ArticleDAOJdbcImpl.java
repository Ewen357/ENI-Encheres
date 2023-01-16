package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.ecole.encheres.bo.ArticleVendu;
import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.bo.Retrait;
import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.exception.BusinessException;

public class ArticleDAOJdbcImpl implements DAOArticleVendu {

	private static final String INSERT_ARTICLE_VENDU = "INSERT INTO ARTICLE_VENDU (nom_article, description, date_debut_encheres, date_fin_encheres, miseAPrix, prix_vente, etat_vente, no_utilisateur, no_categorie) VALUES (?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_ARTICLE_BY_ID = "SELECT * FROM ARTICLE_VENDU INNER JOIN RETRAIT ON article.noarticle = retrait.noarticle WHERE ARTICLE_VENDU.noarticle = ? ";
	private static final String SELECT_ARTICLE_BY_VENDEUR ="SELECT * FROM ARTICLE_VENDU WHERE no_utilisateur= ? ";
	private static final String SELECT_ALL_ARTICLE_VENDU ="SELECT * FROM ARTICLE_VENDU";
	private static final String UPDATE_ARTICLE_VENDU ="UPDATE ARTICLE_VENDU SET (nom_article= ?, description= ?, date_debut_encheres= ?, date_fin_encheres= ?, miseAPrix= ?, prix_vente= ?, etat_vente= ?, no_utilisateur= ?, no_categorie= ?)";
	private static final String DELETE_ARTICLE_VENDU ="DELETE ARTICLE_VENDU WHERE noArticle=?";
	
	private static DAOUtilisateur utilisateurDAO = new UtilisateurDAOJdbcImpl();
	private static DAOCategorie categorieDAO = new DAOCategorieJdbcImpl();
	private static DAORetrait retraitDAO = new DAORetraitJdbcImpl();
	
	@Override
	public void insertArticleVendu(ArticleVendu articleVendu) throws BusinessException  {
		
		if (articleVendu == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_ARTICLE_VENDU_NULL);
			throw businessException;
		}
			try (Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(INSERT_ARTICLE_VENDU,PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, articleVendu.getNomArticle());
			pstmt.setString(2, articleVendu.getDescription());
			pstmt.setDate(3, java.sql.Date.valueOf(articleVendu.getDateDebutEnchere()));
			pstmt.setDate(4, java.sql.Date.valueOf(articleVendu.getDateFinEnchere()));
			pstmt.setInt(5, articleVendu.getMiseAPrix());
			pstmt.setInt(6, articleVendu.getPrixVente());
			pstmt.setInt(7, 0);
			pstmt.setInt(8, articleVendu.getUtilisateur().getNoUtilisateur());
			pstmt.setInt(9, articleVendu.getCategorie().getNoCategorie());
	
			
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if(rs.next()) {
				articleVendu.setNoArticle(rs.getInt(1));
				
			}
			} catch (Exception e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				businessException.ajouterErreur(CodesResultatDAL.INSERT_ARTICLE_VENDU_ECHEC);
				throw businessException;
			}
			
		
	}

	@Override
	public ArticleVendu selectById(int noArticle) throws BusinessException {
		
		ArticleVendu articleVendu = null;
		
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ARTICLE_BY_ID);
			pstmt.setInt(1, noArticle);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				
				articleVendu = new ArticleVendu(rs.getInt("no_article"),
						rs.getString("nom_article"),
						rs.getString("description"),
						rs.getDate("getDateDebutEnchere"),
						rs.getDate("date_fin_encheres"),
						rs.getInt("miseAPrix"),
						rs.getInt("prix_vente"),
						rs.getBoolean("etat_vente")
						
						;	
				
			}
			} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_ARTICLE_BY_ID_ECHEC);
			throw businessException;

		}
		return articleVendu;
		
		
	}

	@Override
	public List<ArticleVendu> selectAll() throws BusinessException {
		
		return null;
	}

	@Override
	public List<ArticleVendu> selectByVendeur(int noUtilisateur) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleVendu update(ArticleVendu ArticleVendu) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int noUtilisateur) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ArticleVendu> selectByRetrait(Retrait retrait) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
