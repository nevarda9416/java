<%-- 
    Document   : list
    Created on : Sep 23, 2020, 5:12:31 PM
    Author     : Admin
--%>
<style type="text/css">
.main{
width: 700px;
margin-left: 250px;
padding: 10px;
border: 5px solid grey;
}
table{
font-family:arial,sans-serif;
border-collapse:collapse;
width:600px;
}
td{
border:5px solid silver;
text-align:center;
padding:8px;
}
</style>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<div class="main">
    <center>
        <h1><a href="../users/add">Add User</a></h1>
    </center>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <%
          try
          {
            Class.forName("com.mysql.jdbc.Driver"); // Load driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/n2cms", "root", ""); // Create connection         
                PreparedStatement pstmt = null; // Create statement
                pstmt=con.prepareStatement("select * from users"); // SQL insert query
                ResultSet rs = pstmt.executeQuery(); // Execute query
                while(rs.next())
                {
                %>
                <tr>
                    <td><%=rs.getInt(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><a href="../users/update?id=<%=rs.getInt(1)%>">Edit</a></td>
                    <td><a href="../users/delete?id=<%=rs.getInt(1)%>">Delete</a></td>
                </tr>
                <%
                }
          } catch (Exception e) {
            out.println(e);
          }
        %>    
    </table>
</div>
    
