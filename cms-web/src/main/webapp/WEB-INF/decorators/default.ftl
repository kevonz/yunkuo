[#ftl]
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
    ${head}
</head>
<body>
<div style="margin:0 auto;width:960px;background-color:#c1c1c1;">
    <div style="width:600px;height:100px;background-color:#ccc;float:left;">
        <h3>demo[#--, name=${name}--]</h3>
    </div>
    <div style="width:200px;height:500px;float:left;background-color:#fe00df;">
    [#include "left.ftl"]
    </div>
    <div style="width:398px;float:left;border:1px solid #fefefe;">
    ${body}
    </div>
</div>
</body>
</html>