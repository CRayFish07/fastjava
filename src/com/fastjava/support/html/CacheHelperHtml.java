package com.fastjava.support.html;

/*
<div class="infoPage">

	<div class="path content">
			mapper配置文件路径：<input class="xmlPath" id="mapperPath" name="mapperPath" type="text"/>
			<button onclick="doFastJava('cacheHelper_setXmlPath')">确定</button>
	</div>

	<div id="successContent" class="content" style="height:95px">
		<div class="title">正确缓存</div>
		<div>
			<div id="successDiv" class="margin">
				<div>
					<div class='tableTitle mainCache'>主缓存</div>
					<div class='tableTitle fromCache'>从缓存</div>
				</div>
			</div>
		</div>
	</div>

	<div id="failContent" class="content" style="height:95px">
		<div class="title">错误缓存</div>
		<div>
			<div id="failDiv" class="margin">
				<div>
					<div class='tableTitle mainCache'>缓存文件</div>
					<div class='tableTitle fromCache'>错误原因</div>
				</div>
			</div>
		</div>
	</div>

	<div class="content" style="height:220px">
		<div class="title">缓存配置</div>
		<div>
			<div class="margin">
				<font>* 主缓存中添加</font><br/>
				<font>* 主从缓存insert、update、delete操作会刷新缓存</font>
			</div>
			<textarea readonly="readonly" class="margin" style="margin-top:0px;height:23px">
<cache type="org.mybatis.caches.ehcache.LoggingEhcache"/></textarea>
			<div class="margin">
				<font>* 从缓存中添加</font>
			</div>
			<textarea readonly="readonly" class="margin" style="margin-top:0px;height:23px">
<cache-ref namespace="主缓存的namespace"/></textarea>
		</div>
	</div>

</div>

<script>
var mapperPath;
var successRelation;	//成功配额
var failRelation;		//失败配额

function onloadFunction() {
	document.getElementById("mapperPath").value = typeof(mapperPath)=="undefined"?"":mapperPath;
	showCache(successRelation, "success");	//显示成功配额
	showCache(failRelation, "fail");		//显示失败配额
}

//显示配额信息
function showCache(relation, type) {
	if(typeof(relation) != "undefined" && relation != "") {
		var div = "";
		var height = 0;
		var relations = relation.split(";");
		for(var i=0; i<relations.length; i++) {
			if(relations[i] == "") {
				continue;
			}
			height += 30;
			var relationInfo = relations[i].split(":");
			div += "<div class='tableRow'>"
				+ "<div class='tableRowDiv mainCache'>" + relationInfo[0] + "</div>"
				+ "<div class='tableRowDiv fromCache'>" + relationInfo[1] + "</div>"
				+ "</div>";
		}
		document.getElementById(type + "Div").innerHTML = document.getElementById(type + "Div").innerHTML + div;
		document.getElementById(type + "Content").style.height = parseInt(document.getElementById(type + "Content").style.height.replace("px","")) + height + "px";
	}
}

//读取项目路径
function readPath() {
	doFastJava('cacheHelper'); //读取项目路径
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
	height:33px;
	padding-top:10px;
	padding-left:35px;
}
.xmlPath {
	width: 650px;
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
.mainCache {
	width:30%;
}
.fromCache {
	width:70%;
}
.tableRow {
	clear:both;
}
.tableTitle {
	float:left;
	display:inline;
}
.tableRowDiv {
	float:left;
	display:inline;
	margin-top:5px;
	border-bottom:1px solid rgba(0,0,0,.15);
}
textarea {
	resize: none;
	width: 900px;
	font-size:16px;
	font-family: Microsoft Yahei,Helvetica Neue,Hiragino Sans GB,WenQuanYi Micro Hei,sans-serif
}
</style>
 */
public class CacheHelperHtml {

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
