<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<title>cook Cookie</title>
</head>
<%
String cookieName = "myCookie";
Cookie cookie = new Cookie(cookieName, "Apple");
cookie.setMaxAge(60);
cookie.setValue("Melone");
response.addCookie(cookie);
%>
<body>
<h1>Example Cookie</h1>
��Ű�� ����ϴ�.<br/>
��Ű ������ <a href = "tasteCookie.jsp">�����</a>!!!
</body>
</html>