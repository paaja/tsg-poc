<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
MVC link: <a href="/index.do">index.do</a><br/>
 Hi from TSG: <%= new Date() %><br/>

Value from MVC (HomePageController): ${dateTime}<br/>
</body>
</html>