<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enregistrement</title>
</head>
<body>
<h1>Creer compte</h1>



	
	
	
	<form action="<%=request.getContextPath()%>/ServletCreerCompte" method="post" class="creerProfil">
  <div class="">
    <label for="pseudo">Pseudo : </label>
    <input type="text" name="pseudo" id="pseudo" required placeholder="toto" >
  </div>
  <div class="">
    <label for="nom">Nom : </label>
    <input type="text" name="nom" id="nom" required placeholder="dupont" >
  </div>
  <div class="">
    <label for="prénom">Prénom : </label>
    <input type="text" name="prenom" id="prenom" required placeholder="marie" >
  </div>
  <div class="">
    <label for="email">Email : </label>
    <input type="email" name="email" id="email" required placeholder="marie.dupont@gmail.com">
  </div>
  <div class="">
    <label for="tel">Téléphone : </label>
    <input type="tel" name="tel" id="tel" required placeholder="0622334455" >
  </div>
  <div class="">
    <label for="rue">Rue : </label>
    <input type="text" name="rue" id="rue" required placeholder="8 rue des Lilas" >
  </div>
  <div class="">
    <label for="codePostal">Code Postal : </label>
    <input type="text" name="codePostal" id="codePostal" required placeholder="35000" >
  </div>
  <div class="">
    <label for="ville">Ville : </label>
    <input type="text" name="ville" id="ville" required placeholder="Rennes" >
  </div>
  <div class="">
    <label for="motDePasse">Mot de passe : </label>
    <input type="password" name="motDePasse" id="motDePasse" required placeholder="******" >
  </div>
  <div class="">
    <label for="confirmation">Confirmation : </label>
    <input type="password" name="confirmation" id="confirmation" required placeholder="******" >
  </div>
  
  <div class="">
    <input type="submit" value="Créer" >
  </div>
  
  
  
  
  
</form>
	
	
	<a href="<%=request.getContextPath()%>/ServletAccueil"> <input
		type="button" class="bouton" value="Annuler" />
	</a>
	
	
	
	
	
</body>
</html>