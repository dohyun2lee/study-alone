<%@ page contentType="text/html; charset=EUC-KR" %>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mMgr" class="chapter14.MemberMgr"/>
<jsp:useBean id="mBean" class="chapter14.MemberBean"/>
<jsp:setProperty  name="mBean" property="*"/>
<%
	  boolean result = mMgr.updateMember(mBean);
	  if(result){
%>
<script type="text/javascript">
		alert("ȸ������ ���� �Ͽ����ϴ�.");
		location.href="../main.jsp";
</script>
<% }else{%>
<script type="text/javascript">
		alert("ȸ������ ������ ���� �Ͽ����ϴ�.");
		history.back();
</script>
<%} %>