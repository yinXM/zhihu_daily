<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>知乎日报 网页版</title>
    <link href="./css/common.css" rel="stylesheet" type="text/css" />
    <link href="./css/menu.css" rel="stylesheet" type="text/css" />
    <link rel="icon" href="./image/favicon.ico" mce_href="/favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="./image/favicon.ico" type="image/x-icon">
</head>
<script src="./js/get.js"></script>
<script type="text/javascript">
    function myScroll()
    {
        window.scrollTo(0,0);
    }
</script>
<body>
    <div id="frame_item" class="frame_item">
        <p style="
            background: #009dd7;
            color: white;
            border-radius: 5px;
            padding: 10px;
            font-weight: bold;
            text-align: center;
        ">
            <a href="javascript:display_change(3);" style=" color: white; text-decoration: none;">想体验新版吗？</a>
        </p>
        <div id="frame_item_list">
            <h1>${date}</h1>
            <#list stories as storie>
                <#--<div class="item"><a href = "javascript:_get_content(${storie.id},'${storie.title}')">${storie.title}</a></div>-->
                <div class="item"><a href = "http://news-at.zhihu.com/api/4/news/${storie.id}">${storie.title}</a></div>
            </#list>
        </div>
</body>