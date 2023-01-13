<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<h1>Accueil</h1>

	<a href="<%=request.getContextPath()%>/ServletSeConnecter"> <input
		type="button" class="bouton" value="Se connecter" />
	</a>
	
	<a href="<%=request.getContextPath()%>/ServletCreerCompte"> <input
		type="button" class="bouton" value="Créer un compte" />
	</a>
	
</body>
</html>