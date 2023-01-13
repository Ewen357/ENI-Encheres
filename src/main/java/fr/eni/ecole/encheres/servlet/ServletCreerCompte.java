package fr.eni.ecole.encheres.servlet;

import java.io.IOException;

import fr.eni.ecole.encheres.bll.UtilisateurManager;
import fr.eni.ecole.encheres.bo.Utilisateur;
import fr.eni.ecole.encheres.exception.BusinessException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletCreerCompte
 */
@WebServlet("/ServletCreerCompte")
public class ServletCreerCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ServletCreerCompte() {
        super ();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/EnregistrementUtilisateur.jsp");
			rd.forward(request, response);
			

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("tel");
		String rue = request.getParameter("rue");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");
		String motDePasse = request.getParameter("motDePasse");
		
		Utilisateur utilisateur = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,codePostal,ville,motDePasse);
		
		UtilisateurManager mgt = new UtilisateurManager();
		
		try {
			mgt.insertUtilisateur(utilisateur);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}