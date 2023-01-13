<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouvelle vente</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/ServletAjouterArticle" method="post" class="">

  <div class="">
    <label for="article">Article : </label>
    <input type="text" name="article" id="article" required placeholder="chaise" >
  </div>
  
  <div class="">
    <label for="description">Description : </label>
    <input type="text" name="description" id="description" required placeholder="chaise verte jolie" >
  </div>
  
  <label for="catégorie">Choix de catégorie:</label>
<select name="catégorie" id="catégorie">
    <option value="">--Choix de catégorie--</option>
    <option value="informatique">Informatique</option>
    <option value="ameublement">Ameublement</option>
    <option value="vêtement">Vêtement</option>
    <option value="sport-loisirs">Sport-Loisirs</option>
</select>

  <div class="">
    <label for="photo">Choisis une photo : </label>
	<input type="file"
       id="photo" name="photo"
       accept="image/png, image/jpeg">
  </div>
  
  <div class="">
    <label for="prix">Mise à prix : </label>
    <input type="number" name="prix" id="prix" min="10" max="5000" required placeholder="50" >
  </div>
  
  
  <div class="">
    <label for="debutEnchere">Début de l'enchère : </label>
    <input type="datetime-local" name="debutEnchere" id="debutEnchere" required >
  </div>
  
  
  
  <div class="">
    <label for="finEnchere">Fin de l'enchère : </label>
    <input type="datetime-local" name="finEnchere" id="finEnchere" required >
  </div>
  
  
  
  <div class="">
  <h4>Retrait</h4>
    <label for="rue">Rue : </label>
    <input type="text" name="rue" id="rue" required placeholder="rue des Gayeulles" >
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
    <input type="submit" value="Enregistrer" >
  </div>
  
  </form>
	
	
	<a href="<%=request.getContextPath()%>/ServletAjouterArticle"> <input
		type="button" class="bouton" value="Annuler" />
	</a>


</body>
</html>