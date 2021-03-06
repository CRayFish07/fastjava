package com.fastjavaframework.support.html;

/*
<div class="infoPage">

	<div class="path content">
			spring&nbsp;&nbsp;&nbsp;：<input type="text" name="springPath" id="springPath" class="xmlPath"/><br/>
			web.xml：<input type="text" name="webXmlPath" id="webXmlPath" class="xmlPath"/>
			<button onclick="doFastJava('moduleHelper_setXmlPath')">确定</button>
	</div>

	<div class="content" style="height:230px">
		<div class="title">错误信息类</div>
		<div class="margin">
			状态：<font id="errState"></font>
		</div>
		<div class="margin">
			<font>* 配置在spring配置文件中</font>
		</div>
		<textarea id="errText" readonly="readonly" class="margin" style="margin-top:0px;height:90px">
<!-- 错误信息 -->
<bean id="exceptionHandler" class="com.fastjava.Exception.ExceptionHandler">
	<property name="message" value="请稍后再试！" /><!-- 自定义返回错误信息 -->
</bean></textarea>
	</div>

	<div class="content" style="height:625px">
		<div class="title">Druid监控</div>
		<div class="margin">
			状态：<font id="druidState"></font>
		</div>
		<div class="margin">
			<font>* 配置在web.xml中</font>
		</div>
		<textarea readonly="readonly" class="margin" style="margin-top:0px;height:485px">
<!-- Druid数据库监控 -->
<servlet>
	<servlet-name>DruidStatView</servlet-name>
	<servlet-class>com.alibaba.druid.support.http.StatViewServlet</servlet-class>
</servlet>
<servlet-mapping>
	<servlet-name>DruidStatView</servlet-name>
	<url-pattern>/druid/*</url-pattern>
</servlet-mapping>

<filter>
	<filter-name>DruidWebStatFilter</filter-name>
	<filter-class>com.alibaba.druid.support.http.WebStatFilter</filter-class>
	<init-param>
		<param-name>exclusions</param-name>
		<param-value>*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*</param-value>
	</init-param>
</filter>
<filter-mapping>
	<filter-name>DruidWebStatFilter</filter-name>
	<url-pattern>/*</url-pattern>
</filter-mapping></textarea>
	</div>

</div>

<script>
var springPath;
var webXmlPath;
var errSwitch;
var druidSwitch;

function onloadFunction() {
	document.getElementById("springPath").value = typeof(springPath)=="undefined"?"":springPath;
	document.getElementById("webXmlPath").value = typeof(webXmlPath)=="undefined"?"":webXmlPath;
	if(errSwitch) {
		document.getElementById("errState").innerHTML = "已启用";
	} else {
		document.getElementById("errState").innerHTML = "未启用";
	}
	if(druidSwitch) {
		document.getElementById("druidState").innerHTML = "已启用";
	} else {
		document.getElementById("druidState").innerHTML = "未启用";
	}
}

//读取项目路径
function readPath() {
	doFastJava('moduleHelper'); //读取项目路径
}
</script>
<style>
.infoPage {
	margin-left: auto;
	margin-right:auto;
	width:970px;
}
.content {
	background-color: white;
	height:510px;
	color:#4E4E4E;
	margin-bottom: 20px;
}
.path {
	height:60px;
	padding-top:10px;
	padding-left:35px;
}
.xmlPath {
	width: 750px;
}
.title {
	height:40px;
	line-height:40px;
	border-bottom:1px solid rgba(0,0,0,.15);
	padding-left:10px;
	font-size:16px;
}
.margin {
	margin: 15px 35px 0px;
}
textarea {
	resize: none;
	width: 900px;
	font-size:16px;
	font-family: Microsoft Yahei,Helvetica Neue,Hiragino Sans GB,WenQuanYi Micro Hei,sans-serif
}
</style>
 */
public class ModuleHelperHtml {

