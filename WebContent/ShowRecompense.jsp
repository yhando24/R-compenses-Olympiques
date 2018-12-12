
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des Athletes et de leur recompense</h1>
	<c:forEach items="${athletes}" var="athlete">
						athletes : ${athlete.nom} :
						<br>
		<c:forEach items="${athlete.medailles}" var="medaille">
						 Medaille :  ${medaille.categorieMedaille}
					 epreuves :  ${medaille.epreuve}
					 <br>
		</c:forEach>
		<br>
		<br>
	</c:forEach>

			<a href="http://localhost:8484/RECOMPENSES_OLYMPIQUES/connection">Retour a la page d'accueil</a>
</body>
</html>