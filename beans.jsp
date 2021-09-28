<%@ page contentType="text/html; charset=EUC-KR" %>
<jsp:useBean id="bean" class="chapter18.ELBean"/>
<jsp:setProperty name="bean" property="sitaName"/>
<html>
<head>
<title>Expression Language</title>
</head>
<body>
<h2>EL의 Beans</h2>
빈즈액션 태그<br/> 
사이트명 : <jsp:getProperty name="bean"  property="sitaName"/><p/>
EL Beans <br/>
사이트명 : ${bean.sitaName}
</body>
</html>