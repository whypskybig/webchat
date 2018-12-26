<!DOCTYPE html>
<html>
<head>
    <title>简易聊天室</title>
</head>
<body>
    Welcome<br/>
    <hr/>

    <hr/>
    <div id="message"></div>

    <div style="float:left; width: 360px; height: 200px;">
        <textarea id="taMessages" style="width: 360px; height: 400px; overflow-y:auto" readonly ></textarea>
        <br />
        <input id="text" type="text" style="float:left; width:300px; height: 150px" />
        <input id="btnSend" type="button" value="Send" onclick="send();"/>
    </div>
</body>

<script type="text/javascript">
    var roomid="葬爱家族";//房间名
    var nickname ="冬泳欧巴";//自己的昵称
    var flag = "join";
    var info = flag + "|" +roomid + "|" +nickname;
    var message = document.getElementById('text').value;
    var welcome = JSON.stringify({			//加入房间时的欢迎消息
        nickname:nickname,    //用户名
        content:message,		//消息内容
        target:roomid,		//推送到目标房间
        flag:"chatroom"});	//推送标识

    var websocket = null;
    //判断当前浏览器是否支持WebSocket
    if ('WebSocket' in window) {
        //websocket = new WebSocket("ws://47.107.110.18:8091/websocket");
        websocket = new WebSocket("ws://127.0.0.1:8091/websocket");
    }
    else {
        alert('当前浏览器 Not support websocket')
    }

    //连接发生错误的回调方法
    websocket.onerror = function () {
        setMessageInnerHTML("WebSocket连接发生错误");
        websocket.onopen;
    };

    //连接成功建立的回调方法
    websocket.onopen = function () {
        websocket.send(welcome);
        setMessageInnerHTML("WebSocket连接成功");
    }

    //接收到消息的回调方法
    websocket.onmessage = function (event) {
        console.info("回调数据"+event.data);
        var data =event.data; //json字符串
        var obj = JSON.parse(data);
        console.info(obj.content);
        //alert(obj.rows);
        setMessageInnerHTML(obj.content);
    }

    //连接关闭的回调方法
    websocket.onclose = function () {
        setMessageInnerHTML("WebSocket连接关闭");
    }

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        closeWebSocket();
    }

    //将消息显示在网页上
    function setMessageInnerHTML(innerHTML) {
        document.getElementById('taMessages').innerHTML += innerHTML + '&#10';
    }

    //关闭WebSocket连接
    function closeWebSocket() {
        websocket.close();
    }

    //发送消息
    function send() {
        var text = document.getElementById('text').value;
        var message = JSON.stringify({			//加入房间时的欢迎消息
            nickname:nickname,    //用户名
            content:text,		//消息内容
            target:roomid,		//推送到目标房间
            flag:"chatroom"});
        websocket.send(message);
    }
</script>
</html>