<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="br.com.teste.kleber.webservice.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.com.teste.kleber.webservice.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id42");
        int id_1idTemp  = Integer.parseInt(id_1id);
        br.com.teste.kleber.model.Exame getExame13mtemp = sampleServiceProxyid.getExame(id_1idTemp);
if(getExame13mtemp == null){
%>
<%=getExame13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">responsavel:</TD>
<TD>
<%
if(getExame13mtemp != null){
java.lang.String typeresponsavel16 = getExame13mtemp.getResponsavel();
        String tempResultresponsavel16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresponsavel16));
        %>
        <%= tempResultresponsavel16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">resultado:</TD>
<TD>
<%
if(getExame13mtemp != null){
java.lang.String typeresultado18 = getExame13mtemp.getResultado();
        String tempResultresultado18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresultado18));
        %>
        <%= tempResultresultado18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">exame:</TD>
<TD>
<%
if(getExame13mtemp != null){
java.lang.String typeexame20 = getExame13mtemp.getExame();
        String tempResultexame20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexame20));
        %>
        <%= tempResultexame20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">medico:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">nome:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Medico tebece0=getExame13mtemp.getMedico();
if(tebece0 != null){
java.lang.String typenome24 = tebece0.getNome();
        String tempResultnome24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenome24));
        %>
        <%= tempResultnome24 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">especialidade:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Medico tebece0=getExame13mtemp.getMedico();
if(tebece0 != null){
java.lang.String typeespecialidade26 = tebece0.getEspecialidade();
        String tempResultespecialidade26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespecialidade26));
        %>
        <%= tempResultespecialidade26 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">crm:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Medico tebece0=getExame13mtemp.getMedico();
if(tebece0 != null){
java.lang.String typecrm28 = tebece0.getCrm();
        String tempResultcrm28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecrm28));
        %>
        <%= tempResultcrm28 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Medico tebece0=getExame13mtemp.getMedico();
if(tebece0 != null){
%>
<%=tebece0.getId()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">paciente:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">convenio:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Paciente tebece0=getExame13mtemp.getPaciente();
if(tebece0 != null){
java.lang.String typeconvenio34 = tebece0.getConvenio();
        String tempResultconvenio34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeconvenio34));
        %>
        <%= tempResultconvenio34 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">nome:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Paciente tebece0=getExame13mtemp.getPaciente();
if(tebece0 != null){
java.lang.String typenome36 = tebece0.getNome();
        String tempResultnome36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenome36));
        %>
        <%= tempResultnome36 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getExame13mtemp != null){
br.com.teste.kleber.model.Paciente tebece0=getExame13mtemp.getPaciente();
if(tebece0 != null){
%>
<%=tebece0.getId()
%><%}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getExame13mtemp != null){
%>
<%=getExame13mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>