<%@ page contentType="text/html; charset=EUC-KR"%>
<%
String id = (String)session.getAttribute("idKey");
%>
<html>
<body>
<h1>Servelt ����</h1>
<%
if(id!=null) {
%>
<%=id%>�� �ݰ����ϴ�.<p/>
<a href = 'logout.jsp'>�α׾ƿ�</a>
<%
}
else{
%>
<form method="post" action="LoginServlet">
id : <input name="id"><br/>
pwd : <input type="password" name="pwd"><br/>
<input type="submit" value="�α���">
</form>
<%}%>
</body>
</html>