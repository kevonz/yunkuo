<html>
<body>
	this is article list1
<#--
    <table border="1">
    <#list articleList as article>
    <tr>
        <td>${article.id}</td>
        <td>${article.title}</td>
    </tr>
</#list>
    </table>
-->

    <table border="1">
    <#list articleDOList as article>
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
        </tr>
    </#list>
</body>
</html>