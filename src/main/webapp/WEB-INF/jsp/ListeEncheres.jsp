<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Dosis&display=prata" rel="stylesheet">
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet">


<title>Liste d'enchères</title>
</head>
<body>
	
	<header class="nav">
	<a href="<%=request.getContextPath()%>/ServletSeConnecter"> 
		<li>Se connecter</li>
	</a>
	
	<a href="<%=request.getContextPath()%>/ServletCreerCompte">
		<li>Créer un compte</li>
	</a>

	</header>
	
	<h1>Liste d'enchères</h1>
	
	<h2>Filtres :</h2>
	
	<div class ="container">
	
	<label for="site-search">Le nom de l'article</label>
	<input type="search" id="site-search" name="q">
	
	
	
	<label for="categorie-select">Catégorie : </label>

	<select name="categorie" id="categorie-select">
	    <option value="">Toutes </option>
	    <option value="Informatique">Informatique</option>
	    <option value="Mobilier">Mobilier</option>
	    <option value="Vêtements">Vêtements</option>
	    <option value="Sport&Loisirs">Sport et Loisirs</option>
	</select>
	
	<button>go</button>
	
	</div>
	
	<section class="sect2">
	
		<img width="80" src="<%=request.getContextPath()%>/img/pc1.png"/>
		<p>Pc gamer pour travailler <br> 
		prix : 210 points <br>
		Fin de l'enchère : 10/08/2018 <br>
		Vendeur : jojo44 </p>
		
	</section>
	
</body>
</html>