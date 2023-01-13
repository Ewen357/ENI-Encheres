/**
 * 
 */
package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fr.eni.ecole.encheres.bo.Retrait;
import fr.eni.ecole.encheres.exception.BusinessException;



/**
 * Classe en charge de 
 * @author cdean2022
 * @date 13 janv. 2023 - 10:21:16
 * @version ENI-Encheres - v0.1
 */
public class DAORetraitJdbcImpl implements DAORetrait{
	
	private static final String INSERT_RETRAIT="insert into retrait(no_article, rue, code_postal, ville) values(?,?,?,?)";
	private static final String SELECT_RETRAIT_BY_NO_ARTICLE="select no_article, rue, code_postal, ville FROM retrait WHERE no_article=? ";
	
	

	@Override
	public void insertRetrait(Retrait retrait) throws BusinessException {
		if(retrait==null)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_RETRAIT_NULL);
			throw businessException;
		}
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			try
			{
				cnx.setAutoCommit(false);
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_RETRAIT);
				//Penser à convertir les local en sql.
				pstmt.setInt(1, retrait.getNoArticle());
				pstmt.setString(2, retrait.getRue());
				pstmt.setString(3, retrait.getCodePostal());
				pstmt.setString(4, retrait.getVille());
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				
				rs.close();
				pstmt.close();
				cnx.commit();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				cnx.rollback();
				throw e;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_RETRAIT_ECHEC);
			throw businessException;
		}

	}



	@Override
	public Retrait selectBynoArticle(int noArticle) throws BusinessException {
		Retrait retrait = null;
		try (Connection cnx=ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_RETRAIT_BY_NO_ARTICLE);
			pstmt.setInt(1, noArticle);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				 retrait= new Retrait(rs.getInt("no_article"), rs.getString("rue"), rs.getString("code_postal"),
						rs.getString("ville"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.LECTURE_RETRAIT_ECHEC);
			throw businessException;
		}
		if(retrait.getNoArticle()==0) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.LECTURE_RETRAIT_NULL);
			throw businessException;
		}
		
		return retrait;
	}

}
