<%--
  Created by IntelliJ IDEA.
  User: Cheng
  Date: 2018/11/2
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/springmvc/student/insert.action" method="post">

    <table>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><input type="text" name="gender"/></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>生日：</td>
            <td><input type="date" name="birthday"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="增加">
            </td>
        </tr>
    </table>
</form>


</body>
</html>
