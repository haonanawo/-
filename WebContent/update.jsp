<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <base href="<%=basePath%>">
    
    <title>信息修改</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>jQuery Contact Form Plugin: FFForm</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-uii.js" type="text/javascript"></script>
    <!--End Framework-->
     <script src="js/jquery.ffform.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#form').ffform({ animation: 'fade', submitButton: '#submit', validationIndicator: '#validation', errorIndicator: '#error', successIndicator: '#success', 'fields': [{ 'id': 'name', required: true, requiredMsg: 'Name is required', type: 'alpha', validate: true, msg: 'Invalid Name' }, { 'id': 'email', required: true, requiredMsg: 'E-Mail is required', type: 'email', validate: true, msg: 'Invalid E-Mail Address' }, { 'id': 'phone', required: false, type: 'custom', validate: false, msg: 'Invalid Phone #' }, { 'id': 'message', required: false, type: 'text', validate: false, msg: ''}] });
        });
    </script>
    <script>String username = session['user']</script>
</head>
<body class="flipInX animated">
 
    <section id="getintouch">
        <div class="container" style="border-bottom: 0;">
            <h1>
                <span>修改员工信息!</span>
            </h1>
        </div>
        <div class="container">
            <form class="contact" action="EmployeeUpdateServlet" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">
                        编号</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="name" data-required="true" data-validation="text"
                        data-msg="Invalid Name" placeholder="Ex: John Donga" name="eno" value="${em.eno }" readonly="readonly">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="email">
                        姓名</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="email"  data-required="true" data-validation="email"
                        data-msg="Invalid E-Mail" placeholder="Ex: youremail@domain.com" name="ename" value="${em.ename }">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="email">
                        性别</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="phone" data-required="true" data-validation="custom"
                        data-msg="Invalid Phone #" placeholder="Ex: 111-258-444" name="esex" value="${em.esex }">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        年龄</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="subject" placeholder="Ex: Quote for Project" name="eage" value="${em.eage }">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="message">
                        电话</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="message" name="etel" value="${em.etel }">
                    <input type="hidden" name="username" value="3">
                </div>
            </div>
            <div class="row  clearfix">
                <div class="span10 offset2">
                    <input type="submit"  class="submit" value="修改员工信息">
                </div>
            </div>
            </form>
         
        </div>
    </section>
</body>
</html>
