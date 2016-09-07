<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eschool</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<meta name="generator" content="Bootply" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="webjars/bootstrap/3.3.6/css/styles.css" rel="stylesheet">
</head>
<body>

<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">          
          <h1 class="text-center">Admin Panel</h1>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block" action="/eschool" method="post">
           
            <div class="form-group">
              <input type="text" class="form-control input-lg" placeholder="Username" name="name">
            </div>
            <div class="form-group">
              <input type="password" class="form-control input-lg" placeholder="Password" name="password">
            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
              
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <span class="pull-right"><h3><font color="red">${errorMessage}</font></h3></span>
		  </div>	
      </div>
  </div>
  </div>
</div>

 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>