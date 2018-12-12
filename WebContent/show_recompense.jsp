
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/fragment/head.jsp"%>
<body>


<table class="table table-striped table-dark">
   <caption><h1>Liste des Athletes et de leur recompense</h1></caption>
  <thead>
	   <tr>
	   

	      <th scope="col">Ahletes</th>
	      <th scope="col">Categorie medaille</th>
	      <th scope="col">Epreuve</th>
	 
	       <th  scope="col">Action</th>
	    
	   </tr>
 	</thead>
 	 <tbody>
   <c:forEach items="${athletes}" var="athlete" varStatus="status">
        <c:if test="${!empty athlete.medailles}">
	     	<tr>
	      <td rowspan="${fn:length(athlete.medailles)} scope="row"><c:out value="${athlete.nom}"/></td>
	   
	       <c:forEach items="${athlete.medailles}" var="medaille">
	   
	      <td>	 Medaille :  ${medaille.categorieMedaille}</td>
	    
	     	
	     	
	    
	   <td>	${medaille.epreuve}</td>
	   <td>
	     	 <a href="<c:url value='/connection'/>">Supprimer</a></td>
	   	
	  		
	   
	   </tr>    
	     	</c:forEach>
	   
	</c:if>
   	</c:forEach>	  	 
	 </tbody>

</table>
	

										
			<a href="<c:url value='/connection'/>">Retour a la page d'accueil</a>
</body>
</html>