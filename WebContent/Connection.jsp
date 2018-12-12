
<!DOCTYPE html>
<html>
<%@ include file="/fragment/head.jsp" %>
<body>

    <div class="container">

	    <form style="margin-top : 50px" method = "POST" action="http://localhost:8484/RECOMPENSES_OLYMPIQUES/connection">
	  <div class="form-group">

	    <input type="text" class="form-control" id="formGroupExampleInput" value="admin" name="userName">
	  </div>
	  <div class="form-group">

	    <input type="password" class="form-control" id="formGroupExampleInput2" value="password"  name="password">
	  </div>
	     <button type="submit" class="btn btn-success">Connection</button>
	     <br>
	     ${error}
	     
<c:if test="${!empty erreur}">

	    <span style="color:red">
	    <c:out value="${erreur}"></c:out>
	    
	    
	     <span>

</c:if>


	</form>
	
	   <form style="margin-top : 50px" method = "POST" action="http://localhost:8484/RECOMPENSES_OLYMPIQUES/ShowRecompense">
	     <button type="submit" class="btn btn-success">Voir Recompense</button>
	   	</form>
	</div>


</body>
</html>