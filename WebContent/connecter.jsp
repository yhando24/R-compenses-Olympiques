
<!DOCTYPE html>
<html>
<%@ include file="/fragment/head.jsp"%>
<body>

	<%
		session = request.getSession();

		String userName = (String) session.getAttribute("pseudo");
	%>
	<h1 style="text-align: center;">
		Bonjour
		<%=userName%></h1>

	<div style="text-align: right;">
		<a href="<c:url value='/deconnection'/>">
			<button type=submit class="btn btn-danger">Deconnection</button>
		</a>
	 <form style="margin-top : 50px" method = "POST" action="<c:url value='/ShowRecompense'/>">
	     <button type="submit" class="btn btn-success">Voir Recompense</button>
	   	</form>
	   	
	</div>	   	
		<div class="container">

			<form style="margin-top: 50px" method="POST"
				action="<c:url value='/AddMedaille'/>">
				<div class="form-group" style="text-align: left">


					<label for="pet-select">Choisir un Athlete</label> <select
						name="athlete" id="pet-select">

						<c:forEach items="${athletes}" var="athlete">
							<option value="${athlete.nom}">${athlete.nom}
								${athlete.prenom}</option>

						</c:forEach>

					</select> <label for="pet-select">Quel Sport?</label> <select name="epreuve"
						id="pet-select">

						<c:forEach items="${Epreuves}" var="epreuve">
							<option value="${epreuve.key}">${epreuve.nom}</option>

						</c:forEach>

					</select> <label for="pet-select">Quel medaille?</label> <select
						name="medaille" id="pet-select">

						<c:forEach items="${medailles}" var="medaille">
							<option value="${medaille.name}">${medaille.name}</option>

						</c:forEach>

					</select>




				</div>
				<button type="submit" class="btn btn-success">Ajouter</button>
<hr>
				<span style="color : red; text-align : center;">${errorAddMedaille}</span>



			</form>


		</div>



		<br>
		
	  
</body>
</html>