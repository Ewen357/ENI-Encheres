/**
 * 
 */
package fr.eni.ecole.encheres.dal;

import fr.eni.ecole.encheres.bo.Retrait;
import fr.eni.ecole.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author cdean2022
 * @date 13 janv. 2023 - 10:21:16
 * @version ENI-Encheres - v0.1
 */
public class DAORetraitJdbcImpl implements DAORetrait{
	
	private static final String INSERT_Retrait="insert into retrait() values(?,?)";
	
	

	@Override
	public void insertRetrait(Retrait retrait) throws DALException {
		
		
	}



	@Override
	public Retrait selectById(int noArticle) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
