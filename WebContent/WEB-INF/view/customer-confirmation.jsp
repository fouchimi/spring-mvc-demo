<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
  <title></title>
</head>

<body>
  Customer Name : <b>${customer.firstName} ${customer.lastName}</b><br /><br />
  Customer free passes: <b>${customer.freePasses}</b><br /><br />
  Customer postal code: <b>${customer.postalCode}</b>
</body>
</html>