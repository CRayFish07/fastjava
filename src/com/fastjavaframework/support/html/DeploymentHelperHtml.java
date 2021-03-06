package com.fastjavaframework.support.html;

/*
<div class="infoPage">

	<div class="content" style="height:180px">
		<div class="title">数据库</div>
		<div class="margin">
			<p>
				数据库：<input type="text" value="test" />
			</p>
			<p>
				地&nbsp;&nbsp;&nbsp;址：<input type="text" value="127.0.0.1" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				端&nbsp;&nbsp;&nbsp;口：<input type="text" value="3306" />
			</p>
			<p>
				用户名：<input type="text" value="root" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				密&nbsp;&nbsp;&nbsp;码：<input type="text" value="" />
			</p>
		</div>
	</div>

	<div class="content" style="height:240px">
		<div class="title">错误信息类</div>
		<div class="margin">
			<input type="radio" value="1" name="exceptionSwitch">启用
			<input type="radio" value="0" name="exceptionSwitch">停用
		</div>
		<div class="margin">
			自定义返回错误信息：<input type="text" value="请稍后再试！" />
		</div>
		<textarea readonly="readonly" class="margin" style="height:85px">
<bean id="exceptionHandler" class="com.fastjava.Exception.ExceptionHandler">
	<!-- 自定义返回错误信息 -->
	<property name="message" value="请稍后再试！" />
</bean></textarea>
	</div>

	<div class="content" style="height:205px">
		<div class="title">Druid监控</div>
		<div class="margin">
			<input type="radio" value="1" name="exceptionSwitch">启用
			<input type="radio" value="0" name="exceptionSwitch">停用
		</div>
		<textarea readonly="readonly" class="margin" style="height:85px">
<bean id="exceptionHandler" class="com.fastjava.Exception.ExceptionHandler">
	<!-- 自定义返回错误信息 -->
	<property name="message" value="请稍后再试！" />
</bean></textarea>
	</div>

	<div class="content" style="height:330px">
		<div class="title">日志</div>
		<div>
			<div class="margin">sql控制台打印：
				<input type="radio" value="1" name="exceptionSwitch">启用
				<input type="radio" value="0" name="exceptionSwitch">停用
			</div>
			<textarea readonly="readonly" class="margin" style="height:85px">
<bean id="exceptionHandler" class="com.fastjava.Exception.ExceptionHandler">
	<!-- 自定义返回错误信息 -->
	<property name="message" value="请稍后再试！" />
</bean></textarea>
		</div>
		<div class="log4jDiv">
			<div class="margin">错误日志：
				<input type="radio" value="1" name="exceptionSwitch">启用
				<input type="radio" value="0" name="exceptionSwitch">停用<br/>
				保存路径：<input type="text" style="width: 816px" value="" />
			</div>
		</div>
		<div class="log4jDiv">
			<div class="margin">定时任务日志：
				<input type="radio" value="1" name="exceptionSwitch">启用
				<input type="radio" value="0" name="exceptionSwitch">停用<br/>
				保存路径：<input type="text" style="width: 816px" value="" />
			</div>
		</div>
	</div>

</div>

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
.log4jDiv {
	margin-top: 15px;
}
textarea {
	resize: none;
	width: 900px;
	font-size:16px;
	font-family: Microsoft Yahei,Helvetica Neue,Hiragino Sans GB,WenQuanYi Micro Hei,sans-serif
}
</style>
 */
public class DeploymentHelperHtml {