    public String html() {
        StringBuffer sb = new StringBuffer();
        String newLine = System.getProperty("line.separator");

        sb.append(newLine).append("<div class=\"infoPage\">")
                .append(newLine).append("	")
                .append(newLine).append("	<div class=\"path content\">")
                .append(newLine).append("			spring&nbsp;&nbsp;&nbsp;：<input type=\"text\" name=\"springPath\" id=\"springPath\" class=\"xmlPath\"/><br/>")
                .append(newLine).append("			web.xml：<input type=\"text\" name=\"webXmlPath\" id=\"webXmlPath\" class=\"xmlPath\"/>")
                .append(newLine).append("			<button onclick=\"doFastJava('moduleHelper_setXmlPath')\">确定</button>")
                .append(newLine).append("	</div>")
                .append(newLine).append("	")
                .append(newLine).append("	<div class=\"content\" style=\"height:230px\">")
                .append(newLine).append("		<div class=\"title\">错误信息类</div>")
                .append(newLine).append("		<div class=\"margin\">")
                .append(newLine).append("			状态：<font id=\"errState\"></font>")
                .append(newLine).append("		</div>")
                .append(newLine).append("		<div class=\"margin\">")
                .append(newLine).append("			<font>* 配置在spring配置文件中</font>")
                .append(newLine).append("		</div>")
                .append(newLine).append("		<textarea id=\"errText\" readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:90px\">")
                .append(newLine).append("<!-- 错误信息 -->")
                .append(newLine).append("<bean id=\"exceptionHandler\" class=\"com.fastjava.Exception.ExceptionHandler\">")
                .append(newLine).append("	<property name=\"message\" value=\"请稍后再试！\" /><!-- 自定义返回错误信息 -->")
                .append(newLine).append("</bean></textarea>")
                .append(newLine).append("	</div>")
                .append(newLine).append("")
                .append(newLine).append("	<div class=\"content\" style=\"height:625px\">")
                .append(newLine).append("		<div class=\"title\">Druid监控</div>")
                .append(newLine).append("		<div class=\"margin\">")
                .append(newLine).append("			状态：<font id=\"druidState\"></font>")
                .append(newLine).append("		</div>")
                .append(newLine).append("		<div class=\"margin\">")
                .append(newLine).append("			<font>* 配置在web.xml中</font>")
                .append(newLine).append("		</div>")
                .append(newLine).append("		<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:485px\">")
                .append(newLine).append("<!-- Druid数据库监控 -->")
                .append(newLine).append("<servlet>")
                .append(newLine).append("	<servlet-name>DruidStatView</servlet-name>")
                .append(newLine).append("	<servlet-class>com.alibaba.druid.support.http.StatViewServlet</servlet-class>")
                .append(newLine).append("</servlet>")
                .append(newLine).append("<servlet-mapping>")
                .append(newLine).append("	<servlet-name>DruidStatView</servlet-name>")
                .append(newLine).append("	<url-pattern>/druid/*</url-pattern>")
                .append(newLine).append("</servlet-mapping>")
                .append(newLine).append("")
                .append(newLine).append("<filter>")
                .append(newLine).append("	<filter-name>DruidWebStatFilter</filter-name>")
                .append(newLine).append("	<filter-class>com.alibaba.druid.support.http.WebStatFilter</filter-class>")
                .append(newLine).append("	<init-param>")
                .append(newLine).append("		<param-name>exclusions</param-name>")
                .append(newLine).append("		<param-value>*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*</param-value>")
                .append(newLine).append("	</init-param>")
                .append(newLine).append("</filter>")
                .append(newLine).append("<filter-mapping>")
                .append(newLine).append("	<filter-name>DruidWebStatFilter</filter-name>")
                .append(newLine).append("	<url-pattern>/*</url-pattern>")
                .append(newLine).append("</filter-mapping></textarea>")
                .append(newLine).append("	</div>")
                .append(newLine).append("	")
                .append(newLine).append("</div>")
                .append(newLine).append("")
                .append(newLine).append("<script>")
                .append(newLine).append("var springPath;")
                .append(newLine).append("var webXmlPath;")
                .append(newLine).append("var errSwitch;")
                .append(newLine).append("var druidSwitch;")
                .append(newLine).append("")
                .append(newLine).append("function onloadFunction() {")
                .append(newLine).append("	document.getElementById(\"springPath\").value = typeof(springPath)==\"undefined\"?\"\":springPath;")
                .append(newLine).append("	document.getElementById(\"webXmlPath\").value = typeof(webXmlPath)==\"undefined\"?\"\":webXmlPath;")
                .append(newLine).append("	if(errSwitch) {")
                .append(newLine).append("		document.getElementById(\"errState\").innerHTML = \"已启用\";")
                .append(newLine).append("	} else {")
                .append(newLine).append("		document.getElementById(\"errState\").innerHTML = \"未启用\";")
                .append(newLine).append("	}")
                .append(newLine).append("	if(druidSwitch) {")
                .append(newLine).append("		document.getElementById(\"druidState\").innerHTML = \"已启用\";")
                .append(newLine).append("	} else {")
                .append(newLine).append("		document.getElementById(\"druidState\").innerHTML = \"未启用\";")
                .append(newLine).append("	}")
                .append(newLine).append("}")
                .append(newLine).append("")
                .append(newLine).append("//读取项目路径")
                .append(newLine).append("function readPath() {")
                .append(newLine).append("	doFastJava('moduleHelper'); //读取项目路径")
                .append(newLine).append("}")
                .append(newLine).append("</script>")
                .append(newLine).append("<style>")
                .append(newLine).append(".infoPage {")
                .append(newLine).append("	margin-left: auto;")
                .append(newLine).append("	margin-right:auto;")
                .append(newLine).append("	width:970px;")
                .append(newLine).append("}")
                .append(newLine).append(".content {")
                .append(newLine).append("	background-color: white;")
                .append(newLine).append("	height:510px;")
                .append(newLine).append("	color:#4E4E4E;")
                .append(newLine).append("	margin-bottom: 20px;")
                .append(newLine).append("}")
                .append(newLine).append(".path {")
                .append(newLine).append("	height:60px;")
                .append(newLine).append("	padding-top:10px;")
                .append(newLine).append("	padding-left:35px;")
                .append(newLine).append("}")
                .append(newLine).append(".xmlPath {")
                .append(newLine).append("	width: 750px;")
                .append(newLine).append("}")
                .append(newLine).append(".title {")
                .append(newLine).append("	height:40px;")
                .append(newLine).append("	line-height:40px;")
                .append(newLine).append("	border-bottom:1px solid rgba(0,0,0,.15);")
                .append(newLine).append("	padding-left:10px;")
                .append(newLine).append("	font-size:16px;")
                .append(newLine).append("}")
                .append(newLine).append(".margin {")
                .append(newLine).append("	margin: 15px 35px 0px;")
                .append(newLine).append("}")
                .append(newLine).append("textarea {")
                .append(newLine).append("	resize: none;")
                .append(newLine).append("	width: 900px;")
                .append(newLine).append("	font-size:16px;")
                .append(newLine).append("	font-family: Microsoft Yahei,Helvetica Neue,Hiragino Sans GB,WenQuanYi Micro Hei,sans-serif")
                .append(newLine).append("}")
                .append(newLine).append("</style>");

        return sb.toString();
    }
}
