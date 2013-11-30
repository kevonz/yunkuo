<html>
<body>
	this is user page
    <table border="1">
    <#list userList as user>
        <tr>
            <td>${user.name}</td>
            <td>${user.sex}</td>
        </tr>
    </#list>
    </table>
</body>
</html>