<%-- 
    Document   : add
    Created on : Sep 23, 2020, 3:43:35 PM
    Author     : Admin
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<style type="text/css">
.main{
width: 700px;
margin-left: 250px;
padding: 10px;
border: 5px solid grey;
}
table{
font-family: arial, sans-serif;
border-collapse: collapse;
width: 600px;
}
td{
border: 5px solid silver;
text-align: left;
padding: 8px;
}
</style>
<!-- javascript codes for form validation -->
<script>
function validate()
{
    var name = document.myform.txt_name;
    var email = document.myform.txt_email;
    if (name.value == "")
    {
        window.alert("Please enter name?");
        name.focus();
        return false;
    }
    if (email.value == "")
    {
        window.alert("Please enter email?");
        email.focus();
        return false;
    }
}
</script>    
<div class="main">
    <form method="post" name="myform" onsubmit="return validate();">
        <center>
            <h1>Update User</h1>
        </center>
        <table>
            <%
            try
            {
                Class.forName("com.mysql.jdbc.Driver"); // Load driver
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/n2cms", "root", "");
                if (request.getParameter("id")!=null)
                {
                    int id = Integer.parseInt(request.getParameter("id"));
                    String name, email;
                    PreparedStatement pstmt = null; // Create statement
                    pstmt = con.prepareStatement("SELECT * FROM users WHERE id=?");
                    pstmt.setInt(1, id);
                    ResultSet rs = pstmt.executeQuery();
                    while(rs.next())
                    {
                        id = rs.getInt(1);
                        name = rs.getString(2);
                        email = rs.getString(3);
                        %>
                        
            <tr>
                <td>Fullname</td>
                <td><input type="text" name="txt_name" value="<%=name%>"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="txt_email" value="<%=email%>"></td>
            </tr>
            <tr>
                <td><input type="hidden" name="txt_id" value="<%=id%>"></td>
                <td><input type="submit" name="btn_update" value="Update"></td>
            </tr>
            <%
                    }
                }
            }
            catch (Exception e)
            {
                out.println(e);
            }         
            %>
        </table>
        <center>
            <h1><a href="../users">Back</a></h1>
        </center>
    </form>
</div>
