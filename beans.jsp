<%@ page contentType="text/html; charset=EUC-KR" %>
<jsp:useBean id="bean" class="chapter18.ELBean"/>
<jsp:setProperty name="bean" property="sitaName"/>
<html>
<head>
<title>Expression Language</title>
</head>
<body>
<h2>EL�� Beans</h2>
����׼� �±�<br/> 
����Ʈ�� : <jsp:getProperty name="bean"  property="sitaName"/><p/>
EL Beans <br/>
����Ʈ�� : ${bean.sitaName}
</body>
</html>