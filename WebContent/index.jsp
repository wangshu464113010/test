<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<script>
		function getXMLHttpRequest(){
			var xhr = false;
			if(window.XMLHttpRequest){
				xhr = new XMLHttpRequest();
			}else if(window.ActiveXObject){
				xhr = new ActiveXObject("Micrsoft.XMLHttp");
			}
			return xhr;
		}
		window.onload = function(){
			alert(getXMLHttpRequest());
			var toAjax = document.getElementById('toAjax');
			toAjax.onclick = function(){
				var xhr = getXMLHttpRequest();
				
				xhr.open("get","Hello.txt");//建立与服务器的连接
				//open(method,url,true/false)
				xhr.send();//发送请求、数据
				//send(data) :如果是get请求则不会把数据发送个服务器
				//post还需设置请求消息头Context-type
				xhr.onreadystatechange = function (){//处理返回的数据
					//alert(xhr.readyState);
					if(xhr.readyState == 4){
						if(xhr.status == 200){
						//	alert(xhr.responseText);//获取数据
						//解析json
							var text = xhr.responseText;
							var jsonT = eval("("+text+")");//使用eval解析json
							var d = document.getElementById('d');
							d.innerHTML = "my name is "+jsonT.hello;
						}else if(xhr.status == 404){
							//....未找到
							alert("未找到");
						}
					}
				}
				return false;
			}
		}
		/**json：{key:value}*/
		
	</script>

</head>
<body>
	<a id="toAjax" href="Hello.txt">ersdf</a>
	<a id="toAjax" href="Hello.txt">ersdf</a>
	<a id="toAjax" href="Hello.txt">ersdf</a>
	<div id="d">
		
	</div>
</body>
</html>