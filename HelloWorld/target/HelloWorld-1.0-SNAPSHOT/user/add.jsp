<%-- 
    Document   : add
    Created on : Sep 23, 2020, 3:43:35 PM
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
            <h1>Insert User</h1>
        </center>
        <table>
            <tr>
                <td>Fullname</td>
                <td><input type="text" name="txt_name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="txt_email"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="btn_add" value="Insert"></td>
            </tr>
        </table>
        <center>
            <h1><a href="../users">Back</a></h1>
        </center>
    </form>
</div>
