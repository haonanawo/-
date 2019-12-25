<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<title>login</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<!-- -->
</head>
<body>
<!-- contact-form -->	
<div class="message warning">
<div class="inset">
	<div class="login-head">
		<h1>人力资源管理系统</h1>
		 <div class="alert-close"> </div> 			
	</div>
		<form action="LoginaServlet" method="post">
			<li>
				<input type="text" class="text" name="username">
			</li>
				<div class="clear"> </div>
			<li>
				<input type="password" name="password" > 
			</li>
			<div class="clear"> </div>
			<div class="submit">
				<input type="submit"  value="登录" >
				<h4><a href="#">忘记密码?</a></h4>
						  <div class="clear">  </div>	
			</div>
				
		</form>
		</div>					
	</div>
	</div>
	<div class="clear"> </div>

</body>
</html>