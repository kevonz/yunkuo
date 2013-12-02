<html>
<body>
	this is article list
    <table border="1">
    <#list articleList as article>
    <tr>
        <td>${article.id}</td>
        <td>${article.title}</td>
    </tr>
</#list>
    </table>

</body>
</html>