package fr.eni.ecole.encheres.bll;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import fr.eni.ecole.repas.bo.Aliment;
import fr.eni.ecole.repas.bo.Repas;
import fr.eni.ecole.repas.dao.DAOFactory;
import fr.eni.ecole.repas.dao.RepasDAO;
import fr.eni.ecole.repas.exception.BusinessException;

/**
 * Classe en charge de gérer un Repas.
 * @author dsanchez
 * @date 22 déc. 2022 - 16:36:48
 * @version TpSuiviRepas - v0.1
 */
public class UtilisateurManager {
	private RepasDAO repasDAO;
	
	public RepasManager() {
		this.repasDAO=DAOFactory.getRepasDAO();
	}

	/**
	 * @param date
	 * @param heure
	 * @param listeAliments
	 * @return
	 * @throws BusinessException
	 */
	public Repas ajouterRepas(LocalDate date, LocalTime heure, List<String> listeAliments) throws BusinessException 
	{
		
		BusinessException businessException = new BusinessException();
		this.validerDateHeure(date, heure, businessException);
		this.validerListeAliments(listeAliments,businessException);
		
		Repas repas = null;
		
		if(!businessException.hasErreurs())
		{
			repas = new Repas();
			repas.setDate(date);
			repas.setHeure(heure);
			for(String aliment:listeAliments)
			{
				repas.getListeAliments().add(new Aliment(aliment.trim()));
			}
			this.repasDAO.insert(repas);
		}
		else
		{
			throw businessException;
		}
		return repas;
	}

	/**
	 * @param date
	 * @param heure
	 * @param businessException
	 */
	private void validerDateHeure(LocalDate date, LocalTime heure, BusinessException businessException) {
		if(date==null || 
			date.isAfter(LocalDate.now()) ||
			(date.isEqual(LocalDate.now()) && heure.isAfter(LocalTime.now())))
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_REPAS_DATE_ERREUR);
		}
		
	}

	/**
	 * @param listeAliments
	 * @param businessException
	 */
	private void validerListeAliments(List<String> listeAliments, BusinessException businessException) {
		if(listeAliments==null || listeAliments.size()==0)
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_REPAS_ALIMENTS_ERREUR);
		}
		else
		{
			for (String aliment : listeAliments) {
				if(aliment.length()>50)
				{
					businessException.ajouterErreur(CodesResultatBLL.REGLE_REPAS_ALIMENTS_ERREUR);
					break;
				}
			}
		}
		
	}

	/**
	 * @return
	 * @throws BusinessException
	 */
	public List<Repas> selectionnerTousLesRepas() throws BusinessException{
		return this.repasDAO.select();
	}

	/**
	 * @param dateFiltre
	 * @return
	 * @throws BusinessException
	 */
	public List<Repas> selectionnerTousLesRepasDUnJour(LocalDate dateFiltre) throws BusinessException {
		return this.repasDAO.select(dateFiltre);
	}
	
	
	
}
