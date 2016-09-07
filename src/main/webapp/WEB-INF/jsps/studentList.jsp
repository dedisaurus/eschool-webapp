<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eschool</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
        <table class="table table-striped">
            <caption>Students</caption>

            <thead>
                <tr>
                    <th>Student name</th>
                    <th>Age</th>
                    <th>GPA</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${students}" var="student">
                    <tr>
                        <td>${student.sname}</td>
                        <td>${student.age}</td>
                        <td>${student.gpa}</td>
                        <td>
                            <a type="button" class="btn btn-warning" 
                                href="/delete-student?id=${student.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div>
            <a class="button" href="/add-student">Add</a>
        </div>
    </div>

    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>