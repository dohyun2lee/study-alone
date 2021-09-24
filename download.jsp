<%@page contentType="application; charset=EUC-KR"%>
<jsp:useBean id="bMgr" class="chapter15.BoardMgr" />
<%
	  bMgr.downLoad(request, response, out, pageContext);
%>