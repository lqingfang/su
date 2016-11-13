<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPath"><%=request.getContextPath() %></c:set>
<!DOCTYPE>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${ctxPath}/scripts/lib/css/jquery.slideunlock.css"/>
	<script type="text/javascript" src="${ctxPath}/scripts/lib/js/jquery.js"></script> 
	<script type="text/javascript" src="${ctxPath}/scripts/lib/js/jquery.slideunlock.js"></script> 
	<title>hello</title>
</head>
<body>
	<form id="su01" method="post" action="${ctxPath}/save">
		<input type="text" id="time" name="time" placeholder="xxx"><br><br>
		<input type="button" value="start！" id="start" onClick="startTimer()"><br><br>
		<div class="slideunlock-wrapper">
  				<input type="hidden" value="" class="slideunlock-lockable"/>
  				<div class="slideunlock-slider"> 
  					<span class="slideunlock-label"></span> 
  					<span class="slideunlock-lable-tip">Slide to unlock!</span> 
  				</div>
		</div>
		<br>
		<!--  
		<button id="reset-btn" class="btn btn-primary">Reset</button>
		-->
		<!--  <p class="warn"></p> -->
		<input type="button" value="click me!">&nbsp;&nbsp;&nbsp;
		<input type="button" value="click me!">&nbsp;&nbsp;&nbsp;
		<input type="button" value="click me!"><br><br>
		<input type="button" value="stop！" id="end" onClick="stopTimer()"><br><br>
		<input type="button" value="restart" onClick="clearAll()">
	</form>
</body>
<script type="text/javascript">
	var myVar;
	var count = 0;
	function startTimer() {
		/*setInterval() 间隔指定的毫秒数不停地执行指定的代码*/
		myVar = setInterval(function() {
			myTimer()
		}, 1000);
	}
	function myTimer()/* 定义一个得到本地时间的函数*/
	{
		count++;
		document.getElementById("time").value = count;
	}
	function clearAll() {/* clearInterval() 方法用于停止 setInterval() 方法执行的函数代码*/
		clearInterval(myVar);
		count=0;
		document.getElementById("time").value = "xxx";
	}
	function stopTimer() {
		document.getElementById("su01").submit();
	}
</script>

  
<script type="text/javascript">
    $(function () {
        var slider = new SliderUnlock(".slideunlock-slider", {}, function(){
            <!--alert('success');-->
        }, function(){
            <!--$(".warn").text("index:" + slider.index + "， max:" + slider.max + ",lableIndex:" + slider.lableIndex + ",value:" + $(".slideunlock-lockable").val() + " date:" + new Date().getUTCDate());
        	-->
        });
        slider.init();
        $("#reset-btn").on('click', function(){
            slider.reset();
        });
    })
</script>

</html>