    public String html() {
        StringBuffer sb = new StringBuffer();
        String newLine = System.getProperty("line.separator");

        sb.append(newLine).append("<div class=\"infoPage\">")
                .append(newLine).append("")
                .append(newLine).append("	<div class=\"path content\">")
                .append(newLine).append("			mapper配置文件路径：<input class=\"xmlPath\" id=\"mapperPath\" name=\"mapperPath\" type=\"text\"/>")
                .append(newLine).append("			<button onclick=\"doFastJava('cacheHelper_setXmlPath')\">确定</button>")
                .append(newLine).append("	</div>")
                .append(newLine).append("")
                .append(newLine).append("	<div id=\"successContent\" class=\"content\" style=\"height:95px\">")
                .append(newLine).append("		<div class=\"title\">正确缓存</div>")
                .append(newLine).append("		<div>")
                .append(newLine).append("			<div id=\"successDiv\" class=\"margin\">")
                .append(newLine).append("				<div>")
                .append(newLine).append("					<div class='tableTitle mainCache'>主缓存</div>")
                .append(newLine).append("					<div class='tableTitle fromCache'>从缓存</div>")
                .append(newLine).append("				</div>")
                .append(newLine).append("			</div>")
                .append(newLine).append("		</div>")
                .append(newLine).append("	</div>")
                .append(newLine).append("")
                .append(newLine).append("	<div id=\"failContent\" class=\"content\" style=\"height:95px\">")
                .append(newLine).append("		<div class=\"title\">错误缓存</div>")
                .append(newLine).append("		<div>")
                .append(newLine).append("			<div id=\"failDiv\" class=\"margin\">")
                .append(newLine).append("				<div>")
                .append(newLine).append("					<div class='tableTitle mainCache'>缓存文件</div>")
                .append(newLine).append("					<div class='tableTitle fromCache'>错误原因</div>")
                .append(newLine).append("				</div>")
                .append(newLine).append("			</div>")
                .append(newLine).append("		</div>")
                .append(newLine).append("	</div>")
                .append(newLine).append("")
                .append(newLine).append("	<div class=\"content\" style=\"height:220px\">")
                .append(newLine).append("		<div class=\"title\">缓存配置</div>")
                .append(newLine).append("		<div>")
                .append(newLine).append("			<div class=\"margin\">")
                .append(newLine).append("				<font>* 主缓存中添加</font><br/>")
                .append(newLine).append("				<font>* 主从缓存insert、update、delete操作会刷新缓存</font>")
                .append(newLine).append("			</div>")
                .append(newLine).append("			<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:23px\">")
                .append(newLine).append("<cache type=\"org.mybatis.caches.ehcache.LoggingEhcache\"/></textarea>")
                .append(newLine).append("			<div class=\"margin\">")
                .append(newLine).append("				<font>* 从缓存中添加</font>")
                .append(newLine).append("			</div>")
                .append(newLine).append("			<textarea readonly=\"readonly\" class=\"margin\" style=\"margin-top:0px;height:23px\">")
                .append(newLine).append("<cache-ref namespace=\"主缓存的namespace\"/></textarea>")
                .append(newLine).append("		</div>")
                .append(newLine).append("	</div>")
                .append(newLine).append("	")
                .append(newLine).append("</div>")
                .append(newLine).append("")
                .append(newLine).append("<script>")
                .append(newLine).append("var mapperPath;")
                .append(newLine).append("var successRelation;	//成功配额")
                .append(newLine).append("var failRelation;		//失败配额")
                .append(newLine).append("")
                .append(newLine).append("function onloadFunction() {")
                .append(newLine).append("	document.getElementById(\"mapperPath\").value = typeof(mapperPath)==\"undefined\"?\"\":mapperPath;")
                .append(newLine).append("	showCache(successRelation, \"success\");	//显示成功配额")
                .append(newLine).append("	showCache(failRelation, \"fail\");		//显示失败配额")
                .append(newLine).append("}")
                .append(newLine).append("")
                .append(newLine).append("//显示配额信息")
                .append(newLine).append("function showCache(relation, type) {")
                .append(newLine).append("	if(typeof(relation) != \"undefined\" && relation != \"\") {")
                .append(newLine).append("		var div = \"\";")
                .append(newLine).append("		var height = 0;")
                .append(newLine).append("		var relations = relation.split(\";\");")
                .append(newLine).append("		for(var i=0; i<relations.length; i++) {")
                .append(newLine).append("			if(relations[i] == \"\") {")
                .append(newLine).append("				continue;")
                .append(newLine).append("			}")
                .append(newLine).append("			height += 30;")
                .append(newLine).append("			var relationInfo = relations[i].split(\":\");")
                .append(newLine).append("			div += \"<div class='tableRow'>\"")
                .append(newLine).append("				+ \"<div class='tableRowDiv mainCache'>\" + relationInfo[0] + \"</div>\"")
                .append(newLine).append("				+ \"<div class='tableRowDiv fromCache'>\" + relationInfo[1] + \"</div>\"")
                .append(newLine).append("				+ \"</div>\";")
                .append(newLine).append("		}")
                .append(newLine).append("		document.getElementById(type + \"Div\").innerHTML = document.getElementById(type + \"Div\").innerHTML + div;")
                .append(newLine).append("		document.getElementById(type + \"Content\").style.height = parseInt(document.getElementById(type + \"Content\").style.height.replace(\"px\",\"\")) + height + \"px\";")
                .append(newLine).append("	}")
                .append(newLine).append("}")
                .append(newLine).append("")
                .append(newLine).append("//读取项目路径")
                .append(newLine).append("function readPath() {")
                .append(newLine).append("	doFastJava('cacheHelper'); //读取项目路径")
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
                .append(newLine).append("	height:33px;")
                .append(newLine).append("	padding-top:10px;")
                .append(newLine).append("	padding-left:35px;")
                .append(newLine).append("}")
                .append(newLine).append(".xmlPath {")
                .append(newLine).append("	width: 650px;")
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
                .append(newLine).append(".mainCache {")
                .append(newLine).append("	width:30%;")
                .append(newLine).append("}")
                .append(newLine).append(".fromCache {")
                .append(newLine).append("	width:70%;")
                .append(newLine).append("}")
                .append(newLine).append(".tableRow {")
                .append(newLine).append("	clear:both;")
                .append(newLine).append("}")
                .append(newLine).append(".tableTitle {")
                .append(newLine).append("	float:left;")
                .append(newLine).append("	display:inline;")
                .append(newLine).append("}")
                .append(newLine).append(".tableRowDiv {")
                .append(newLine).append("	float:left;")
                .append(newLine).append("	display:inline;")
                .append(newLine).append("	margin-top:5px;")
                .append(newLine).append("	border-bottom:1px solid rgba(0,0,0,.15);")
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
