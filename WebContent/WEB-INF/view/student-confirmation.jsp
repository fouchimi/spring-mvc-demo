<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>
  <title>Student Confirmation</title>
</head>

<body>

The student is confirmed:  <b>${student.firstName} ${student.lastName}</b>; 
<br /> 
Student's country: <b>${student.country}</b>
<br />
Favorite Language <b>${student.favoriteLanguage}</b>
<br />
Operating Systems : 

  <ul>
     <c:forEach var="os" items="${student.operatingSystems}">
       <li><b>${os}</b></li>
     </c:forEach>
   </ul>
</body>

</html>