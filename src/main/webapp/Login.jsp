<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <!-- Bootstrap v5.1.3 CDNs -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!-- CSS File -->
  <link href="css/style.css" rel="stylesheet" type="text/css">
</head>

<body>

    <div class="login">

        <h1 class="text-center">Hello Again!</h1>
        
        <form class="needs-validation" action="add" method="post">
            <div class="form-group was-validated">
                <label class="form-label" for="name">Name</label>
                <input class="form-control" type="text" name="name" id="name" required >
                <div class="invalid-feedback">
                    Please enter your name
                </div>
            </div>
            <div class="form-group was-validated">
                <label class="form-label" for="password">Password</label>
                <input class="form-control" type="password" id="password" required>
                <div class="invalid-feedback">
                    Please enter your password
                </div>
            </div>
         
            <input class="btn btn-success w-100" type="submit" value="SIGN IN">
        </form>

    </div>

</body>

</body>
</html>