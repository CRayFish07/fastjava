package com.fastjavaframework.support.html;

/*
<div class="infoPage">

	<div class="path content">
			log4j配置文件&nbsp;&nbsp;：<input class="xmlPath" id="log4jPath" name="log4jPath" type="text"/><br/>
			数据源配置文件：<input class="xmlPath" id="dataSourcePath" name="dataSourcePath" type="text"/>
			<button onclick="doFastJava('logHelper_setXmlPath')">确定</button>
	</div>

	<div class="content" style="height:295px">
		<div class="title">sql控制台打印</div>
		<div>
			<div class="margin">
				状态：<font id="sqlSwitch"></font>
			</div>
			<div class="margin">
				<font>* 配置在log4j.xml中，建议发布时取消</font>
			</div>
			<textarea readonly="readonly" class="margin" style="margin-top:0px;height:90px">
<!-- sql控制台输出 -->
<logger name="jdbc.sqltiming">
	<param name="Level" value="WARNING" />
</logger></textarea>
			<div class="margin">
				<font>* 数据源jdbcUrl中需增加“log4jdbc:”，建议发布时取消</font>
			</div>
			<textarea readonly="readonly" class="margin" style="margin-top:0px;height:22px">
jdbc:log4jdbc:mysql://${ip}:${port}/${project}</textarea>
		</div>
	</div>

	<div class="content" style="height:520px">
		<div class="title">定时任务日志</div>
		<div class="margin">
			<font>* 配置在log4j.xml中，同时quartz.xml中log总开关需开启才生成</font>
		</div>
			<textarea readonly="readonly" class="margin" style="margin-top:0px;height:263px">
<!-- 定时任务日志输出 -->
<appender name="QUARTZ_LOG_FILE" class="org.apache.log4j.DailyRollingFileAppender">
	<errorHandler class="org.apache.log4j.helpers.OnlyOnceErrorHandler" />
	<param name="Encoding" value="utf-8" />
	<param name="Threshold" value="INFO" />
	<param name="File" value="../logs/${project.name}/quartz/quartz.log" />	<!-- 保存路径 -->
	<param name="Append" value="true" />
	<param name="DatePattern" value="'.'yyyy-MM-dd'.log'" />
	<layout class="org.apache.log4j.PatternLayout">
		<param name="ConversionPattern" value="%m%n%n" />
	</layout>
</appender></textarea>
		<div class="margin">
			<font>* 扫描定时任务所在包</font>
		</div>
			<textarea readonly="readonly" class="margin" style="margin-top:0px;height:110px">
 <!-- 定时任务日志包 -->
<logger name="com.fastjava.quartz">
	<param name="Level" value="INFO" />
	<appender-ref ref="QUARTZ_LOG_FILE" />
</logger></textarea>
	</div>

</div>

<script>
var log4jPath;
var dataSourcePath;
var sqlSwitch;
var dataSourceSwitch;

function onloadFunction() {
	document.getElementById("log4jPath").value = typeof(log4jPath)=="undefined"?"":log4jPath;
	document.getElementById("dataSourcePath").value = typeof(dataSourcePath)=="undefined"?"":dataSourcePath;
	if(sqlSwitch && dataSourceSwitch) {
		document.getElementById("sqlSwitch").innerHTML = "已启用";
	} else if(!sqlSwitch) {
		document.getElementById("sqlSwitch").innerHTML = "log4j.xml未配置";
	} else if(!dataSourceSwitch) {
		document.getElementById("sqlSwitch").innerHTML = "jdbcUrl未配置";
	}
}

//读取项目路径
function readPath() {
	doFastJava('logHelper'); //读取项目路径
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
	width: 700px;
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
public class LogHelperHtml {

    public String html() {
        StringBuffer sb = new StringBuffer();
        String newLine = System.getProperty("line.separator");
        
        sb.append(newLine).append("<div class=\"infoPage\">")
                .append(newLine).append("")
                .append(newLine).append("	<div class=\"path content\">")
                .append(newLine).append("			log4j配置文件&nbsp;&nbsp;：<input class=\"xmlPath\" id=\"log4jPath\" name=\"log4jPath\" type=\"text\"/><br/>")
                .append(newLine).append("			数据源配置文件：<input class=\"xmlPath\" id=\"dataSourcePath\" name=\"dataSourcePath\" type=\"text\"/>")
                .append(newLine).append("			<button onclick=\"doFastJava('logHelper_setXmlPath')\">确定</button>")
                .append(newLine).append("	</div>")
                .append(newLine).append("")
                .append(newLine).append("	<div class=\"content\" style=\"height:295px\">")
                .append(newLine).append("		<div class=\"title\">sql控制台打印</div>")
                .append(newLine).append("		<div>")
                .append(newLine).append("			<div class=\"margin\">")
                .append(newLine).append("				状态：<font id=\"sqlSwitch\"></font>")
                .append(newLine).append("			</div>")
                .append(newLine).append("			<div class=\"margin\">")
                .append(newLine).append("				<font>* 配置在log4j.xml中，建议发布时取消</font>")
                .append(newLine).append("			</div>")
                .append(newLine).append("			<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:90px\">")
                .append(newLine).append("<!-- sql控制台输出 -->")
                .append(newLine).append("<logger name=\"jdbc.sqltiming\">")
                .append(newLine).append("	<param name=\"Level\" value=\"WARNING\" />")
                .append(newLine).append("</logger></textarea>")
                .append(newLine).append("			<div class=\"margin\">")
                .append(newLine).append("				<font>* 数据源jdbcUrl中需增加“log4jdbc:”，建议发布时取消</font>")
                .append(newLine).append("			</div>")
                .append(newLine).append("			<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:22px\">")
                .append(newLine).append("jdbc:log4jdbc:mysql://${ip}:${port}/${project}</textarea>")
                .append(newLine).append("		</div>")
                .append(newLine).append("	</div>")
                .append(newLine).append("")
                .append(newLine).append("	<div class=\"content\" style=\"height:520px\">")
                .append(newLine).append("		<div class=\"title\">定时任务日志</div>")
                .append(newLine).append("		<div class=\"margin\">")
                .append(newLine).append("			<font>* 配置在log4j.xml中，同时quartz.xml中log总开关需开启才生成</font>")
                .append(newLine).append("		</div>")
                .append(newLine).append("			<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:263px\">")
                .append(newLine).append("<!-- 定时任务日志输出 -->")
                .append(newLine).append("<appender name=\"QUARTZ_LOG_FILE\" class=\"org.apache.log4j.DailyRollingFileAppender\">")
                .append(newLine).append("	<errorHandler class=\"org.apache.log4j.helpers.OnlyOnceErrorHandler\" />")
                .append(newLine).append("	<param name=\"Encoding\" value=\"utf-8\" />")
                .append(newLine).append("	<param name=\"Threshold\" value=\"INFO\" />")
                .append(newLine).append("	<param name=\"File\" value=\"../logs/${project.name}/quartz/quartz.log\" />	<!-- 保存路径 -->")
                .append(newLine).append("	<param name=\"Append\" value=\"true\" />")
                .append(newLine).append("	<param name=\"DatePattern\" value=\"'.'yyyy-MM-dd'.log'\" />")
                .append(newLine).append("	<layout class=\"org.apache.log4j.PatternLayout\">")
                .append(newLine).append("		<param name=\"ConversionPattern\" value=\"%m%n%n\" />")
                .append(newLine).append("	</layout>")
                .append(newLine).append("</appender></textarea>")
                .append(newLine).append("		<div class=\"margin\">")
                .append(newLine).append("			<font>* 扫描定时任务所在包</font>")
                .append(newLine).append("		</div>")
                .append(newLine).append("			<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:110px\">")
                .append(newLine).append(" <!-- 定时任务日志包 -->")
                .append(newLine).append("<logger name=\"com.fastjava.quartz\">")
                .append(newLine).append("	<param name=\"Level\" value=\"INFO\" />")
                .append(newLine).append("	<appender-ref ref=\"QUARTZ_LOG_FILE\" />")
                .append(newLine).append("</logger></textarea>")
                .append(newLine).append("	</div>")
                .append(newLine).append("	")
                .append(newLine).append("</div>")
                .append(newLine).append("")
                .append(newLine).append("<script>")
                .append(newLine).append("var log4jPath;")
                .append(newLine).append("var dataSourcePath;")
                .append(newLine).append("var sqlSwitch;")
                .append(newLine).append("var dataSourceSwitch;")
                .append(newLine).append("")
                .append(newLine).append("function onloadFunction() {")
                .append(newLine).append("	document.getElementById(\"log4jPath\").value = typeof(log4jPath)==\"undefined\"?\"\":log4jPath;")
                .append(newLine).append("	document.getElementById(\"dataSourcePath\").value = typeof(dataSourcePath)==\"undefined\"?\"\":dataSourcePath;")
                .append(newLine).append("	if(sqlSwitch && dataSourceSwitch) {")
                .append(newLine).append("		document.getElementById(\"sqlSwitch\").innerHTML = \"已启用\";")
                .append(newLine).append("	} else if(!sqlSwitch) {")
                .append(newLine).append("		document.getElementById(\"sqlSwitch\").innerHTML = \"log4j.xml未配置\";")
                .append(newLine).append("	} else if(!dataSourceSwitch) {")
                .append(newLine).append("		document.getElementById(\"sqlSwitch\").innerHTML = \"jdbcUrl未配置\";")
                .append(newLine).append("	}")
                .append(newLine).append("}")
                .append(newLine).append("")
                .append(newLine).append("//读取项目路径")
                .append(newLine).append("function readPath() {")
                .append(newLine).append("	doFastJava('logHelper'); //读取项目路径")
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
                .append(newLine).append("	width: 700px;")
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
