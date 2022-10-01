<%@ page import="java.util.ArrayList" %>
<%@ page import="com.shrcb.servlet.entity.User" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<body>


<%
    Object users = request.getAttribute("users");
    if (null!=users && users instanceof ArrayList){
        ArrayList<User> list = (ArrayList<User>) users;
        for(User user:list){
%>
<div>
<tr>
    <td><%=user.getId()%></td>
    <td><%=user.getAge()%></td>
    <td><%=user.getName()%></td>
</tr>
</div>
<%
        }
    }
%>
</body>
</html>
