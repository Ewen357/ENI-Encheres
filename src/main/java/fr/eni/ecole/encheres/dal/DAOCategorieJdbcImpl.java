/**
 * 
 */
package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.Categorie;
import fr.eni.ecole.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author cdean2022
 * @date 16 janv. 2023 - 09:38:17
 * @version ENI-Encheres - v0.1
 */
public class DAOCategorieJdbcImpl implements DAOCategorie{

	private static final String INSERT_CATEGORIE="insert into categorie(no_categorie, libelle) values(?,?)";
	private static final String SELECT_CATEGORIE_BY_NO_CATEGORIE="select no_categorie, libelle FROM categorie WHERE no_categorie=? ";
	private static final String SELECT_ALL_CATEGORIE="select no_categorie, libelle FROM categorie";
	private static final String UPDATE_CATEGORIE_BY_NO_CATEGORIE="UPDATE categorie set no_categorie=?, libelle=? where no_categorie=?";
	private static final String DELETE_CATEGORIE_BY_NO_CATEGORIE="DELETE categorie FROM categorie WHERE no_categorie=?";
	
	
	@Override
	public void insertCategorie(Categorie categorie) throws BusinessException {
		if(categorie==null)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_CATEGORIE_NULL);
			throw businessException;
		}
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			try
			{
				cnx.setAutoCommit(false);
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_CATEGORIE);
				//Penser à convertir les local en sql.
				pstmt.setInt(1, categorie.getNoCategorie());
				pstmt.setString(2, categorie.getLibelle());
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
			businessException.ajouterErreur(CodesResultatDAL.INSERT_CATEGORIE_ECHEC);
			throw businessException;
		}

	}

	@Override
	public Categorie selectByNoCategorie(int noCategorie) throws BusinessException {
		Categorie categorie = null;
		try (Connection cnx=ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_CATEGORIE_BY_NO_CATEGORIE);
			pstmt.setInt(1, noCategorie);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				 categorie= new Categorie(rs.getInt("noCategorie"), rs.getString("libelle"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.LECTURE_CATEGORIE_ECHEC);
			throw businessException;
		}
		if(categorie.getNoCategorie()==0) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.LECTURE_CATEGORIE_NULL);
			throw businessException;
		}
		
		return categorie;
	}

	@Override
	public List<Categorie> selectAllCategorie() throws BusinessException {
		List<Categorie> listeCategorie = new ArrayList<Categorie>();
		try (Connection cnx=ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL_CATEGORIE);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				listeCategorie.add(new Categorie(rs.getInt("noCategorie"), rs.getString("libelle")));
			}
		}catch(Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_ALL_CATEGORIE_ECHEC);
			throw businessException;
		}
		return listeCategorie;
	}

	@Override
	public Categorie updateByNoCategorie(Categorie categorie) throws BusinessException {
		try (Connection cnx = ConnectionProvider.getConnection())
		{
				PreparedStatement pstmt = cnx.prepareStatement(UPDATE_CATEGORIE_BY_NO_CATEGORIE);
				pstmt.setInt(1, categorie.getNoCategorie());
				pstmt.setString(2, categorie.getLibelle());
				pstmt.setInt(3, categorie.getNoCategorie());
				pstmt.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				businessException.ajouterErreur(CodesResultatDAL.UPDATE_CATEGORIE_ECHEC);
				throw businessException;
			}
		return categorie;
		
	}

	@Override
	public void deleteByNoCategorie(int noCategorie) throws BusinessException {
		try (Connection cnx = ConnectionProvider.getConnection())
		{
				PreparedStatement pstmt = cnx.prepareStatement(DELETE_CATEGORIE_BY_NO_CATEGORIE);
				pstmt.setInt(1, noCategorie);
				pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.DELETE_CATEGORIE_BY_NO_CATEGORIE);
			throw businessException;
		}
	}

}
