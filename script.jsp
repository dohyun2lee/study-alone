<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<title>
JSP스크립트 Example
</title>
<body>
<h1>
Script Example
</h1>
<%! String declaration = "Declaration"; %>
<%! 
public String decMethod(){
	return declaration;
}
%>
<%
String scriptlet = "Scriptlet";
String comment = "Comment";
out.println("내장객체를 이용한 출력 :"+declaration+"<p>");
%>
선언문의 출력1 : <%=declaration%><p>
선언문의 출력2 : <%=decMethod()%><p>
스트립트릿의 출력 : <%=scriptlet%><p>
<!-- JSP주석부분 -->
<!-- JSP주석1 : <%=comment%> --><p>
<%-- JSP주석2 : <%comment%> --%>
<% /* 주석
(여러줄 주석)
*/
%>
<%// 주석(한줄 주석) %>
</body>
</html>