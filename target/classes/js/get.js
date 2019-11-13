function _get_content(id,title)
{
    var xmlhttp;
    if (window.XMLHttpRequest)
    {
        // 兼容 IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // 兼容 IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("POST","get_content.php",false);
    xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    var msg="id="+id;
    xmlhttp.send(msg);
    document.getElementById("frame_content_content").innerHTML=xmlhttp.responseText;
    document.getElementById("frame_content_title").innerHTML=title;
    hotlink_under_id("frame_content_content");
    /**************↓更改菜单样式↓*****************/
    display_change(2);

}

function _getlist(day)
{
    var xmlhttp;
    if (window.XMLHttpRequest)
    {
        // 兼容 IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // 兼容 IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("POST","get_list.php",false);
    xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    var msg="day="+day;
    xmlhttp.send(msg);
    document.getElementById("frame_item_list").innerHTML=xmlhttp.responseText;
}