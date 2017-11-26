<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
 <head>
    <title>Student form</title>
 </head>
 
 <body>
 
 <form:form action="processForm" modelAttribute="student">
   First Name : <form:input path="firstName" />
   <br /> <br />
   Last Name : <form:input path="lastName" />
   <br /> <br />
   Country : 
   <form:select path="country">
      <form:options items="${theCountryOptions}" />
   </form:select>
   <br /><br />
   Java <form:radiobutton path="favoriteLanguage" value="Java"/>
   C# <form:radiobutton path="favoriteLanguage" value="C#"/>
   Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
   JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript" />
   <br /><br />
   Operating Systems:
   Linux<form:checkbox path="operatingSystems" value="Linux" />
   Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
   Windows OS<form:checkbox path="operatingSystems" value="Windows OS" />
   <br /><br />
 <input type="submit" value="Submit" />
 
 </form:form>
 
 </body>
 
</html>