<%@ page contentType="text/html; charset=EUC-KR"%>
<%
response.setHeader("Pragma","no-cache");
if(request.getProtocol().equals("HTTP/1.1")) {
response.setHeader("Cache-Control","no-store");
}
%>
<h1>Response Example</h1>
http://localhost/myapp/src/main/webapp/response1.jsp가<p/>
http://localhost/myapp/src/main/webapp/response1_1.jsp로 변경되었습니다.