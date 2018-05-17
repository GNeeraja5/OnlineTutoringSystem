<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<style>

table{
    width: 60%;
    
}
th
{
text-align: left;}
td
{
    border-radius: 25px;
    background: grey;
    background-position: left top;
    background-repeat: repeat;
    padding: 0px,10px,10px,5px; 
    width: 20px;
    height: 15px; 
    text-align: left;
}
#logout
{
align:right;
}


</style>
</head>

<body>
<p style="font-size:160%;">Welcome Student<p>
<input type="button" value="Logout" style="float: right;">
<h3>Courses Available</h3>
<table class="table" frame="box" cellpadding = "10" class="coursetable" >
  <thead>
    <tr>
      <th scope="col" position="static">Course Name</th>
      <th scope="col">Available Tutors</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      
    </tr>
  </tbody>
</table>
<br>
<h3>Student completed/subscribed learnings </h3>
<table class="table table-striped" frame="box" cellpadding = "10">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Course Name</th>
      <th scope="col">Tutor Name</th>
      <th scope="col">Status</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>

</body>
</html>