package fr.eni.ecole.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.exception.BusinessException;


public class UtilisateurDAOJdbcImpl implements DAOUtilisateur {

	private static final String INSERT_UTILISATEUR = "INSERT INTO UTILISATEUR pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_UTILISATEUR_BY_ID = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur FROM UTILISATEUR WHERE no_utilisateur = ? ";
	private static final String SELECT_UTILISATEUR_BY_PSEUDO = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur FROM UTILISATEUR WHERE pseudo = ? ";
	private static final String SELECT_ALL_UTILISATEUR = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville FROM UTILISATEUR";
	private static final String DELETE_UTILISATEUR_BY_ID = "DELETE UTILISATEUR FROM UTILISATEUR WHERE no_utilisateur=?";
	private static final String UPDATE_UTILISATEUR = "UPDATE UTILISATEUR SET pseudo=?, nom=?, prenom=?, email=?, telephone=?, rue=?, code_postal=?, ville=?, mot_de_passe=?, credit=?, administrateur=? WHERE no_utilisateur=?";

	
	
	
	
	public List <Utilisateur> selectAll () throws BusinessException{
		
		List<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();
		try (Connection cnx=ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL_UTILISATEUR);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				listeUtilisateur.add(new Utilisateur(
						rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getString("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville")));
			}
		}catch(Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_ALL_UTILISATEUR_ECHEC);
			throw businessException;
		}
		return listeUtilisateur;
	}
			
		
	
	
	// Insertion de l'utilisateur en BDD avec inscription //
	@Override
	public void insertUtilisateur(Utilisateur utilisateur) throws DALException {
		
		try (Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR,PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, 100);
			pstmt.setInt(11, 0);
			
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if(rs.next()) {
				utilisateur.setNoUtilisateur(rs.getInt(1));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException ("Erreur d'insertion",e);
		}
		
	}

	// selection de l'utilisateur en BDD avec son pseudo //

	@Override
	public Utilisateur selectByPseudo(String pseudo) throws DALException {
		ResultSet rs = null;
		Utilisateur utilisateur = null;

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_UTILISATEUR_BY_PSEUDO);
			pstmt.setString(1, pseudo);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				utilisateur = new Utilisateur(rs.getInt("no_utilisateur"), rs.getString("pseudo"), rs.getString("nom"),
						rs.getString("prenom"), rs.getString("email"), rs.getString("telephone"), rs.getString("rue"),
						rs.getString("code_postal"), rs.getString("ville"), rs.getString("mot_de_passe"),
						rs.getInt("credit"), rs.getBoolean("administrateur"));
			}
		} catch (SQLException e) {
			throw new DALException("Erreur d'execution SelectByPseudo de UtilisateurDAOJdbcImpl", e);

		}
		return utilisateur;
	}

	
	
	// selection de l'utilisateur en BDD avec son numero d'utilisateur //
	@Override
	public Utilisateur selectById(int noUtilisateur) throws DALException {
		ResultSet rs = null;
		Utilisateur utilisateur = null;
		
		try(Connection cnx = ConnectionProvider.getConnection()){
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_UTILISATEUR_BY_ID);
				pstmt.setInt(1, noUtilisateur);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					utilisateur = new Utilisateur (rs.getInt("no_utilisateur"),
							rs.getString("pseudo"),
							rs.getString("nom"),
							rs.getString("prenom"),
							rs.getString("email"),
							rs.getString("telephone"),
							rs.getString("rue"),
							rs.getString("code_postal"),
							rs.getString("ville"),
							rs.getString("mot_de_passe"),
							rs.getInt("credit"),
							rs.getBoolean("administrateur"));							
				}
		} catch (SQLException e) {
			throw new DALException ("Erreur d'execution SelectById de UtilisateurDAOJdbcImpl",e);
			
		}
		return utilisateur;
	}

	// Mise a jour de l'utilisateur sur le profil //
	@Override
	public Utilisateur updateById(Utilisateur utilisateur) throws DALException {
		try (Connection cnx = ConnectionProvider.getConnection())
		{
				PreparedStatement pstmt = cnx.prepareStatement(UPDATE_UTILISATEUR);
				pstmt.setString(1, utilisateur.getPseudo());
				pstmt.setString(2, utilisateur.getNom());
				pstmt.setString(3, utilisateur.getPrenom());
				pstmt.setString(4, utilisateur.getEmail());
				pstmt.setString(5, utilisateur.getTelephone());
				pstmt.setString(6, utilisateur.getRue());
				pstmt.setString(7, utilisateur.getCodePostal());
				pstmt.setString(8, utilisateur.getVille());
				pstmt.setString(9, utilisateur.getMotDePasse());
				pstmt.setInt(10, utilisateur.getNoUtilisateur());
				
				
				pstmt.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
				throw new DALException ("Echec de la mise a jour",e);
			}return utilisateur;
		
	}

	// suppression des infos utilisateur via son numero//
	@Override
	public void deleteById(int noUtilisateur) throws DALException {
		try (Connection cnx = ConnectionProvider.getConnection())
		{
				PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR_BY_ID);
				pstmt.setInt(1, noUtilisateur);
				pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException ("Echec de la suppression",e);
		}
	}

}
