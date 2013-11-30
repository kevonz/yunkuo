<html>
<body>
	this is category list
    <table border="1">
    <#list categoryList as category>
    <tr>
        <td>${category.id}</td>
        <td>${category.name}</td>
    </tr>
</#list>
    </table>
</body>
</html>