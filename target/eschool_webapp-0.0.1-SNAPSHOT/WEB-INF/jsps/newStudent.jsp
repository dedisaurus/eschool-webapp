<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eschool</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">


</head>
<body>

  
 <div class="container">
  <h2>Add a new student</h2>
  <form class="form-horizontal" action="/add-student" method="POST">
    <div class="form-group">   
      <label class="control-label col-sm-2" for="email">Student name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="sname" required="required"/>
      </div>
  
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Student age:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="age" required="required">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Student GPA:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="gpa" required="required">
      </div>
    </div>   
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Add</button>
      </div>
    </div>
  </form>
</div>
 
 
  
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>